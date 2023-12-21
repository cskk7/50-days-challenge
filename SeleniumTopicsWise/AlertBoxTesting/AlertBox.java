package SeleniumTopicsWise.AlertBoxTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertBox {
        public static void main(String[] args) throws InterruptedException {

                WebDriver driver = new ChromeDriver();
        
                driver.manage().window().maximize();
        
                driver.navigate().to("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
        
                Thread.sleep(3000);
        //ALERT has only accept
        //ALERT BOX - accept
                driver.findElement(By.id("alertexamples")).click(); // Click to show Alert box
        
                Thread.sleep(3000);
        
                System.out.println(driver.switchTo().alert().getText()); //ALERT BOX - getText
        
                Thread.sleep(3000);
        
                driver.switchTo().alert().accept(); //Clicked OK of Alert Box
        
                Thread.sleep(3000);
        //---------------------------------------------------------------
        //CONFIRM - accept and dismiss
        //CONFIRM BOX - 1)accept
                driver.findElement(By.id("confirmexample")).click();// Click to show Confirm box
        
                Thread.sleep(3000);
        
                System.out.println(driver.switchTo().alert().getText()); //CONFIRM BOX - getText
        
                Thread.sleep(3000);
        
                driver.switchTo().alert().accept(); // Click OK of Confirm Box
        
                Thread.sleep(3000);
        
        //CONFIRM BOX - 2)dismiss
                driver.findElement(By.id("confirmexample")).click();// Click to show Confirm box
        
                Thread.sleep(3000);
        
                driver.switchTo().alert().dismiss(); // Click Cancel of Confirm Box
        
                Thread.sleep(3000);
        
        
        //PROMPT BOX - 1)accept
                driver.findElement(By.id("promptexample")).click();// Click to show Prompt box
        
                Thread.sleep(3000);
        
                driver.switchTo().alert().sendKeys("I am Karthik");//type values inside prompt
        
                Thread.sleep(3000);
        
                System.out.println(driver.switchTo().alert().getText()); //CONFIRM BOX - getText
        
                Thread.sleep(3000);
        
                driver.switchTo().alert().accept(); // Click OK of Prompt Box
        
                Thread.sleep(3000);
        
        //PROMPT BOX - 2)dismiss
        
                driver.findElement(By.id("promptexample")).click();// Click to show Prompt box
        
                Thread.sleep(3000);
        
                driver.switchTo().alert().sendKeys("I am Karthik");//type values inside prompt
        
                driver.switchTo().alert().dismiss(); // Click Cancel of Prompt Box
        
                Thread.sleep(3000);
        
                driver.quit();
            }
}