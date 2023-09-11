package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CounterTestCase {

	private Counter counter;

	@BeforeEach
	public void setUp() throws Exception {
		counter = new Counter();

		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
	}

	@Test
	public void testEvenNumbers() {
		assertEquals(counter.getEvenNumbers(), 1);
	}

	@Test
	public void testOddNumbers() {
		assertEquals(counter.getOddNumbers(), 9);
	}

	@Test
	public void testMultipliersOfFive() {
		assertEquals(counter.getMultipliersOf(5), 6);
	}

}
