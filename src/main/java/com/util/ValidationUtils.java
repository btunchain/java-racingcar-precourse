package com.util;

import com.constant.RacingCarGameConstant;

/**
 * @주시스템		    :	java-racingcar-precourse
 * @서브 시스템		:   util
 * @프로그램 ID		:   ValidationUtils.java
 * @프로그램 개요	    :   유효성 체크 Util
 */
public abstract class ValidationUtils {
	
	/**
	* 유효한 차량명인지 체크합니다.
	*
	* @param carName
	* @return boolean
	*/
	public static boolean validateCarName(String carName) {
		carName = StringUtils.trimWhiteSpaceAndTab(carName);
		return carName.length() > RacingCarGameConstant.ZERO && carName.length() <= RacingCarGameConstant.MAX_CAR_SIZE;
	}
	
	/**
	 * 유효한 게임 카운트인지 체크합니다.
	 *
	 * @param gameCount
	 * @return boolean
	 */
	public static boolean validateGameCount(String gameCount) {
		if (StringUtils.isEmpty(gameCount) || StringUtils.isText(gameCount)) {
			return false;
		}
		return Integer.parseInt(gameCount) != RacingCarGameConstant.ZERO;
	}
	
}
