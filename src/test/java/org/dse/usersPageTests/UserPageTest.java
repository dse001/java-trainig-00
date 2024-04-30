package org.dse.usersPageTests;

import junit.framework.Assert;
import org.dse.base.BaseTest;
import org.testng.annotations.Test;

import java.util.Optional;


@Test
public class UserPageTest extends BaseTest {
    public void searchInRepos(){
        String resourse =baseUrl +"dse001";
        basePage.open(resourse);
        userPage.clickOnRepo();
        userPage.fullRepoSearchField("java");
        Boolean result = userPage.findElementAfterSearch("java");
        Assert.assertTrue(result);

    }
}
