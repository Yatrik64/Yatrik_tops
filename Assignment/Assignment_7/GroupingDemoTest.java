package org.junitdemo;

import org.testng.annotations.Test;
public class GroupingDemoTest {
	

    @Test(groups = {"smoke"})
    public void testLogin() {
        System.out.println("Smoke Test: Login functionality");
    }

    @Test(groups = {"regression"})
    public void testRegister() {
        System.out.println("Regression Test: Registration functionality");
    }

    @Test(groups = {"smoke", "regression"})
    public void testSearch() {
        System.out.println("Smoke + Regression Test: Search functionality");
    }

    @Test(groups = {"sanity"})
    public void testLogout() {
        System.out.println("Sanity Test: Logout functionality");
    }

}
