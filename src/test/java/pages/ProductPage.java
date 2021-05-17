package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends PageBase{
    public ProductPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id ="product_description")
    WebElement productDescription;

    public boolean isItProductPage() {
        return productDescription.isDisplayed();
    }
}
