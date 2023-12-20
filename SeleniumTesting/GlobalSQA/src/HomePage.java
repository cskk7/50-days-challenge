import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    public void homePage(String homePageURL){
        WebDriver driver = new ChromeDriver();
        driver.get(homePageURL);

    }
}
