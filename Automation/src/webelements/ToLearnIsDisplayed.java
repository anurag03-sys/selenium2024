package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIsDisplayed 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(9000);
		WebElement LogIn = driver.findElement(By.xpath("button[@type='submit']"));
		
		System.out.println("Display status is printing.");
		System.out.println("Display Status : " + LogIn.isDisplayed());
		System.out.println("---------------------------------------------");
		System.out.println("Enable status is printing.");
		System.out.println("Enabled Status : "+ LogIn.isEnabled());
		
	}
}
