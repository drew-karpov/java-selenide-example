package tests;

import com.codeborne.selenide.WebDriverRunner;
import factories.BrowserFactory;
import factories.PropertiesFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.util.Properties;


public class TestCore {

    private WebDriver wd;
    private Properties properties;

    @BeforeSuite(alwaysRun = true)
    public void initObjects() {
        properties = PropertiesFactory.loadProperties();
    }

    @BeforeTest(alwaysRun = true)
    public void openBrowser() {
        wd = BrowserFactory.getDriver();
        wd.get(properties.getProperty("baseUrl"));
        WebDriverRunner.setWebDriver(wd);
    }

    @AfterTest(alwaysRun = true)
    public void closeBrowser()
    { if(wd != null){
        wd.quit();
    }
    }
}
