package page;

import mail_page.AccountPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DecimalFormat;

public class ProductPage {
    private static WebDriver driver;
    private static WebDriverWait wait;
    private By wishListButton = By.cssSelector("#wishlist_button");
    private By accountButton = By.xpath("(//*[@class='header_user_info'])[1]");
    private By closeButton = By.xpath("//*[@class='fancybox-item fancybox-close']");
    private By cartButton = By.xpath("//*[@class='exclusive']");
    private By cointinueButton = By.xpath("//*[@title='Continue shopping']");
    private By dressTab = By.xpath("(//*[@title='Dresses'])[2]");
    private By carts = By.xpath("//*[@title='View my shopping cart']");
    private By cost = By.cssSelector("#our_price_display");


    public ProductPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void clickWishListButton() {
        driver.findElement(wishListButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(closeButton));
        driver.findElement(closeButton).click();

    }

    public CartPage clickCarts() {
        driver.findElement(carts).click();
        return new CartPage(driver, wait);
    }

    public Double clickCartButton() {

        driver.findElement(cartButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(cointinueButton));
        driver.findElement(cointinueButton).click();
        String summa = driver.findElement(cost).getText().substring(1);
        return Double.valueOf(summa);

    }

    public AccountPage clickAccountPage() {
        clickAccountButton();
        return new AccountPage(driver, wait);
    }

    public DressesPage clickDressesPage() {
        clickDressTab();
        return new DressesPage(driver, wait);
    }

    private void clickDressTab() {
        driver.findElement(dressTab).click();
    }

    public void clickAccountButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(accountButton));
        driver.findElement(accountButton).click();
    }
}
