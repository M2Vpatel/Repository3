package com.miit.qa.novqa.basic;

import org.junit.Test;

import junit.framework.Assert;

public class EmployeeTest {

	@Test
	public void test1() {
		Employee e = new Employee("E1", 25, 10000);
		int expectedValue = 1000;
		int actualValue = e.calculateTax(10);
		Assert.assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void test2() {
		Employee e = new Employee("E1", 25, 0);
		int expectedValue = 1000;
		int actualValue = e.calculateTax(10);
		Assert.assertEquals(expectedValue, actualValue);
	}
}
