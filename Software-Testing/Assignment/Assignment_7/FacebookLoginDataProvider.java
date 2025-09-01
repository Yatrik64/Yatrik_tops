package org.junitdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookLoginDataProvider {

	   WebDriver driver;

	    @BeforeTest
	    public void setUp() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.facebook.com/");
	    }

	    // DataProvider to supply multiple sets of data
	    @DataProvider(name = "loginData")
	    public Object[][] getData() {
	        return new Object[][] {
	            {"niyatiparth23", "niyatiParth23"},
	            {"testuser2@gmail.com", "password2"},
	            {"testuser3@gmail.com", "password3"}
	        };
	    }

	    // Test method that takes data from DataProvider
	    @Test(dataProvider = "loginData")
	    public void loginTest(String username, String password) throws InterruptedException {
	        WebElement email = driver.findElement(By.id("email"));
	        email.clear();
	        email.sendKeys(username);

	        WebElement pass = driver.findElement(By.id("pass"));
	        pass.clear();
	        pass.sendKeys(password);

	        driver.findElement(By.name("login")).click();

	        Thread.sleep(2000); // just for demo
	        System.out.println("Login attempted with: " + username + " / " + password);

	        driver.navigate().back(); // go back to login page for next data set
	    }

	    @AfterTest
	    public void tearDown() {
	        driver.quit();
	    }
}
