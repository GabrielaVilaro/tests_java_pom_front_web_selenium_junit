package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyAccountPage extends BasePage{

    By nameOfUserRegistration = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span");
    By titleOfBannerRegistration = By.xpath("//*[@id=\"center_column\"]/h1");

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public String getTextOfNameUserRegistration()
    {
        WebElement text = new WebDriverWait(driver, 10).
                until(ExpectedConditions.visibilityOfElementLocated(nameOfUserRegistration));
        return text.getText();
    }
    public String getTextOfTitleBannerRegistration()
    {
        WebElement text = new WebDriverWait(driver, 10).
                until(ExpectedConditions.visibilityOfElementLocated(titleOfBannerRegistration));
        return text.getText();
    }
}
