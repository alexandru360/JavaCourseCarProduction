package main;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import CarBrandLine.CarBrand;
import CarBrandLine.CarBrandModel;
import ProductionLine.ProduceCarModels;

public class RunProductionLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<CarBrand> oCars = ProduceCarModels.BuildCarType(CarBrandModel.FORD, 100);
		for(CarBrand iteratorVariable : oCars){
			iteratorVariable.StartEngine();
			iteratorVariable.StopEngine();
		}
		
//		ProduceCarModels oBuildCar = new ProduceCarModels();
//		ProduceCarModels.BuildCarType(CarBrandModel.FORD);
//		ProduceCarModels.BuildCarType(CarBrandModel.BMW);
//		ProduceCarModels.BuildCarType(CarBrandModel.MERCEDES);
		
		
		// processMap(new LinkedHashMap<String, Integer>());
		// processMap(new TreeMap<String, Integer>());
	}

	public static void processMap(Map<String, Integer> map) {
		System.out.println("Process the map");
		map.put("3", new Integer(3));
		map.put("2", new Integer(2));
		map.put("1", new Integer(1));

		for (String key : map.keySet()) {
			System.out.println(key);
		}
	}

}
