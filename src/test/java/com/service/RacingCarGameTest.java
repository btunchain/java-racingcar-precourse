package com.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import com.constant.RacingCarGameConstant;
import com.util.UIUtils;

/**
 * @주시스템		    :	java-racingcar-precourse
 * @서브 시스템		:   service
 * @프로그램 ID		:   RacingCarGameTest.java
 * @프로그램 개요	    :   자동차 경주 게임 로직 단위 테스트
 */
public class RacingCarGameTest {
	
	@Test
	@DisplayName("자동차 설정 테스트")
	void setCarTest() {
		assertThat(setCar("a,b,c")).isNotNull();
	}
	
	private RacingCarSetting setCar(String scannerInput) {
		
		RacingCarSetting racingCarSetting = null;
		int carListSize = RacingCarGameConstant.ZERO;
		
		while (RacingCarGameConstant.ZERO == carListSize) {
			UIUtils.printLineConsole(RacingCarGameConstant.ENTER_CAR_NAME);
			racingCarSetting = new RacingCarSetting(scannerInput);
			carListSize = racingCarSetting.getCarCount();
		}
		return racingCarSetting;
	}
	
	@Test
	@DisplayName("경기 수 설정 테스트")
	void setCountTest() {
		assertThat(setCount("1")).isNotNull();
	}
	
	private RacingCountSetting setCount(String scannerInput) {
		RacingCountSetting racingCountSetting = null;
		int gameCount = RacingCarGameConstant.ZERO;
		
		while (RacingCarGameConstant.ZERO == gameCount) {
			UIUtils.printLineConsole(RacingCarGameConstant.COUNT_CHECK);
			racingCountSetting = new RacingCountSetting(scannerInput);
			gameCount = racingCountSetting.getGameCount();
		}
		
		return racingCountSetting;
	}
	
}
