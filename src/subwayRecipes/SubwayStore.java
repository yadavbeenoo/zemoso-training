package subwayRecipes;

import java.util.Scanner;

public class SubwayStore {
	private SubMaker subMaker;
	
	public SubwayStore(SubMaker subMaker){
		this.subMaker=subMaker;
	}
	
	public Sub getSub(){
		return this.subMaker.getSub();
	}
	
	public void makeSub(){
		System.out.println("Welcome to Italian Subway:");
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter type of Bread u want from below:\n1.FlatBread\n2.ItalianBread");
		String bread=sc.next();
		this.subMaker.makeBread(bread);
		
		System.out.println("Please enter type of Salad u want from below:\n1.Spinach\n2.Pickles");
		String salad=sc.next();
		this.subMaker.makeSalad(salad);
		
		System.out.println("Please enter type of Sauce u want from below:\n1.Ranch\n2.Tamato");
		String sauce=sc.next();
		this.subMaker.makeSauce(sauce);
		
		System.out.println("Please enter type of Addons u want from below:\n1.Cheese");
		String addons=sc.next();
		this.subMaker.makeAddons(addons);
		
		sc.close();
	}
	
	public void showPrice(){
		System.out.println("Total cost of Sub is : "+this.subMaker.getprice());
	}
}
