package test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import strategy.AddWishListStrategy;
import strategy.СreatedWishList;


public class CreateWishlistTest extends BaseTest
{

    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("Wishlist's test")
    public void createWishListTest(){
        AddWishListStrategy strategy=new СreatedWishList();
        Assertions.assertTrue(strategy.addToWishList().isProductAdded());


    }
}
