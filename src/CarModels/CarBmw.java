package CarModels;

import CarContracts.Car;

public abstract class CarBmw implements Car {

	private String carType = "BMW";
	private int passagers = 0;

	public CarBmw() {
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