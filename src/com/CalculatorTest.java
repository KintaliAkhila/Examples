package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	
	
	
	
	@Before
	void addtest()
	{
		System.out.println("can do initialization task before each run test");
	}
	@Test
	void testAdd() {
		assertEquals(10, c.add());
	}
	
	@After
	@Test
	void subtest()
	{
		System.out.println("cleanup task after each test case is executed");
	}
	

	@Test
	void testSubtract() {
     assertEquals(2, c.subtract());
	}
	

	@Test
	void testMultiplication() {
assertEquals(24, c.multiplication());
}
	

	@Test
	void testDivision()
	{
assertEquals(1, c.division());	
}
	
	@BeforeClass
	void multest()
	{
		System.out.println("execute task before start of tests ");
	}
	
		
	@AfterClass
	void divisiontest()
	{
		System.out.println("cleanup all tasks after all the tests are completed ");
	}
	
	@Ignore
	void d1()
	{
		System.out.println("to ignore the test method");
	}

	
	
	Calculator c=new Calculator();

	

}
