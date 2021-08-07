package com.demo7;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestcaseArea {

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		assertEquals(24,Area.area(12,3));//fails
		assertEquals(36,Area.area(12,3));
	}

}
