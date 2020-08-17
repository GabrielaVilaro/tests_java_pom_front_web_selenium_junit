package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ItemPage extends BasePage{

    By textOfResult = By.xpath("//*[@id=\"center_column\"]/p");

    public ItemPage(WebDriver driver) {
        super(driver);
    }

    public String getTextOfResult()
    {
        WebElement text = new WebDriverWait(driver, 10).
                until(ExpectedConditions.visibilityOfElementLocated(textOfResult));
        return text.getText();

    }

}
