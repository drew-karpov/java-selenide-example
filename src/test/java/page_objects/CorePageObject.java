package page_objects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;
import java.util.regex.Pattern;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CorePageObject {

    void click(String locator) {
        getElement(locator).click();
    }
    void type(String locator, String text) {
        getElement(locator).sendKeys(text);
    }

    private SelenideElement getElement(String locator){
        SelenideElement element = $(getLocatorStringByString(locator)).waitUntil(Condition.visible, 5000);
        return element;
    }
    List<SelenideElement> getElementsList(String locator){
        $(getLocatorStringByString(locator)).waitUntil(Condition.visible,4000);
        return $$(getLocatorStringByString(locator));
    }
    public String getElementText(String locator){
        return getElement(locator).getText();
    }
    private By getLocatorStringByString(String locatorWithType) {
        String[] explodedLocator = locatorWithType.split(Pattern.quote(":"), 2);
        String byType = explodedLocator[0];
        String locator = explodedLocator[1];

        switch (byType) {
            case "xpath":
                return By.xpath(locator);
            case "id":
                return By.id(locator);
            case "name":
                return By.name(locator);
            case "css":
                return By.cssSelector(locator);
            default:
                throw new IllegalArgumentException("cannot get type of locator: " + locator);
        }
    }
}
