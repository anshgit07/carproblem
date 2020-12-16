package com.cognitree.assignmnt;

import java.util.Comparator;

public class SortbyHP implements Comparator<CarModel> {

	public int compare(CarModel arg0, CarModel arg1) {
		// TODO Auto-generated method stub
		Double hp1 = arg0.getHorsePower();
		Double hp2 = arg1.getHorsePower();
		if (hp1 == hp2)
			return 0;
		else if (hp1 > hp2)
			return 1;
		else
			return -1;

	}
}
