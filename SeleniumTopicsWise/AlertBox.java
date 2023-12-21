package SeleniumTopicsWise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertBox {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://testpages.herokuapp.com/styled/alerts/alert-test.html");

        Thread.sleep(3000);

//ALERT BOX
        driver.findElement(By.id("alertexamples")).click();

        Thread.sleep(3000);

        driver.switchTo().alert().accept();

        Thread.sleep(3000);

//CONFIRM BOX - accept
        driver.findElement(By.id("confirmexample")).click();

        Thread.sleep(3000);

        driver.switchTo().alert().accept();

        Thread.sleep(3000);

//CONFIRM BOX - dismiss
        driver.findElement(By.id("confirmexample")).click();

        Thread.sleep(3000);

        driver.switchTo().alert().dismiss();

        Thread.sleep(3000);

//PROMPT BOX - accept

        driver.findElement(By.id("promptexample")).click();

        Thread.sleep(3000);

        driver.switchTo().alert().sendKeys("I am Karthik");

        driver.switchTo().alert().accept();

        Thread.sleep(3000);

//PROMPT BOX - dismiss

        driver.findElement(By.id("promptexample")).click();

        Thread.sleep(3000);

        driver.switchTo().alert().sendKeys("I am Karthik");

        driver.switchTo().alert().dismiss();

        Thread.sleep(3000);

        driver.quit();
    }
}