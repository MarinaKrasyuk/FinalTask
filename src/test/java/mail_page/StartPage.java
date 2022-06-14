package mail_page;

import data.JsonParserClass;
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
        clickCreateButton();
        return new AccountCreationPage(driver, wait);
    }

    private void clickCreateButton() {
        JsonParserClass.parsing();
        driver.findElement(emailInput).sendKeys(JsonParserClass.email);
        driver.findElement(createButton).click();

    }

    public AccountPage clickAccountPage() {
        clickSinInButton();
        return new AccountPage(driver, wait);
    }

    private void clickSinInButton() {
        JsonParserClass.parsing();
        driver.findElement(emailFiled).sendKeys(JsonParserClass.email);
        driver.findElement(pwdField).sendKeys(JsonParserClass.password);
        driver.findElement(signInButton).click();

    }


}
