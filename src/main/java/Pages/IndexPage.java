package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IndexPage extends BasePage{

    public IndexPage(WebDriver driver) {
        super(driver);
    }

    public void searchElement(String text)
    {
        WebElement textOfResultInvalid = new WebDriverWait(driver, 10).
                until(ExpectedConditions.visibilityOfElementLocated(By.id("search_query_top")));
        textOfResultInvalid.sendKeys(text);
    }

    public void clickElement()
    {
        WebElement buttonSearch = new WebDriverWait(driver, 10).
                until(ExpectedConditions.visibilityOfElementLocated(By.name("submit_search")));
        buttonSearch.click();
    }
}
