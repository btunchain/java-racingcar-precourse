package com.vo;

import com.constant.RacingCarGameConstant;

public class Car {
	
	private String name;
	private String progress = "";
	
	public Car(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getProgress() {
		return progress;
	}
	
	public void addProgress() {
		progress = progress.concat(RacingCarGameConstant.DASH);
	}
	
}
