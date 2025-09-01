package Assignments_7;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleFormAutomation {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/automation-practice-form");

        driver.findElement(By.id("firstName")).sendKeys("Yatrik");
        driver.findElement(By.id("lastName")).sendKeys("Prajapati");
        driver.findElement(By.id("userEmail")).sendKeys("yatrik@example.com");
        driver.findElement(By.id("userNumber")).sendKeys("9876543210");

        WebElement gender = driver.findElement(By.cssSelector("label[for='gender-radio-1']"));
        gender.click();

        driver.findElement(By.id("currentAddress")).sendKeys("Ahmedabad, India");

        driver.findElement(By.id("submit")).click();

        System.out.println("Form filled successfully!");

        driver.quit();
    }
}
