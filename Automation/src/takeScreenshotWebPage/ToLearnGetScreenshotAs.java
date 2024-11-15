package takeScreenshotWebPage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToLearnGetScreenshotAs 
{
public static void main(String[] args) throws IOException, InterruptedException 
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	TakesScreenshot takescreenshot= (TakesScreenshot) driver;
	Thread.sleep(1000);
	File temporay = takescreenshot.getScreenshotAs(OutputType.FILE);
	File destinition = new File("./screenshots/FlipkartScreenshot.png");
	FileHandler.copy(temporay, destinition);
			
}
}
