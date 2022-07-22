package api_learning;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkTestInteraction {

    public static void main(String[] args) {

        // Get a chrome session
        WebDriver driver = DriverFactory.getChromeDriver();

        //Navigate to the target page
        driver.get("https://the-internet.herokuapp.com/login");

        //Define selector values
        By powerdByLinkTextElem = By.linkText("Elemental Selenium");

        // Find element
        WebElement powerdByLinkTextElem = driver.findElement(powerdByLinkTextElem)



        //Interaction

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
