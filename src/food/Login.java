package food;

public class Login {
	private static final int MAX_USERS=10;
	private static String[] usernames=new String[MAX_USERS];
	private static String[] passwords=new String[MAX_USERS];
	private static int userCount=0;
	
	public static void addUser(String username, String password) {
		if(userCount<MAX_USERS) {
			usernames[userCount]=username;
			passwords[userCount]=password;
			userCount++;
			System.out.println("\n\nUser registered successfully");
		}
		else {
			System.out.println("User limit reached. Cannot register more users.");
		}
	}
	public static boolean isUserRegistered(String username) {
		for(int i=0;i<userCount;i++) {
			if(username.equals(usernames[i])) {
				return true;
			}
		}
		return false;
	}
	public static boolean login(String username,String password) {
		for (int i=0;i<userCount;i++) {
			if(username.equals(usernames[i])&&password.equals(passwords[i])) {
				System.out.println("\nLogin successful!");
				return true;
			}
		}
		System.out.println("Invallid username or password.");
		return false;
	}
}