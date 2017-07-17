package subwayRecipes;

public class SubApp {
	public static void main(String[] args){
		 
		SubMaker subMaker=new SimpleSubmaker();
		SubwayStore substore=new SubwayStore(subMaker);
		
		substore.makeSub();
		substore.showPrice();
	}
}
