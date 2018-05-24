package kiran;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class goud 
	{  
	    WebDriver driver;
	@Test
	public void face()
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\arte206_saikiran\\Desktop\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");

}
}


//mvn clean install