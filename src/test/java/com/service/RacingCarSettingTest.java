package com.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @주시스템		    :	java-racingcar-precourse
 * @서브 시스템		:   service
 * @프로그램 ID		:   RacingCarGameSettingTest.java
 * @프로그램 개요	    :   자동차 설정 테스트
 */
public class RacingCarSettingTest {

	
	@ParameterizedTest
	@CsvSource(value = {"a,b,c:3", "'':0", "' ':0", "carcarcarcar:0"}, delimiter = ':')
	@DisplayName("차량명 입력 테스트")
	void enterCarNameTest(String insertCarNames, int expected) {
		assertThat(new RacingCarSetting(insertCarNames).getCarCount()).isEqualTo(expected);
	}
	
	
	
}
