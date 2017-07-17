package subwayRecipes;

public interface Sub {
	public void setBreadType(String bread);
	public void setSaladType(String salad);
	public void setSauceType(String sauce);
	public void setAddons(String addons);
	public Bread getBreadType();
	public Salad getSaladType();
	public Sauce getSauceType();
	public Addons getAddonsType();
}
