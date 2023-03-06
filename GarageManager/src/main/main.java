package main;


import java.util.Optional;

import domain.Client;
import domain.Vehicle;
import facade.DClient;
import facade.GarageManager;
import facade.handlers.ClientHandler;
import facade.handlers.InterventionHandler;
import facade.handlers.VehicleHandler;

public class main {

	public static void main(String[] args) {
		
		System.out.println("TESTING");
		
		GarageManager gm = new GarageManager();
		
		//calling handlers
		ClientHandler ch = gm.getClientHandler();
		VehicleHandler vh = gm.getVehicleHandler();
		InterventionHandler ih = gm.getInterventionHandler();

		//registar novo cliente
		System.out.println("Adding a new client");
		ch.newClient("André", 961237815, "Rua XPTO");
		
		//verifica se o cliente existe na bd
		ch.clientExists("André", 961237815);
		//se existe adiciona um veiculo ao cliente
		if(ch.clientExists("André", 961237815)) {
			Client c = ch.getClient("André", 961237815);
			System.out.println("Printing client...");
			c.toString();
			vh.newVehicle(c, "Mazda", "MX-5", "10-AA-52", 125000);
			if(vh.vehicleExists("10-AA-52")) {
				System.out.println("Printing Vehicle...");
				Vehicle v = vh.getVehicle("10-AA-52");
				ih.newIntervention(v, "Description", 20.0);
			}	
		}
		System.out.println("ENDING TESTING...");

		/*
		c.addVehicle(new Vehicle("Mazda", "MX-5", "10-AA-52", 125000));
		c.addVehicle(new Vehicle("Opel", "Astra", "04-AD-52", 125000));
		c.addVehicle(new Vehicle("BMW", "M3", "85-JG-34", 125000));
		*/
		
	
		
	}

}
