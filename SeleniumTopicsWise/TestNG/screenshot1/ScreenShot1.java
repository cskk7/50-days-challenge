package SeleniumTopicsWise.TestNG.screenshot1;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class ScreenShot1 {

    public WebDriver driver;
    public Actions actions;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/");
        driver.manage().window().maximize();
        actions = new Actions(driver);
    }
    @Test
    public void testLogin() throws IOException {

        WebElement testerHub = driver.findElement(By.xpath("//div[@id='menu']//a[text()='Tester’s Hub']"));
        WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOf(testerHub));
        actions.moveToElement(wait).build().perform();
        screen("testerHub");
        WebElement demoTestSite = driver.findElement(By.xpath("//span[text()='Demo Testing Site']"));
        actions.moveToElement(demoTestSite).build().perform();
        screen("demoTestSite");
        driver.findElement(By.xpath("//span[text()='Dialog Boxes']")).click();
        driver.switchTo().frame(0);
        screen("dialogueBox-Form");

        driver.findElement(By.id("create-user")).click();
        screen("createNewUser");
        }
    public void screen(String screenShot) throws IOException {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
//        ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("F:\\"+screenShot+".png"));
    }

    @AfterClass
    public void close() {
        driver.quit();
    }
}

