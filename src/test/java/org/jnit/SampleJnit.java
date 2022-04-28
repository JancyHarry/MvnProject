package org.jnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SampleJnit {
	@BeforeClass
	public static void beforClass() {
		System.out.println("Before Class");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
	
	@Before
	public void beforE() {
		System.out.println("Before");
	}
	@After
	public void afteR() {
		System.out.println("After");
	}
	@Test
	public void test01() {
	System.out.println("Test 01");
	}
	@Test
	public void test02() {
		System.out.println("Test 02");
	}

}
