package popUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NotificationPopup 
{
public static void main(String[] args) 
{
ChromeOptions option = new ChromeOptions();	
//option.addArguments("--disable-notifications ");
option.addArguments("--incognito");
//option.addArguments("--start-maximized");
	option.addArguments("--start-fullscreen"); 
	//if we are using full screen thrn we can't perform forward and backward.
WebDriver driver = new ChromeDriver(option);
//driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

driver.get("https://www.myntra.com/");
driver.findElement(By.partialLinkText("MEN")).click();
}
}
