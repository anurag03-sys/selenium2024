package popUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnAlertPopUps 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

driver.get("https://demowebshop.tricentis.com/");
WebElement searchButton = driver.findElement(By.xpath("//input[@value='Search']"));
searchButton.click();

Alert alertPopUp = driver.switchTo().alert();
Thread.sleep(5000);
System.out.println("Please capture the POPUP message !!!");

String PopUpMSG = alertPopUp.getText();
System.out.println("The POPUP message : "+PopUpMSG);

alertPopUp.accept();

}
}
