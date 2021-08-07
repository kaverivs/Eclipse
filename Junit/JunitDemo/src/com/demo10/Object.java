package com.demo10;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class Object {
	@Test
	public void test() {
		Object obj= new Object();
		System.out.println(obj);
		Object obj1=null;
		assertNull(obj1);
		assertNotNull(obj);
		
	}

}
