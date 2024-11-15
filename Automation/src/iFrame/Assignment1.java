package iFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment1 
{
public static void main(String[] args) throws InterruptedException 
{

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

driver.get("https://petdiseasealerts.org/forecast-map/#/");
System.out.println("petdiseasealerts link open successfully. ");

Thread.sleep(10000);
WebElement mapFrame = driver.findElement(By.xpath("//iframe[contains(@id,'map-instance-9724')]"));
driver.switchTo().frame(mapFrame);
System.out.println("Switch to map (frame 2) from main WebPage(frame 1).");

driver.findElement(By.name("Montana")).click();
System.out.println("Montana selected.");

driver.switchTo().defaultContent();

driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();

System.out.println("All the valid details are loading.");
driver.findElement(By.id("user")).sendKeys("anurag@gmail.com");
driver.findElement(By.id("pass")).sendKeys("iamDevil");
driver.findElement(By.id("cpass")).sendKeys("iamDevil");
driver.findElement(By.id("firstName")).sendKeys("Anurag");
driver.findElement(By.id("lastName")).sendKeys("Das");
driver.findElement(By.id("phone")).sendKeys("8270426108");

WebElement userTypeDropDown = driver.findElement(By.id("user-type"));
Select userSelection = new Select(userTypeDropDown);
userSelection.selectByVisibleText("Academic");

driver.findElement(By.id("accept-tou")).click();
driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();

WebElement successMessage = driver.findElement(By.xpath(""));
String message = successMessage.getText();
System.out.println("The success message is: "+ message);
}
}
