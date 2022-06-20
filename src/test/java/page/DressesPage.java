package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.BaseTest;

public class DressesPage extends BaseTest {

    private String product_str="(//*[@class='product_img_link'])";

    public DressesPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public ProductPage clickProduct(int i) {
        By product=By.xpath(product_str+"["+i+"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(product));
        driver.findElement(product).click();
        return new ProductPage(driver, wait);
    }

}
