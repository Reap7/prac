package com.simpleFactory.factory;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitFlowTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("this is before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("this is after class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("this is before method");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("this is after method");
	}

	@Test
	public void test() {
		System.out.println("this is test");
	}
	@Test
	public void test2()
	{
		System.out.println("this is test2");
	}

}
