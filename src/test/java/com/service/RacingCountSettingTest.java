package com.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingCountSettingTest {

	@ParameterizedTest
	@CsvSource(value = {"0:0", "1:1", "r:0"}, delimiter = ':')
	@DisplayName("경주 횟수 설정 테스트")
	void setRacingCountTest(String inputText, int expected) {
		assertThat(new RacingCountSetting(inputText).getGameCount()).isEqualTo(expected);
	}
	
}
