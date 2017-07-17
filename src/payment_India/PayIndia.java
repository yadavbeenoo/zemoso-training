package payment_India;

import java.util.Scanner;

public class PayIndia {
	
	private int amount=20000;//balance of user
	PaymentFactory paymentfactory=new PaymentFactory();//factory object to create payment object at runtime
	Payment payment;//payment type will be assigned at runtime
	public PayIndia(String type){
		payment=paymentfactory.createPaymentMode(type,getAmount());
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public void pay(int amt){
		payment.pay(amt);//paying amount using payment method
	}
	
	public void showBalance(){
		payment.showBalance();
	}
	
	public static void main(String[] args){
		String type;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter payment method:\n Credit Card\n Debit Card\n Netbanking\n Wallets\n Cash");
		type=sc.nextLine();
		PayIndia account= new PayIndia(type);
		account.showBalance();
		System.out.println("please enter amount to pay:");
		int amt=sc.nextInt();
		account.pay(amt);
		account.showBalance();
		
		
		sc.close();
	}
}
