package dev.pustelnikov.homedevices;

import java.util.ArrayList;
import java.util.List;
import dev.pustelnikov.homedevices.service.HomeDeviceBusinessService;
import dev.pustelnikov.homedevices.service.HomeDeviceDefaultService;

/* 
 * Task: Home electrical devices. 
 * Determine the hierarchy of electrical devices. 
 * Plug some into a power outlet. Calculate power consumption. 
 * Sort the devices of the apartment based on power. 
 * Find a device in the apartment that corresponds to the specified range of parameters.
 * 
 * The application must satisfy the following requirements:
 * 1. Use OOP features: classes, inheritance, polymorphism, encapsulation, abstraction.
 * 2. Java code conventions must be used.
 * 3. Classes must be properly divided into packages.
 * 4. Unit tests (optional)
 */

public class Main {

	public static void main (String[] args) {
	
		// Creating of devices
		HomeDevice ceilingChandelier = new HomeDevice("Ceiling Chandelier", 300, false);
		HomeDevice computer = new HomeDevice("Computer", 100, false);
		HomeDevice fridge = new HomeDevice("Fridge", 200, false);
		HomeDevice kettle = new HomeDevice("Kettle", 1500, false);
		HomeDevice microwave = new HomeDevice("Microwave", 2000, false);
		HomeDevice tableLamp = new HomeDevice("Table lamp", 10, false);
		HomeDevice tv = new HomeDevice("TV", 150, false);
		
		// Creating of services for devices
		HomeDeviceDefaultService defaultService = new HomeDeviceDefaultService();
		HomeDeviceBusinessService businessService = new HomeDeviceBusinessService();
		
		// Adding of devices to collection for operations
		List<HomeDevice> devices = new ArrayList<>();
		devices.add(ceilingChandelier);
		devices.add(computer);
		devices.add(fridge);
		devices.add(kettle);
		devices.add(microwave);
		devices.add(tableLamp);
		devices.add(tv);
		
		// Sorting of devices by power
		businessService.sortByPower(devices, defaultService);
		
		// Filtering of devices by power range
		List<HomeDevice> filteredByPowerRangeDevices = businessService.filterByPowerRange(devices, defaultService, 150, 1500);
		
		// Displaying of sort result
		System.out.println("All devices (sorted by power)");
		devices.forEach(d -> System.out.print(defaultService.toString(d)));
		System.out.println('\n');
		
		// Displaying of filter result
		System.out.println("Filtered devices (by power range)");
		filteredByPowerRangeDevices.forEach(d -> System.out.print(defaultService.toString(d)));
		System.out.println('\n');
		
		// Switching on of some devices
		defaultService.setStatus(computer, true);
		defaultService.setStatus(fridge, true);
		defaultService.setStatus(tableLamp, true);
		defaultService.setStatus(tv, true);

		// Displaying of switched on devices
		System.out.println("Switched on devices");
		businessService.showSwitchedOnDevices(devices, defaultService);
		System.out.println('\n');

		// Calculating of summary power consumption of switched on devices
		int sumPowerOfTurnedOnDevices = businessService.calculatePowerOfTurnedOnDevices(devices, defaultService);
		
		// Displaying of summary power consumption result
		System.out.println("Total power consumption of switched on devices, Watt: " + sumPowerOfTurnedOnDevices);
	}
}
