package com.util;

import java.util.Scanner;

/**
 * @주시스템		    :	java-racingcar-precourse
 * @서브 시스템		:   util
 * @프로그램 ID		:   UIUtils.java
 * @프로그램 개요	    :   UI 관련 기능 Util Class
 */
public abstract class UIUtils {
	
	public static Scanner initScanner() {
		return new Scanner(System.in);
	}
	
	public static void closeScanner(Scanner scanner) {
		scanner.close();
	}
	
	public static void printLineConsole(String str) {
		System.out.println(str);
	}
	
}
