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
	
}
