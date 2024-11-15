package select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment 
{
public static void main(String[] args) 
{
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

driver.get("https://www.freshersworld.com/");
 WebElement registerButton = driver.findElement(By.xpath("//span[contains(text(),'REGISTER NOW')]"));

System.out.println("Checking the Register Button is displaying or not.");
boolean result = registerButton.isDisplayed();
System.out.println("Result :"+ result);

if(result==true)
{
	registerButton.click();
	
	driver.findElement(By.id("firstname")).sendKeys("Anurag");
	driver.findElement(By.id("lastname")).sendKeys("Das");
	driver.findElement(By.xpath("//label[contains(text(),'Please enter')]")).sendKeys("anurag@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("NowIBecomeDeath");
	driver.findElement(By.xpath("//label[contains(text(),'Please enter Min 10')]")).sendKeys("9080706055");
	
	WebElement currentCityDropDown = driver.findElement(By.id("currentCity"));
	Select citySelection = new Select(currentCityDropDown);
	citySelection.selectByVisibleText(" Bangalore ");
	
	WebElement heighestCourseSelection = driver.findElement(By.id("course"));
	Select courseSelection = new Select(heighestCourseSelection);
	courseSelection.selectByVisibleText("BE/B.Tech");
	
	WebElement branchSelection = driver.findElement(By.id("branch"));
	Select branch = new Select(branchSelection);
	branch.selectByVisibleText("Chemical Engineering");
	
	driver.findElement(By.id("cgpa")).click();
	driver.findElement(By.id("marks")).sendKeys("7.5");
	
	
	WebElement passoutYear = driver.findElement(By.id("passYear"));
	Select yearSelection = new Select(passoutYear);
	yearSelection.selectByVisibleText("2020");
	
	WebElement location = driver.findElement(By.id("hqState"));
	Select state = new Select(location);
	state.selectByVisibleText(" Orissa ");
	
	WebElement college = driver.findElement(By.id("select2-hqInstitute-container"));
	Select collegeSelection = new Select(location);
	state.selectByVisibleText(" Orissa ");
	
	
	System.out.println("Program is running succesfully and require data is loaded.");
}
else
{
	System.out.println("Register Button is not displaying, Please check !!!");
}
}
}
