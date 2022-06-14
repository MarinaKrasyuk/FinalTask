package data;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class ChromeEnvClass implements EnvironmentStrategy{
    WebDriver driver;

    public ChromeEnvClass(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public WebDriver getBrowserLocal() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        return driver;
    }

    @Override
    public WebDriver getBrowserSaucelab() throws MalformedURLException {
        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setPlatformName("Windows 10");
        browserOptions.setBrowserVersion("latest");
        Map<String, Object> sauceOptions = new HashMap<>();
        browserOptions.setCapability("sauce:options", sauceOptions);
        URL url = new URL("https://oauth-marinakrasyuk-885c4:5edb7ae3-2576-467a-976e-349ccf75b270@ondemand.eu-central-1.saucelabs.com:443/wd/hub");
        driver = new RemoteWebDriver(url, browserOptions);
        return driver;

    }
}
