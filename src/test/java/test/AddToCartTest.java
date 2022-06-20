package test;

import mail_page.AccountPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import page.CartPage;
import page.DressesPage;
import page.ProductPage;

import java.text.DecimalFormat;


public class AddToCartTest extends BaseTest {
    Double total = 0.0;
    private static DecimalFormat df2 = new DecimalFormat("#.00");

    @Test
    public void addToCartTest() {
        AccountPage accountPage = login();
        ProductPage productPage = null;
        DressesPage dressesPage = accountPage.clickDressesPage();
        for (int i = 1; i < 4; i++) {
            productPage = dressesPage.clickProduct(i);
            total += productPage.clickCartButton();
            dressesPage = productPage.clickDressesPage();

        }

        CartPage cartPage = productPage.clickCarts();
        Double totalExpected = Double.valueOf(df2.format(total + 2.0));
        Double totalPrice = cartPage.getTotalPrice();

        Assertions.assertTrue(totalExpected.equals(totalPrice));


    }


}
