package com.cognitree.assignmnt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CarProblem {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Number of Cars(N) & Origin(O) :");

		int n = sc.nextInt();
		String origin = sc.nextLine();

		List<CarModel> arrlist = new ArrayList<CarModel>();
		arrlist.add(new CarModel("Chevrolet Chevelle", 130.0, "US"));
		arrlist.add(new CarModel("Buick Skylark 320", 165.0, "US"));
		arrlist.add(new CarModel("Plymouth Satellite", 150.0, "US"));
		arrlist.add(new CarModel("Volkswagen 1131 Deluxe Sedan", 46.0, "Europe"));
		arrlist.add(new CarModel("Peugeot 504", 87.0, "Europe"));
		arrlist.add(new CarModel("Audi 100 LS", 90.0, "Europe"));

		List<CarModel> newlist = new ArrayList<CarModel>();

		Double hp = 0.0;
		Double nCar = 0.0;

		for (int i = 0; i < arrlist.size(); i++) {
			System.out.println(arrlist.get(i).getOrigin());
			if (arrlist.get(i).getOrigin().equalsIgnoreCase(origin.replace(" ", ""))) {
				hp += arrlist.get(i).getHorsePower();
				nCar++;

			}

			if (i == arrlist.size() - 1) {
				Double avg = hp / nCar;
				for (int j = 0; j < arrlist.size(); j++) {
					if (arrlist.get(j).getHorsePower() > avg
							&& arrlist.get(j).getOrigin().equalsIgnoreCase(origin.replace(" ", "")))
						newlist.add(arrlist.get(j));
				}

			}
		}
		Collections.sort(newlist, new SortbyHP());
		if (n > newlist.size())
			n = newlist.size();
		for (int i = newlist.size() - 1; i >= newlist.size() - n; i--) {

			System.out.println(newlist.get(i).getCarName() + " " + newlist.get(i).getHorsePower() + " "
					+ newlist.get(i).getOrigin());
		}

	}
}