package food;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class GeneralMenu implements Menu {
	public void displayMenu(Scanner scanner,OrderProcessor orderProcessor) {
		boolean isValidChoice=false;
		while(!isValidChoice) {
		System.out.println("\n\n-----General Menu-----");
		System.out.println("\n1. Food order");
		System.out.println("2. Customer support");
		System.out.println("3. Logout");
		System.out.print("\nEnter your choice: ");
		int choice=scanner.nextInt();
		scanner.nextLine();
		
		switch(choice) {
		case 1:
			Menu foodMenu=new FoodMenu();
			foodMenu.displayMenu(scanner,orderProcessor);
			isValidChoice=true;
			break;
		case 2:
			System.out.print("Enter your message(Feedback/Food request/Complain): ");
			String message=scanner.nextLine();
			writeMessageToFile(message);
		case 3:
			System.out.println("Logged out successfully");
			isValidChoice=true;
			break;
		default:
			System.out.println("Invalid choice. Please try again.");
			break;
		}
		}
	}
	private void writeMessageToFile(String message) {
		String filename="customer_support.txt";
		try(BufferedWriter writer=new BufferedWriter(new FileWriter(filename,true))){
			writer.write(message);
			writer.newLine();
			System.out.println("\nMessage written to file successfully.");
		}
		catch(IOException e) {
			System.out.println("Error occured while writing to the file: "+e.getMessage());
		}
	}
}
