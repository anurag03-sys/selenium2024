package webDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingPosition 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/products_page/15");
		Thread.sleep(25000);
		
		driver.findElement(By.id("compare")).click();
		Thread.sleep(1000);
		
		switchToWindow(driver, "flipkart");
		Point flipkartPosition = driver.manage().window().getPosition();
		Thread.sleep(1000);
		
		switchToWindow(driver, "ebay");
		Point ebayPosition = driver.manage().window().getPosition();
		Thread.sleep(1000);
		
		driver.manage().window().setPosition(flipkartPosition);
		switchToWindow(driver, "flipkart");
		driver.manage().window().setPosition(ebayPosition);
		
			
	}

	private static void switchToWindow(WebDriver driver, String url) 
	{
		Set<String> allWindows = driver.getWindowHandles();
		for(String id : allWindows)
		{
			driver.switchTo().window(id);
			String actualURL = driver.getCurrentUrl();
		
			if(actualURL.contains(url));
			{
				break;
			}
		}
	}

}
