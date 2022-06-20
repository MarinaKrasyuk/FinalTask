package test;

import constant.ConstantURL;
import driver.Driver;
import mail_page.AccountPage;
import mail_page.StartPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeAll
    public  static void init() throws MalformedURLException {
        driver= Driver.getDriver();
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    public static AccountPage login(){
        driver.get(ConstantURL.LOGIN_URL);
        StartPage startPage=new StartPage(driver,wait);
        AccountPage accountPage=startPage.clickAccountPage();
        return  accountPage;
    }
    @AfterAll
    public static void  cleanUp(){
       Driver.driverClose();
    }
}
