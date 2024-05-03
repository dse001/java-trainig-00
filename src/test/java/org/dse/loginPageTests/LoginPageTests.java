package org.dse.loginPageTests;
import org.apache.commons.lang3.RandomStringUtils;
import org.dse.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTests extends BaseTest {
    @Test
    public void invalidLoginTest()
    {
        String resource = baseUrl +"login";
        basePage.open(resource);
        loginPage.SetLogin(RandomStringUtils.random(9, true, true));
        loginPage.SetPasswordEndSignIn(RandomStringUtils.random(9, true, true));
        String errorMessage = loginPage.InvalidLoginCheck();
        Assert.assertEquals(errorMessage,"Incorrect username or password.");
    }
}
