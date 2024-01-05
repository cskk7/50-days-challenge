package tests;
import org.openqa.selenium.WebDriver;
import pages.DriverClass;
import pages.LoginPage;


public class DemoTest extends DriverClass {
    static LoginPage loginPage;

    static WebDriver driver = getDriver();

    public static void main(String[] args) {

// LOGIN PAGE
        loginPage = new LoginPage(driver);

        loginPage.launchURL("https://practicetestautomation.com/practice-test-login/");

        loginPage.enterUsername("student");

        loginPage.enterPassword("password");

        loginPage.clickSubmit();

        loginPage.endTest();

    }
}
