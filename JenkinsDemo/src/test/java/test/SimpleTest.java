package test;

import org.testng.annotations.Test;

import base.BaseClass;

public class SimpleTest extends BaseClass {
	@Test
	public void testCase1() {

		System.out.println("This is testCase1");
		System.out.println("This is New Comment");
		System.out.println("This is New Comment2");

	}
	@Test
	public void testCase2() {

		System.out.println("This is testCase2");

	}
	@Test
	public void testCase3() {

		System.out.println("This is testCase3");
	}

}

