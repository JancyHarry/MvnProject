package org.jnit;

import org.junit.Ignore;
import org.junit.Test;

public class Test1 {

	@Test
	public void tc01() {
		System.out.println("Test 1");
	}

	@Test
	public void tc02() {
		System.out.println("Test 2");
	}

	@Ignore
	@Test
	public void tc03() {
		System.out.println("Test 3");
	}

	@Test
	public void tc04() {
		System.out.println("Test 4");
	}
}
