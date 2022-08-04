package com.qa.garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	List<Vehicle> listVehicles = new ArrayList<>();
	
	public void addVehicle(Vehicle aVehicle) {
		listVehicles.add(aVehicle); 
		}
	
	
	
	public void bill(Vehicle vehicle) {
		float baseRate = 2.5f;
		if(vehicle instanceof Car) {
			System.out.println("Your bill is: " + baseRate * 10);
		} else if(vehicle instanceof Motorbike) {
			System.out.println("Your bill is: " + baseRate * 5);
		} else if(vehicle instanceof Bus) {
			System.out.println("Your bill is: " + baseRate * 20);
		} else {
			System.out.println("Please declare vehicle type.");
		}
	}
	public void calcAllBills() {
		for(Vehicle vh : listVehicles) {
			bill(vh);
		}
	}
	
	public void clearListVehicles() {
		listVehicles.clear();
	}
	
	public void fix(Vehicle vh) {
		bill(vh);
	}

	
	public List<Vehicle> getListVehicles() {
		return listVehicles;
	

	
	}
	@Override
	public String toString() {
		return "Garage [listVehicles=" + listVehicles + "]";
	}

	
		
	}


	

