package com.yatrik.hybrid.tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.yatrik.hybrid.keywords.ActionKeywords;
import com.yatrik.hybrid.utils.ExcelReader;


public class HybridLoginTest {
	
	@Test
	public void runHybridSteps() {
        System.out.println("Running Hybrid Test");
        String excelPath = "src/test/resources/data/HybridData.xlsx";
        ExcelReader reader = new ExcelReader(excelPath);
        String sheet = "Sheet1";
        int lastRow = reader.getRowCount(sheet);

        for (int r = 1; r <= lastRow; r++) { // row 0 is header
            String keyword = reader.getCellData(sheet, r, 1);
            String locatorType = reader.getCellData(sheet, r, 2);
            String locatorValue = reader.getCellData(sheet, r, 3);
            String testData = reader.getCellData(sheet, r, 4);
            String expected = reader.getCellData(sheet, r, 5);

            System.out.println("Step " + r + " -> " + keyword);

            switch (keyword.toLowerCase()) {
                case "openbrowser":
                    ActionKeywords.openBrowser(testData);
                    break;
                case "navigate":
                    ActionKeywords.navigate(testData);
                    break;
                case "entertext":
                    ActionKeywords.enterText(locatorType, locatorValue, testData);
                    break;
                case "click":
                    ActionKeywords.click(locatorType, locatorValue);
                    break;
                case "verifyerror":
                    boolean result = ActionKeywords.verifyError(locatorType, locatorValue, expected);
                    Assert.assertTrue(result, "Expected error state: " + expected);
                    break;
                case "closebrowser":
                    ActionKeywords.closeBrowser();
                    break;
                default:
                    throw new RuntimeException("Unknown keyword: " + keyword);
            }
        }
    }

}
