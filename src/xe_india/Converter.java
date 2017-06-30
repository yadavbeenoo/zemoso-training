package xe_india;

import java.util.ArrayList;

public class Converter implements Subject {
	
	private ArrayList<Observer> observers;
	private double valueUSD=65;
	private double valueGBP=80;
	private double valueEURO=69;
	
	public Converter(){
		observers=new ArrayList<Observer>();
	}
	
	@Override
	public void addPerson(Observer newPerson) {
		observers.add(newPerson);
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
		System.out.println("current conversion rate with INR \nUSD = " + this.valueUSD + "\nEURO = " +
                this.valueEURO + "\nGBP = " + this.valueGBP + "\n");
	}
	
	public void setUSD(double usd){
		System.out.println("recent change in USD\n");
		valueUSD=usd;
		notifyPerson();
	}
	
	public void setEURO(double euro){
		System.out.println("recent change in EURO\n");
		valueEURO=euro;
		notifyPerson();
	}
	
	public void setGBP(double gbp){
		System.out.println("recent change in GBP\n");
		valueGBP=gbp;
		notifyPerson();
	}

}
