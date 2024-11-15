package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetLocation 
{
public static void main(String[] args) 
{
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://demowebshop.tricentis.com/");
Point Location = driver.findElement(By.xpath("//input[@value='Search']")).getLocation();
System.out.println("Printing the location of search button.");
System.out.println("Point of X is : "+ Location.getX());
System.out.println("Point of Y is : "+ Location.getY());

}
}
