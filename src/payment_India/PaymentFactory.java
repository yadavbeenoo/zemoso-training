package payment_India;

public class PaymentFactory {
	
	Payment createPaymentMode (String type, int accBalance){
		if(type.equals("Credit Card"))
			return new CreditCard(accBalance);
		else if(type.equals("Debit Card"))
			return new DebitCard(accBalance);
		else if(type.equals("Netbanking"))
			return new Netbanking(accBalance);
		else if(type.equals("Wallets"))
			return new Wallets(accBalance);
		else if(type.equals("Cash"))
			return new CashOnDelivery(accBalance);
		return null;
	}
}
