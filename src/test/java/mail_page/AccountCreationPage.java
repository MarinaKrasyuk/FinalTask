package mail_page;

import data.UserData;
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
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstName));
        driver.findElement(firstName).sendKeys(UserData.getFirstName());
        driver.findElement(lastName).sendKeys(UserData.getLastName());
        driver.findElement(password).sendKeys(UserData.getPassword());
        driver.findElement(address).sendKeys(UserData.getAddress());
        driver.findElement(mobilePhone).sendKeys(UserData.getMobilePhone());
        driver.findElement(state).sendKeys(UserData.getState());
        driver.findElement(zip).sendKeys(UserData.getZip());
        driver.findElement(city).sendKeys(UserData.getCity());

        driver.findElement(registerButton).click();
        return new AccountPage(driver, wait);

    }

}
