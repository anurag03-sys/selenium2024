package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentSwitch 
{
public static void main(String[] args) throws InterruptedException 
{
	String ogTitle= "Demo Web Shop";
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(5000);
	
	String checkTitle= driver.getTitle();
	if(checkTitle.equals(ogTitle))
	{
	System.out.println("DemoWebShop Title is matching");
	switchToWindow(driver, "facebook");
	Point flipkartPosition = driver.manage().window().getPosition();
	Thread.sleep(1000);

	
	/*driver.findElement(By.xpath("//a[contains(text(),'Facebook')]")).click();
	Thread.sleep(5000);*/
	
	driver.findElement(By.xpath("//span[contains(text(),'Create new account')]")).click();
	driver.findElement(By.xpath("//div[contains(text(),'First name')]")).sendKeys("Anurag");
	}
	else
	{
		System.out.println("DemoWebShop Title is matching, Please Check....");
	}
	
}

private static void switchToWindow(WebDriver driver, String string) {
	// TODO Auto-generated method stub
	
}
}
