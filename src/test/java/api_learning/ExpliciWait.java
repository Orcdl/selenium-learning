package api_learning;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.ui.WaitMoreThanOneTab;
import support.ui.selectEx;
import url.Urls;

import java.time.Duration;

public class ExpliciWait {

    public static void main(String[] args) {

        // Get a chrome session
        WebDriver driver = DriverFactory.getChromeDriver();

        try {
            // Navigate to target base
            driver.get(Urls.baseURL.concat(Urls.LoginSlug));

            //  Find the locator
            By taolaoSel = (By.cssSelector("#teo"));

            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(taolaoSel));

            wait.until(new WaitMoreThanOneTab());
        } catch(Exception e){
            e.printStackTrace();
        }
        driver.quit();
    }
}
