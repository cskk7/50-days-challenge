package select1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;

public class SelectPractice {

    private WebDriver driver;
    private Select select;
    private WebElement selectCar;

    @BeforeClass(groups = {"SelectOptions","PrintOptions"})
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://cskk7.github.io/Karthikesavan-Blog");

    }
    @Test(groups = {"SelectOptions","PrintOptions"})
    public void createWebElement() throws InterruptedException {
        WebElement selectMenu = driver.findElement(By.partialLinkText("SELECT"));
        selectMenu.click();
        selectCar = driver.findElement(By.id("selectCars"));
        select = new Select(selectCar);
        Thread.sleep(3000);
    }
//Select Purple --  selectByValue()
    @Test(dependsOnMethods = "createWebElement",groups = {"SelectOptions"})
    public void byValue() throws InterruptedException{
        select.selectByValue("ns");
        Thread.sleep(3000);
    }
//Select White -- selectByVisibletext()
    @Test(dependsOnMethods = "createWebElement",groups = {"SelectOptions"})
    public void byVisibleText() throws InterruptedException{
        select.selectByVisibleText("Land Rover");
        Thread.sleep(3000);
    }
//Select Blue -- selectByIndex()
    @Test(dependsOnMethods = "createWebElement",groups = {"SelectOptions"})
    public void byIndex() throws InterruptedException{
        select.selectByIndex(4);
        Thread.sleep(3000);
    }
//Print all Options
    @Test(dependsOnMethods = "createWebElement",groups = {"PrintOptions"})
    public void printAllOptions() throws InterruptedException{

        List<WebElement> options = select.getOptions();
        Iterator<WebElement> itr = options.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next().getText()+" | ");
        }
        System.out.println("\n-------------------------------------");
        Thread.sleep(3000);
    }
//Print all Options
    @Test(dependsOnMethods = "createWebElement",groups = {"PrintOptions"})
    public void printOneOption() throws InterruptedException{

        for(WebElement i : select.getOptions()) {
            System.out.println(i.getText());
        }
        System.out.println("-------------------------------------");
        Thread.sleep(3000);
    }

    @AfterClass(groups = {"SelectOptions","PrintOptions"})
    public void close() {
        driver.quit();
    }
}
