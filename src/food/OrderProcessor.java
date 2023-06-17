package food;
import java.util.List;
import java.util.Scanner;

public class OrderProcessor {

	public void processOrder(List<FoodItem> selectedItems)
	{
		System.out.println("\n\n-----Order summary-----");
		int totalAmount = 0;
		for (FoodItem item : selectedItems)
		{
			System.out.println("\nFood:"+ item.getName());
			System.out.println("Price:"+ item.getPrice());
			totalAmount+=item.getPrice();
			
		}
		totalAmount+=10;
		System.out.println("\n\nTotal Amount(Including BDT 10 delivery charge): BDT"+totalAmount);
		System.out.print("\n---Enter 10 to get BDT10 off: ");
		Scanner scanner = new Scanner(System.in);
		int off=scanner.nextInt();
		totalAmount-=off;
		System.out.println("\n-Discounted price: BDT"+totalAmount);
		boolean isValidPayment = false;
		while(!isValidPayment) {
			System.out.println("\n\n-----Select a payment method-----");
			System.out.println("\n1.Bkash");
			System.out.println("2.Card");
			System.out.println("3.Cash");
			System.out.print("\nEnter your Choice: ");
			int payementChoice = scanner.nextInt();
			scanner.nextLine();
			switch (payementChoice) {
			case 1:
				isValidPayment = processBKashPayment(totalAmount);
				break;
			case 2:
				isValidPayment = processCardPayment(totalAmount);
				break;
			case 3:
				isValidPayment = processCashPayment(totalAmount);
				break;
			}
		}
	}
	private boolean processBKashPayment(int totalAmount) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\n---Enter Your Bkash Number 11 Digits: ");
        String bkashNumber = scanner.nextLine();
        while(bkashNumber.length() != 11) {
        	 System.out.println("Invalid Bkash Number Please.Enter 11 Digits");
        	 System.out.print("\n\n---Enter Your Bkash Number 11 Digits: ");
             bkashNumber = scanner.nextLine();
        	 
        }
        System.out.print("\n-Enter The Payment Amount: BDT");
        int paymentAmount = scanner.nextInt();
        scanner.nextLine();
        while(paymentAmount < totalAmount){
        	 System.out.println("\nPayment Amount is less Than Total Amount.Please enter Again.");
        	 System.out.print("\n-Enter The Payment Amount: BDT");
             paymentAmount = scanner.nextInt();
             scanner.nextLine();
        }
       if(paymentAmount == totalAmount) {
    	   System.out.println("\n\n---Thank You For Your payment Via Bkash");
    	   return true;
       }
       else {
    	   int refundAmount = paymentAmount - totalAmount;
    	   System.out.println("\n\n---Payment Successfull Via Bkash.Your Refund Amount BDT "+refundAmount);
    	   System.out.println("\n-Thank You");
    	   return true;
       }
        }
	private boolean processCardPayment(int totalAmount) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\n---Enter Your Card Number 16 Digits: ");
        String cardNumber = scanner.nextLine();
        while(cardNumber.length() != 16) {
        	 System.out.println("Invalid Card Number Please Enter 16 Digits");
        	 System.out.print("\n\n---Enter Your Card Number 16 Digits: ");
             cardNumber = scanner.nextLine();
        	 
        }
        System.out.print("\n-Enter The Payment Amount: BDT");
        int paymentAmount = scanner.nextInt();
        scanner.nextLine();
        while(paymentAmount < totalAmount){
        	 System.out.println("\n-Payment Amount is less Than Total Amount.Please enter Again");
        	 System.out.println("\n-Enter The Payment Amount: BDT");
             paymentAmount = scanner.nextInt();
             scanner.nextLine();
        }
       if(paymentAmount == totalAmount) {
    	   System.out.println("\n\n-Thank You For Your payment Via Card");
    	   return true;
       }
       else {
    	   int refundAmount = paymentAmount - totalAmount;
    	   System.out.println("\n\n-Payment Successfull Via Card.Your Refund Amount"+refundAmount);
    	   System.out.println("\n-Thank You");
    	   return true;
       }
        }
	private boolean processCashPayment(int totalAmount) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\n\n---Enter The Payment Amount: BDT");
        int paymentAmount = scanner.nextInt();
        scanner.nextLine();
        while(paymentAmount < totalAmount){
        	 System.out.println("Payment Amount is less Than Total Amount.Please enter Again");
        	 System.out.print("\n\n---Enter The Payment Amount: BDT");
             paymentAmount = scanner.nextInt();
             scanner.nextLine();
        }
       if(paymentAmount == totalAmount) {
    	   System.out.println("\n\n-Thank You For Your payment Via Cash");
    	   return true;
       }
       else {
    	   int refundAmount = paymentAmount - totalAmount;
    	   System.out.println("\n\n-Payment Successfull Via Cash.Your Refund Amount"+refundAmount);
    	   System.out.println("\n-Thank You");
    	   return true;
       }
    }
}