package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetSize 
{
public static void main(String[] args) 
{
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demowebshop.tricentis.com/");
Dimension size = driver.findElement(By.xpath("//input[@value='Search']")).getSize();
System.out.println("Printing the height and width of search button....");
System.out.println("Height is :"+ size.getHeight());
System.out.println("Width is :"+ size.getWidth());
}
}
