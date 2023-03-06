package domain;

import java.time.LocalDate;
import java.util.ArrayList;


/**
 * Vehicle Intervention class
 * @author afirm
 *
 */
public class Intervention {

	private String description;
	private Double price;
	private String[] states = {"In Queue", "In Intervention", "Completed"};
	private States state;
	private ArrayList<Part> parts = new ArrayList<>();
	private LocalDate startingDate;
	private LocalDate endingDate;
	private LocalDate entranceDate;
	private Double interventionTime;
	private Vehicle car;
	private Double manPower;
	
	
	enum States {
		InQueue,
		InIntervention,
		Completed
	}
	
	/**
	 * Vehicle Intervention constructor
	 * @param description
	 * @param manPower
	 */
	public Intervention(String description, Double manPower) {
		
		this.description = description;
		this.state = States.InQueue;
		this.interventionTime = null;
		this.price = 0.0;
		this.entranceDate = LocalDate.now();
		this.manPower = manPower;
		
	}
	

	/**
	 * start intervention
	 */
	private void start() {
		this.state = States.InIntervention;
		this.startingDate = LocalDate.now();
	}
	
	/**
	 * finish intervention
	 */
	private void finish() {
		this.state = States.Completed;
		this.endingDate = LocalDate.now();
	}
	
	/**
	 * 
	 * @return intervention state
	 */
	public States getState() {
		return this.state;
	}

	
	/**
	 * Add a part to the list of intervention parts
	 * 
	 * @param name of the part
	 * @param price of the part
	 * @param amount of the part  
	 */
	public void addPart(String name, Double price, int amount) {
		parts.add(new Part(name, amount, price));
	}
	

	/**
	 * 
	 * @param parts
	 * @param interventionTime
	 * @return
	 */
	private Double getFinalPrice(ArrayList<Part> parts, Double interventionTime) {
		
		Double finalValue = 0.0;
		for (Part part : parts) {
			finalValue = finalValue + (part.getPrice() * part.getQuantity());
		}
		return finalValue + (manPower * interventionTime);
	}

	/**
	 * 
	 * @return the description of the intervention
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * sets a description for the intervention
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * 
	 * @return
	 */
	public Double updateBill() {
		getFinalPrice(parts, interventionTime);
		return price;
	}

	/**
	 * 
	 * @param price
	 */
	public void setPrice(Double price) {
		this.price = price;
	}



	
	
	
	
	
}
