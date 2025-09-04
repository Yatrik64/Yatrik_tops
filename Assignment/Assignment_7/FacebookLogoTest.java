package Assignments_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogoTest {
	public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

      
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

   
        driver.get("https://www.facebook.com/");

       
        WebElement logo = driver.findElement(By.xpath("//img[contains(@alt,'Facebook')]"));

        // Check if displayed
        if (logo.isDisplayed()) {
            System.out.println("✅ Facebook logo is displayed!");
        } else {
            System.out.println("❌ Facebook logo is NOT displayed!");
        }

     
        driver.quit();
    }
}
