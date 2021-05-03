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
		UIUtils.printLineConsole(RacingCarGameConstant.ENTER_CAR_NAME);
	}
	
}
