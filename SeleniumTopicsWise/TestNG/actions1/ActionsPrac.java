package SeleniumTopicsWise.TestNG.actions1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class ActionsPrac {

    private WebDriver driver;
    private Actions  actions;

    @BeforeClass(groups = {"Right CLick"})
    public void setUpRightClick() {
        driver = new ChromeDriver();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        actions = new Actions(driver);
    }
    @BeforeClass(groups = {"Slider"})
    public void setUpSlider() {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/slider/");
        actions = new Actions(driver);
    }

    public void rightclick(){
        WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
        actions.contextClick(rightClick).build().perform();

    }

    @Test(groups = {"Right CLick"})
    public void edit(){
        rightclick();
        driver.findElement(By.xpath("//span[text()='Edit']")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
    }
    @Test(groups = {"Right CLick"})
    public void cut(){
        rightclick();
        driver.findElement(By.xpath("//span[text()='Cut']")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
    }
    @Test(groups = {"Right CLick"})
    public void copy(){
        rightclick();
        driver.findElement(By.xpath("//span[text()='Copy']")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
    }
    @Test(groups = {"Right CLick"})
    public void paste(){
        rightclick();
        driver.findElement(By.xpath("//span[text()='Paste']")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
    }
    @Test(groups = {"Right CLick"})
    public void delete(){
        rightclick();
        driver.findElement(By.xpath("//span[text()='Delete']")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
    }
    @Test(groups = {"Slider"})
    public void slider(){
        WebElement slider = driver.findElement(By.xpath("//input[@type='range']"));
        actions.moveToElement(slider).dragAndDropBy(slider,210,0).build().perform();
    }


    @AfterClass(groups = {"Right CLick","Slider","Double Click"})
    public void close() {
        driver.quit();
    }
}