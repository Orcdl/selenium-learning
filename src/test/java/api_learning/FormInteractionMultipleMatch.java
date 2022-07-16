package api_learning;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.Driver;
import java.util.List;

public class FormInteractionMultipleMatch {

    public static void main(String[] args) {
        // Get a chrome session
        WebDriver driver = DriverFactory.getChromeDriver();
        try {

        //Navigate to the target page
        driver.get("https://the-internet.herokuapp.com/login");

        //Define selector value
        By loginInputFeldSel = By.tagName("input");

        //Interation
            List<WebElement> loginFormFieldElem = driver.findElements(loginInputFeldSel);
            final int USENAME_INDEX = 0;
            final int PASSWORD_INDEX = 1;
            loginFormFieldElem.get(USENAME_INDEX).sendKeys("teo@sthing.com");
            loginFormFieldElem.get(PASSWORD_INDEX).sendKeys("123456");


        //Debug purpose only

            Thread.sleep(2000);
        } catch (Exception e){
            e.printStackTrace();
        }

        //Quit the browser session
        driver.quit();
    }
}
