package org.dse;


import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 *
 */
public class App
{

    public static void main( String[] args ) throws IOException, ParseException, InterruptedException {
        SetupData setupData = new SetupData();



        Map<String, String> settings = setupData.getSettings();
        String outLog = "start test \n  base URL = " + settings.get("baseUrl") + "driver path = " + settings.get("pathToDriver");
        System.out.println(outLog);
        System.setProperty("webdriver.gecko.driver", settings.get("pathToDriver"));
        WebDriver driver = new FirefoxDriver();
        UserPage userPage = new UserPage(driver);
        driver.manage().timeouts().implicitlyWait(5000,
                TimeUnit.MILLISECONDS);
        driver.manage().timeouts().pageLoadTimeout(10000,
                TimeUnit.MILLISECONDS);

//wait for an asynchronous script to finish execution
        driver.manage().timeouts().setScriptTimeout(5000,
                TimeUnit.MILLISECONDS);
        driver.get(settings.get("baseUrl"));
        UserPage basePage = new UserPage(driver);
        basePage.clickOnRepo();
        basePage.fullRepoSearchField("java");
        //basePage.leftBurger.click();
        //basePage.closeLeftMenu.click();
        //WebElement repositories = driver.findElement(By.xpath("*//a[@class='UnderlineNav-item js-responsive-underlinenav-item js-selected-navigation-item']"));
        //repositories.click();
        //Thread.sleep(2000);
        //WebElement filedForFind = driver.findElement(By.xpath("//*[@id='your-repos-filter']"));
        //Thread.sleep(2000);
        //driver.wait(1000);
        //filedForFind.sendKeys("java");
        Thread.sleep(7000);
        driver.quit();
    }
}
