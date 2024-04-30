package org.dse;


import org.testng.Assert;
import org.json.simple.parser.ParseException;
import org.junit.Before;
import org.dse.BeforeSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;


public class MainTest extends BeforeSetup {

//public  App app;
//         static private WebDriver driver;
//    static private Map<String, String> settings;
//    static private UserPage userPage;
//@Before
//public void SetForTest () throws IOException, ParseException {
//    SetupData setupData = new SetupData();
//    Map<String, String> settings = setupData.getSettings();
//    System.setProperty("webdriver.gecko.driver", settings.get("pathToDriver"));
//    WebDriver driver = new FirefoxDriver();
//    driver.manage().timeouts().implicitlyWait(5000,
//            TimeUnit.MILLISECONDS);
//    driver.manage().timeouts().pageLoadTimeout(10000,
//            TimeUnit.MILLISECONDS);
//    driver.manage().timeouts().setScriptTimeout(5000,
//            TimeUnit.MILLISECONDS);
//    driver.get(settings.get("baseUrl"));
//    //Auth will be in this place
//    UserPage userPage = new UserPage(driver);
//    userPage.clickOnRepo();
//    userPage.fullRepoSearchField("java");
//    //assertTrue(userPage.findElementAfterSearch("java"));
//
//}
public void SearcTest()   {


    userPage.clickOnRepo();
    userPage.fullRepoSearchField("java");
    System.out.println("OK!");


}
}