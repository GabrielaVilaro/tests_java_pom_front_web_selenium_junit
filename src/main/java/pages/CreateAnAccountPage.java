package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAnAccountPage extends BasePage{
    By titleCreateAnAccountAuthentication = By.xpath("//*[@id=\"noSlide\"]/h1");

    public CreateAnAccountPage(WebDriver driver) {
        super(driver);
    }

    public String getTextTitleOfAuthentication()
    {
        return getText(titleCreateAnAccountAuthentication);

    }
}
