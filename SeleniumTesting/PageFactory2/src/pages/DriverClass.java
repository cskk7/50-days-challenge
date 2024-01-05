package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverClass {
    public static WebDriver driver;
   public WebDriver getDriver() {

       driver = new ChromeDriver();
       return driver;
   }

}
