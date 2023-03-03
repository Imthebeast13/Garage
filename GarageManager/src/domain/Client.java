package domain;

import java.util.ArrayList;
import java.util.UUID;

public class Client {
	
	private String name;
	private int phoneNumber;
	private String id;
	private ArrayList<Vehicle> vehicleList;
	
	
	/**
	 * Constructor
	 * @param name
	 * @param phoneNumber
	 */
	public Client (String name, int phoneNumber) {
		
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.id = generateID();
		this.vehicleList = new ArrayList<>();
		
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
	
	

}
