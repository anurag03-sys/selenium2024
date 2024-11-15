package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_isDisplayed_Rect 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		WebElement subscribeButton = driver.findElement(By.xpath("//input[@value='Subscribe']"));
		
		System.out.println("Subscribe button is present or not checking, Please wait !!! ");
		boolean result = subscribeButton.isDisplayed();
		
	    System.out.println("Result of checking : "+ result);
	    Thread.sleep(3000);
		
		if(result==true)
		{
		Rectangle rect = driver.findElement(By.xpath("//input[@value='Subscribe']")).getRect();
		Thread.sleep(2000);
		System.out.println("Printing the Height, Width and Location (Position of X and Y) of Subscribe button");
		System.out.println("Height : "+ rect.getHeight());
		System.out.println("Width : "+ rect.getWidth());
		System.out.println("Position of X : "+ rect.getX());
		System.out.println("Position of Y : "+ rect.getY());
		}
		else
		{
			System.out.println("Check your webpage, you have a defect.");
		}
	
	}

}
