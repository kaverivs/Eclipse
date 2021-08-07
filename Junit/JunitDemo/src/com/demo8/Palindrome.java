package com.demo8;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Palindrome {
	
	@Test
	public void testP() {
		String string = "malayalam";
		StringBuilder b=new StringBuilder(string);
		String reverse=b.reverse().toString();
		if(string.equals(reverse)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		assertEquals("malayalam",reverse);
	}
}
