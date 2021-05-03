package com.util;
import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @주시스템		    :	java-racingcar-precourse
 * @서브 시스템		:   util
 * @프로그램 ID		:   ListUtilsTest.java
 * @프로그램 개요	    :   ListUtil 테스트
 */
class ListUtilsTest {
	
	@Test
	@DisplayName("isEmpty 테스트")
	void isEmptyTest() {
		String[] arr = {};
		assertThat(ListUtils.isEmpty(Arrays.asList(arr))).isEqualTo(true);
	}
	
}