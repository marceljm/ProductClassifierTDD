package com.marceljm.constant;

public enum ColumnEnum {
	ID(0), 
	NAME(1), 
	PRICE(2), 
	IMAGESMALL(3), 
	IMAGEMEDIUM(4), 
	IMAGELARGE(5), 
	LINK(6), 
	PATH(7), 
	MAINCATEGORY(8), 
	SUBCATEGORY(9), 
	THIRDCATEGORY(10), 
	BRAND(11), 
	STORE(12);

	private int value;

	private ColumnEnum(int value) {
		this.setValue(value);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
};
