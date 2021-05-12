package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;


public class LoginPageTests extends TestBase {
    LoginPage loginPage;


    @BeforeMethod
    public void pageInit() {
        loginPage = PageFactory.initElements(driver, LoginPage.class);


    }

    @Test
    public void userLoginTest() {
        loginPage.openLogRegForm();
        loginPage.fillRegLogForm();
        loginPage.login();

        Assert.assertTrue(loginPage.isElementPresent());
    }
}