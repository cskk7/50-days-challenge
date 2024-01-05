package SeleniumTopicsWise.TestNG.methodsXML;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class ActionsPractice {

    private WebDriver driver;
    private Actions  actions;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://jqueryui.com/");
        actions = new Actions(driver);
    }

    @Test
    public void switchToDroppableFrame(){
        WebElement droppableButton = driver.findElement(By.linkText("Droppable"));
        droppableButton.click();
        WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(iframe);
    }

    @Test
    public void dragAndDrop(){
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));
        actions.dragAndDrop(draggable, droppable).build().perform();
    }
    @Test
    public void clickAndHold(){
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));
        actions.clickAndHold(draggable).build().perform();
        actions.moveToElement(droppable).build().perform();
        actions.release(draggable).build().perform();
    }

    @AfterClass
    public void close() {
        driver.quit();
    }
}