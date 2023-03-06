package domain;

import java.util.ArrayList;
import java.util.UUID;

public class Client {
	
	private String name;
	private int phoneNumber;
	private String id;
	private ArrayList<Vehicle> vehicleList;
	private String address;
	
	
	/**
	 * Constructor
	 * @param name
	 * @param phoneNumber
	 */
	public Client (String name, int phoneNumber, String address) {
		
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.id = generateID();
		this.vehicleList = new ArrayList<>();
		this.address = address;
		
	}


	@Override
	public String toString() {
		return "Client [name=" + name + ", phoneNumber=" + phoneNumber + ", id=" + id + "]";
	}


	private String generateID() {
		
		return UUID.randomUUID().toString();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getID() {
		return id;
	}
	
	public void addVehicle(Vehicle v) {
		vehicleList.add(v);
	}
	
	public void removeVehicle(Vehicle v) {
		vehicleList.remove(v);
		System.out.println("Vehicle " + v.getBrand() + " " + v.getModel() + " removed from client vehiles");
	}
	
	public void getVehicleList() {
		System.out.println("Vehicles:\n");
		for (Vehicle v : vehicleList) {
			v.printVehicleInfo();
		}
	}
	
	

}
