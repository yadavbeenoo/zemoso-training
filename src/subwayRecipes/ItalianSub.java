package subwayRecipes;

public class ItalianSub  implements Sub{

	private Bread breadType;
	private Salad saladType;
	private Sauce sauceType;
	private Addons addons;
	
	
	public void setBreadType(String bread) {
		if(bread.equals("FlatBread"))
			this.breadType=new FlatBread();
		else if(bread.equals("ItalianBread"))
			this.breadType=new ItalianBread();
		else{
			System.out.println("Not Available,Taking Default one FlatBread");
			this.breadType=new FlatBread();
		}	
	}
	
	public void setSaladType(String salad) {
		if(salad.equals("Spinach"))
			this.saladType=new Spinach();
		else if(salad.equals("Pickles"))
			this.saladType=new Pickles();
		else{
			System.out.println("Not Available,Taking Default one Spinach");
			this.saladType=new Spinach();
		}
	}

	
	public void setSauceType(String sauce) {
		if(sauce.equals("Ranch"))
			this.sauceType=new Ranch();
		if(sauce.equals("Tamato"))
			this.sauceType=new Tamato();
		else{
			System.out.println("Not Available,Taking Default one Tamato");
			this.sauceType=new Tamato();
		}
	}

	
	public void setAddons(String addons) {
		if(addons.equals("Cheese"))
			this.addons=new Cheese();
		else{
			System.out.println("Not Available,Taking Default one Cheese");
			this.addons=new Cheese();
		}
	}

	@Override
	public Bread getBreadType() {
		return breadType;
	}

	@Override
	public Salad getSaladType() {
		return saladType;
	}

	@Override
	public Sauce getSauceType() {
		return sauceType;
	}

	@Override
	public Addons getAddonsType() {
		return addons;
	}
	
}
