package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.BaseTest;

public class CartPage extends BaseTest {
    private By total = By.cssSelector("#total_price_container");


    public CartPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public Double getTotalPrice() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(total));
        String summa = driver.findElement(total).getText().substring(1);
        return Double.valueOf(summa);
    }

}
