package org.junitdemo;

import java.util.Arrays;
import java.util.Collection;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Parameterized.class)
public class FacebookLoginTest1 {

	  private String email;
	    private String password;
	    private static WebDriver driver;

	    public void FacebookLoginTest(String email, String password) {
	        this.email = email;
	        this.password = password;
	    }

	    @BeforeClass
	    public static void setUpBeforeClass() {
	        System.out.println("Opening Browser...");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.facebook.com/");
	    }

	    @AfterClass
	    public static void tearDownAfterClass() {
	        System.out.println("Closing Browser...");
	        driver.quit();
	    }

	    @Parameters
	    public static Collection<Object[]> testData() {
	        return Arrays.asList(new Object[][] {
	            { "testuser1@gmail.com", "password123" },
	            { "testuser2@gmail.com", "pass456" },
	            { "testuser3@gmail.com", "mypassword" }
	        });
	    }

	    @Test
	    public void testLoginWithMultipleUsers() throws InterruptedException {
	        WebElement emailField = driver.findElement(By.id("email"));
	        WebElement passField = driver.findElement(By.id("pass"));
	        WebElement loginBtn = driver.findElement(By.name("login"));

	       
	        emailField.clear();
	        passField.clear();

	        emailField.sendKeys(email);
	        passField.sendKeys(password);
	        loginBtn.click();

	        Thread.sleep(2000); 

	        System.out.println("Tried login with -> Email: " + email + " | Password: " + password);

	      
	        driver.navigate().back();
	    }
	}

