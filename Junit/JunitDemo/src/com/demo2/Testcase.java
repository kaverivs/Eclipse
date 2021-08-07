package com.demo2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.*;
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
	public void sum() {
		System.out.println("test case for sum ");
		assertEquals(Arithmetic.a,Arithmetic.sum(Arithmetic.a,Arithmetic.b));
	}
	
	@Test
	public void diff() {
		System.out.println("test case for difference ");
		assertNotNull(Arithmetic.diff(Arithmetic.a,Arithmetic.b));
		}
	

}
