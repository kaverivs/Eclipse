package com.demo5;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.demo4.ReverseString;

public class TestCase {
	
	@BeforeClass
	public static void beforeClass()throws Exception{
		System.out.println("Before class");
	}
		
	@Before
	public void before()throws Exception{
		System.out.println("\nBefore");
	}
	
	@Test
	public void palindrome() {
		System.out.println("Testcase for palindrome");
		assertEquals(1,Palindrome.StringPalindrome());
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
