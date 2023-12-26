package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class DemoTest {
    static LoginPage loginPage;

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        loginPage = new LoginPage(driver);

        loginPage.launchURL("https://practicetestautomation.com/practice-test-login/");

        loginPage.enterUsername("student");

        loginPage.enterPassword("password");

        loginPage.clickSubmit();

        driver.close();

        driver.quit();
    }
}
