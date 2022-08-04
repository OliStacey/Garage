package com.qa.garage;

public class Bus extends Vehicle implements Horn {
	
	private int capacity;
	private boolean isDoubleDecker;
	private int numOfWindows;
	private boolean beepHorn = true;
	
	public Bus() {}
		
		
	
	public Bus(int iD, int numOfWheels, String fuelType, String colour, boolean isRepaired,
			int capacity, boolean isDoubleDecker, int numOfWindows, boolean beepHorn) {
		super(iD, numOfWheels, fuelType, colour, isRepaired);
		this.capacity = capacity;
		this.isDoubleDecker = isDoubleDecker;
		this.numOfWindows = numOfWindows;
		this.beepHorn = beepHorn;
		
	}
	
	public String beepHorn() {
		if(beepHorn) {
			return "Honk Honk";
		} else {
			return "The horn seems to be broken";
		}
		}



	public int getCapacity() {
		return capacity;
	}



	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}



	public boolean isDoubleDecker() {
		return isDoubleDecker;
	}



	public void setDoubleDecker(boolean isDoubleDecker) {
		this.isDoubleDecker = isDoubleDecker;
	}



	
	public int getNumOfWindows() {
		return numOfWindows;
	}



	public void setNumOfWindows(int numOfWindows) {
		this.numOfWindows = numOfWindows;
	}



	@Override
	public String toString() {
		return "Bus [capacity=" + capacity + ", isDoubleDecker=" + isDoubleDecker + ", numOfWindows=" + numOfWindows
				+ ", beepHorn=" + beepHorn + ", beepHorn()=" + beepHorn() + ", isRepaired()=" + isRepaired()
				+ ", getNumOfWheels()=" + getNumOfWheels() + ", getFuelType()=" + getFuelType() + ", getColour()="
				+ getColour() + ", getiD()=" + getiD() + "]";
	}



	







	
	}




	



	
	




	
	
	


