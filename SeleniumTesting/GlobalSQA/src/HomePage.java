import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    public void homePage() throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        WebElement homeButton = driver.findElement(By.xpath("//div[@class='dark_menu']//descendant::a[text()='Home']"));
        homeButton.click();

        Thread.sleep(3000);

        driver.close();
        driver.quit();
    }
}
