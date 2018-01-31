package shoppingcart;

import java.text.NumberFormat;
import java.util.Locale;

public class Item {

	private String name;
	private int quantity;
	private double price;

	public Item() {

	}

	public Item(String name, int quantity, double price) {
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	@Override
	public String toString() {
		Locale locale = new Locale("en", "US");
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
		return "Item [item=" + name + ", quantity=" + quantity + " price = " + currencyFormatter.format(price) + "]";
	}

	public String getName() {

		return name;
	}

	public int getQuantity() {

		return quantity;
	}

	public double getPrice() {

		return price;
	}
	public double getItemTotalPrice() {

		return quantity*price;
	}

}
