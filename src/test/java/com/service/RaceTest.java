package com.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RaceTest {
	RacingCarSetting racingCarSetting;
	RacingCountSetting racingCountSetting;
	
	@BeforeEach
	void setUp() {
		racingCarSetting = new RacingCarSetting("a,b,c");
		racingCountSetting = new RacingCountSetting("5");
	}
	
	@Test
	@DisplayName("경기 시작 테스트")
	void startTest() {
		new Race(racingCarSetting, racingCountSetting).start();
	}
	
	@Test
	@DisplayName("경기 결과 테스트")
	void getResultTest() {
		Race race = new Race(racingCarSetting, racingCountSetting);
		race.start();
		String result = race.getResult();
		System.out.println(result);
	}
	
}
