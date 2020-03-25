package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxBrowser {

    public WebDriver getFirefoxWebDriver() {
        WebDriver webDriver = new FirefoxDriver();
        webDriver.manage().window().maximize();
        return webDriver;
    }

    private FirefoxOptions someFirefoxOptions()
    {
        return null;
    }
}
