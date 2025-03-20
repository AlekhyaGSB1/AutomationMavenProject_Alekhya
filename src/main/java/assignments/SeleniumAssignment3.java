package assignments;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

public class SeleniumAssignment3 {
	
	public static void main(String args[])
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		
		//Click Button to see alert
		WebElement alertButton1 = driver.findElement(By.xpath("//button[@id='alertButton']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", alertButton1);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		//On button click, alert will appear after 5 seconds
		WebElement alertButton2 = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		js.executeScript("arguments[0].click()", alertButton2);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
		wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
		
		//On button click, confirm box will appear
		WebElement alertButton3 = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		js.executeScript("arguments[0].click()", alertButton3);

		
		alert.accept();
		WebElement actualConfirmTextEle = driver.findElement(By.xpath("//span[@id='confirmResult']"));
		String actualConfirmText=actualConfirmTextEle.getText();
		System.out.println(actualConfirmText);
		Assert.assertEquals(actualConfirmText, "You selected Ok");
		
		//On button click, prompt box will appear
		WebElement alertButton4 = driver.findElement(By.xpath("//button[@id='promtButton']"));
		js.executeScript("arguments[0].click()", alertButton4);
		
		alert.sendKeys("Sample Text");
		alert.accept();
		
		WebElement actualPromptResultEle = driver.findElement(By.xpath("//span[@id='promptResult']"));
		String actualPromptText= actualPromptResultEle.getText();
		System.out.println(actualPromptText);
		Assert.assertEquals(actualPromptText,"You entered Sample text");
		
		driver.quit();
	}

}
