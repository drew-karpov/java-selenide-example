package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeBrowser {

    public WebDriver getChromeDriver() {
        WebDriver webDriver = new ChromeDriver(someChromeOptions());
        webDriver.manage().window().maximize();
        return webDriver;
    }

    private ChromeOptions someChromeOptions(){
        return null;
    }
}
