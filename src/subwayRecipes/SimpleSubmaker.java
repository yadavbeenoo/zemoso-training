package subwayRecipes;

public class SimpleSubmaker implements SubMaker {
	private Sub sub=new ItalianSub();
	@Override
	public Sub getSub() {
		
		return sub;
	}

	@Override
	public int getprice() {
		
		return  sub.getBreadType().getPrice()+
				sub.getSaladType().getPrice()+
				sub.getSauceType().getPrice()+
				sub.getAddonsType().getPrice();
	}

	@Override
	public void makeBread(String bread) {
		sub.setBreadType(bread);
	}

	@Override
	public void makeSalad(String salad) {
		sub.setSaladType(salad);
	}

	@Override
	public void makeSauce(String sauce) {
		sub.setSauceType(sauce);
		
	}

	@Override
	public void makeAddons(String addons) {
		sub.setAddons(addons);
	}

}
