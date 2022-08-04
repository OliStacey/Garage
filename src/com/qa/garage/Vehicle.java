package com.qa.garage;

public class Vehicle {
	
	private int iD;
	private int numOfWheels;
	private String fuelType;
	private String colour;
	private boolean isRepaired;
	
	public Vehicle() {}
	
	
	
	public Vehicle(int iD, int numOfWheels, String fuelType, String colour, boolean isRepaired) {
		super();
		this.iD = iD;
		this.numOfWheels = numOfWheels;
		this.fuelType = fuelType;
		this.colour = colour;
		this.isRepaired = isRepaired;
	}
	
	
	public String isRepaired() {
		if(isRepaired) {
			return "Good to go!";
		} else {
			return "Not yet repaired!";
		}
		}

	public int getNumOfWheels() {
		return numOfWheels;
	}

	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void setRepaired(boolean isRepaired) {
		this.isRepaired = isRepaired;
	}



	public int getiD() {
		return iD;
	}



	public void setiD(int iD) {
		this.iD = iD;
	}



	@Override
	public String toString() {
		return "Vehicle [iD=" + iD + ", numOfWheels=" + numOfWheels + ", fuelType=" + fuelType + ", colour=" + colour
				+ ", isRepaired=" + isRepaired + "]";
	}

	
	}
	
	
	
	
	
	
	
