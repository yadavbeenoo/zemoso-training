package payment_India;

public class Netbanking extends Payment {
	
	public Netbanking(int curAmt){
		setAmount(curAmt);
	}
	
	public void pay(int amt){
		System.out.println("You are doing payment using NetBanking:");
		super.pay(amt);
	}
}
