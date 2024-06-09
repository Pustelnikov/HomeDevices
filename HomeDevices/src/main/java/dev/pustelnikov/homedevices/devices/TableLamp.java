package dev.pustelnikov.homedevices.devices;

public class TableLamp extends HomeDevice {

	
	public TableLamp(String description, int power) {
		
		super(description, power);
		
	}
	
	
	
	
	
	@Override
	public void doAction() {
		
		System.out.println("Table lamp is illuminating the table");
	
	}

}
