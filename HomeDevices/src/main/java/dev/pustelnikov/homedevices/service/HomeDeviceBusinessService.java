package dev.pustelnikov.homedevices.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import dev.pustelnikov.homedevices.HomeDevice;

// Business services for HomeDevice according to the task
public class HomeDeviceBusinessService {

	public void sortByPower(List<HomeDevice> devices, HomeDeviceDefaultService service) {
		devices.sort(Comparator.comparing(d -> (service.getPower(d))));
	}
	
	public List<HomeDevice> filterByPowerRange(List<HomeDevice> devices, HomeDeviceDefaultService service, int fromPower, int toPower) {
		List<HomeDevice> filteredByPowerDevices = devices.stream()
				.filter(d -> (service.getPower(d) >= fromPower && service.getPower(d) <= toPower))
				.collect(Collectors.toCollection(ArrayList::new));
		return filteredByPowerDevices;
	}
	
	public int calculatePowerOfTurnedOnDevices(List<HomeDevice> devices, HomeDeviceDefaultService service) {
		int sum = 0;
		for (int i = 0; i < devices.size(); i++) {
			if (service.getStatus(devices.get(i)) == true) {
				sum += service.getPower(devices.get(i));
			}
		}
		return sum;
	}
	
	public void showSwitchedOnDevices(List<HomeDevice> devices, HomeDeviceDefaultService service) {
		for (int i = 0; i < devices.size(); i++) {
			if (service.getStatus(devices.get(i)) == true) {
				System.out.println(service.getDescription(devices.get(i)) + ", " + service.getPower(devices.get(i)) + " W");
			}
		}
	}
}
