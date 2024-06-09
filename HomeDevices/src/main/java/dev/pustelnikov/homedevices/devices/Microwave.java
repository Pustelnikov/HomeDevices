package dev.pustelnikov.homedevices.devices;

public class Microwave extends HomeDevice {

		
	public Microwave(String description, int power) {
		
		super(description, power);
		
	}
	
	
	
	
	
	@Override
	public void doAction() {
				
		System.out.println("Microwave is heating up pizza");

	}

}
