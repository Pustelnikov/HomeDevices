package dev.pustelnikov.homedevices;

// Typical home device according to the task
public class HomeDevice {

	// Description of device
	public String description;
	
	// Power consumption
	public int power;
	
	// Status "On" or "Off"
	public boolean status;

	public HomeDevice(String description, int power, boolean status) {
		this.description = description;
		this.power = power;
		this.status = status;
	}
}
