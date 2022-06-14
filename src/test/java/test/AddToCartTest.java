package test;

import mail_page.AccountPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import page.CartPage;
import page.DressesPage;
import page.ProductPage;

import java.text.DecimalFormat;


public class AddToCartTest extends BaseTest{
    Double total=0.0;
    private static DecimalFormat df2 = new DecimalFormat("#.00");
    @Test
    public void addToCartTest(){
        AccountPage accountPage=login();
        DressesPage dressesPage=accountPage.clickDressesPage();
        ProductPage productPage=dressesPage.clickProduct1();
        total+=productPage.clickCartButton();
        dressesPage=productPage.clickDressesPage();
        productPage=dressesPage.clickProduct2();
        total+=productPage.clickCartButton();
        dressesPage=productPage.clickDressesPage();
        productPage=dressesPage.clickProduct3();
        total+=productPage.clickCartButton();
        CartPage cartPage = productPage.clickCarts();
        Double totalExpected= Double.valueOf(df2.format(total+2.0));
        Double totalPrice=cartPage.getTotalPrice();

        Assertions.assertTrue(totalExpected.equals(totalPrice));



    }


}
