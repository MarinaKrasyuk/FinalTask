package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.AddWishListStrategy;
import utils.СreatedWishList;


public class CreateWishlistTest extends BaseTest
{

    @Test
    public void createWishListTest(){
        AddWishListStrategy strategy=new СreatedWishList();
        Assertions.assertTrue(strategy.addToWishList().isProductAdded());


    }
}
