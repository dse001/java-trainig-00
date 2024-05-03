package org.dse.pageObjects.LoginPageObject;

import org.dse.pageObjects.BasePageObject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    private By loginFieldLocator = By.cssSelector("#login_field");
    private By passFieldLocator = By.id("password");
    private By signInlocator = By.xpath("//*[@value='Sign in']");
    private By invalidMessageLocator = By.id("js-flash-container");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void SetLogin (String login){
        WebElement loginField = driver.findElement(loginFieldLocator);
        loginField.sendKeys(login);
    }

    public void SetPasswordEndSignIn (String pass){
        WebElement passwordField = driver.findElement(passFieldLocator);
        WebElement signInButton = driver.findElement(signInlocator);
        passwordField.sendKeys(pass);
        signInButton.click();
    }

    public String InvalidLoginCheck() {
        WebElement invalidMessage = driver.findElement(invalidMessageLocator);
        String result =invalidMessage.getText();
        return result;
    }
}
