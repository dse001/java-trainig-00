package org.dse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserPage {
    private final WebDriver driver;

    private By repositoriesLocator = By.xpath("*//a[@class=\"UnderlineNav-item js-responsive-underlinenav-item js-selected-navigation-item\"]");
    private By repoSearchFieldLocator = By.xpath("//*[@id='your-repos-filter']");
    private By overViewLocator = By.xpath("*//a[@class='UnderlineNav-item js-responsive-underlinenav-item js-selected-navigation-item']");

    public UserPage(WebDriver driver) {;
        this.driver = driver;
    }

    public void clickOnRepo()
    {
        WebElement clickOnRepositories = driver.findElement(repositoriesLocator);
        clickOnRepositories.click();
    }

    public void clickOnOverView()
    {
        WebElement clickOnOverViews = driver.findElement(overViewLocator);
        clickOnOverViews.click();
    }

    public void fullRepoSearchField(String keys)
    {
        WebElement setSearchRepo = driver.findElement(repoSearchFieldLocator);
        setSearchRepo.sendKeys(keys);
    }
}
