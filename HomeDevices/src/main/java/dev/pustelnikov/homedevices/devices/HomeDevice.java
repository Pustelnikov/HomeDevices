package dev.pustelnikov.homedevices.devices;

import java.util.Objects;

// Typical home device according to the task
public class HomeDevice {

	// Description of device
	private String description;
	
	// Power consumption
	private int power;
	
	// Status "On" or "Off"
	private boolean status;

	
	
	public HomeDevice(String description, int power) {
		this.description = description;
		this.power = power;
	}
	
	
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	public String getDescription() {
		return description;
	}
	
	
	
	public void setPower(int power) {
		if (power > 0) {
			this.power = power;
		} else {
			System.out.println("Power cannot be negative or zero");
		}
	}
	
	
	
	public int getPower() {
		return power;
	}
	
	
	
	public void setStatus(boolean status) {
		this.status = status;
		if (status) {
			this.doAction();
		}
	}
	
	
	
	public boolean getStatus() {
		return status;
	}
	
	
	// this method for toString() method only
	private String printStatus() {
		String status;
		if (this.status) {
			status = "Switched On";
		} else {
			status = "Switched Off";
		}
		return status;
	}
	
	
	
	public String toString() {
		return "Device: " + this.description + "; " + "Power: " + this.power + "; " + "Status: " + this.printStatus() + '\n';
	}
	
	
	
	@Override
	public int hashCode() {
		int result = description != null ? description.hashCode() : 0;
		result = 31 * result + power;
		return result;
	}
	
	
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		HomeDevice device = (HomeDevice) o;
		if (power != device.power) return false;
		return Objects.equals(power, device.power);
	}
	
	
		
	protected void doAction() {
		System.out.println("Device is doing something");
	}
	
}
