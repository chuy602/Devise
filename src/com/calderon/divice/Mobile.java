package com.calderon.divice;

public class Mobile extends Device{
	
	private String number;

	

	public Mobile(String name, String brand, Double price, String number) {
		super(name, brand, price);
		this.number = number;
	}

	@Override
	public String toString() {
		return "Mobile [getNumber()=" + getNumber() + ", toString()=" + super.toString() + "]";
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	
}