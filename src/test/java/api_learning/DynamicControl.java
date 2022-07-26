package api_learning;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.ui.selectEx;
import url.Urls;

import java.time.Duration;

public class DynamicControl implements Urls {

    public static void main(String[] args) {

        // Get a chrome session
        WebDriver driver = DriverFactory.getChromeDriver();

        try {
            // Navigate to target base
            driver.get(baseURL.concat(dynamicControl)); // noi vao thanh trang hoan chinh

            // Define parent locators | 2 form | checkbox form + input form
            By checkboxFormSel = By.id("checkbox-example");
            By inputFormSel = By.id("input-example");

            // Checkbox Form Interaction
            WebElement inputFormElem = driver.findElement(inputFormSel);
            WebElement inputFieldElem = driver.findElement(By.tagName("input"));
            WebElement inputBtnElem = driver.findElement(By.tagName("button"));
            if(!inputFieldElem.isEnabled()) inputFieldElem.click();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loading")));
            inputBtnElem.sendKeys("tui ten la Tam, hello cac ban");


            // Debug purpose ONLY
            Thread.sleep(1000);

            // Input form Interaction


            // Debug purpose ONLY
            Thread.sleep(2000);

        } catch(Exception e){
            e.printStackTrace();
        }

        driver.quit();

    }
}

