package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends PageBase{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(className ="dropdown-submenu")
    WebElement submenuBooks;

    @FindBy(className ="product_pod")
    List<WebElement>productList;

    public void selectCategory() {
        submenuBooks.click();
    }

    public void selectProduct() {
        productList.get(0).click();
    }
}
