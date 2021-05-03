package com.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @주시스템		    :	java-racingcar-precourse
 * @서브 시스템		:   util
 * @프로그램 ID		:   StringUtilsTest.java
 * @프로그램 개요	    :   문자열 관련 Util 기능 테스트
 */
public class StringUtilsTest {
	
	@ParameterizedTest
	@CsvSource(value = {"a:false", "'':true", "'  	':false"}, delimiter = ':')
	@DisplayName("빈 문자열 체크 테스트")
	void isEmptyTest(String str, boolean expected) {
		assertThat(StringUtils.isEmpty(str)).isEqualTo(expected);
	}
	
	@ParameterizedTest
	@CsvSource(value = {"a:true", "'':false", "'  	':true"}, delimiter = ':')
	@DisplayName("유효 문자열 체크 테스트")
	void hasTextTest(String str, boolean expected) {
		assertThat(StringUtils.hasText(str)).isEqualTo(expected);
	}
	
	@ParameterizedTest
	@CsvSource(value = {"' ':''", "'	 ':''", "a b	c:abc"}, delimiter = ':')
	@DisplayName("공백 제거 테스트")
	void trimWhiteSpaceAndTabTest(String str, String expected) {
		assertThat(StringUtils.trimWhiteSpaceAndTab(str)).isEqualTo(expected);
	}
	
	@ParameterizedTest
	@CsvSource(value = {"1:true", "r:false", "' ':false", "0:true"}, delimiter = ':')
	@DisplayName("숫자타입 체크 테스트")
	void isNumberTest(String str, boolean expected) {
		assertThat(StringUtils.isNumber(str)).isEqualTo(expected);
	}
	
	@ParameterizedTest
	@CsvSource(value = {"1:false", "r:true", "' ':true", "0:false"}, delimiter = ':')
	@DisplayName("문자타입 체크 테스트")
	void isTextTest(String str, boolean expected) {
		assertThat(StringUtils.isText(str)).isEqualTo(expected);
	}
	
}
