package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnClear 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		WebElement userText = driver.findElement(By.xpath("//input[contains(@aria-label,'Phone number')]\""));
		Thread.sleep(3000);
		userText.clear();
		driver.navigate().refresh();
		userText.sendKeys("Anurag");
		
		Thread.sleep(2000);
		WebElement passwordText = driver.findElement(By.xpath("//input[contains(@aria-label,'Password')]"));
		passwordText.clear();
		driver.navigate().refresh();
		passwordText.sendKeys("Radhe_Radhe");
	}

}
