package shoppingcart;

import java.util.ArrayList;

public class Cart {
	private ArrayList<Item> items = new ArrayList<>();

	public void addItem(Item item) {
		items.add(item);

	}

	public void removeItem(Item item) {
		items.remove(item);

	}

	public int listSize() {

		return items.size();
	}

	public double getTotalCartPrice() {
		double totalPrice = 0;
		for (Item item : items) {
			totalPrice += item.getItemTotalPrice();
		}
		return totalPrice;
	}

	public void showCartContents() {
		for (Item item : items) {
			System.out.println(item);
		}
	}
}