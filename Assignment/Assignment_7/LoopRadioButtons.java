package Assignments_7;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

public class LoopRadioButtons {

    public static void main(String[] args) {
      
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        

        driver.get("https://demo.automationtesting.in/Register.html");

        
        List<WebElement> radioOptions = driver.findElements(By.name("radiooptions"));

        System.out.println("Total radio options found: " + radioOptions.size());

        
        for (int i = 0; i < radioOptions.size(); i++) {
            WebElement radio = radioOptions.get(i);
            String value = radio.getAttribute("value");
            System.out.println("Clicking radio option #" + (i + 1) + " with value: " + value);
            radio.click();
           
            try { Thread.sleep(500); } catch (InterruptedException e) { /* ignored */ }
        }

        driver.quit();
    }


    }

