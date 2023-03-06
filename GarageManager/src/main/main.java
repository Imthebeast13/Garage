package main;



import domain.Vehicle;
import facade.DClient;
import facade.GarageManager;
import facade.handlers.ClientHandler;
import facade.handlers.InterventionHandler;
import facade.handlers.VehicleHandler;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("TESTE TESTE");
		
		GarageManager gm = new GarageManager();
		
		//registar novo cliente
		ClientHandler ch = gm.getClientHandler();
		ch.newClient("André", 961237815, "Rua XPTO");
		
		
		
		/*
		c.addVehicle(new Vehicle("Mazda", "MX-5", "10-AA-52", 125000));
		c.addVehicle(new Vehicle("Opel", "Astra", "04-AD-52", 125000));
		c.addVehicle(new Vehicle("BMW", "M3", "85-JG-34", 125000));
		*/
		System.out.println("TESTING vehicle list...");
		//c.getVehicleList();
		System.out.println("TESTE 3");
	
		
	}

}
