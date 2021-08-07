package com.demo9;

import static org.junit.Assert.*;

import org.junit.Test;

public class LargerTestCase {

	@Test
	public void test() {
		System.out.println("testcase runs");
		assertEquals(14,Largest.largestNum(14, 6));
		assertEquals(6,Largest.largestNum(14, 6));
		assertEquals(0,Largest.largestNum(14, 6));
	}

}
