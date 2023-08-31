package TestNgAssignment;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterSuite;

public class Annotations {
	
	@BeforeSuite
	public void BeforeSuit() {
		System.out.println("Before Suit");
	}
	
	@BeforeTest
	public void BeforeTest() {
		System.out.println("Before Test");
	}
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("Before Method");
	}
	
	@Test(priority=1)
	public void WriteTestCases() {
		System.out.println("Write Test cases");
	}
	
	@Test(priority=2)
	public void Execute() {
		System.out.println("Execute Test cases");
	}
	
	@Test(priority=3)
	public void LogDefects() {
		System.out.println("Log the defects");
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("After Method");
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("After Class");
	}
	
	@AfterTest
	public void AfterTest() {
		System.out.println("After Test");
	}
	
	@AfterSuite
	public void AfterSuite() {
		System.out.println("After Suite");
	}
}
