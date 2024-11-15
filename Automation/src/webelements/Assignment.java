package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment 
{
public static void main(String[] args) 
{
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.abhibus.com/");
driver.findElement(By.xpath("//button[contains(text(),'Top Bus Routes')]/..//a[contains(text()),'Hyderabad to Bangalore Bus')]")).click();
driver.findElement(By.xpath("//div[contains(text(),'Bus Partner')]")).click();
driver.findElement(By.xpath("//label[contains(text(),'BSR TOURS')]/..//input[@type='checkbox']")).click();

{
	
}
}
}
