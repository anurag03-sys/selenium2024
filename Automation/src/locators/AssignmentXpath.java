package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentXpath 
{
public static void main(String[] args) throws InterruptedException 
{
	
	String titleF = "Demo Web Shop";
	
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://demowebshop.tricentis.com/");
Thread.sleep(3000);
driver.findElement(By.linkText("Register")).click();
Thread.sleep(2000);

driver.findElement(By.id("gender-male")).click();
driver.findElement(By.id("FirstName")).sendKeys("Sai Anurag");
driver.findElement(By.id("LastName")).sendKeys("Das");
driver.findElement(By.id("Email")).sendKeys("anurag99@gmail.com");
driver.findElement(By.id("Password")).sendKeys("IamInevitable99");

Thread.sleep(3000);

driver.findElement(By.id("ConfirmPassword")).sendKeys("IamInevitable99");
driver.findElement(By.id("register-button")).click();

driver.navigate().back();
Thread.sleep(5000);

driver.findElement(By.xpath("//a[text()='Log in']")).click();
driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("anurag99@gmail.com");
driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("IamInevitable99");

Thread.sleep(1000);

driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
driver.findElement(By.xpath("//input[@value='Log in']")).click();

String titleP = driver.getTitle();

if(titleP.equals(titleF))
{
	System.out.println("Titles are matching so Login is successfull.");
	driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
	System.out.println("Logging out after checking the correct webpage is opened or not. ");

}
else
{
	System.out.println("Titles are not matching so Login is unsucessfull. Please check !!!");
}
}
}
