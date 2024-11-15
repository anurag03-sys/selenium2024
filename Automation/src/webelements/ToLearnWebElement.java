package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnWebElement 
{
public static void main(String[] args) 
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Log in")).click();
}
}
