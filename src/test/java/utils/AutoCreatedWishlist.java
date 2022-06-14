package utils;

import mail_page.AccountPage;
import page.ProductPage;
import page.WishListPage;

import static test.BaseTest.login;

public class AutoCreatedWishlist implements AddWishListStrategy {

    @Override
    public WishListPage addToWishList() {
        AccountPage accountPage= login();
        WishListPage wishListPage=accountPage.clickWishListPage();
        if (wishListPage.isWishListPresent()){
            System.out.println("Wishlist is added for account");
        }
        else{
            System.out.println("Wishlist is empty");
        }
        ProductPage productPage=wishListPage.clickProductPage();
        productPage.clickWishListButton();
        accountPage=productPage.clickAccountPage();
        wishListPage=accountPage.clickWishListPage();
        return wishListPage;
    }
}
