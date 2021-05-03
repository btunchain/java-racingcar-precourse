package com.service;

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
	
}
