package com.demo3;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testcase {
	@BeforeClass
	public static void beforeClass()throws Exception{
		System.out.println("Before class");
	}
	
	@AfterClass
	public static void afterClass()throws Exception{
		System.out.println("\nAfter class");
	}
	
	@Before
	public void before()throws Exception{
		System.out.println("\nBefore");
	}
	
	@After
	public void after()throws Exception{
		System.out.println("After");
	}
	
	@Test
	public void testcase() {
		System.out.println("testcase for armstrong number");
		assertNotNull(Armstrong.result());
	}
}
