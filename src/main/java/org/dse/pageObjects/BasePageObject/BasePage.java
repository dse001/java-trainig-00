package org.dse.pageObjects.BasePageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.dse.consts.constProject.timeOutVar.EXPLICIT_WAIT;

public class BasePage {
    protected WebDriver driver;
    public BasePage(WebDriver driver){
        this.driver =driver;
    }
    public void open(String url)
    {
        driver.get(url);
    };
    public WebElement waitElementIsVisible(WebElement element){
        new WebDriverWait(
                driver, Duration.ofSeconds(EXPLICIT_WAIT)).until(ExpectedConditions.visibilityOf(element));
        return element;
    }
}
