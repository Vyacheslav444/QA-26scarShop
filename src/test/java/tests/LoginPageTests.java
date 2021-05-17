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
    @BeforeMethod
    public void ensurePreconditions(){
      //  if (loginPage.isElementPresent()){
       //     loginPage.clickLogoutButton();
      //  }
    }

    @Test
    public void userLoginTest() {

        loginPage.loginAll();


        Assert.assertTrue(loginPage.isElementPresent());
    }
    @Test
    public void userNegativeLoginTestInvalidPassword() {
        loginPage.openLogRegForm();
        loginPage.fillRegLogFormInvalidPassword();
        loginPage.login();

        Assert.assertTrue(loginPage.isElementPresentErrors());
    }



}