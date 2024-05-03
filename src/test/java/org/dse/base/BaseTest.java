package org.dse.base;

import org.dse.common.CommonActions;
import org.dse.pageObjects.BasePageObject.BasePage;
import org.dse.pageObjects.LoginPageObject.LoginPage;
import org.dse.pageObjects.UserPageObject.UserPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

import static org.dse.common.conf.CLEAN_COOKES;
import static org.dse.common.conf.HOLD_BROWSER;
import static org.dse.common.conf.BASE_URL;
public class BaseTest  {
    protected WebDriver driver = CommonActions.driverCreator();
    protected BasePage basePage = new BasePage(driver);
    protected UserPage userPage = new UserPage(driver);
    protected LoginPage loginPage = new LoginPage(driver);

    protected String baseUrl =BASE_URL;
    @AfterTest
    public void cleanCooke (){
        if (CLEAN_COOKES)
        {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    @AfterTest (alwaysRun = true)
    public void closeBrowser() {
        if (HOLD_BROWSER){
            driver.quit();
        }
    }
}
