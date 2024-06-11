package dev.pustelnikov.homedevices;

// Default services for HomeDevice like getters-setters and more 
public class HomeDeviceDefaultService {

	public void setDescription(HomeDevice device, String description) {
		device.description = description;
	}

	public String getDescription(HomeDevice device) {
		return device.description;
	}

	public void setPower(HomeDevice device, int power) {
		if (power > 0) {
			device.power = power;
		} else {
			System.out.println("Power cannot be negative or zero");
		}
	}

	public int getPower(HomeDevice device) {
		return device.power;
	}

	public void setStatus(HomeDevice device, boolean status) {
		device.status = status;
	}

	public boolean getStatus(HomeDevice device) {
		return device.status;
	}

	// this method for toString() method only
	private String printStatus(boolean status) {
		String result;
		if (status) {
			result = "Switched On";
		} else {
			result = "Switched Off";
		}
		return result;
	}

	public String toString(HomeDevice device) {
		return "Device: " + device.description + "; " + "Power: " + device.power + "; " + "Status: " + this.printStatus(device.status) + '\n';
	}
}
