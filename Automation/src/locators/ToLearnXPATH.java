package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXPATH 
{
public static void main(String[] args) 
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("//input[@value='Search store']")).sendKeys("Books");
	
	//driver.findElement(By.xpath("//input[@id='Isc']")).click();
	
	
	
//	driver.findElement(By.xpath("//input[@value=\'Search\']")).click();
//	driver.findElement(By.cssSelector("//input[@value=\'true\']")).click();
//	driver.findElement(By.cssSelector("value=\"Search\"")).click();
//	driver.findElement(By.className("price-from")).sendKeys("350");
//	driver.findElement(By.className("price-to")).sendKeys("900");
//	driver.findElement(By.xpath("//input[@value=\'true\']")).click();
//	driver.findElement(By.xpath("//input[@value=\'Search\']")).click();
}
}