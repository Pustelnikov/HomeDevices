package dev.pustelnikov.homedevice;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class HomeDevice {

	// Description of device
	private String description;
	
	// Power consumption
	private int power;
	
	// Status "On" or "Off"
	private boolean status;
	
	public HomeDevice(String description, int power, boolean status) {
		this.description = description;
		this.power = power;
		this.status = status;
	}
}