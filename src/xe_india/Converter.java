package xe_india;

import java.util.ArrayList;

public class Converter implements Subject {
	
	private ArrayList<Observer> observers;
	private double valueUSD;
	private double valueGBP;
	private double valueEURO;
	
	public Converter(){
		observers=new ArrayList<Observer>();
	}
	
	@Override
	public void addPerson(Observer newPerson) {
		observers.add(newPerson);
		notifyPerson();
	}

	@Override
	public void removePerson(Observer removePerson) {
		int observerIndex = observers.indexOf(removePerson);
		
		System.out.println("Person " + (observerIndex+1) + " removed");
		
		observers.remove(observerIndex);
	}

	@Override
	public void notifyPerson() {
		for(Observer person: observers){
			person.update(valueUSD,valueEURO,valueGBP);
		}
		
		if(!observers.isEmpty())
			System.out.println("current conversion rate with INR \nUSD = " + this.valueUSD + "\nEURO = " +
                this.valueEURO + "\nGBP = " + this.valueGBP + "\n");
	}
	
	public void setUSD(double usd){
		System.out.println("value of USD is set\n");
		valueUSD=usd;
		notifyPerson();
	}
	
	public void setEURO(double euro){
		System.out.println("value of EURO is set\n");
		valueEURO=euro;
		notifyPerson();
	}
	
	public void setGBP(double gbp){
		System.out.println("value of GBP is set\n");
		valueGBP=gbp;
		notifyPerson();
	}

}
