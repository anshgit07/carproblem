package com.cognitree.assignmnt;

public class CarModel {

	private String carName;
	private Double horsePower;
	private String origin;

	public CarModel(String carName, Double horsePower, String origin) {
		this.carName = carName;
		this.horsePower = horsePower;
		this.origin = origin;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public Double getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(Double horsePower) {
		this.horsePower = horsePower;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

}
