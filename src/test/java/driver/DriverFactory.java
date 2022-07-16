package driver;

import org.apache.commons.exec.OS;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
    public static WebDriver getChromeDriver(){
        String currenPojectLocation = System.getProperty("user.dir");
        String chromeDriverLocation = "";
        if (OS.isFamilyMac()) {
            chromeDriverLocation = currenPojectLocation + "/src/test/resources/driver/chromedriver";
        }
        if (OS.isFamilyWindows() ){
            chromeDriverLocation = currenPojectLocation + "\\src\\test\\resources\\driver\\chromedriver";
        }

        if (chromeDriverLocation.isEmpty()) {
            throw new IllegalArgumentException("cant detect OS type");
        }

        System.setProperty("webdriver.chrome.driver", chromeDriverLocation);

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");

        return new ChromeDriver(chromeOptions);
    }
}
