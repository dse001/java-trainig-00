package org.dse;

import org.dse.pageObjects.UserPageObject.UserPage;
import org.json.simple.parser.ParseException;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;


public class BeforeSetup {
    public static  WebDriver driver;
    public static  Map<String, String> settings;
    public static UserPage userPage;

    @Before
    public void SetForTest() throws IOException, ParseException {
        SetupData setupData = new SetupData();
        Map<String, String> settings = setupData.getSettings();
        System.setProperty("webdriver.gecko.driver", settings.get("pathToDriver"));
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5000,
                TimeUnit.MILLISECONDS);
        driver.manage().timeouts().pageLoadTimeout(10000,
                TimeUnit.MILLISECONDS);
        driver.manage().timeouts().setScriptTimeout(5000,
                TimeUnit.MILLISECONDS);
        driver.get(settings.get("baseUrl"));
        //Auth will be in this place
//        UserPage userPage = new UserPage(driver);
//        userPage.clickOnRepo();
//        userPage.fullRepoSearchField("java");
        //assertTrue(userPage.findElementAfterSearch("java"));
    }
}