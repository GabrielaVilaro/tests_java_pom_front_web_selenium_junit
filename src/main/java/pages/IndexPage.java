package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IndexPage extends BasePage{

    By textOfResultInvalid = By.id("search_query_top");
    By buttonSearch = By.name("submit_search");
    By buttonSignIn = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");

    public IndexPage(WebDriver driver) {
        super(driver);
    }

    public void searchElement(String text)
    {
        sendKeys(textOfResultInvalid, text);
    }
    public void clickButtonSearch()
    {
        clickButton(buttonSearch);
    }

    public void clickButtonSignIn()
    {
        clickButton(buttonSignIn);
    }

}
