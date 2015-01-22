package edu.ecu.cs.sle.testing;

import static org.junit.Assert.*;

import org.easymock.EasyMock;
import org.junit.Test;

public class ListClassWithMockingTest {

	@Test
	public void testCalculateListLength() {
		MathClass mc = EasyMock.createMock(MathClass.class);
		EasyMock.expect(mc.divide(6, 3)).andReturn(2);
		EasyMock.expect(mc.multiply(2, 5)).andReturn(12);
		
		EasyMock.replay(mc);
		
		assertEquals("Division Test", 2, mc.divide(6, 3));
		assertEquals("Multiplication Test", 10, mc.multiply(2,5));
	}

}
