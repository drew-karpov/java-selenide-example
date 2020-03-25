package factories;

import browsers.ChromeBrowser;
import browsers.FirefoxBrowser;
import org.openqa.selenium.WebDriver;

public class BrowserFactory {

    public static WebDriver getDriver() {
        String browser = System.getProperty("browser");
        if (browser.equals("firefox")) {
            return new FirefoxBrowser().getFirefoxWebDriver();
        }
        if (browser.equals("chrome")) {
            return new ChromeBrowser().getChromeDriver();
        }
        else {
            throw new IllegalArgumentException("cannot get type of browser: " + browser);
        }
    }
}
