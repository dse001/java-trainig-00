package org.dse.common;

//import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

import static org.dse.common.conf.ENV_AND_BROWSER;
import static org.dse.consts.constProject.timeOutVar.IMPLICIT_WAIT;


public class CommonActions {
    public static WebDriver driverCreator() {
        WebDriver driver = null;
        switch (ENV_AND_BROWSER) {
            case "win_ff" :
                System.setProperty("webdriver.firefox.driver","src/main/resources/geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            default:
                Assert.fail("no divers");

        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.MILLISECONDS);
        return driver;
    }
}
