package com.service;
import com.constant.RacingCarGameConstant;
import com.util.UIUtils;
import com.util.ValidationUtils;

/**
 * @주시스템		    :	java-racingcar-precourse
 * @서브 시스템		:   service
 * @프로그램 ID		:   RacingCountSetting.java
 * @프로그램 개요	    :   경기수 설정 Class
 */
public class RacingCountSetting {
	
	private int gameCount;
	
	public RacingCountSetting(String inputText) {
		this.gameCount = setRacingGameCount(inputText);
	}
	
	/**
	* 입력받은 문자열로 게임 횟수를 설정합니다.
	*
	* @param inputText
	* @return int
	*/
	private int setRacingGameCount(String inputText) {
		if (!ValidationUtils.validateGameCount(inputText)) {
			UIUtils.printLineConsole(RacingCarGameConstant.VALIDATE_COUNT);
			return RacingCarGameConstant.ZERO;
		}
		return Integer.parseInt(inputText);
	}
	
	/**
	* 게임 횟수를 반환합니다.
	*
	* @return int
	*/
	public int getGameCount() {
		return this.gameCount;
	}
	
}
