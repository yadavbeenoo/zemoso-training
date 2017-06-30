package xe_india;

public class TestXEIndia {
	
	public static void main(String[] args){
		
	Converter converter=new Converter();
	
	@SuppressWarnings("unused")
	Person person1=new Person(converter,2000);
	
	converter.setUSD(65);
	converter.setEURO(69);
	converter.setGBP(80);
	
	@SuppressWarnings("unused")
	Person person2=new Person(converter,50000);
	converter.setEURO(59);
	
	}
}
