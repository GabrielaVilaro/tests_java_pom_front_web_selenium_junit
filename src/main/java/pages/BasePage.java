package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage implements Config {

    private static WebDriver driver;

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
    }

    public static void clickButton(By locator)
    {
        WebElement button = new WebDriverWait(driver, 10).
                until(ExpectedConditions.visibilityOfElementLocated(locator));
        button.click();
    }

    public static void sendKeys(By locator, String text)
    {
        WebElement textOfResult = new WebDriverWait(driver, 10).
                until(ExpectedConditions.visibilityOfElementLocated(locator));
        textOfResult.sendKeys(text);
    }

    public static String getText(By locator)
    {
        WebElement text = new WebDriverWait(driver, 10).
                until(ExpectedConditions.visibilityOfElementLocated(locator));
        return text.getText();

    }

}
