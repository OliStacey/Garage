package com.qa.garage;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("\n================Cars===============\n");
		
		Vehicle car1 = new Car(2002, 4, "Petrol", "Blue", true, 5, "Ford", "Kuga", false);
		System.out.println(car1 + " - Car 1");
		
		Vehicle car2 = new Car(3648, 3, "Petrol", "Black", false, 5, "Toyota", "Yaris", true);
		System.out.println("\n" + car2 + " - Car 2");
		
		Vehicle car3 = new Car(2109, 4, "Electricity", "Grey", true, 4, "Tesla", "Model S", true);
		System.out.println("\n" + car3 + " - Car 3");
		
		System.out.println("\n================Motorbikes===============\n");
		
		Vehicle motorbike1 = new Motorbike(1092, 2, "Petrol", "Silver", true, 1700, false);
		System.out.println("\n" + motorbike1 + " - Motorbike 1");
		
		Vehicle motorbike2 = new Motorbike(1567, 1, "Petrol", "Red", false, 1800, true);
		System.out.println("\n" + motorbike2 + " - Motorbike 2");
		
		System.out.println("\n================Buses===============\n");
		
		Vehicle bus1 = new Bus(2345, 4, "Diesel", "Blue", true, 150, true, 12, false);
		System.out.println("\n" + bus1 + " - Bus 1");
		
		Vehicle bus2 = new Bus(1789, 4, "Diesel", "Red", true, 80, false, 6, true);
		System.out.println("\n" + bus2 + " - Bus 2");
		
		System.out.println("\n================List===============\n");
		
		Garage garage = new Garage();
		garage.addVehicle(car1);
		garage.addVehicle(car2);
		garage.addVehicle(car3);
		garage.addVehicle(motorbike1);
		garage.addVehicle(motorbike2);
		garage.addVehicle(bus1);
		garage.addVehicle(bus2);
		
		System.out.println(garage);
		
		garage.calcAllBills();
		garage.bill(car1);
		
		garage.fix(bus1);
	


	}

}
