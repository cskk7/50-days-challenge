package SeleniumTopicsWise.ButtonColorTesting;

// To check the backgroung color of button and the color of text inside the button.
// Output: The color in rgba format will be printed in the console
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonColor {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        String buttonColor = driver.findElement(By.xpath("//button[text()='Log in']")).getCssValue("background-color");
        String buttonTextColor = driver.findElement(By.xpath("//button[text()='Log in']")).getCssValue("color");
        System.out.println("Button color: " + buttonColor);
        System.out.println("Text color " + buttonTextColor);
        driver.close();
        driver.quit();
    }
}

