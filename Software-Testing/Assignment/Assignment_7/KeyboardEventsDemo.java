package Assignments_7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEventsDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Register.html");

        Actions action = new Actions(driver);

        WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));

        action.click(firstName)
              .keyDown(Keys.SHIFT)
              .sendKeys("yatrik")
              .keyUp(Keys.SHIFT)
              .perform();

        Thread.sleep(2000);

       
        action.sendKeys(Keys.TAB).perform();

        Thread.sleep(2000);

       
        action.sendKeys("Prajapati").perform();

        Thread.sleep(2000);

        action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();

        Thread.sleep(2000);


        action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();

        Thread.sleep(2000);

        
        action.sendKeys(Keys.TAB).perform();

        Thread.sleep(2000);

        action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

        Thread.sleep(3000);
        driver.quit();
    }
}
