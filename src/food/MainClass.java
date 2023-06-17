package food;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Menu generalMenu=new GeneralMenu();
		OrderProcessor orderProcessor=new OrderProcessor();
		boolean isLoggedIn=false;
		boolean shouldContinue=true;
		int attempts=5;
		
		while(shouldContinue) {
			while(!isLoggedIn&&attempts>0) {
				System.out.println("\nRemaining attempts: "+attempts);
				System.out.print("\n---Enter username: ");
				String username=scanner.nextLine();
				System.out.print("---Enter pasword: ");
				String password=scanner.nextLine();
				
				if(!Login.isUserRegistered(username)) {
					System.out.print("\nAre you a new user? yes/no: ");
					String isNewUser=scanner.nextLine();
					if(isNewUser.equalsIgnoreCase("yes")){
							Login.addUser(username,password);
				}
			}
			isLoggedIn=Login.login(username,password);
			if(!isLoggedIn) {
				System.out.println("Login failed! Please try again.");
				attempts--;
			}
		}
		if(isLoggedIn) {
			System.out.println("\n\nWelcome!");
			generalMenu.displayMenu(scanner,orderProcessor);
			
				isLoggedIn=false;
				attempts=5;
		}
		if(!isLoggedIn) {
			System.out.println("\n\nMax Login attepts reached opr logged out.");
			System.out.print("Do you want to log in again or register or exit? login/register/exit: ");
			String loginAgainOption=scanner.nextLine();
			scanner.nextLine();
			
			if(loginAgainOption.equalsIgnoreCase("exit")) {
				shouldContinue=false;
				System.out.println("Thank you. Goodbye!");
			}
			else if(loginAgainOption.equalsIgnoreCase("register")) {
				System.out.println("Enter username: ");
				String username=scanner.nextLine();
				System.out.println("Enter password: ");
				String password=scanner.nextLine();
				Login.addUser(username,password);
				attempts=5;
			}
			else {
				attempts=5;
			}
		}
	}
}
}
