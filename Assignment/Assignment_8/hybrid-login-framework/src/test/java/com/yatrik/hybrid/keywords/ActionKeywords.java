package com.yatrik.hybrid.keywords;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class ActionKeywords {

	 public static WebDriver driver;

	    public static void openBrowser(String browser) {
	        if (browser == null || browser.isBlank()) browser = "chrome";
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    }

	    public static void navigate(String url) {
	        driver.get(url);
	    }

	    private static By getBy(String type, String value) {
	        switch (type.toLowerCase()) {
	            case "id": return By.id(value);
	            case "name": return By.name(value);
	            case "xpath": return By.xpath(value);
	            case "css": return By.cssSelector(value);
	            default: throw new RuntimeException("Unsupported locator type: " + type);
	        }
	    }

	    public static void enterText(String locatorType, String locatorValue, String data) {
	        WebElement el = driver.findElement(getBy(locatorType, locatorValue));
	        el.clear();
	        el.sendKeys(data);
	    }

	    public static void click(String locatorType, String locatorValue) {
	        driver.findElement(getBy(locatorType, locatorValue)).click();
	    }

	    public static boolean verifyError(String locatorType, String locatorValue, String expected) {
	        List<WebElement> els = driver.findElements(getBy(locatorType, locatorValue));
	        boolean found = !els.isEmpty() && els.get(0).isDisplayed();
	        return expected.equalsIgnoreCase("error") ? found : !found;
	    }

	    public static void closeBrowser() {
	        if (driver != null) driver.quit();
	    }
}
