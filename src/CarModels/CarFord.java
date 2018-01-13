package CarModels;

import CarContracts.Car;

public abstract class CarFord implements Car {

	private String carType = "Ford";
	private int passagers = 0;

	public CarFord() {
		setPassagers(5);
		System.out.println("Default passagers no for " + carType + " cars is" + getPassagers());
	}

	public int getPassagers() {
		return passagers;
	}

	public void setPassagers(int passagers) {
		this.passagers = passagers;
	}

	public void openDoor() {
		System.out.println("General behavior of " + carType + " openDoors");
	}

	public void blockWindow() {
		System.out.println("General behavior of " + carType + " blockWindow");
	}
}