package edu.ecu.cs.sle.testing;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ListClassTest {

	public static ArrayList<Integer> myList;
	
	@BeforeClass
	public static void setUpClass() {
		System.out.println("Setting up class-level fixture");
		myList = new ArrayList<Integer>();
	}
	
	@AfterClass
	public static void tearDownClass() {
		System.out.println("Tearing down class-level fixture");
		myList = null;
	}
	
	@Before
	public void setUp() {
		System.out.println("Setting up method-level fixture");
		myList.add(5); myList.add(10); myList.add(15);
	}
	
	@After
	public void tearDown() {
		System.out.println("Tearing down method-level fixture");
		myList.clear();
	}
	
	@Test
	public void testCalculateListLength() {
		assertEquals(3,  ListClass.calculateListLength(myList));
	}

}
