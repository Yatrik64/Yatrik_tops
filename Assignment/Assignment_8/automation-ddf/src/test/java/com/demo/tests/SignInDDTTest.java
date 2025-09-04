package com.demo.tests;

import com.demo.base.BaseTest;
import com.demo.pages.SignInPage;
import com.demo.utils.ExcelUtil;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SignInDDTTest extends BaseTest {

   
    private static final String EXCEL_PATH = "src/test/resources/data/LoginData.xlsx";
    private static final String SHEET_NAME = "Sheet1";

    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return ExcelUtil.readSheet(EXCEL_PATH, SHEET_NAME);
    }

    @Test(dataProvider = "loginData")
    @Parameters({"baseUrl"})
    public void signIn_withExcelData(String email, String password, String expected) {
        SignInPage page = new SignInPage(driver);

        page.login(email, password);
        page.waitForOutcome();

        boolean success = page.isLoginSuccessful();
        boolean error = page.isErrorShown();

        
        if ("success".equalsIgnoreCase(expected)) {
            Assert.assertTrue(success && !error, 
                "Expected SUCCESS but got error or no redirect. Email: " + email);
        } else {
            Assert.assertTrue(error || !success,
                "Expected ERROR but looks like success. Email: " + email);
        }
    }
}
