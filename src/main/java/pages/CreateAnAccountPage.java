package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAnAccountPage extends BasePage{
    By titleCreateAnAccountAuthentication = By.xpath("//*[@id=\"noSlide\"]/h1");

    public CreateAnAccountPage(WebDriver driver) {
        super(driver);
    }

    public String getTextTitleOfAuthentication()
    {
        WebElement text = new WebDriverWait(driver, 10).
                until(ExpectedConditions.visibilityOfElementLocated(titleCreateAnAccountAuthentication));
        return text.getText();

    }
}
