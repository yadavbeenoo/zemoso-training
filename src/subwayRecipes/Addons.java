package subwayRecipes;

public abstract class Addons {
	private int price;
	private String name;
	
	public Addons(String name,int price){
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
