package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathContains 
{
public static void main(String[] args) 
{
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://www.instagram.com/");
driver.findElement(By.xpath("//input[contains(@aria-label,'Phone number')]")).sendKeys("anurag99@gmail.com");
driver.findElement(By.xpath("//input[contains(@aria-label,'Password')]")).sendKeys("Dhichkiyanooo");
driver.findElement(By.xpath("//div[contains(text(),'Log in')]")).click();
}
}
