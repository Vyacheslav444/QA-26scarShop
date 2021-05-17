package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends HomePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "login_link")
    WebElement LoginOrRegister;
    @FindBy(id = "id_login-username")
    WebElement loginUsername;
    @FindBy(id = "id_login-password")
    WebElement loginPassword;
    @FindBy(name = "login_submit")
    WebElement login;
    @FindBy(className= "icon-user")
    //@FindBy(css = "a[href$='/en-gb/accounts/']")
    WebElement elementPresent;
    @FindBy(id = "logout_link")
    WebElement logout;
    @FindBy(className= "alert alert-danger")
    WebElement elementPresentErrors;


    public void openLogRegForm() {
        LoginOrRegister.click();

    }

    public void fillRegLogForm() {
        inputText(loginUsername, "books@gmail.com");
        inputText(loginPassword,"Book123123");
    }
    public void fillRegLogFormInvalidPassword() {
        inputText(loginUsername, "books@gmail.com");
        inputText(loginPassword,"Book1231234");
    }

    public void login() {
        login.click();

    }

    public boolean isElementPresent() {
        return elementPresent.isDisplayed();
    }
    public boolean isElementPresentErrors() {
        return elementPresentErrors.isDisplayed();
    }

    public void clickLogoutButton() {
        logout.click();

    }
    public void loginAll(){
        openLogRegForm();
        fillRegLogForm();
        login();
    }
}
