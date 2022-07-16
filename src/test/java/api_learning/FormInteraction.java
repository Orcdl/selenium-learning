package api_learning;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormInteraction {

    public static void main(String[] args) {

        // Get a chrome session
        WebDriver driver = DriverFactory.getChromeDriver();

        //Navigate to the target page
        driver.get("https://the-internet.herokuapp.com/login");

        // Find element
        WebElement usernameEle = driver.findElement(By.id("username"));
        WebElement passwordEle = driver.findElement(By.cssSelector("#password"));
        WebElement LoginBthEle = driver.findElement(By.cssSelector("[type=submit]"));
        //Interaction
        usernameEle.sendKeys("tomsmith");
        passwordEle.sendKeys("SuperSecretPassword!");
        LoginBthEle.click();

        //Debug purpose only
        try{
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        }

        //Quit the browser session
        driver.quit();
    }
}
