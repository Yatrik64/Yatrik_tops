package org.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginTest {
	  WebDriver driver;

	    @Before
	    public void setUp() {
	       
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.facebook.com/");
	    }

	    @Test
	    public void testLogin() throws InterruptedException {
	       
	        WebElement email = driver.findElement(By.id("email"));
	        email.sendKeys("your_test_email@gmail.com"); 
	      
	        WebElement password = driver.findElement(By.id("pass"));
	        password.sendKeys("your_test_password");    
	       
	        WebElement loginBtn = driver.findElement(By.name("login"));
	        loginBtn.click();

	        Thread.sleep(3000); 
	       
	        boolean result = driver.getPageSource().contains("Facebook") 
	                         || driver.getCurrentUrl().contains("login");
	        
	        assertTrue("Login test failed!", result);
	    }

	    private void assertTrue(String string, boolean result) {
		
			
		}

		@After
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }

}
