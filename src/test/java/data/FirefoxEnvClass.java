package data;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class FirefoxEnvClass implements EnvironmentStrategy {
    WebDriver driver;

    public FirefoxEnvClass(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public WebDriver getBrowserLocal() {
        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
        driver=new FirefoxDriver();
        return driver;
    }

    @Override
    public WebDriver getBrowserSaucelab() throws MalformedURLException {
        FirefoxOptions browserOptions = new FirefoxOptions();
        browserOptions.setPlatformName("Windows 8.1");
        browserOptions.setBrowserVersion("100");
        Map<String, Object> sauceOptions = new HashMap<>();
        browserOptions.setCapability("sauce:options", sauceOptions);
        URL url = new URL("https://oauth-marinakrasyuk-885c4:5edb7ae3-2576-467a-976e-349ccf75b270@ondemand.eu-central-1.saucelabs.com:443/wd/hub");
        driver = new RemoteWebDriver(url, browserOptions);
        return driver;
    }
}
