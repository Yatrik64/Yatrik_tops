package Assignments_7;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownRigister {

	    public static void main(String[] args) {
	        Object WebDriverManager;
	
	        WebDriver driver = new ChromeDriver();
	        try {
	            driver.manage().window().maximize();
	            driver.get("https://demo.automationtesting.in/Register.html");

	          
	            WebElement skillsDropdown = driver.findElement(By.id("Skills"));
	            Select skillsSelect = new Select(skillsDropdown);

	            // Select by visible text
	            String optionToSelect = "Java";
	            skillsSelect.selectByVisibleText(optionToSelect);

	            // Optional: Verify selection
	            WebElement selected = skillsSelect.getFirstSelectedOption();
	            System.out.println("Selected skill: " + selected.getText());

	            // Add more dropdown interactions if needed (e.g., Country)
	            // WebElement countryDropdown = driver.findElement(By.id("..."));
	            // Select countrySelect = new Select(countryDropdown);
	            // countrySelect.selectByValue("...');
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            driver.quit();
	        }
	    }
	}
