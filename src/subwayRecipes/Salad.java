package subwayRecipes;

public abstract class Salad {
	private int price;
	private String name;
	
	public Salad(String name,int price){
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
