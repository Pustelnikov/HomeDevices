package dev.pustelnikov.homedevices.devices;

public class CeilingChandelier extends HomeDevice {

	
	public CeilingChandelier(String description, int power) {
		
		super(description, power);
		
	}
	
	
	
	
	
	@Override
	public void doAction() {
		
		System.out.println("Ceiling chandelier is illuminating the room");
		
	}

}
