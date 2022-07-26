package api_learning;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import support.ui.selectEx;
import url.Urls;

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
            WebElement checkboxFormElem = driver.findElement(checkboxFormSel);
            WebElement checkboxElem = driver.findElement(By.tagName("input"));
            if(!checkboxElem.isSelected()) checkboxElem.click();

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

