package mail_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.DressesPage;
import page.WishListPage;

public class AccountPage {
    private static WebDriver driver;
    private static WebDriverWait wait;
    private By acount = By.cssSelector(".navigation_page");
    private By wishlistButton = By.xpath("(//*[@class='myaccount-link-list'])[2]");
    private By dressTab = By.xpath("(//*[@title='Dresses'])[2]");

    public AccountPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public boolean isIconPresent() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(acount));
        return driver.findElement(acount).isDisplayed();

    }

    public WishListPage clickWishListPage() {
        clickWishListButton();
        return new WishListPage(driver, wait);
    }

    public DressesPage clickDressesPage() {
        clickDressTab();
        return new DressesPage(driver, wait);
    }

    private void clickDressTab() {
        driver.findElement(dressTab).click();
    }

    private void clickWishListButton() {
        driver.findElement(wishlistButton).click();
    }
}
