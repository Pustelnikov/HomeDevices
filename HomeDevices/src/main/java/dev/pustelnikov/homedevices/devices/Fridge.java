package dev.pustelnikov.homedevices.devices;

public class Fridge extends HomeDevice {

		
	public Fridge(String description, int power) {
		
		super(description, power);
		
	}
	
	
	
	
	
	@Override
	public void doAction() {
		
		System.out.println("Fridge is freezing beer");
		
	}
	
}
