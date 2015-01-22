package edu.ecu.cs.sle.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathClassTest {

	@Test
	public void testMultiply() {
		fail("Not yet implemented");
	}

	@Test(expected = ArithmeticException.class)
	public void testDivideBy0() {
		(new MathClass()).divide(5, 0);
	}
}
