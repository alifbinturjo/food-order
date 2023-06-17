package food;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FoodMenu extends GeneralMenu implements Menu {
	public void displayMenu( Scanner scanner,OrderProcessor orderProcessor) {
	List<FoodItem> selectedItems=new ArrayList<>();
	boolean isOrdering= true;
	while(isOrdering) {
		System.out.println("\n\n-----FoodMenu-----");
		System.out.println("\nVAT INCLUDED");
		System.out.println("\n1.Pancake--BDT 60");
		System.out.println("2.Porata--BDT 10");
		System.out.println("3.French Fry--BDT 90");
		System.out.println("4.Hot Dog--BDT 60");
		System.out.println("5.Sandwich--BDT 60");
		System.out.println("6.Soda--BDT 30");
		System.out.println("7.Mango Juice--BDT 60");
		System.out.println("8.Lassi--BDT 60");
		System.out.println("9.Watermelon Juice--BDT 60");
		System.out.println("10.Soft Drinks--BDT 30");
		System.out.println("11.Chicken Burger--BDT 300");
		System.out.println("12.Pizza--BDT 350");
		System.out.println("13.Pasta--BDT 100");
		System.out.println("14.Khicuri--BDT 70");
		System.out.println("15.Rice--BDT 25");
		System.out.println("16.Polao--BDT 30");
		System.out.println("17.Chicken Fry--BDT 110");
		System.out.println("18.Beef-- BDT 180 ");
		System.out.println("19.Fish Curry--BDT 80 ");
		System.out.println("20.Complete order");
		System.out.print("\nEnter Your Choice: ");
		int Choice=scanner.nextInt();
		scanner.nextLine();
		switch(Choice) {
		case 1:
			selectedItems.add(new FoodItem("Pancakes",60));
			System.out.println("\n-Pancake added to the order"); 
			break;
		case 2:
			selectedItems.add(new FoodItem("Porata",10));
			System.out.println("\n-Porata added to the order"); 
			break;
		case 3:
			selectedItems.add(new FoodItem("French Fry",90));
			System.out.println("\n-French Fry added to the order");
			case 4:
			selectedItems.add(new FoodItem("Hot Dog",60));
			System.out.println("\n-Hot Dog added to the order"); 
			break;
		case 5:
			selectedItems.add(new FoodItem("Sandwich",60));
			System.out.println("\n-Sandwich added to the order"); 
			break;
		case 6:
			selectedItems.add(new FoodItem("Soda",30));
			System.out.println("\n-Soda added to the order"); 
			break;
		case 7:
			selectedItems.add(new FoodItem("Mango Juice ",60));
			System.out.println("\n-Mango Juice added to the order"); 
			break;
		case 8:
			selectedItems.add(new FoodItem("Lassi",60));
			System.out.println("\n-Lassi added to the order"); 
			break;
		case 9:
			selectedItems.add(new FoodItem("Watermelon juice",60));
			System.out.println("\n-Watermelon Juice added to the order"); 
			break;
		case 10:
			selectedItems.add(new FoodItem("Soft Drinks",30));
			System.out.println("\n-Soft Drinks added to the order"); 
			break;
		case 11:
			selectedItems.add(new FoodItem("Chicken Burger",300));
			System.out.println("\n-Chicken Burger added to the order"); 
			break;
		case 12:
			selectedItems.add(new FoodItem("Pizza",350));
			System.out.println("\n-Pizza added to the order"); 
			break;
		case 13:
			selectedItems.add(new FoodItem("Pasta ",100));
			System.out.println("\n-Pasta added to the order"); 
			break;
		case 14:
			selectedItems.add(new FoodItem("Khicuri",70));
			System.out.println("\n-Khicuri added to the order");
		case 15:
			selectedItems.add(new FoodItem("Rice",25));
			System.out.println("\n-Rice added to the order"); 
			break;
		case 16:
			selectedItems.add(new FoodItem("Polao",30));
			System.out.println("\n-Polao added to the order"); 
			break;
		case 17:
			selectedItems.add(new FoodItem("Chicken Fry",110));
			System.out.println("\n-Chicken Fry added to the order"); 
			break;
		case 18:
			selectedItems.add(new FoodItem("Beef",180));
			System.out.println("\n-Beef added to the order"); 
			break;
		case 19:
			selectedItems.add(new FoodItem("Fish Curry",80));
			System.out.println("\n-Fish Curry added to the order"); 
			break;
		case 20:
			System.out.println("\n\n-----Your Location-----");
			System.out.println("\n1.Mirpur");
			System.out.println("2.Airport");
			System.out.println("3.ECB");
			System.out.println("4.Kuril");
			System.out.println("5.Bashundhara");
			System.out.print("\nEnter choice: ");
			int location=scanner.nextInt();
			switch(location) {
			case 1:
				System.out.println("\nDelivery time: 30 mins");
				break;
			case 2:
				System.out.println("\nDelivery time: 25 mins");
				break;
			case 3:
				System.out.println("\nDelivery time: 20 mins");
				break;
			case 4:
				System.out.println("\nDelivery time: 15 mins");
				break;
			case 5:
				System.out.println("\nDelivery time: 10 mins");
				break;
			default:
				System.out.println("\nInvalid. Try again.");
				break;
			}
			orderProcessor.processOrder(selectedItems);
			isOrdering=false;
			break;
		default :
			System.out.println("\nInvalid Choice. PLease Try Again");
			break;
			
			}
		}
	}

}
	class FoodItem{
		private String name;
		private int price;
		public FoodItem(String name,int price) {
			this.name=name;
			this.price=price;
		}
		public String getName() {
			return name;
		}
		public int getPrice() {
			return price;
	}
}