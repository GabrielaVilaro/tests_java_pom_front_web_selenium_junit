package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
        sendKeys(boxOfEmailNotRegistered, text);
    }
    public void clickButtonCreateAnAccount()
    {
       clickButton(buttonCreateAnAccount);
    }

    public void sendKeysBoxOfEmailRegistered(String text)
    {
        sendKeys(boxEmailRegistered, text);
    }

    public void sendKeysBoxOfPassword(String text)
    {
        sendKeys(boxPasswordRegistered, text);
    }

    public void clickButtonSignInRegistered()
    {
        clickButton(buttonSignInRegistered);
    }
}
