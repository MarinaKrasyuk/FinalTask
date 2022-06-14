package utils;

import mail_page.AccountPage;
import page.ProductPage;
import page.WishListPage;

import static test.BaseTest.login;

public class СreatedWishList implements AddWishListStrategy {
    @Override
    public WishListPage addToWishList() {
        AccountPage accountPage=login();
        WishListPage wishListPage=accountPage.clickWishListPage();
        wishListPage.createWishlist();
        ProductPage productPage = wishListPage.clickProductPage();
        productPage.clickWishListButton();
        accountPage=productPage.clickAccountPage();
        wishListPage=accountPage.clickWishListPage();
        return wishListPage;
    }
}
