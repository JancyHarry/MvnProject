package org.jnit;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class AssertSample {
	@Test
	public void tc01() {
		String s="abc";
		Assert.assertEquals("Abc", s);
		System.out.println("Hi");
		System.out.println("Hello");
		
	}
	@Ignore
	@Test
	public void tc02() {
		System.out.println("Test 2");
	}
	@Test
	public void tc03() {
		System.out.println("Test 3");

	}
	
	

}
