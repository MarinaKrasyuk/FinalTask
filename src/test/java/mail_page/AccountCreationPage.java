package mail_page;

import data.JsonParserClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountCreationPage {
    private static WebDriver driver;
    private static WebDriverWait wait;
    private By firstName= By.cssSelector("#customer_firstname");
    private By lastName=By.cssSelector("#customer_lastname");
    private By password=By.cssSelector("#passwd");
    private By address=By.cssSelector("#address1");
    private By mobilePhone=By.cssSelector("#phone_mobile");
    private By zip=By.cssSelector("#postcode");
    private By state=By.cssSelector("#id_state");
    private By city=By.cssSelector("#city");
    private By registerButton=By.cssSelector("#submitAccount");


    public AccountCreationPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public AccountPage clickRegistrationPage() {
        clickRegistrationButton();
        return new AccountPage(driver, wait);
    }

    private void clickRegistrationButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstName));
        driver.findElement(firstName).sendKeys(JsonParserClass.firstName);
        driver.findElement(lastName).sendKeys(JsonParserClass.lastName);
        driver.findElement(password).sendKeys(JsonParserClass.password);
        driver.findElement(address).sendKeys(JsonParserClass.address);
        driver.findElement(mobilePhone).sendKeys(JsonParserClass.mobilePhone);
        driver.findElement(state).sendKeys(JsonParserClass.state);
        driver.findElement(zip).sendKeys(JsonParserClass.zip);
        driver.findElement(city).sendKeys(JsonParserClass.city);

        driver.findElement(registerButton).click();

    }

}
