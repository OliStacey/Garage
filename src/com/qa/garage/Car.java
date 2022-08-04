package com.qa.garage;

public class Car extends Vehicle implements Horn {
	
	private int numOfDoors;
	private String make;
	private String model;
	private boolean beepHorn = true;
	
	public Car() {}
	
	public Car(int iD, int numOfWheels, String fuelType, String colour, boolean isRepaired, 
			int numOfDoors, String make, String model, boolean beepHorn) {
		super(iD, numOfWheels, fuelType, colour, isRepaired);
		this.numOfDoors = numOfDoors;
		this.make = make;
		this.model = model;
		this.beepHorn = beepHorn;
		}
	
	public String beepHorn() {
		if(beepHorn) {
			return "Beep Beep";
		} else {
			return "The horn seems to be broken";
		}
		
	}

	public int getNumOfDoors() {
		return numOfDoors;
	}

	public void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public boolean isBeepHorn() {
		return beepHorn;
	}

	public void setBeepHorn(boolean beepHorn) {
		this.beepHorn = beepHorn;
	}

	@Override
	public String toString() {
		return "Car [numOfDoors=" + numOfDoors + ", make=" + make + ", model=" + model + ", beepHorn=" + beepHorn
				+ ", beepHorn()=" + beepHorn() + ", isRepaired()=" + isRepaired() + ", getNumOfWheels()="
				+ getNumOfWheels() + ", getFuelType()=" + getFuelType() + ", getColour()=" + getColour() + ", getiD()="
				+ getiD() + "]";
	}


	}

	
	

	
	
	
	
	
	

	
		
	


