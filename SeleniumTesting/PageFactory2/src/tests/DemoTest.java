package tests;
import pages.DriverClass;
import pages.LoginPage;

import java.util.Set;

public class DemoTest{
    static LoginPage loginPage;

    public static void main(String[] args) {

// LOGIN PAGE

        loginPage = new LoginPage(loginPage.getDriver());

        loginPage.launchURL("https://practicetestautomation.com/practice-test-login/");

        loginPage.enterUsername("student");

        loginPage.enterPassword("password");

        loginPage.clickSubmit();

        loginPage.endTest();

    }
}
