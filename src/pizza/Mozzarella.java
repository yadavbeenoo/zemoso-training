package pizza;

public class Mozzarella extends ToppingDecorator {

	public Mozzarella(Pizza newPizza) {
		
		super(newPizza);
		
		System.out.println("Adding Dough");
		
		System.out.println("Adding Moz");
	}
	
	// Returns the result of calling getDescription() for
	// PlainPizza and adds " mozzarella" to it
	
	public String getDescription(){
		
		return tempPizza.getDescription() + ", mozzarella";
		
	}
	
	public double getCost(){
		
		return tempPizza.getCost() + .50;
		
	}
	
}
