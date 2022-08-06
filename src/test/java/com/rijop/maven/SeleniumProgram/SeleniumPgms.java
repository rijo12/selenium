package com.rijop.maven.SeleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumPgms {
	
	WebDriver driver;

	@BeforeMethod
	public void set() {

		// Basic Setup for selenium

		System.setProperty("webdriver.edge.driver", "C:\\Driver\\Edge Driver\\msedgedriver.exe");

		// opens the browser
		driver = new EdgeDriver();

		// Load url on the browser that was opened

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		// maximise the screen

		driver.manage().window().maximize();

	}

	@Test

	public void test() {
		
		WebElement firstNameInputField = driver.findElement(By.id("input-firstname"));
		
		firstNameInputField.sendKeys("ABCD");
		
		WebElement lastNAmeInputField= driver.findElement(By.cssSelector("#input-lastname"));
		
		lastNAmeInputField.sendKeys("EFGH");
		
		WebElement eMailInputField= driver.findElement(By.cssSelector("#input-email"));
		
		eMailInputField.sendKeys("xyz@gmail.com");
		
		WebElement telephoneInputField= driver.findElement(By.cssSelector("#input-telephone"));
		
		telephoneInputField.sendKeys("2535653656");
		
		WebElement passwordInputField= driver.findElement(By.cssSelector("#input-password"));
		
		passwordInputField.sendKeys("SDeR!23#");
		
		WebElement confirmPasswordInputField= driver.findElement(By.cssSelector("#input-confirm"));
		
		confirmPasswordInputField.sendKeys("SDeR!23#");
		
		WebElement continueButton = driver.findElement(By.cssSelector("div.buttons input:last-of-type"));
		
		continueButton.click();
		
		WebElement alertMessage = driver.findElement(By.cssSelector("div.alert"));
		
		String warningMessage=alertMessage.getText();
		
		System.out.println(warningMessage);
		
		Assert.assertEquals(warningMessage, "Warning: You must agree to the Privacy Policy!", "Text does not match");
		
		
		
		
		
	}

//	@AfterMethod
//
//	public void teardown() {
//
//		// close the browser
//
//		driver.close();
//
//	}
	
	
	
	
	
	
	
	
	
	
	
	

}
