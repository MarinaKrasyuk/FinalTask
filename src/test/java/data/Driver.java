package data;

import constant.ConstantEnv;
import org.openqa.selenium.WebDriver;
import java.net.MalformedURLException;

public class Driver {
    private static WebDriver driver;
    private Driver() {

    }

    public static WebDriver getDriver() throws MalformedURLException {
        EnvironmentStrategy strategy;
        if (driver == null) {
            if (ConstantEnv.BROWSER.equals("Chrome")) {
                strategy = new ChromeEnvClass(driver);
                if (ConstantEnv.ENVIRONMENT.equals("local")) {
                    driver = strategy.getBrowserLocal();
                } else {
                    driver = strategy.getBrowserSaucelab();
                }
            } else {
                strategy = new FirefoxEnvClass(driver);
                if (ConstantEnv.ENVIRONMENT.equals("local")) {
                    driver = strategy.getBrowserLocal();
                } else {
                    driver = strategy.getBrowserSaucelab();
                }
            }
        }
        return driver;
    }

    public static void driverClose() {
        System.out.print("close(): ");
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
