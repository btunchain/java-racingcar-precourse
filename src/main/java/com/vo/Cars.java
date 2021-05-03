package com.vo;

import java.util.AbstractList;
import java.util.List;

public class Cars extends AbstractList<Car> {
	
	private List<Car> carList;
	
	public Cars(List<Car> carList) {
		this.carList = carList;
	}
	
	@Override
	public Car get(int index) {
		return this.carList.get(index);
	}
	
	@Override
	public int size() {
		return this.carList.size();
	}
	
}
