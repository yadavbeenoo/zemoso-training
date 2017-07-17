package utooCab;

public abstract class Cab {
	private int price;
	private String name;
	//cost of cab booking
	public int getPrice() {
		return price;
	}
	//set cost of cab for booking
	public void setPrice(int price) {
		this.price = price;
	}
	
	//name of cab
	public String getName() {
		return name;
	}
	//set name of cab
	public void setName(String name) {
		this.name = name;
	}
}
