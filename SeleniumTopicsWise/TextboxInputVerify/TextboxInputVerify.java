package SeleniumTopicsWise.TextboxInputVerify;

public class TextboxInputVerify {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

//   Email input checking
        WebElement myEmailInput = driver.findElement(By.id("email"));

        myEmailInput.sendKeys("myName@gmail.com");

        String actualEmailInput = myEmailInput.getAttribute("value");
        System.out.println("Entered email is: " + actualEmailInput);


//   Password input checking
        WebElement myPasswordInput = driver.findElement(By.id("pass"));
        myPasswordInput.sendKeys("abcd1234");
        String actualPasswordInput = myPasswordInput.getAttribute("value");
        System.out.println("Entered password is: " + actualPasswordInput);

        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }
}