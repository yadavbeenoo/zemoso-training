package payment_India;

public class DebitCard extends Payment {
	
	public DebitCard(int curAmt){
		setAmount(curAmt);
	}
	
	public void pay(int amt){
		System.out.println("You are doing payment using debit Card:");
		super.pay(amt);
	}
}
