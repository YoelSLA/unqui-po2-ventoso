package ar.edu.unq.po2.tp4.ej1y2.supermarket;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.ej1y2.product.Product;
import ar.edu.unq.po2.tp4.ej1y2.supermarket.Supermarket;

import static org.junit.jupiter.api.Assertions.*;

public class SupermarketTestCase {

	private Product rice;
	private Product detergent;
	private Supermarket supermarket;

	@BeforeEach
	public void setUp() {
		rice = new Product(true, "Rice", 18.9d);
		detergent = new Product("Detergent", 75d);
		supermarket = new Supermarket("Av Zubeldia 801", "Lo de Tito");
	}

	@Test
	public void testQuantityOfProducts() {
		assertEquals(0, supermarket.totalQuantityOfProductosToSell());
		supermarket.addProduct(rice);
		supermarket.addProduct(detergent);
		assertEquals(2, supermarket.totalQuantityOfProductosToSell());
	}

	@Test
	public void testTotalPriceOfProducts() {
		assertEquals(0, supermarket.totalSumOfProductPrices());
		supermarket.addProduct(rice);
		supermarket.addProduct(detergent);
		assertEquals(93.9, supermarket.totalSumOfProductPrices(), 0);
	}
}
