package popUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleConfirmationPopUp 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

driver.get("https://demo.guru99.com/test/delete_customer.php");
driver.findElement(By.name("submit")).click();

Alert confirmationPopup = driver.switchTo().alert();
String confirmationPopupMSg = confirmationPopup.getText();
System.out.println("The confirmation popup message is : "+ confirmationPopupMSg);

confirmationPopup.accept();
Thread.sleep(10000);
System.out.println("Confirmation popup message is : "+ confirmationPopup.getText());
confirmationPopup.accept();
}
}
