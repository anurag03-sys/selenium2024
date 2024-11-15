package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentLocatorsInsta 
{
public static void main(String[] args) 
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.instagram.com/");
	driver.findElement(By.xpath("//span[contains(text(),'Contact Uploading ')]")).click();
	
}
}
