package SeleniumTopicsWise.TestNG.alerts1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AlertsPrac {


    public WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://cskk7.github.io/Karthikesavan-Blog/alertsPractice.html");
    }
    @Test(groups = {"Alerts"})
    public void alertsAccept() throws InterruptedException {
        WebElement alert = driver.findElement(By.id("alert"));
        alert.click(); // Click to show Alert box
        Thread.sleep(3000);
        System.out.println(driver.switchTo().alert().getText()); //ALERT BOX - getText
        Thread.sleep(3000);
        driver.switchTo().alert().accept(); //Clicked OK of Alert Box
        Thread.sleep(3000);
    }
    @Test(groups = {"Confirm"})
    public void confirmAccept() throws InterruptedException {
        WebElement confirm = driver.findElement(By.id("confirm"));
        confirm.click();// Click to show Confirm box
        Thread.sleep(3000);
        System.out.println(driver.switchTo().alert().getText()); //CONFIRM BOX - getText
        Thread.sleep(3000);
        driver.switchTo().alert().accept(); // Click OK of Confirm Box
        Thread.sleep(3000);
    }
    @Test(groups = {"Confirm"})
    public void confirmDismiss() throws InterruptedException {
        WebElement confirm = driver.findElement(By.id("confirm"));
        confirm.click();// Click to show Confirm box
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss(); // Click Cancel of Confirm Box
        Thread.sleep(3000);
    }
    @Test(groups = {"Prompt"})
    public void promptAccept() throws InterruptedException {
        WebElement confirm = driver.findElement(By.id("prompt"));
        confirm.click();// Click to show Prompt box
        Thread.sleep(3000);
        driver.switchTo().alert().sendKeys("I am Karthik");//type values inside prompt
        Thread.sleep(3000);
        System.out.println(driver.switchTo().alert().getText()); //CONFIRM BOX - getText
        Thread.sleep(3000);
        driver.switchTo().alert().accept(); // Click OK of Prompt Box
        Thread.sleep(3000);
    }
    @Test(groups = {"Prompt"})
    public void promptDismiss() throws InterruptedException {
        WebElement confirm = driver.findElement(By.id("prompt"));
        confirm.click();// Click to show Prompt box
        Thread.sleep(3000);
        driver.switchTo().alert().sendKeys("I am Karthik");//type values inside prompt

        driver.switchTo().alert().dismiss(); // Click Cancel of Prompt Box

        Thread.sleep(3000);

        driver.quit();
    }
    @AfterClass
    public void close() {
        driver.quit();
    }
}