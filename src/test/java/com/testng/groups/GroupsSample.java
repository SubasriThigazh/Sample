package com.testng.groups;

import org.testng.annotations.Test;

public class GroupsSample {

	@Test(groups="sanity")
	public void test1() {
		System.out.println("Test Method 1");
	}
	
	@Test(groups= {"smoke", "sanity"})
	public void test2() {
		System.out.println("Test Method 2");
	}
	
	@Test(groups="regression")
	public void test3() {
		System.out.println("Test Method 3");
	}
	
	@Test(groups = {"sanity", "regression"})
	public void test4() {
		System.out.println("Test Method 4");
	}
	
	@Test(groups = {"smoke", "regression"})
	public void test5() {
		System.out.println("Test Method 5");
	}
}
