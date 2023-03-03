package domain;

public class Part {

	private String name;
	private int amount;
	private Double price;


	public Part(String name, int amount, Double price) {
		super();
		this.name = name;
		this.amount = amount;
		this.price = price;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getQuantity() {
		return amount;
	}


	public void setQuantity(int amount) {
		this.amount = amount;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
