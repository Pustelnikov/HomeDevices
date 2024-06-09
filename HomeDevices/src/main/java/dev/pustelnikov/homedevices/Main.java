package dev.pustelnikov.homedevices;

import dev.pustelnikov.homedevices.devices.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



/*
 * Task: Home electrical devices. 
 * Determine the hierarchy of electrical devices. 
 * Plug some into a power outlet. Calculate power consumption. 
 * Sort the devices of the apartment based on power. 
 * Find a device in the apartment that corresponds to the specified range of parameters.
 * 
 * 
 * The application must satisfy the following requirements:
 * 1. Use OOP features: classes, inheritance, polymorphism, encapsulation, abstraction.
 * 2. Java code conventions must be used.
 * 3. Classes must be properly divided into packages.
 * 4. Unit tests (optional)
 * 
 */



public class Main {

	
	public static void main (String[] args) {
		
		
		// Creating of devices
		HomeDevice ceilingChandelier = new CeilingChandelier("Ceiling Chandelier", 300);
		HomeDevice computer = new Computer("Computer", 100);
		HomeDevice fridge = new Fridge("Fridge", 200);
		HomeDevice kettle = new Kettle("Kettle", 1500);
		HomeDevice microwave = new Microwave("Microwave", 2000);
		HomeDevice tableLamp = new TableLamp("Table lamp", 10);
		HomeDevice tv = new TV("TV", 150);
		
		
		
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
		devices.sort(Comparator.comparing(HomeDevice::getPower));
		
		
		
		// Filtering of devices by power range
		List<HomeDevice> filteredByPowerRangeDevices = devices.stream()
				.filter(d -> (d.getPower() >= 150 && d.getPower() <= 1500))
				.collect(Collectors.toCollection(ArrayList::new));
		
		
		
		// Printing of sort result
		System.out.println("All devices (sorted by power)");
		devices.forEach(System.out::print);
		System.out.println('\n');
		
		
		
		// Printing of filter result
		System.out.println("Filtered devices (from 150 to 1500 Watt)");
		filteredByPowerRangeDevices.forEach(System.out::print);
		System.out.println('\n');
		
				
				
		// Switching on of some devices
		// Devices will do some different actions that will be displayed on console 
		computer.setStatus(true);
		fridge.setStatus(true);
		tableLamp.setStatus(true);
		tv.setStatus(true);
		
		
		
		// Printing of switched on devices
		System.out.println('\n' + "Switched on devices");
		for (int i = 0; i < devices.size(); i++) {
			if (devices.get(i).getStatus() == true) {
				System.out.println(devices.get(i).getDescription() + ", " + devices.get(i).getPower() + " W");
			}
		}
		
		
		
		// Calculating of summary power consumption of switched on devices
		int sumPowerOfTurnedOnDevices = devices.stream()
				.filter(d -> d.getStatus() == true)
				.mapToInt(HomeDevice::getPower)
				.sum();
		
		
		
		// Printing of summary power consumption result
		System.out.println('\n');
		System.out.println("Total power consumption of switched on devices, Watt: " + sumPowerOfTurnedOnDevices);
		System.out.println('\n');
				
	}
	
	
}
