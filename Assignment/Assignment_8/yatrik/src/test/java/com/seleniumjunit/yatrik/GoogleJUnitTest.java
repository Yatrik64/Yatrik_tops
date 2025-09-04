package com.seleniumjunit.yatrik;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleJUnitTest {
	
	 private WebDriver driver;

	    @BeforeEach
	    void setUp() {
	        WebDriverManager.chromedriver().setup();
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--start-maximized");
	        driver = new ChromeDriver(options);
	    }

	    @Test
	    void testGoogleHomePageTitle() {
	        driver.get("https://www.google.com/");
	        String title = driver.getTitle();
	        System.out.println("Page Title: " + title);
	        Assertions.assertTrue(title.contains("Google"), "Title should contain 'Google'");
	    }

	    @AfterEach
	    void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }

}
