package Assignments_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Development\\chrome web drive\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://careercenter.tops-int.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.id("mobile")).sendKeys("9173816590");
		Thread.sleep(1000);
		driver.findElement(By.className("user_password")).sendKeys("9173816590");
		Thread.sleep(1000);
		driver.findElement(By.className("btn.btn-brand.btn-block.w-75.mx-auto")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("Diploma.In.Software.Testing.And.Automation")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("dropdown-item.fw-600.text-darkgray.lbCourseList")).click();
		Thread.sleep(1000);
        driver.findElement(By.className("Godhani.Khushi")).click();
		Thread.sleep(1000);
        driver.findElement(By.className("class=\"dropdown-item text-danger\"")).click();
		Thread.sleep(1000);
		
	}
}