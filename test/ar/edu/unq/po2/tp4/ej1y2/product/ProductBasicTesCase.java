package ar.edu.unq.po2.tp4.ej1y2.product;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.ej1y2.product.ProductBasic;

import static org.junit.jupiter.api.Assertions.*;

public class ProductBasicTesCase {

	private ProductBasic milk;
	private ProductBasic rice;
	
	@BeforeEach
	public void setUp() {
		milk = new ProductBasic(11, false, "Milk", 8d);
		rice = new ProductBasic(8, false, "Rice", 18.9d);
	}
	
	@Test
	public void testEstimePriceOfMilk() {
		assertEquals(7.12, milk.getPrice());
	}
	
	@Test
	public void testEstimePriceOfRice() {
		assertEquals(17.39, rice.getPrice());
	}
}
