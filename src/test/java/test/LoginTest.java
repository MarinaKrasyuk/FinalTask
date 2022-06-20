package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class LoginTest extends BaseTest {

    @Test
    public void loginAccountTest() {
        Assertions.assertTrue(login().isIconPresent());
    }



}
