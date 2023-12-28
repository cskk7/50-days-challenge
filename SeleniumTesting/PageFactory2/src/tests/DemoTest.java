package tests;
import pages.DriverClass;
import pages.LoginPage;

public class DemoTest extends DriverClass{
    static LoginPage loginPage;

    public static void main(String[] args) {

// LOGIN PAGE

        loginPage = new LoginPage(loginPage.driver);

        loginPage.launchURL("https://practicetestautomation.com/practice-test-login/");

        loginPage.enterUsername("student");

        loginPage.enterPassword("password");

        loginPage.clickSubmit();

        loginPage.endTest();

    }
}
