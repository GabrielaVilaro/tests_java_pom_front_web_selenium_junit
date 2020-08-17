package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IndexPage extends BasePage{

    public IndexPage(WebDriver driver) {
        super(driver);
    }

    public void searchElement(String text)
    {
        driver.findElement(By.id("search_query_top")).sendKeys(text);
        new IndexPage(driver);
    }

    public void clickElement()
    {
        driver.findElement(By.name("submit_search")).click();
        new IndexPage(driver);
    }
}
