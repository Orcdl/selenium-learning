package api_learning;

import com.beust.ah.A;
import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import url.Urls;

import java.util.List;

public class MouseHoverAndNarrowDownSearching implements Urls {
    // Declare Selector
    private  final static By figureSel = By.className(("figure"));
    private  final static By profileNameSel = By.className((".figcaption h5"));
    private  final static By profileLinkSel = By.className((".figcaption a"));



    public static void main(String[] args) {

        // Get a chrome session
        WebDriver driver = DriverFactory.getChromeDriver();
        driver.findElement(By.className("alert"));

        try{

        //Navigate to the target base
            driver.get((baseURL.concat(hoverSlug)));
        // Target parent element
            List<WebElement> figuresElem = driver.findElements(figureSel);
            if(figuresElem.isEmpty())
                throw new RuntimeException("There is no profile image displayed");

            Actions actions = new Actions(driver);

            for (WebElement figureElem : figuresElem) {
                WebElement profileNameElem = figureElem.findElement(profileNameSel); // Element find Element
                WebElement profileLinkElem = figureElem.findElement(profileLinkSel); // Element find Element

                //Before Mouse hover
                System.out.println(profileNameElem.getText() +":" + profileNameElem.isDisplayed());
                System.out.println(profileNameElem.getText() +":" + profileLinkElem.isDisplayed());


                // Mouse hover
                actions.moveToElement(figureElem).perform();


                //After Mouse hover
                System.out.println(profileNameElem.getText() +": " + profileNameElem.isDisplayed());
                System.out.println(profileNameElem.getText() +": " + profileNameElem.isDisplayed());

            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
