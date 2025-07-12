import java.util.Scanner;

public class PaymentProcess {

	public static void main(String[] args) 
	{
		System.out.println("PaymentProcess");
		System.out.println("Please select any one Payment Method from the Menu :");
		System.out.println("\t\t 1) Payment by using Cash ");
		System.out.println("\t\t 2) Payment by using Credit Card ");
		System.out.println("\t\t 3) Payment by using Debit Card ");

		Scanner sc = new Scanner(System.in);
		Payment p1 = new Payment();
		System.out.println("Please enter your Payment choice [1/2/3]");
		int choice = Integer.parseInt(sc.nextLine());
		
		switch(choice)
		{
		case 1:
		{
			System.out.println("Enter the amount you want to pay through cash :");
			sc.nextLine();
			double amount=sc.nextDouble();
			p1.makePayment(amount);
	    }
		break;
		
		case 2 :
		{
			System.out.println("Enter your name :");
			sc.nextLine();
			String cardHolderName = sc.nextLine();
			System.out.println(" Enter your 16 digit Credit Card Number :");
			String creditCardNumber = sc.nextLine();
			System.out.println("Enter your Payment Amount :");
			double amount = sc.nextDouble();
			p1.makePayment(cardHolderName, creditCardNumber,amount);
			
		}
		break;
		
		case 3:
		{
			System.out.println("Enter your 16 digit Debit Card Number :");
			String cardNumber = sc.nextLine();
			System.out.println("Enter your Payment Amount :");
			double amount = sc.nextDouble();
			p1.makePayment(cardNumber,amount);
		}
		break;
		
		default : System.out.println("Invalid choice!!!");
		
		}
		sc.close();
		}

}
