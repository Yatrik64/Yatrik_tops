package com.seleniumjunit;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleJUnitTest {

    private WebDriver driver;

    @BeforeEach
    void setUp() {
        // Use WebDriverManager to download/setup matching ChromeDriver
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        // options.addArguments("--headless=new"); // uncomment for headless CI runs

        driver = new ChromeDriver(options);
    }

    @Test
    void testGoogleTitle() {
        driver.get("https://www.google.com/");
        String title = driver.getTitle();
        System.out.println("Page title: " + title);
        Assertions.assertTrue(title.contains("Google"), "Title should contain 'Google'");
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    }