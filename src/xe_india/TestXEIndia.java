package xe_india;

public class TestXEIndia {
	
	public static void main(String[] args){
		
	Converter converter=new Converter();
	converter.setUSD(65);
	converter.setEURO(69);
	converter.setGBP(80);
	
	Person person1=new Person(converter,2000);
	
	Person person2=new Person(converter,50000);
	converter.setEURO(59);
	
	}
}
