package testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Properties;
import java.util.logging.FileHandler;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InstagramAccountCreation 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	String time = LocalDateTime.now().now().toString().replace(":", "-");
	
	FileInputStream fiso1 = new FileInputStream("./testData/instagramdata.properties");
	Properties properties = new Properties();
	properties.load(fiso1);
	
	String urlReg = properties.getProperty("urlIG");
	String FullName = properties.getProperty("FullName");
	String userIDReg = properties.getProperty("userID");
	String passwordIG = properties.getProperty("passwordIG");
	
	FileInputStream fiso2 = new FileInputStream("./testData/instagramdata.xlsx");
	Workbook workbook = WorkbookFactory.create(fiso2);
	
	String emailReg = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	String passwordReg = workbook.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	String fullname = workbook.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
	String userID = workbook.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
	
	System.out.println(emailReg);
	System.out.println(passwordReg);
	System.out.println(fullname);
	System.out.println(userID);
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	
	driver.get(urlReg);
	
	String actualURL = "https://www.instagram.com/";
	String signupURL = "https://www.instagram.com/accounts/emailsignup/";
	
	
	RegisterPageIG registerPageIG = new RegisterPageIG(driver);
	
	if(driver.getCurrentUrl().equals(actualURL))
	{
		driver.findElement(By.xpath("//span[contains(text(),'Sign up')]")).click();
		if(driver.getCurrentUrl().equals(signupURL))
		{
			registerPageIG.getEmailTF().sendKeys(emailReg);
			registerPageIG.getPasswordTF().sendKeys(passwordReg);
			registerPageIG.getFullNameTF().sendKeys(fullname);
			registerPageIG.getUserNameTF().sendKeys(userID);
			registerPageIG.getSignUpTF().click();
			
			TakesScreenshot screenshot1= (TakesScreenshot) driver;
			File temploc1 = screenshot1.getScreenshotAs(OutputType.FILE);
			File perdest1= new File("./screenshots/"+time+".png");
			org.openqa.selenium.io.FileHandler.copy(temploc1, perdest1);
			
			WebElement monthDropDown = driver.findElement(By.className("_aau- _ap32"));
			Select monthselection = new Select(monthDropDown);
			monthselection.selectByVisibleText("September");
			
			WebElement dayDropDown = driver.findElement(By.className("_aau- _ap32"));
			Select dayselection = new Select(monthDropDown);
			dayselection.selectByVisibleText("18");
			
			WebElement yearDropDown = driver.findElement(By.className("_aau- _ap32"));
			Select yearselection = new Select(monthDropDown);
			yearselection.selectByVisibleText("1999");
			
			driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
			driver.findElement(By.id("recaptcha-anchor")).click();
			
			TakesScreenshot screenshotcaptcha = (TakesScreenshot) driver;
			File temploc2 = screenshotcaptcha.getScreenshotAs(OutputType.FILE);
			File perdest2= new File("./screenshots/"+time+".png");
			org.openqa.selenium.io.FileHandler.copy(temploc2, perdest2);
			
			driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
			
			
			
		}
		else
		{
			System.out.println("There is some error in your coding, please check and try again.");
		}
	}
	else
	{
		System.out.println("Instagram page is not opening, Please chcek the code.");
	}
}
}
 