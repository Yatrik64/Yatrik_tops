package org.junitdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FacebookLoginTestJunit {
    WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.out.println("Launching Browser...");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
    }

    // Accepting multiple parameters from TestNG.xml
    @Test
    @Parameters({"username", "password"})
    public void loginTest(String username, String password) throws InterruptedException {
        WebElement email = driver.findElement(By.id("email"));
        email.clear();
        email.sendKeys(username);

        WebElement pass = driver.findElement(By.id("pass"));
        pass.clear();
        pass.sendKeys(password);

        driver.findElement(By.name("login")).click();

        Thread.sleep(2000); // Just for demo
        System.out.println("Login attempted with: " + username + " / " + password);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
        System.out.println("Browser closed.");
    }

}
