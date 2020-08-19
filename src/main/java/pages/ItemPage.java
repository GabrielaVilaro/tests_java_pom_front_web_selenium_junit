package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemPage extends BasePage{

    By textOfResult = By.xpath("//*[@id=\"center_column\"]/p");

    public ItemPage(WebDriver driver) {
        super(driver);
    }

    public String getTextOfResult()
    {
      return getText(textOfResult);
    }

}
