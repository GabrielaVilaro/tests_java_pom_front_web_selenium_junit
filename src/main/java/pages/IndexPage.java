package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IndexPage extends BasePage{

    By textOfResultInvalid = By.id("search_query_top");
    By buttonSearch = By.name("submit_search");
    By buttonSignIn = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");

    public IndexPage(WebDriver driver) {
        super(driver);
    }
    public void searchElement(String text)
    {
        WebElement textOfResult = new WebDriverWait(driver, 10).
                until(ExpectedConditions.visibilityOfElementLocated(textOfResultInvalid));
        textOfResult.sendKeys(text);
    }
    public void clickButtonSearch()
    {
        WebElement button = new WebDriverWait(driver, 10).
                until(ExpectedConditions.visibilityOfElementLocated(buttonSearch));
        button.click();
    }

    public void clickButtonSignIn()
    {
        WebElement button = new WebDriverWait(driver, 10).
                until(ExpectedConditions.visibilityOfElementLocated(buttonSignIn));
        button.click();
    }
}
