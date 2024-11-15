package webDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetPosition 
{
public static void main(String[] args) 
{
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://demowebshop.tricentis.com/");
Point position = driver.manage().window().getPosition();

System.out.println("X :"+ position.getX());
System.out.println("Y :"+ position.getY());
}
}
