package ProductionLine;

import java.util.ArrayList;
import java.util.List;

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

	public static List<CarBrand> BuildCarType(CarBrandModel parModelToProduce, int itemsToProduce) {
		List<CarBrand> oCarb = new ArrayList<CarBrand>();
		CarBrand oCarItem;
		int x = 0;
		do {
			switch (parModelToProduce) {
			case BMW:
				oCarItem = new CarBrand(3, 1.8, "BMV Z3");
				break;

			case FORD:
				oCarItem = new CarBrand(3, 5.6, "FORD FOCUS");
				break;

			case MERCEDES:
				oCarItem = new CarBrand(3, 1.8, "MERCEDES ceva ?!");
				break;

			default:
				// Linie introdusa pentru a ocoli un null pointer exception
				oCarItem = new CarBrand(3, 0, "Aici nu ajunge !");
				break;
			}
			oCarb.add(oCarItem);
			x++;
		} while (x < itemsToProduce);
		return oCarb;
	}

}