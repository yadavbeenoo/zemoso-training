package subwayRecipes;

public abstract class Bread {
	private int price;
	private String name;
	
	public Bread(String name,int price){
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
