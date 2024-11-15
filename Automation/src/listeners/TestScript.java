package listeners;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersImplementation.class)

public class TestScript extends BaseClass
{
@Test
public void login()
{
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys("iamanurag@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("Iaminevitable");
	
	Reporter.log("click on login button", true);
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	
	Assert.assertEquals(driver.getTitle(), "Demo Web", "Home page is not displayed");
	Reporter.log("Home page is displayed", true);
}
}
