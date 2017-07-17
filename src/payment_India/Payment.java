package payment_India;

public abstract class Payment {
	private int amount;
	public void pay(int amt) {
		
		if(getAmount()>=amt){
			setAmount(getAmount()-amt);
			System.out.println("You Have Paid a Amount of "+amt);
		}else {
			System.out.println("You don't have Sufficient money to pay this amount:"+amt);
		}
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public void showBalance(){
		System.out.println("Your Curr Balance: "+getAmount());
	}
}
