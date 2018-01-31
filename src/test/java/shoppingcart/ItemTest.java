package shoppingcart;

import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Test;

public class ItemTest {

	@Test
	public void shouldInitiateItem() {
		Item underTest = new Item();
		assertNotNull(underTest);
	}

	@Test
	public void shouldInstantiateItemName() {
		Item underTest = new Item("toy", 0, 0);
		String result = underTest.getName();
		Assert.assertEquals("toy", result);
	}

	@Test
	public void shouldInstantiateItemQuantity() {
		Item underTest = new Item("toy", 2, 0);
		int result = underTest.getQuantity();
		Assert.assertEquals(2, result);
	}

	@Test
	public void shouldInstantiateItemPrice() {
		Item underTest = new Item("toy", 2, 5);
		double result = underTest.getPrice();
		Assert.assertEquals(5, result, 0.01); // need to clarify rounding decimal with double values
	}

	@Test
	public void shouldReturnItemTotalPrice() {
		Item underTest = new Item("toy", 2, 5);
		double result = underTest.getItemTotalPrice();
		Assert.assertEquals(10, result, 0.01);
	}
}