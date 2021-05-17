package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LogoutPageTest extends TestBase {
    LoginPage loginPage;


    @BeforeMethod
    public void pageInit() {
        loginPage = PageFactory.initElements(driver, LoginPage.class);
    }
    @BeforeMethod
    public void ensurePreconditions(){
        if(!loginPage.isElementPresent()){
            loginPage.loginAll();
        }
    }
    @Test
    public void userLogoutTest(){
        loginPage.clickLogoutButton();
    }
}
