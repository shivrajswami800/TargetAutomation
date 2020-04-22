package TestNgFiles;

import org.testng.annotations.BeforeSuite;

public class Beforesuite {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Befor running the complete Suite");
	}

}
