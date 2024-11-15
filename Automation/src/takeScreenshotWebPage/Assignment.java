package takeScreenshotWebPage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment 
{
public static void main(String[] args) throws IOException 
{
	String time = LocalDateTime.now().toString().replace(":", "-");
	String title = "DemoApps | Qspiders | Tables";
	String url = "https://demoapps.qspiders.com/ui/table/dynamicTable";
	
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

driver.get("https://demoapps.qspiders.com/");
driver.findElement(By.xpath("//p[contains(text(),'Experience the seamless interactions')]")).click();
driver.findElement(By.xpath("//section[contains(text(),'Web Table')]")).click();

String fetchTitle = driver.getTitle();
if(fetchTitle.equals(title))
{
	driver.findElement(By.xpath("//a[contains(text(),'Dynamic Web Table')]")).click();
	String currentUrl = driver.getCurrentUrl();
	if(currentUrl.equals(url))
	{
		WebElement price = driver.findElement(By.xpath("//th[text()='Apple iPhone']/following-sibling::th[1]"));
	    System.out.println(price);
	}
	else
	{
		System.out.println("Dynamic Web Tabel is not displaying because titles are not matching, Please check....");
	}
}
else
{
	System.out.println("Web Tabel is not displaying because titles are not matching, Please check....");
}
TakesScreenshot takesScreenshot= (TakesScreenshot) driver;
File temporaryDestinition= takesScreenshot.getScreenshotAs(OutputType.FILE);
File permanentDestinition = new File("./screenshots/"+time+".png");
FileHandler.copy(temporaryDestinition, permanentDestinition);
}
}
