package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends BasePage{

    By nameOfUserRegistration = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span");
    By titleOfBannerRegistration = By.xpath("//*[@id=\"center_column\"]/h1");

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public String getTextOfNameUserRegistration()
    {
        return getText(nameOfUserRegistration);
    }
    public String getTextOfTitleBannerRegistration()
    {
        return getText(titleOfBannerRegistration);
    }
}
