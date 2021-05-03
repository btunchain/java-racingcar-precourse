package com.service;

import java.util.Scanner;

import com.constant.RacingCarGameConstant;
import com.util.UIUtils;

/**
 * @주시스템		    :	java-racingcar-precourse
 * @서브 시스템		:   service
 * @프로그램 ID		:   RacingCarGame.java
 * @프로그램 개요	    :   레이싱 경기 Class
 */
public class RacingCarGame {
	
	public RacingCarGame() {
	}
	
	/**
	* 자동차 경주 게임을 실행합니다.
	*/
	public void startGame() {
		Scanner scanner = UIUtils.initScanner();
		Race race = new Race(setCar(scanner), setCount(scanner));
		
		UIUtils.printLineConsole(RacingCarGameConstant.EXECUTE_RESULT);
		UIUtils.printLineConsole(RacingCarGameConstant.EMPTY_STR);
		race.start();
	}
	
	/**
	 * 차량 정보를 설정합니다.
	 *
	 * @param scanner
	 * @return RacingCarSetting
	 */
	private RacingCarSetting setCar(Scanner scanner) {
		
		RacingCarSetting racingCarSetting = null;
		int carCount = RacingCarGameConstant.ZERO;
		
		while (RacingCarGameConstant.ZERO == carCount) {
			UIUtils.printLineConsole(RacingCarGameConstant.ENTER_CAR_NAME);
			racingCarSetting = new RacingCarSetting(scanner.nextLine());
			carCount = racingCarSetting.getCarCount();
		}
		return racingCarSetting;
	}
	
	/**
	 * 경기 횟수를 설정합니다.
	 *
	 * @param scanner
	 * @return RacingCountSetting
	 */
	private RacingCountSetting setCount(Scanner scanner) {
		RacingCountSetting racingCountSetting = null;
		int gameCount = RacingCarGameConstant.ZERO;
		
		while (RacingCarGameConstant.ZERO == gameCount) {
			UIUtils.printLineConsole(RacingCarGameConstant.COUNT_CHECK);
			racingCountSetting = new RacingCountSetting(scanner.nextLine());
			gameCount = racingCountSetting.getGameCount();
		}
		
		return racingCountSetting;
	}
	
}
