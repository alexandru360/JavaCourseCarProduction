package CarBrandLine;

import Contracts.CarContract;

public class CarBrand implements CarContract {
	private int Doors;
	private double EngineSpec;
	private String Brand;
	
	private int getDoors() {
		return Doors;
	}

	private void setDoors(int doors) {
		Doors = doors;
	}

	private double getEngineSpec() {
		return EngineSpec;
	}

	private void setEngineSpec(double engineSpec) {
		EngineSpec = engineSpec;
	}
	private String getBrand() {
		return Brand;
	}

	private void setBrand(String brand) {
		Brand = brand;
	}

	public CarBrand(int parDoors, double parEngineSpec, String parBrand) {
		setDoors(parDoors);
		setEngineSpec(parEngineSpec);
		setBrand(parBrand);
		
		System.out.println("Brand is: " + getBrand());
		Engine();
	}

	@Override
	public void Engine() {
		// TODO Auto-generated method stub
		System.out.println("Doors: " + getDoors() + " EngineSpec: " + getEngineSpec());
	}
}
