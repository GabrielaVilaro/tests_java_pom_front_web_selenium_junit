package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage implements Config {

    private static WebDriver driver;

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
    }

    public void clickButton(By locator)
    {
        WebElement button = new WebDriverWait(driver, 10).
                until(ExpectedConditions.visibilityOfElementLocated(locator));
        button.click();
    }

    public void sendKeys(By locator, String text)
    {
        WebElement textOfResult = new WebDriverWait(driver, 10).
                until(ExpectedConditions.visibilityOfElementLocated(locator));
        textOfResult.sendKeys(text);
    }

    public String getText(By locator)
    {
        WebElement text = new WebDriverWait(driver, 10).
                until(ExpectedConditions.visibilityOfElementLocated(locator));
        return text.getText();
    }

    public void selectByVisibleText(By locator, String text){

        Select dropList = new Select(new WebDriverWait(driver, 10).
                until(ExpectedConditions.presenceOfElementLocated(locator)));
        dropList.selectByVisibleText(text);
    }
}
