package domain;

import java.util.ArrayList;
import java.util.Optional;



public class Vehicle {
	
	private String brand;
	private String model;
	private String licencePlate;
	private int km;
	private ArrayList<Intervention> interventions = new ArrayList<>();
	
	
	public Vehicle(String brand, String model, String licencePlate, int km) {
		super();
		this.brand = brand;
		this.model = model;
		this.licencePlate = licencePlate;
		this.km = km;
		this.interventions = interventions;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getLicencePlate() {
		return licencePlate;
	}


	public void setLicencePlate(String licencePlate) {
		this.licencePlate = licencePlate;
	}


	public int getKm() {
		return km;
	}


	public void setKm(int km) {
		this.km = km;
	}
	
	public void getInterventions() {
		for (Intervention intervention : interventions) {
			intervention.toString();
		}
	}


	public void printVehicleInfo() {
		System.out.println("Vehicle: " + 
				this.brand + " " + 
				this.model);
		
	}
	
	
	
	
	

}
