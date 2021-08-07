package com.demo4;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestcaseReverse {
	@BeforeClass
	public static void beforeClass()throws Exception{
		System.out.println("Before class");
	}
		
	@Before
	public void before()throws Exception{
		System.out.println("\nBefore");
	}
	
	@Test
	public void reverse() {
		System.out.println("Testcase for reverse string");
		assertEquals(ReverseString.Orginal(),ReverseString.reverse(ReverseString.string));
	}
	
	@After
	public void after()throws Exception{
		System.out.println("After");
	}

	@AfterClass
	public static void afterClass()throws Exception{
		System.out.println("\nAfter class");
	}
	
}
