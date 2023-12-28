package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DriverClass {

    public static WebDriver driver;

   public WebDriver getDriver() {

       driver = new ChromeDriver();
       return driver;
   }



}
