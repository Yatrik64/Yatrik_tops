package com.Assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class PracticeDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Development\\chrome web drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		driver.findElement(By.id("firstName")).sendKeys("Yatrik");
		Thread.sleep(2000);
		driver.findElement(By.id("lastName")).sendKeys("Prajapati");
		Thread.sleep(2000);
		driver.findElement(By.id("userEmail")).sendKeys("yatrik@gmail.com");
		Thread.sleep(2000);
		WebElement maleRadio = driver.findElement(By.cssSelector("label[for='gender-radio-1']"));
		maleRadio.click();
		WebElement radioInput = driver.findElement(By.id("gender-radio-1"));
		if (radioInput.isSelected()) {
			System.out.println("Male radio button is selected.");
		} else {
			System.out.println("Radio button not selected.");
		}
		driver.findElement(By.id("userNumber")).sendKeys("9876543210");
		Thread.sleep(2000);
		driver.findElement(By.id("dateOfBirthInput")).click();
		 driver.findElement(By.id("dateOfBirthInput")).click();
	        Thread.sleep(1000);
	        WebElement year = driver.findElement(By.cssSelector(".react-datepicker__year-select"));
	        year.sendKeys("2002");
	        Thread.sleep(1000);
	        WebElement month = driver.findElement(By.cssSelector(".react-datepicker__month-select"));
	        month.sendKeys("April");
	        Thread.sleep(1000);
	        driver.findElement(By.cssSelector(".react-datepicker__day--029")).click();
	        Thread.sleep(2000);
	        
	Thread.sleep(2000);
	WebElement subjectInput = driver.findElement(By.cssSelector(".subjects-auto-complete__input input"));
    subjectInput.sendKeys("Maths");
    subjectInput.sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	WebElement sportsCheckbox = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
	WebElement readingCheckbox = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-2']"));
	WebElement musicCheckbox = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-3']"));
	
	sportsCheckbox.click();
	Thread.sleep(1000);
	readingCheckbox.click();
	Thread.sleep(1000);
	musicCheckbox.click();
	Thread.sleep(1000); 
	
	WebElement uploadElement= driver.findElement(By.id("uploadPicture"));
	uploadElement.sendKeys("C:\\Users\\YATRIK-PC\\Downloads");
	Thread.sleep(2000);
	
	driver.findElement(By.id("currentAddress")).sendKeys("Hello my name is yatrik");
	Thread.sleep(2000);

	 WebElement state = driver.findElement(By.id("react-select-3-input"));
     state.sendKeys("NCR");
     state.sendKeys("\n");
     
     Thread.sleep(1000);
     
     WebElement city = driver.findElement(By.id("react-select-4-input"));
     city.sendKeys("Delhi");
     city.sendKeys("\n");
     
	
	Thread.sleep(1000);
	
	driver.findElement(By.id("submit")).click();
	driver.close();
	}

}
