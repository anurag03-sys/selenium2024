package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetRect 
{
public static void main(String[] args)
{
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://demowebshop.tricentis.com/");
Rectangle rect = driver.findElement(By.xpath("//input[@value='Search store']")).getRect();
System.out.println("Height, Width, location (position of X and Y) is printing of search text field.");
System.out.println("Height is : "+ rect.getHeight());
System.out.println("Width is : "+ rect.getWidth());
System.out.println("Position of X : "+rect.getX());
System.out.println("Position of Y : "+ rect.getY());
}
}
