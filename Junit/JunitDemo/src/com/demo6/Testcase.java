package com.demo6;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testcase {
	
	private static Average avg;
	private static SumOfDigit sum;
	
	@Before
	public void setUpBefore()throws Exception {
		System.out.println("before");
	}
	
	@BeforeClass
	public static void setUpBeforeClass()throws Exception{
		avg=new Average();
		sum=new SumOfDigit();	
		System.out.println("before class");
	}

	@Test
	public void average() {
		System.out.println("Test case for average");
		assertNotNull(avg.n);
		assertNotNull(avg.d);
		assertNotNull(avg.avg());
	}
	
	@Test
	public void sum() {
		System.out.println("Test case for sum");
		assertNotNull(sum.n);
		assertNotNull(sum.sum());
	}
	
	
	@After
	public void tearDown() throws Exception{
		System.out.println("after");
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception{
		System.out.println("after class");
	}
}
