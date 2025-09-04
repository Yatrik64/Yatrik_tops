package Assignments_7;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandlingDemo {
    public static void main(String[] args) throws InterruptedException {
       
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Alerts.html");

     
        driver.findElement(By.xpath("//button[contains(text(),'alert box:')]")).click();

        Alert simpleAlert = driver.switchTo().alert();
        System.out.println("Simple Alert Text: " + simpleAlert.getText());
        Thread.sleep(2000);
        simpleAlert.accept();

       
        driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'confirm box')]")).click();

        Alert confirmAlert = driver.switchTo().alert();
        System.out.println("Confirmation Alert Text: " + confirmAlert.getText());
        Thread.sleep(2000);
        confirmAlert.dismiss();  // Click Cancel


        driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'prompt box')]")).click();

        Alert promptAlert = driver.switchTo().alert();
        System.out.println("Prompt Alert Text: " + promptAlert.getText());
        Thread.sleep(2000);
        promptAlert.sendKeys("Yatrik"); 
        promptAlert.accept();            

        Thread.sleep(3000);
        driver.quit();
    }
}
