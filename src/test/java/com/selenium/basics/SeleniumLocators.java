package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {
	public static void main(String args[])
	{
		
		WebDriver driver = new ChromeDriver();
		
		//Solutions with class name locator
		driver.findElement(By.className("Solutions"));
		
		//About us using link text locator
		driver.findElement(By.linkText("About Us"));
		
		//Services using link text locator
		driver.findElement(By.linkText("Services"));
		
		//Products using link text locator
		driver.findElement(By.linkText("Products"));
		
		//Locations using link text locator
		driver.findElement(By.linkText("Locations"));
		
		//Admin page using link text locator
		driver.findElement(By.linkText("Admin Page"));
		
		//Login Username text box using name locator
		driver.findElement(By.name("username"));
		
		//Password text box using name locator
		driver.findElement(By.name("password"));
		
		//Login button using classname locator
		driver.findElement(By.className("button"));
		
		//Forgot login partial link text
		driver.findElement(By.partialLinkText("Forgot login"));
		
		//Register link text
		driver.findElement(By.linkText("Register"));
		
		//Withdraw using link text locator
		driver.findElement(By.linkText("Withdraw Funds"));
		
		
		
		
	}

}
