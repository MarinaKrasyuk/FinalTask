package test;
;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import strategy.AddWishListStrategy;
import strategy.AutoCreatedWishlist;


public class AutoCreatedWishlistTest extends BaseTest {
    @Test
    public void autoCreatedWishlistTest(){
        AddWishListStrategy strategy=new AutoCreatedWishlist();
        Assertions.assertTrue(strategy.addToWishList().isWishListPresent());

    }
}
