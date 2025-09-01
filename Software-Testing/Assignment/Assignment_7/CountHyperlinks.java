package Assignments_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class CountHyperlinks {
    public static void main(String[] args) {
    
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            driver.get("https://qavbox.github.io/demo/webtable/");

          
            List<WebElement> links = driver.findElements(By.tagName("a"));
            
           
            System.out.println("Total number of hyperlinks on the page: " + links.size());

            
            for (WebElement link : links) {
                System.out.println("Text: \"" + link.getText() + "\" | HREF: " + link.getAttribute("href"));
            }
        } finally {
            driver.quit();
        }
    }
}
