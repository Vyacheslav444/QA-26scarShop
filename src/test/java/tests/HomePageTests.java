package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.PageBase;
import pages.ProductPade;

public class HomePageTests extends TestBase{
    HomePage homePage;
    ProductPade productPade;



    @BeforeMethod
    public void pageInit(){
        homePage = PageFactory.initElements(driver,HomePage.class);
        productPade = PageFactory.initElements(driver, ProductPade.class);


    }
    @Test
    public void userCanSelectProductInMenuTest() throws InterruptedException {
        homePage.selectCategory();

        homePage.selectProduct();


        Assert.assertTrue(productPade.isItProductPage());

    }
}
