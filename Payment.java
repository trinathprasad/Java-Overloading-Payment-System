public class Payment 
{
	public void makePayment(double amount)
	{
		validateAmount(amount);
		System.out.println("Processing payment via Cash...");
		System.out.println("Amount Paid RS :"+amount);
		System.out.println("Payment Successful!");
		
	}
	
	public void makePayment(String cardHolderName, String creditCardNumber,double amount)
	{
		 validateCardNumber(creditCardNumber);
		 validateAmount(amount);
		 System.out.println("Processing payment via Credit Card...");
		 System.out.println("Card Holder:"+cardHolderName);
		 System.out.println("Card Number:"+maskCardNumber(creditCardNumber));
		 System.out.println("Amount Paid RS :"+amount);
		 System.out.println("Payment Successful!");
		
		
	}
	
	public void makePayment(String debitCardNumber, double amount)
	{
		validateAmount(amount);
		validateCardNumber(debitCardNumber);
		System.out.println("Processing payment via Debit Card...");
		System.out.println("Card Number: "+maskCardNumber(debitCardNumber));
		System.out.println("Amount Paid RS :"+amount);
		System.out.println("Payment Successful!");
		
		
	}
	
	private boolean validateAmount(double amount)
	{
		if(amount<=0)
		{
			System.out.println("Invalid amount !!!");
			System.exit(0);
		}
		
			return true;
		
		
	}
	
	private boolean validateCardNumber(String cardNumber)
	{
		if(cardNumber.length()!=16)
		{
			System.out.println("Invalid card Number !!!");
			System.exit(0);
		}
		
			return true;
		
		
	}
	
	private String maskCardNumber(String cardNumber)
	{
		return "****-****-****-"+cardNumber.substring(12);
	}
}
