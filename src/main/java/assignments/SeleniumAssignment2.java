package assignments;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumAssignment2 {
	static WebDriver driver =null;
	
	public static void main(String args[])
	{
//		1. Launch browser window(Chrome)   
		driver = new ChromeDriver();
		
//      2. Maximize the browser window
		driver.manage().window().maximize();
		
//      3. Delete all the cookies  
		driver.manage().deleteAllCookies();
		
//      4. Enter URL and Launch the application (https://demoqa.com/automation-practice-form)
		driver.get("https://demoqa.com/automation-practice-form");
		
//      5. Wait for Page-load
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf((WebElement) By.xpath("//a[@class='ns-9qnuw-e-5']")));
		
//      6. Enter First name and Last name  
		WebElement firstNameTextField = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstNameTextField.clear();
		firstNameTextField.sendKeys("Alekhya");
		
		WebElement lastNameTextField = driver.findElement(By.xpath("//input[@id='lastName']"));
		lastNameTextField.clear();
		lastNameTextField.sendKeys("Galiveeti");
		
//      7. Enter Email
		WebElement emailTextField = driver.findElement(By.xpath("//input[@id='userEmail']"));
		emailTextField.clear();
		emailTextField.sendKeys("alekhya.gsb@gmail.com");
		
//      8. Select Gender (Female) 
		genderRadioButton("Female");
		
		
//      9. Enter mobile number  
		WebElement mobileNumTextField = driver.findElement(By.xpath("//input[@id='userNumber']"));
		mobileNumTextField.clear();
		mobileNumTextField.sendKeys("7829642015");
		
//      10.Select DOB (1-Feb-1991) 
		selectDob("25", "March", "1993");
		
//      11.Search and Select Computer Science
		
		
//      12.Select Hobbies as Sports and Reading   
		selectHobbies("Sports");
		selectHobbies("Reading");
		
//      13.Upload photo    
		
		
//      14. Wait till window open to upload the file  
		
//      15. Upload file 
		
//      16. Wait till file upload
		
//      17.Submit Details 
		  //Current address
		  WebElement currenAddressTextField = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		  currenAddressTextField.sendKeys("#304,Sobha Dream Acres,Panattur");
		  
		  //Select state and city
		
//      18. Close browser window
		driver.quit();
		
		
	}
	public static void genderRadioButton(String gender)
	{
		WebElement genderOption = driver.findElement(By.xpath("//label[text()='"+gender+"']"));
		genderOption.click();
	}
	
	public static void selectDob(String date,String month,String year)
	{
		WebElement dobField = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		dobField.click();
		
		WebElement monthDropdown = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select select = new Select(monthDropdown);
		select.selectByValue(month);
		
		WebElement yearDropdown = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Select selectYear = new Select(yearDropdown);
		selectYear.selectByValue(year);
		
		WebElement dateOption = driver.findElement(By.xpath("//div[text()='"+date+"' and contains(@aria-label,'"+month+"')]"));
		dateOption.sendKeys(date);
	}
    
	public static void searchAndSelectSubjects(String subject)
	{
		WebElement subjectSearchField = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
		subjectSearchField.click();
		
		subjectSearchField.sendKeys(subject);
		
		
	}
	
	public static void selectHobbies(String hobbyName)
	{
		WebElement hobby= driver.findElement(By.xpath("//div[@id='hobbiesWrapper']//label[text()='"+hobbyName+"']"));
		hobby.click();
	}
	
	public static void selectStateDropdown(String state)
	{
		WebElement stateDropDown = driver.findElement(By.xpath(""))
	}
	
}
