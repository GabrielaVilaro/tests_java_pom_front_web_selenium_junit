package Pages;
import org.openqa.selenium.WebDriver;

public class BasePage implements Config {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
}
