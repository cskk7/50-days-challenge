package Test.demoqa;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

public class ToDoStepDefinition {

    WebDriver driver;
    @Before
    public void setup() {
        driver = new ChromeDriver();
    }

    @Given("Login page")
    public void loginPage() {
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }


    @When("user enter valid username {string}")
    public void userEnterValidUsername(String arg0) {
        WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
        user.sendKeys(arg0);
        String usernameInput = user.getAttribute("value");
        Assert.assertTrue(usernameInput.contains(arg0));
    }

    @And("user enter valid password {string}")
    public void userEnterValidPassword(String arg0) {
        WebElement user = driver.findElement(By.xpath("//input[@id='password']"));
        user.sendKeys(arg0);
        String passwordInput = user.getAttribute("value");
        Assert.assertTrue(passwordInput.contains(arg0));
    }

    @And("user click submit button")
    public void userClickSubmitButton() {
        WebElement user = driver.findElement(By.name("submit"));
        user.click();
    }
    @Then("user enters to profile page")
    public void userEntersToProfilePage() {
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Test login"));
    }

    @And("user is displayed {string}")
    public void userIsDisplayed(String arg0) {
        String text = driver.findElement(By.className("post-content")).getText();
        Assert.assertEquals(text,arg0);
    }

    @And("log out button is displayed")
    public void logOutButtonIsDisplayed() {
        WebElement button = driver.findElement(By.xpath("//a[text()='Log out']"));
        Assert.assertTrue(button.isDisplayed());
    }

    @When("user enter invalid username {string}")
    public void userEnterInvalidUsername(String arg0) {
        WebElement user = driver.findElement(By.name("username"));
        user.sendKeys(arg0);
        String usernameInput = user.getAttribute("value");
        Assert.assertFalse(usernameInput.contains(arg0));
    }

    @Then("error message is displayed")
    public void errorMessageIsDisplayed() {
        WebElement errorMessage = driver.findElement(By.id("error"));
        Assert.assertTrue(errorMessage.isDisplayed());
    }

    @And("user enter invalid password {string}")
    public void userEnterInvalidPassword(String arg0) {
        WebElement user = driver.findElement(By.name("password"));
        user.sendKeys(arg0);
        String passwordInput = user.getAttribute("value");
        Assert.assertFalse(passwordInput.contains(arg0));
    }

    @And("error text is {string}")
    public void errorTextIs(String arg0) {
        String errorMessage = driver.findElement(By.id("error")).getText();
        Assert.assertEquals(errorMessage,arg0);
    }

    @After
    public void cleanUp() {
        driver.quit();
    }


}