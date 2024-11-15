package popUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandlePromptPopUp 
{
public static void main(String[] args) 
{
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");

driver.switchTo().frame("iframeResult");
driver.findElement(By.xpath("//button[text()='Try it']")).click();

Alert promptAlert = driver.switchTo().alert();
promptAlert.sendKeys("Selenium");
promptAlert.accept();
}
}
