package test;
;
import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import strategy.AddWishListStrategy;
import strategy.AutoCreatedWishlist;


public class AutoCreatedWishlistTest extends BaseTest {
    @Test
    @Description("Wishlist's test")
    @Severity(SeverityLevel.TRIVIAL)
    @Link("google.com")
    public void autoCreatedWishlistTest(){
        AddWishListStrategy strategy=new AutoCreatedWishlist();
        Assertions.assertTrue(strategy.addToWishList().isWishListPresent());

    }
}
