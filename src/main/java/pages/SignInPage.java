package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage extends BasePage{

    By boxOfEmailNotRegistered = By.id("email_create");
    By buttonCreateAnAccount = By.xpath("//*[@id=\"SubmitCreate\"]/span");
    //user registered
    By boxEmailRegistered = By.id("email");
    By boxPasswordRegistered = By.id("passwd");
    By buttonSignInRegistered = By.xpath("//*[@id=\"SubmitLogin\"]/span");

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void sendKeysBoxOfEmail(String text)
    {
        WebElement textOfResult = new WebDriverWait(driver, 10).
                until(ExpectedConditions.visibilityOfElementLocated(boxOfEmailNotRegistered));
        textOfResult.sendKeys(text);
    }

    public void clickButtonCreateAnAccount()
    {
        WebElement button = new WebDriverWait(driver, 10).
                until(ExpectedConditions.visibilityOfElementLocated(buttonCreateAnAccount));
        button.click();
    }

    public void sendKeysBoxOfEmailRegistered(String text)
    {
        WebElement textOfResult = new WebDriverWait(driver, 10).
                until(ExpectedConditions.visibilityOfElementLocated(boxEmailRegistered));
        textOfResult.sendKeys(text);
    }

    public void sendKeysBoxOfPassword(String text)
    {
        WebElement textOfResult = new WebDriverWait(driver, 10).
                until(ExpectedConditions.visibilityOfElementLocated(boxPasswordRegistered));
        textOfResult.sendKeys(text);
    }

    public void clickButtonSignInRegistered()
    {
        WebElement button = new WebDriverWait(driver, 10).
                until(ExpectedConditions.visibilityOfElementLocated(buttonSignInRegistered));
        button.click();
    }

}
