package TestNgFiles;

import org.testng.annotations.Test;

public class AnnotationPriority 
{
	
	@Test(timeOut=1000)
	public void openBrowser()
	{
		System.out.println("Browser Opened");
	}
	
	@Test(dependsOnMethods={"openBrowser"},alwaysRun=true)
	public void bookFlight()
	{
		System.out.println("Flight Booked");
		
	}
	
	@Test(enabled=false)
	public void makePayment()
	{
		System.out.println("payment successfully made");
	}
	
	@Test(timeOut=10000)
	public void makePayment1()
	{
		System.out.println("payment successfully made");
	}
}
