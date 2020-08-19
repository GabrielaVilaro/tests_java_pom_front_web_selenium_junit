package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemPage extends BasePage{

    By textOfResult = By.xpath("//*[@id=\"center_column\"]/p");
    By listByOrder = By.id("selectProductSort");
    By showingOneToOneResults = By.xpath("//*[@id=\"center_column\"]/div[1]/div[2]/div[2]");

    public ItemPage(WebDriver driver) {
        super(driver);
    }

    public String getTextOfResult()
    {
      return getText(textOfResult);
    }

    public void selectByTextList(String text)
    {
        selectByVisibleText(listByOrder, text);
    }

    public String getTextOfListOrder()
    {
        return getText(showingOneToOneResults);
    }

}
