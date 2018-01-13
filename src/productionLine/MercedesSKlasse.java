package productionLine;

import CarModels.CarMercedes;

public class MercedesSKlasse extends CarMercedes {

	private String carBrand = "Mercedes S Klasse";

	public MercedesSKlasse() {
		boolean testCar = true;
		try {
			if (buildCar()) {
				start();
				stop();
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			testCar = false;
		} finally {
			if (testCar)
				System.out.println("Success start/stop");
			else
				System.out.println("Car did not start !");
		}
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Start engine of car" + getCarType());
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Stop engine of car" + getCarType());
	}

	@Override
	public String getCarType() {
		// TODO Auto-generated method stub
		return carBrand;
	}

	@Override
	public void openDoor() {
		System.out.println("Door of this model " + getCarType() + " opens to the left from inside of car.");
	}

	@Override
	public void blockWindows() {
		System.out.println("Door of this model " + getCarType() + " opens all windows automatically.");
	}

	@Override
	public boolean buildCar() {
		boolean productionLineStatus = true;
		System.out.println("Production of car" + getCarType() + " started");
		try {
			openDoor();
			blockWindows();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			productionLineStatus = false;
		} finally {
			if (productionLineStatus)
				System.out.println("Production success");
			else
				System.out.println("Production of car Exception STOP!");
		}
		return productionLineStatus;
	}

}
