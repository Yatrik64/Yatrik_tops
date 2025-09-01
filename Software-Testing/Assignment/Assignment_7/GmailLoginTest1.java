package org.junitdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GmailLoginTest1 {

	  WebDriver driver;

	    @BeforeTest
	    public void setUp() {
	        System.out.println("Launching Chrome browser...");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://accounts.google.com/");
	    }

	    @Test
	    public void loginTest() throws InterruptedException {
	        // Enter Email
	        WebElement emailField = driver.findElement(By.id("identifierId"));
	        emailField.sendKeys("yourEmail@gmail.com");

	        driver.findElement(By.id("identifierNext")).click();
	        Thread.sleep(2000);

	        // Enter Password
	        WebElement passwordField = driver.findElement(By.name("Passwd"));
	        passwordField.sendKeys("yourPassword");

	        driver.findElement(By.id("passwordNext")).click();
	        Thread.sleep(3000);

	        System.out.println("Gmail login attempted.");
	    }

	    @AfterTest
	    public void tearDown() {
	        System.out.println("Closing browser...");
	        driver.quit();
	    }
}
