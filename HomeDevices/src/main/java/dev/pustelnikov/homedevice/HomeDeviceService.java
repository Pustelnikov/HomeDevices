package dev.pustelnikov.homedevice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Business services for HomeDevice
public class HomeDeviceService {

	public void sortByPower(List<HomeDevice> devices) {
		devices.sort(Comparator.comparing(d -> d.getPower()));
	}
	
	public List<HomeDevice> filterByPowerRange(List<HomeDevice> devices, int fromPower, int toPower) {
		List<HomeDevice> filteredByPowerDevices = devices.stream()
				.filter(d -> d.getPower() >= fromPower && d.getPower() <= toPower)
				.collect(Collectors.toCollection(ArrayList::new));
		return filteredByPowerDevices;
	}
	
	public int calculatePowerOfTurnedOnDevices(List<HomeDevice> devices) {
		int sum = devices.stream()
				.filter(d -> d.isStatus() == true)
				.mapToInt(d -> d.getPower())
				.sum();
		return sum;
	}
	
	public void showSwitchedOnDevices(List<HomeDevice> devices) {
		devices.stream()
		.filter(d -> d.isStatus() == true)
		.forEach(d -> System.out.println(d.toString()));
	}
}