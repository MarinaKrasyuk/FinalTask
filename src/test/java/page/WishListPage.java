package page;

import org.bouncycastle.cms.PasswordRecipientId;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class WishListPage {
    private static WebDriver driver;
    private static WebDriverWait wait;
    private By table=By.xpath("//*[@class='table table-bordered']");
    private By product=By.xpath("((//*[@class='block_content products-block'])[1]/li)[1]/a");
    private By nameInput=By.cssSelector("#name");
    private By saveButton=By.cssSelector("#submitWishlist");
    private By wishlistEl=By.xpath("(//*[@class='table table-bordered']//tr[last()]//td)[1]");
    private static String nameWishlist;

    public WishListPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public boolean isWishListPresent() {

        return isVisible(table);

    }
    public ProductPage clickProductPage() {
        clickProductButton();
        return new ProductPage(driver,wait);
    }

    private void clickProductButton() {
        driver.findElement(product).click();
    }
    public void createWishlist(){
        Date date = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy.MM.dd_hh.mm.ss");
        String date_str = formatForDateNow.format(date);
        nameWishlist="test"+date_str;
        driver.findElement(nameInput).sendKeys(nameWishlist);
        driver.findElement(saveButton).click();

    }
    public boolean isProductAdded(){
        if (driver.findElement(wishlistEl).getText().equals(nameWishlist)){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isVisible(By wishlist) {
        try {
            WebElement element=driver.findElement(wishlist);
            return true;
        }
        catch (Exception  e) {
            return false;
        }
    }
}
