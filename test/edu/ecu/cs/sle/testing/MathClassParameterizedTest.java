package edu.ecu.cs.sle.testing;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MathClassParameterizedTest {

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
				{ 0, 0, 0 }, { 0, 1, 0 }, { 1, 1, 1 }, { 2, 5, 10 }
		});
	}
	
	private int leftOperand;
	private int rightOperand;
	private int result;
	
	public MathClassParameterizedTest(int left, int right, int res) {
		leftOperand = left;
		rightOperand = right;
		result = res;
	}
	
	@Test
	public void testMultiply() {
		assertEquals(result, (new MathClass()).multiply(leftOperand, rightOperand));
	}

}
