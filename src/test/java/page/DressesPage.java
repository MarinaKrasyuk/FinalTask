package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.BaseTest;

public class DressesPage extends BaseTest {

    private By product1 = By.xpath("(//*[@class='product_img_link'])[1]");
    private By product2 = By.xpath("(//*[@class='product_img_link'])[2]");
    private By product3 = By.xpath("(//*[@class='product_img_link'])[3]");

    public DressesPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public ProductPage clickProduct1() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(product1));
        driver.findElement(product1).click();
        return new ProductPage(driver, wait);
    }

    public ProductPage clickProduct2() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(product2));
        driver.findElement(product2).click();
        return new ProductPage(driver, wait);
    }

    public ProductPage clickProduct3() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(product3));
        driver.findElement(product3).click();
        return new ProductPage(driver, wait);
    }
}
