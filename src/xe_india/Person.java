package xe_india;

import java.text.DecimalFormat;

public class Person implements Observer {

	private double valueUSD=65;
	private double valueGBP=80;
	private double valueEURO=69;
	@SuppressWarnings("unused")
	private Subject converter;
	private double ammountinINR;
	private static int personIDAss=0;
	
	private final int personID;
	
	public Person(Subject converter,double inr){
		this.converter=converter;
		ammountinINR=inr;
		this.personID=++personIDAss;
		
		System.out.println("new person "+this.personID+" created having amoount="+inr+"\n");
		
		converter.addPerson(this);
	}
	
	
	@Override
	public void update(double usd, double euro, double gbp) {
		this.valueUSD=usd;
		this.valueEURO=euro;
		this.valueGBP=gbp;
		
		printAmmountinDifferentCurrency();
	}


	private void printAmmountinDifferentCurrency() {
		
		DecimalFormat df = new DecimalFormat("#.##");
		double usdammount=Double.valueOf(df.format(ammountinINR/valueUSD));
		double euroammount=Double.valueOf(df.format(ammountinINR/valueEURO));
		double gbpammount=Double.valueOf(df.format(ammountinINR/valueGBP));
		
		System.out.println(personID + " has ammount " + ammountinINR + "\n which is equivalent:\n" + usdammount + " USD\n" +
				                euroammount+" EURO\n" +  gbpammount + " GBP\n");
		
	}
	
	
}
