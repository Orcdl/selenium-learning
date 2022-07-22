package api_learning;

import dev.failsafe.internal.util.Assert;
import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ELementDisplaying {

    public static void main(String[] args) {

//        // Get a chrome session
//        WebDriver driver = DriverFactory.getChromeDriver();
//        Exception e = null; // Cho tui một expection = null


        // Cách 1

//        try {
//        //Navigate to the target page
//        driver.get("https://the-internet.herokuapp.com/login");




//        // Find element
//        WebElement usernameEle = driver.findElement(By.id("username_dasfdsf"));
//        WebElement passwordEle = driver.findElement(By.cssSelector("#password"));
//        WebElement LoginBthEle = driver.findElement(By.cssSelector("[type=submit]"));
//
//        //Interaction
//        usernameEle.sendKeys("tomsmith");
//        passwordEle.sendKeys("SuperSecretPassword!");
//        LoginBthEle.click();

        //Debug purpose only

//        } catch (NoSuchMethodException noSuchMethodException) {
//            e = noSuchMethodException;
//        }
//
//        if(e == null)
//            Assert.fail("the element still display is on the page");

        // Cách 2

        // Get a crhome session
//        WebDriver driver = DriverFactory.getChromeDriver();
//
//        driver.get("https://the-internet.herokuapp.com/login");
//        List<WebElement> elementList = driver.findElements(By.tagName("taolao"));
//        if(elementList.isEmpty();
//            Assert.fail("reason...");
//

        //Quit the browser session
//        driver.quit();
    }
}
