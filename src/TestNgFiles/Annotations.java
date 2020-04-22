package TestNgFiles;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@Test
	public void log()
	{
		System.out.println("Log method later Added");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Delete the cookies before you start test");
	}	
	
	@AfterTest
	public void aeforeTest()
	{
		System.out.println("Delete the cookies once you complete test");
	}	
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Please enter valid usr id and password");
	}	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("Successfully Log In");
	}	
	@Test(groups= {"priority1"})
	public void oprningBrowser()
	{
		System.out.println("Browser Opened");
	}


	@Test(groups= {"priority2"})
	public void flightBooking()
	{
		System.out.println("Flight Booked");
	}
}
