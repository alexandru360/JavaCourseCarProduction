package CarModels;

import CarContracts.Car;

public abstract class CarMercedes implements Car {

	private String carType = "Mercedes";
	private int passagers = 0;

	public CarMercedes() {
		setPassagers(5);
		System.out.println("Default passagers no for " + carType + " cars is: " + getPassagers());
	}

	public String getCarType() {
		return carType;
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

	public void blockWindows() {
		System.out.println("General behavior of " + carType + " blockWindow");
	}
	
	void Buildcar() {
		
	}
}
