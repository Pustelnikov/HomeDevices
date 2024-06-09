package dev.pustelnikov.homedevices.devices;

public class Kettle extends HomeDevice {

	
	public Kettle(String description, int power) {
		
		super(description, power);
		
	}
	
	
	
	
	
	@Override
	public void doAction() {
		
		System.out.println("Kettle is boiling water");

	}

}
