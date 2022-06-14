package test;

import constant.ConstantURL;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import mail_page.AccountCreationPage;
import mail_page.AccountPage;
import mail_page.StartPage;

public class CreateAccountTest extends BaseTest{


    @Test
    public void createAccountTest() {
        driver.get(ConstantURL.ACCOUNT_REGISTRATION);
        StartPage startPage=new StartPage(driver,wait);
        AccountCreationPage accountCreationPage=startPage.clickCreationPage();
        AccountPage accountPage=accountCreationPage.clickRegistrationPage();
        Assertions.assertTrue(accountPage.isIconPresent());

    }
}
