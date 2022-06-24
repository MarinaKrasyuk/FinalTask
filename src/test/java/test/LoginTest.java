package test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class LoginTest extends BaseTest {

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Description("Account's test")
    public void loginAccountTest() {
        Assertions.assertTrue(login().isIconPresent());
    }



}
