package Assignments_7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MousecliclEvent {
	public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");

        Actions action = new Actions(driver);

        
        WebElement skillsDropdown = driver.findElement(By.id("Skills"));
        action.moveToElement(skillsDropdown).perform();

        action.click(skillsDropdown)
              .keyDown(Keys.SHIFT)
              .sendKeys("automation")
              .keyUp(Keys.SHIFT)
              .perform();

        driver.quit();
    }

}
