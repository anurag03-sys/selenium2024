package pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment_TestScript 
{
public static void main(String[] args) throws IOException, InterruptedException 
{
	String time = LocalDateTime.now().toString().replace(":", "-");
	
	FileInputStream fiso = new FileInputStream("./testData/pomtestdata.properties");
	
	Properties properties = new Properties();
	properties.load(fiso);
	
	String url = properties.getProperty("url");
	String Email1 = properties.getProperty("Email1");
	String Password1 = properties.getProperty("Password1");
	
	FileInputStream fiso2 = new FileInputStream("./testData/testdataassignment.xlsx");
	Workbook workbook = WorkbookFactory.create(fiso2);
	
	
	String FirstName = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	String LastName = workbook.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	String Email = workbook.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
	String Password = workbook.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
	String ConfirmPassword = workbook.getSheet("Sheet1").getRow(1).getCell(4).getStringCellValue();
	
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
	
	driver.get(url);
	String title = "Demo Web Shop";
	String regiTitle = "Demo Web Shop. Register";
	
	Assignment_RegisterPage registerPage = new Assignment_RegisterPage(driver);
	
	if(driver.getTitle().equals(title))
	{
		registerPage.getRegisterLink().click();
		System.out.println("The Welcome Page has opened successfully.");
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File tempLoc = screenshot.getScreenshotAs(OutputType.FILE);
		File perDest = new File("./screenshots/"+time+".png");
		FileHandler.copy(tempLoc, perDest);
		
	if(driver.getTitle().equals(regiTitle))
	{
		
		
		registerPage.getGenderTF().click();
		registerPage.getFirstNameTF().sendKeys(FirstName);
		registerPage.getLastNameTF().sendKeys(LastName);
		registerPage.getEmailTF().sendKeys(Email);
		registerPage.getPasswordTF().sendKeys(Password);
		registerPage.getConfirmPasswordTF().sendKeys(ConfirmPassword);
		registerPage.getRegisterbuttonTF().click();
		
		TakesScreenshot screenshot2 = (TakesScreenshot) driver;
		File tempLoc2 = screenshot2.getScreenshotAs(OutputType.FILE);
		File perDest2 = new File("./screenshots/"+time+".png");
		FileHandler.copy(tempLoc2, perDest2);
		 
	  System.out.println("After filling all required text fields the user gets registerd successfully.");
	  
	  Thread.sleep(5000);

	    Assignment_WelcomePage welcomepage =new Assignment_WelcomePage(driver);
	    		welcomepage.getLogoutButton().click();
	    		System.out.println("User successfully logged out.");
		
		TakesScreenshot screenshot3 = (TakesScreenshot) driver;
		File tempLoc3 = screenshot3.getScreenshotAs(OutputType.FILE);
		File perDest3 = new File("./screenshots/"+time+".png");
		FileHandler.copy(tempLoc3, perDest3);
		
		welcomepage.getLoginButton1().click();
		
		String loginTitle = "Demo Web Shop. Login";
		
		Thread.sleep(5000);
		
		if(driver.getTitle().equals(loginTitle))
		{	
			welcomepage.getEmailBox().sendKeys(Email1);
			welcomepage.getPasswordBox().sendKeys(Password1);
			welcomepage.getRememberMeButton().click();
			welcomepage.getLoginButton().click();
			
			System.out.println("You are now logged in.");
			
			TakesScreenshot screenshot4 = (TakesScreenshot) driver;
			File tempLoc4 = screenshot4.getScreenshotAs(OutputType.FILE);
			File perDest4 = new File("./screenshots/"+time+".png");
			FileHandler.copy(tempLoc4, perDest4);
			System.out.println("Login page has opend successfully and "
					+ "user successfully logged in.");
		}
		else
		{
			System.out.println("User is unable to log in,"
					+ " kindly fix the coding.");
		}
	}
	else
	{
		System.out.println("Registeration Unsuccessful,"
				+ "There is some coding error in the program, "
				+ "please check and try again.");
	}
	}
	else
	{
		System.out.println("There is some error in your code, Please check and try again.");
	}
	
}
}

