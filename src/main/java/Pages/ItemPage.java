package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemPage extends BasePage{

    public ItemPage(WebDriver driver) {
        super(driver);
    }

    public String getTextOfResult()
    {
        return driver.findElement(By.xpath("//*[@id=\"center_column\"]/p")).getText();
    }

}
