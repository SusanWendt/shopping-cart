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

		System.out.println("Welcome to ShoppingCart!");
		System.out.println("Press enter for options.");

		String option = input.nextLine();

		while (!option.equalsIgnoreCase("3")) {

			System.out.println("ShoppingCart options:");
			System.out.println("add item: enter '1'");
			System.out.println("remove item: enter '2'");
			System.out.println("quit: enter '3'");
			System.out.println("continyue shopping: type 'y'");
			option = input.nextLine();

			String newItemName;
			int newItemQuantity;
			double newItemPrice;

			if (option.equals("1")) {
				System.out.println("Please enter the name of the item you would like to add to your cart:");
				newItemName = input.nextLine();

				System.out.println("Please enter the number of that item:");
				newItemQuantity = input.nextInt();

				System.out.println("Please enter the price of that item:");
				newItemPrice = input.nextDouble();

				myCart.addItem(new Item(newItemName, newItemQuantity, newItemPrice));
				System.out.println("Current Cart Contents");
				myCart.showCartContents();
				System.out.println(
						"Total cart price: " + currencyFormatter.format(myCart.getTotalCartPrice()) + " at checkout.");
				option = input.nextLine();
			}
			if (option.equals("2")) {
				String name;
				System.out.println("type the name of the item that you would like to remove");
				name = input.nextLine();
				myCart.removeItem(name);
				System.out.println("Current Cart Contents");
				myCart.showCartContents();
				System.out.println(
						"Total cart price: " + currencyFormatter.format(myCart.getTotalCartPrice()) + " at checkout.");
			}
			if (option.equals("3")) {
				System.out.println("Goodbye");
				input.close();
//				System.exit(0);
			}
		}
	}
}
