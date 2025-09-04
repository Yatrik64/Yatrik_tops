package com.demo.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SignInPage {
    private final WebDriver driver;
    private final WebDriverWait wait;

   
    private By emailInput = By.cssSelector("input[type='text'], input[type='email']");
    private By passwordInput = By.cssSelector("input[type='password']");
   
    private By signInBtn = By.cssSelector("#enterbtn, button[id*='enter'], button[type='submit'], input[type='submit']");

  
    private By genericError = By.xpath("//*[contains(translate(., 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), 'invalid') and contains(., 'Pass')]");

    
    private final String successUrlFragment = "Index.html";

    public SignInPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(8));
    }

    public void login(String email, String password) {
       
        WebElement emailElm = wait.until(d -> {
            List<WebElement> inputs = d.findElements(emailInput);
            return inputs.isEmpty() ? null : inputs.get(0);
        });
        emailElm.clear();
        emailElm.sendKeys(email);

        
        WebElement passElm = wait.until(d -> {
            List<WebElement> inputs = d.findElements(passwordInput);
            return inputs.isEmpty() ? null : inputs.get(0);
        });
        passElm.clear();
        passElm.sendKeys(password);

     
        WebElement btn = wait.until(d -> {
            List<WebElement> btns = d.findElements(signInBtn);
            return btns.isEmpty() ? null : btns.get(0);
        });
        btn.click();
    }

    /** Wait until either success or error becomes detectable */
    public void waitForOutcome() {
        wait.until((ExpectedCondition<Boolean>) d -> {
            boolean urlLooksGood = d.getCurrentUrl().contains(successUrlFragment);
            boolean errorVisible = !d.findElements(genericError).isEmpty();
            return urlLooksGood || errorVisible;
        });
    }

    public boolean isLoginSuccessful() {
        return driver.getCurrentUrl().contains("Index.html");
    }

    public boolean isErrorShown() {
        return driver.findElements(By.id("errormsg")).size() > 0;
    }

    }
