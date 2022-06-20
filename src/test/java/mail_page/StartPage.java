package mail_page;

import utils.JsonParser;
import data.UserData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class StartPage {
    private static WebDriver driver;
    private static WebDriverWait wait;
    private final By emailInput = By.cssSelector("#email_create");
    private final By createButton = By.cssSelector("#SubmitCreate");
    private static By emailFiled = By.cssSelector("#email");
    private static By pwdField = By.cssSelector("#passwd");
    private static By signInButton = By.cssSelector("#SubmitLogin");


    public StartPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public AccountCreationPage clickCreationPage() {
        JsonParser.parsing();
        driver.findElement(emailInput).sendKeys(UserData.getEmail());
        driver.findElement(createButton).click();
        return new AccountCreationPage(driver, wait);

    }

    public AccountPage clickAccountPage() {
        JsonParser.parsing();
        driver.findElement(emailFiled).sendKeys(UserData.getEmail());
        driver.findElement(pwdField).sendKeys(UserData.getPassword());
        driver.findElement(signInButton).click();
        return new AccountPage(driver, wait);
    }


}
