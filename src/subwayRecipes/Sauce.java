package subwayRecipes;

public abstract class Sauce {
	private int price;
	private String name;
	
	public Sauce(String name,int price){
		this.price=price;
		this.name=name;
	}
	public int getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}
}
