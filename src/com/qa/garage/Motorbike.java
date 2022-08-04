package com.qa.garage;

public class Motorbike extends Vehicle implements Horn{
	
	private int cC;
	private boolean beepHorn = true;
	
	public Motorbike() {}
	

	public Motorbike(int iD, int numOfWheels, String fuelType, String colour, boolean isRepaired, int cC, boolean beepHorn) {
		super(iD, numOfWheels, fuelType, colour, isRepaired);
		this.cC = cC;
		this.beepHorn = beepHorn;
		
	}
	
	public String beepHorn() {
		if(beepHorn) {
			return "Bip Bip";
		} else {
			return "The horn seems to be broken";
		}
		}

	public int getcC() {
		return cC;
	}

	public void setcC(int cC) {
		this.cC = cC;

	}


	@Override
	public String toString() {
		return "Motorbike [cC=" + cC + ", beepHorn=" + beepHorn + ", beepHorn()=" + beepHorn() + ", isRepaired()="
				+ isRepaired() + ", getNumOfWheels()=" + getNumOfWheels() + ", getFuelType()=" + getFuelType()
				+ ", getColour()=" + getColour() + ", getiD()=" + getiD() + "]";
	}

	
	
	}
	

	


	

	
	
	

	
	
	
	


