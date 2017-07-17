package payment_India;

public class CreditCard extends Payment {
	
	public CreditCard(int curAmt){
		setAmount(curAmt);
	}
	
	public void pay(int amt){
		System.out.println("You are doing payment using Credit Card:");
		super.pay(amt);
	}
}
