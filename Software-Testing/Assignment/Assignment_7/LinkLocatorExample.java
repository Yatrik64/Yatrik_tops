package Assignments_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkLocatorExample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Development\\chrome web drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 try {
			 driver.get("https://careercenter.tops-int.com/");
			 WebElement forgotPasswordLink = driver.findElement(By.linkText("Forgot Password?"));
	            forgotPasswordLink.click();
	            WebElement projectTrackerLink = driver.findElement(By.partialLinkText("Project Tracker"));
	            projectTrackerLink.click();
	            WebElement resumeToolLink = driver.findElement(By.partialLinkText("Resume"));
	            resumeToolLink.click();}
	            catch (Exception e) {
	                e.printStackTrace();
	            } finally {
	                driver.quit();
	            }
	        }
		 }

