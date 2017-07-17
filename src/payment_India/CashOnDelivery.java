package payment_India;

public class CashOnDelivery extends Payment {
	
	public CashOnDelivery(int curAmt){
		setAmount(curAmt);
	}
	
	public void pay(int amt){
		System.out.println("You are paying in cash:");
		super.pay(amt);
	}
}
