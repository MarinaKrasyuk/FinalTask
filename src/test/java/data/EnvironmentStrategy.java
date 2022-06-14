package data;
import org.openqa.selenium.WebDriver;
import java.net.MalformedURLException;

public interface EnvironmentStrategy {

    public WebDriver getBrowserLocal();
    public WebDriver getBrowserSaucelab() throws MalformedURLException;
}
