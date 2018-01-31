package shoppingcart;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ShopApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Locale locale = new Locale("en", "US");
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

		Cart myCart = new Cart();

		System.out.println("Would you like to add or remove an item to your shopping cart? (add/remove/quit).");
		String choice = input.nextLine();

		while (!choice.equalsIgnoreCase("quit")) {
			String newItemName;
			int newItemQuantity;
			double newItemPrice;

		
			switch (choice) {
			case "add":

				System.out.println("Please enter the name of the item you would like to add to your cart:");
				newItemName = input.nextLine();

				System.out.println("Please enter the number of that item:");
				newItemQuantity = input.nextInt();

				System.out.println("Please enter the price of that item:");
				newItemPrice = input.nextDouble();
				input.nextLine();

				myCart.addItem(new Item(newItemName, newItemQuantity, newItemPrice));
				System.out.println("Current Cart");
				myCart.showCartContents();
				System.out.println(
						"Total cart price: " + currencyFormatter.format(myCart.getTotalCartPrice()) + " at checkout.");
				break;
			case "remove":
				System.out.println("type the name of the item that you would like to remove");
			default:
				System.out.println("Would you like to continue shopping? (y/n)");
				choice = input.nextLine();
			}
		}
		System.out.println("Goodbye");
		input.close();
	}
}
