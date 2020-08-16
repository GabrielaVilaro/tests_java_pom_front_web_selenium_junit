package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IndexPage extends BasePage{

    private WebDriver driver;

    public IndexPage(WebDriver driver) {
        this.driver = driver;
    }

    public IndexPage searchElement(String text)
    {
        driver.findElement(By.id("search_query_top")).sendKeys(text);
        return new IndexPage(driver);
    }

    public IndexPage clickElement()
    {
        driver.findElement(By.name("submit_search")).click();
        return new IndexPage(driver);
    }
}
