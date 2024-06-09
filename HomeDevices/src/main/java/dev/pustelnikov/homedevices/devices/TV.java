package dev.pustelnikov.homedevices.devices;

public class TV extends HomeDevice {

	
	public TV(String description, int power) {
		
		super(description, power);
		
	}
	
	
	
	
	
	@Override
	public void doAction() {
	
		System.out.println("TV is showing some movie");

	}

}
