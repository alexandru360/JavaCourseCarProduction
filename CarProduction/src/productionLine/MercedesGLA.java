package productionLine;

import CarModels.CarMercedes;

public class MercedesGLA extends CarMercedes {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Start engine of car" + getCarType());
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean buildCar() {
		// TODO Auto-generated method stub
		return false;
	}

}
