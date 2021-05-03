package com.util;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @주시스템		    :	java-racingcar-precourse
 * @서브 시스템		:   util
 * @프로그램 ID		:   StringUtilsTest.java
 * @프로그램 개요	    :   문자열 관련 Util 기능 테스트
 */
public class ValidationUtilsTest {
	
	@ParameterizedTest
	@ValueSource(strings = {"", "  ", "carcarcarcar"})
	@DisplayName("차량명 유효성 테스트")
	void validateCarNameTest(String insertText) {
		assertThat(ValidationUtils.validateCarName(insertText)).isFalse();
	}
	
}
