package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToLearnGet 
{
public static void main(String[] args) 
{
	 WebDriver driver = new EdgeDriver();
	 driver.get("https://www.flipkart.com/");
	
	driver.get("https://www.instagram.com/");
	
	driver.get("https://www.facebook.com/ "); 
	
	/*WebDriver driver = new ChromeDriver();
    driver.get("https://www.flipkart.com/");
	
	driver.get("https://www.instagram.com/");
	
	driver.get("https://www.facebook.com/ "); 
	
	WebDriver driver = new FirefoxDriver();
    driver.get("https://www.flipkart.com/");
	
	driver.get("https://www.instagram.com/");
	
	driver.get("https://www.facebook.com/ "); */
	
	
	
}
}
