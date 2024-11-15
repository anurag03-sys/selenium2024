package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReadDataFromExcel
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
    //step-1 : create FileInputStream Object.
	FileInputStream fiso = new FileInputStream("./testData/Test Data.xlsx");
	
	//step-2 : create respective file type object.
	Workbook workbook = WorkbookFactory.create(fiso);
	
	//step-3 : call read methods.
	String url = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	String username = workbook.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	String password = workbook.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
	String expectedResults = workbook.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
	int price = (int) workbook.getSheet("Sheet1").getRow(1).getCell(4).getNumericCellValue();
	boolean status = workbook.getSheet("Sheet1").getRow(1).getCell(5).getBooleanCellValue();
	LocalDateTime date = workbook.getSheet("Sheet1").getRow(1).getCell(6).getLocalDateTimeCellValue();
	
	
	System.out.println(url);
	System.out.println(username);
	System.out.println(password);
	System.out.println(price);
	System.out.println(date);
	System.out.println(status);
	System.out.println(expectedResults);
	
	 int day = date.getDayOfMonth();
	Month month = date.getMonth();
	int year = date.getYear();
	
	System.out.println(day);
	System.out.println(month);
	System.out.println(year);
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	driver.get(url);
	driver.findElement(By.id("email")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.id("keepLoggedInCheckBox")).click();
	driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
	
	String fetchTitle = "SkillRary Ecommerce";
	String currentTitle = driver.getTitle();
	
	if(currentTitle.equals(fetchTitle))
	{
		System.out.println("Congratulation your code is running fine.");
	}
	else
	{
		System.out.println("There is some error in your code, klindly chcek and run it after fixing. Thank You.");
	}
	
	
	
	
}
}
