package day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnotations {
	
	@Test(priority=1)
	void s1()
	{
		System.out.println("This is test case 1 ");
	}

	@Test(priority=4)
	void s2()
	{
		System.out.println("This is test case 2");
	}
	
	@BeforeClass
	void c1()
	{
		System.out.println("This is before class");
	}
	@AfterClass
	void c2()
	{
		System.out.println("This is after class");
	}
	@BeforeMethod
	void m1()
	{
		System.out.println("This is before method");
	}
	@AfterMethod
	void m2()
	{
		System.out.println("This is after method");
	}
	@BeforeSuite
	void x1() 
	{
		System.out.println("before suite");
	}
	@AfterSuite
	void x2()
	{
		System.out.println("After suite");
	}
	@BeforeTest
	void t1() {
		System.out.println("this is before test");
	}
	@AfterTest
	void t2()
	{
		System.out.println("after test");
	}
}
