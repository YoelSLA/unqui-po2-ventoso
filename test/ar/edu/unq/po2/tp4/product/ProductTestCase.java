package ar.edu.unq.po2.tp4.product;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class ProductTestCase {
	
	private Product rice;
	private Product wine;
	
	@BeforeEach
	public void setUp() {
		rice = new Product(true, "Rice", 18.9d);
		wine = new Product("Wine", 55d);
	}
	
	@Test
	public void testConstructor() {
		assertEquals("Rice", rice.getName());
		assertEquals(18.9, rice.getPrice());
		assertTrue(rice.isAgreedPrice());
		
		assertEquals("Wine", wine.getName());
		assertEquals(55, wine.getPrice());
		assertFalse(wine.isAgreedPrice());
	}
	
	@Test
	public void testAumentarPrecio() {
		rice.increasePrice(1.5);
		assertEquals(20.4, rice.getPrice());
	}
}
