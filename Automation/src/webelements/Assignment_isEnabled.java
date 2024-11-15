package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_isEnabled 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demoapp.skillrary.com/");
Thread.sleep(3000);
WebElement subscribeButton = driver.findElement(By.xpath("//input[@type='text']"));
System.out.println("Chceking the subscriber button is enabled or not.");
boolean result = subscribeButton.isEnabled();
if(result==true)
{
	System.out.println("Subscribe Button is enbaled and working fine, go on.");
	
}
else
{
	System.out.println("Subscribe Button is disabled. Please check !!!! ");
}

}
}
