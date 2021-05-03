package com.util;

import java.util.List;

import com.constant.RacingCarGameConstant;

public abstract class ListUtils {

	public static <T> boolean isEmpty(List<T> list) {
		return list.size() == RacingCarGameConstant.ZERO;
	}
	
}
