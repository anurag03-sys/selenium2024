package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Stale 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(20));

driver.get("https://demoapp.skillrary.com/");

/*WebElement searchTF = driver.findElement(By.id("navbar-search-input"));
searchTF.sendKeys("Selenium",Keys.ENTER);
Thread.sleep(10000);
searchTF.sendKeys("Testng");*/

SkillRaryPage  srp = new SkillRaryPage(driver);
srp.getSearchTF().sendKeys("Selenium",Keys.ENTER);
srp.getSearchTF().sendKeys("Testng");

}
}
