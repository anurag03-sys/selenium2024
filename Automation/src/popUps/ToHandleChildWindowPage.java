package popUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleChildWindowPage 
{
public static void main(String[] args) 
{
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

driver.get("https://www.shoppersstack.com/products_page/23");
driver.findElement(By.id("compare")).click();

Set<String> allWindows = driver.getWindowHandles(); //capture all child window ids

for(String id: allWindows)
{
	driver.switchTo().window(id);
	String url = driver.getCurrentUrl(); //to capture the url
	if(url.contains("flipkart")) //to compare the url
	{
		break;
	}
}
driver.manage().window().maximize();
driver.close();
}
}
