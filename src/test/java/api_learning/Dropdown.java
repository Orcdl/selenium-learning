package api_learning;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import support.ui.selectEx;
import url.Urls;

public class Dropdown implements Urls {
    public static void main(String[] args) {
        // Get a chrome session

        WebDriver driver = DriverFactory.getChromeDriver();

        try {
            // Navigate to target base
            driver.get(baseURL.concat(dropDownSlug)); // noi vao thanh trang hoan chinh

            // Dropdown loacator & Element
            By drodownSel = By.id("");
            WebElement dropdownElem = driver.findElement(drodownSel);

            //Select dropdown
            selectEx select = new selectEx(dropdownElem);

            //Select by visible text | option 1
            select.selectOption1();
            Thread.sleep(1000);

            //Select by index | options 2
            select.selectByIndex(2);
            Thread.sleep(1000);

            //Select by value option 1
            select.selectByValue("1");
            Thread.sleep(1000);


        } catch(Exception e){
            e.printStackTrace();
        }

        driver.quit();


    }
}
