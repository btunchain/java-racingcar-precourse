package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import com.constant.RacingCarGameConstant;
import com.util.UIUtils;
import com.vo.Car;
import com.vo.Cars;

public class Race {
	
	private Cars cars;
	private int gameCount;
	
	public Race( RacingCarSetting racingCarSetting, RacingCountSetting racingCountSetting) {
		this.cars = racingCarSetting.getCars();
		this.gameCount = racingCountSetting.getGameCount();
	}
	
	/**
	* 경주를 시작합니다.
	*/
	public void start() {
		for (int gameRound = RacingCarGameConstant.ZERO; gameRound < this.gameCount; gameRound++) {
			getEachRaceResult();
			UIUtils.printLineConsole(RacingCarGameConstant.EMPTY_STR);
		}
	}
	
	/**
	* 각 경주별 결과를 가져옵니다.
	*/
	private void getEachRaceResult() {
		this.cars.forEach(car -> {
			move(car);
			UIUtils.printLineConsole(car.getName() + RacingCarGameConstant.COLON + car.getProgress());
		});
	}
	
	/**
	* 차량 움직임을 체크해서 차량을 이동합니다.
	*
	* @param car
	* @return Car
	*/
	private Car move( Car car) {
		if (car.checkCarMove()) {
			car.addProgress();
		}
		return car;
	}
	
	/**
	 * 경기 결과를 가져옵니다.
	 *
	 * @return String
	 */
	public String getResult() {
		Cars winningCars = compareProgress();
		StringBuilder result = new StringBuilder();
		String nameDelimiter = RacingCarGameConstant.DELIMITER_COMMA + RacingCarGameConstant.SPACE;
		winningCars.forEach(car -> result.append(nameDelimiter).append(car.getName()));
		return result.substring(nameDelimiter.length());
	}
	
	/**
	 * 경기 결과를 비교합니다.
	 *
	 * @return Cars
	 */
	private Cars compareProgress() {
		int maxProgress = getMaxProgress();
		List<Car> winningCarList = new ArrayList<>();
		this.cars.forEach(car -> addWinningCar(car, maxProgress, winningCarList));
		return new Cars(winningCarList);
	}
	
	/**
	 * 우승 자동차들을 더해줍니다.
	 *
	 * @param car
	 * @param maxProgress
	 * @param winningCarList
	 */
	private void addWinningCar(Car car, int maxProgress, List<Car> winningCarList) {
		if (car.getProgress().length() == maxProgress) {
			winningCarList.add(car);
		}
	}
	
	/**
	 * 최고 점수를 가져옵니다.
	 * @return int
	 */
	private int getMaxProgress() {
		AtomicInteger maxProgress = new AtomicInteger();
		this.cars.forEach(car -> setMaxProgress(car, maxProgress));
		return maxProgress.get();
	}
	
	/**
	 * 최고 점수를 설정합니다.
	 * @param car
	 * @param maxProgress
	 */
	private void setMaxProgress( Car car, AtomicInteger maxProgress) {
		if (car.getProgress().length() >= maxProgress.get()) {
			maxProgress.set(car.getProgress().length());
		}
	}
	
}
