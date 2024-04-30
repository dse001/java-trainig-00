package org.dse.pageObjects.UserPageObject;
import org.dse.pageObjects.BasePageObject.BasePage;
import org.openqa.selenium.*;

public class UserPage extends BasePage {
    public UserPage(WebDriver driver) {
        super(driver);
    }
    public String searchKey;
    private final By repositoriesLocator = By.xpath("*//a[@class=\"UnderlineNav-item js-responsive-underlinenav-item js-selected-navigation-item\"]");
    private final By repoSearchFieldLocator = By.xpath("//*[@id='your-repos-filter']");
    private final By overViewLocator = By.xpath("*//a[@class='UnderlineNav-item js-responsive-underlinenav-item js-selected-navigation-item']");
    public String searchLocatorStrInRepo = "//*[@id='user-repositories-list']//li[1]//*[text()[contains(.,'";
    // public By checkSearchLocator = By.xpath("//*[@id='user-repositories-list]//*[contains(text(), '"+searchKey+"')]");

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

    public boolean findElementAfterSearch(String searchKey)
    {
        boolean theElementIsFound = false;
        this.searchKey = searchKey;
        String searchLocatorStr = searchLocatorStrInRepo + searchKey + "')]]";
        By searchLocator = By.xpath(searchLocatorStr);
        try {

            WebElement setSearchRepo = driver.findElement(searchLocator);
            theElementIsFound = true;

        }
        catch ( NoSuchElementException e )
        {
            theElementIsFound = false;
        }
        return theElementIsFound;
    }
}
