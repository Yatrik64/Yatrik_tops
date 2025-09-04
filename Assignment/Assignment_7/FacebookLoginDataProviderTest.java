package org.junitdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookLoginDataProviderTest {

	 WebDriver driver;

	    @BeforeClass
	    public void setUp() {
	        System.out.println("Launching browser...");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.facebook.com/");
	    }

	    // DataProvider with multiple sets of login data
	    @DataProvider(name = "fbLoginData")
	    public Object[][] getData() {
	        return new Object[][] {
	            {"testuser1@gmail.com", "password123"},
	            {"testuser2@gmail.com", "pass456"},
	            {"testuser3@gmail.com", "mypassword"}
	        };
	    }

	    @Test(dataProvider = "fbLoginData")
	    public void loginTest(String username, String password) throws InterruptedException {
	        WebElement emailField = driver.findElement(By.id("email"));
	        WebElement passField = driver.findElement(By.id("pass"));
	        WebElement loginBtn = driver.findElement(By.name("login"));

	        // Clear old inputs
	        emailField.clear();
	        passField.clear();

	        // Enter login data
	        emailField.sendKeys(username);
	        passField.sendKeys(password);
	        loginBtn.click();

	        Thread.sleep(2000); // wait to see result
	        System.out.println("Login attempted with: " + username + " / " + password);

	        // Navigate back to login page for next dataset
	        driver.navigate().to("https://www.facebook.com/");
	    }

	    @AfterClass
	    public void tearDown() {
	        System.out.println("Closing browser...");
	        driver.quit();
	    }
}
