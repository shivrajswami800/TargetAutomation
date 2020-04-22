package TestNgFiles;

import org.testng.annotations.Test;

public class Groups {
	
	

	@Test(groups= {"priority1"})
	public void P1()
	{
		System.out.println("This is priority 1 Group");
	}
	
	@Test(groups= {"priority2"})
	public void P2()
	{
		System.out.println("This is priority 1 Group");
	}

}
