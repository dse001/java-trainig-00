package org.dse;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Start test" );
        System.setProperty("webdriver.gecko.driver", "C:\\prop\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://github.com/dse001");
    }
}
