package dev.pustelnikov.homedevices.devices;

public class Computer extends HomeDevice {

	
	public Computer(String description, int power) {
		
		super(description, power);
		
	}
	
	
	
	
	
	@Override
	public void doAction() {
		
		System.out.println("Computer is compiling some Java project");
		
	}
	
}
