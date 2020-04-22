package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Common {
	WebDriver driver = new ChromeDriver();
	
	
	@Test
	public void launchBrowser()
	{
		//WebDriver driver = new ChromeDriver();
		//System.setProperty("webderiver.chrome.driver","D://Softwere//Whole Setup//chromedriver.exe");
		//driver.get("http://www.gamil.com");
		
		System.setProperty("webdriver.chrome.driver","D:\\Softwere\\Whole Setup\\chromedriver.exe");		
		driver.get("https://www.google.com/");		
	}
	
	@Test
	public void Login() throws IOException
	{
		Properties pro = new Properties();
		FileInputStream fis =new FileInputStream("E:\\TargetAutomation\\Framework\\parameter.properties");
		pro.load(fis);
		
		String uid =pro.getProperty("username");
		System.out.println(pro.getProperty(uid));
	}

}
