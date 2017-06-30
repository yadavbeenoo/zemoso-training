package pizza;

public class SimplePizza implements Pizza {

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Thin Dough";
	}
	@Override
	public double getCost() {
       
		return 4.00;
	}
}
