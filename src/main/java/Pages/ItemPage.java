package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemPage {

    private WebDriver driver;

    public ItemPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTextOfResult()
    {
        return driver.findElement(By.xpath("//*[@id=\"center_column\"]/p")).getText();
    }

}
