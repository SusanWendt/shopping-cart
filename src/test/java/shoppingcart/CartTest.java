package shoppingcart;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class CartTest {
	@Test
	public void shouldInstantiateCart() {
		Cart underTest = new Cart();

		Assert.assertNotNull(underTest);
	}

	@Test
	public void shouldReturnCartContents() {
		Cart underTest = new Cart();
		underTest.addItem(new Item("shoes", 3, 25));
		underTest.addItem(new Item("shoes", 3, 75));
		int check = underTest.listSize();
		assertEquals(2, check);
	}

	@Test
	public void shouldReturnTotalCartPrice() {
		Cart underTest = new Cart();
		underTest.addItem(new Item("shoes", 3, 5));
		underTest.addItem(new Item("shoes", 3, 10));
		double check = underTest.getTotalCartPrice();
		Assert.assertEquals(45.00, check, 0.01);
	}

}
