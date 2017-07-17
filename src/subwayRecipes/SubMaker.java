package subwayRecipes;

public interface SubMaker {
	public void makeBread(String bread);
	public void makeSalad(String salad);
	public void makeSauce(String sauce);
	public void makeAddons(String addons);
	public Sub getSub();
	public int getprice();
}
