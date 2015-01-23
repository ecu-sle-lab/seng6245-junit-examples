package edu.ecu.cs.sle.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnotherMathClassTest {

	@Test
	public void testMultiplyBy0() {
		MathClass mc = new MathClass();
		assertNotNull(mc);
		
		int res = mc.multiply(5, 0);
		assertEquals("5*0", 0, res);
	}

	@Test
	public void testMultiplyBySelf() {
		MathClass mc = new MathClass();
		assertNotNull(mc);
		
		int res = mc.multiply(5, 5);
		assertEquals("5*5", 25, res);
	}

	@Test
	public void testDivide() {
		assertEquals("5/5", 1, (new MathClass()).divide(5,5));
	}

}
