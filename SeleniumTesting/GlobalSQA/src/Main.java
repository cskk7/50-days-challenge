import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.*;
public class Main {
    public static void main(String[] args) throws InterruptedException{
        HomePage home = new HomePage();
        home.homePage();
    }
}