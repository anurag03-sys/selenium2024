package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnMoveToElements2 
{
public static void main(String[] args) 
{
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

driver.get("https://www.myntra.com/");
WebElement womenLink = driver.findElement(By.partialLinkText("WOMEN"));

Actions action = new Actions(driver);
action.moveToElement(womenLink).perform();
}
}
