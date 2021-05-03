package com.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.constant.RacingCarGameConstant;
import com.util.ListUtils;
import com.util.StringUtils;
import com.util.UIUtils;
import com.util.ValidationUtils;
import com.vo.Car;
import com.vo.Cars;

/**
 * @주시스템		    :	java-racingcar-precourse
 * @서브 시스템		:   service
 * @프로그램 ID		:   RacingCarSetting.java
 * @프로그램 개요	    :   차량 설정 Class
 */
public class RacingCarSetting {
	
	private Cars cars;
	
	public RacingCarSetting(String insertCarNames) {
		this.cars = setCarName(insertCarNames);
	}
	
	/**
	* 입력받은 차량명을 설정합니다.
	*
	* @param insertCarNames
	* @return Cars
	*/
	private Cars setCarName(String insertCarNames) {
		String[] carNameArr = splitCarNames(insertCarNames);
		if (ListUtils.isEmpty(Arrays.asList(carNameArr))) {
			UIUtils.printLineConsole(RacingCarGameConstant.VALIDATE_CAR_NAME);
			return new Cars(new ArrayList<>());
		}
		
		List<Car> carList = setCarList(carNameArr);
		if (ListUtils.isEmpty(carList)) {
			UIUtils.printLineConsole(RacingCarGameConstant.VALIDATE_CAR_NAME);
			return new Cars(new ArrayList<>());
		}
		
		return new Cars(carList);
	}
	
	/**
	* 구분자로 구성된 차량명들을 나눠줍니다.
	*
	* @param insertCarNames
	* @return String[]
	*/
	private static String[] splitCarNames(String insertCarNames) {
		if (StringUtils.isEmpty(insertCarNames)) {
			return new String[]{};
		}
		
		return insertCarNames.split(RacingCarGameConstant.DELIMITER_COMMA);
	}
	
	private List<Car> setCarList(String[] carNameArr) {
		List<Car> carList = new ArrayList<>();
		boolean addResult = true;
		for(String carName : carNameArr) {
			addResult = addCarList(carName, carList);
		}
		
		return addResult ? carList : new ArrayList<>();
	}
	
	/**
	* 차량 리스트에 차량을 추가해줍니다.
	*
	* @param carName
	* @param carList 
	*/
	private boolean addCarList(String carName, List<Car> carList) {
		if (!ValidationUtils.validateCarName(carName)) {
			return false;
		}
		carList.add(new Car(carName));
		return true;
	}
	
	/**
	* 차량 갯수를 반환합니다.
	*
	* @return int 
	*/
	public int getCarCount() {
		return this.cars.size();
	}
	
	/**
	 * 자동차 정보들을 반환합니다.
	 * 
	 * @return
	 */
	public Cars getCars() {
		return this.cars;
	}
	
}
