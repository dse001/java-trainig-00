package org.dse;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.dse.*;

import java.io.IOException;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws IOException, ParseException {
        SetupData setupData = new SetupData();
        Map<String, String> settings = setupData.getSettings();
        String outLog = "start test \n  base URL = " + settings.get("baseUrl") + "driver path = " + settings.get("pathToDriver");
        System.out.println(outLog);
        System.setProperty("webdriver.gecko.driver", settings.get("pathToDriver"));
        WebDriver driver = new FirefoxDriver();
        driver.get(settings.get("baseUrl"));
    }
}
