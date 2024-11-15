package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIsSelected
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demowebshop.tricentis.com/");
Thread.sleep(5000);
WebElement selectRadioButton = driver.findElement(By.xpath("//label[text()='Good']/..//input[@type='radio']"));
selectRadioButton.click();
Thread.sleep(1000);
boolean result = selectRadioButton.isEnabled();
if(result==true)
{
	System.out.println("Good Radio button is selected.");
}
else
{
	System.out.println("Godd Radio button is not selected, Please check !!!");
}
}
}
