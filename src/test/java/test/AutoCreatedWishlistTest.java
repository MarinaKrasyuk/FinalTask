package test;
;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import utils.AddWishListStrategy;
import utils.AutoCreatedWishlist;

public class AutoCreatedWishlistTest extends BaseTest {
    @Test
    public void autoCreatedWishlistTest(){
        AddWishListStrategy strategy=new AutoCreatedWishlist();
        Assertions.assertTrue(strategy.addToWishList().isWishListPresent());

    }
}
