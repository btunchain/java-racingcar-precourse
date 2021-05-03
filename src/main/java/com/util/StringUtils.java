package com.util;

/**
 * @주시스템		    :	java-racingcar-precourse
 * @서브 시스템		:   util
 * @프로그램 ID		:   StringUtils.java
 * @프로그램 개요	    :   문자열 관련 Util Class
 */
public abstract class StringUtils {
	
	/**
	 * 문자열이 비어있는지 체크합니다.
	 *
	 * @param str
	 * @return boolean
	 */
	public static boolean isEmpty(String str) {
		return str == null || "".equals(str);
	}
	
	/**
	 * 문자열이 비어있지 않은지 체크합니다.
	 *
	 * @param str
	 * @return boolean
	 */
	public static boolean hasText(String str) {
		return !isEmpty(str);
	}
	
	/**
	 * 스페이스, 탭 공백을 제거합니다.
	 *
	 * @param str
	 * @return String
	 */
	public static String trimWhiteSpaceAndTab(String str) {
		return str.replaceAll("(\\p{Z}|\\t)", "");
	}
	
	/**
	 * 입력 문자가 숫자인지 체크합니다.
	 *
	 * @param str
	 * @return boolean
	 */
	public static boolean isNumber(String str) {
		if (isEmpty(str)) {
			return false;
		}
		return str.matches("^[0-9]*$");
	}
	
	/**
	 * 입력 문자가 문자인지 체크합니다.
	 *
	 * @param str
	 * @return boolean
	 */
	public static boolean isText(String str) {
		return !isNumber(str);
	}
	
}
