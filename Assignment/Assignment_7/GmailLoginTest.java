package org.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLoginTest {
	WebDriver driver;

    @Before
    public void setUp() {
      
    	System.out.println("Before");
    	System.setProperty("webdriver.chrome.driver", "E:\\Development\\chrome web drive\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fwww.google.com%3Fhl%3Den-US&ec=GAlA8wE&hl=en&flowName=GlifWebSignIn&flowEntry=AddSession&dsh=S995099%3A1756445116249957");  
    }

    @Test
    public void testLogin() throws InterruptedException {
      
    	System.out.println("test");
        WebElement emailField = driver.findElement(By.id("identifierId"));
        emailField.sendKeys("niyatiparth23@gmail.com"); 
        driver.findElement(By.id("identifierNext ")).click();

        Thread.sleep(2000);  

     
        WebElement passwordField = driver.findElement(By.name("Passwd"));
        passwordField.sendKeys("niyatiParth23");     
        driver.findElement(By.id("identifierNext")).click();

        Thread.sleep(3000);
        
    }

   

	@After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
