package ProductionLine;

import CarBrandLine.CarBrand;
import CarBrandLine.CarBrandModel;

public class ProduceCarModels {
	public static void BuildCarType(CarBrandModel parModelToProduce) {
		CarBrand oCarb;
		switch (parModelToProduce) {
		case BMW:
			oCarb = new CarBrand(3, 1.8, "BMV Z3");
			break;

		case FORD:
			oCarb = new CarBrand(3, 5.6, "FORD FOCUS");
			break;

		case MERCEDES:
			oCarb = new CarBrand(3, 1.8, "MERCEDES ceva ?!");
			break;

		default:
			break;
		}
	}

	// public ProduceCarModels(String parModelToProduce ) {
	// BuildCarType(parModelToProduce);
	// }

	private static void BuildCarType(String parModelToProduce) {
		CarBrand oCarb;
		switch (parModelToProduce) {
		case "BMW":
			oCarb = new CarBrand(3, 1.8, "BMV Z3");
			break;

		case "FORD":
			oCarb = new CarBrand(3, 5.6, "FORD FOCUS");
			break;

		case "MERCEDES":
			oCarb = new CarBrand(3, 1.8, "MERCEDES ceva ?!");
			break;

		default:
			break;
		}
	}

}