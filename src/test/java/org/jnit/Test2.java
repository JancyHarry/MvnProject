package org.jnit;

import org.junit.Assert;
import org.junit.Test;

public class Test2 {

	@Test
	public void tc01() {
		System.out.println("Test 1");
	}

	@Test
	public void tc02() {
		System.out.println("Test 2");
	}

	@Test
	public void tc03() {
		Assert.assertTrue(false);
		System.out.println("Test 3");
	}

	@Test
	public void tc04() {
		System.out.println("Test 4");
	}
}
