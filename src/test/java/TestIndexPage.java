import Pages.IndexPage;
import Pages.ItemPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;

public class TestIndexPage {

    private WebDriver driver;
    IndexPage indexPage;
    ItemPage itemPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/gabrielavilaro/Desktop/test_front_java/drivers/chromedriver");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        this.driver.get("http://automationpractice.com/index.php");
        indexPage = new IndexPage(this.driver);
        itemPage =  new ItemPage(this.driver);

    }

    @Test
    public void pageTitleShouldAppear() {
        String pageTitle = driver.getTitle();
        assertEquals("My Store", pageTitle);
    }

    @Test
    public void elementInvalid()
    {
        indexPage.searchElement("Manzana");
        indexPage.clickElement();
        assertEquals(itemPage.getTextOfResult(), "No results were found for your search \"Manzana\"");
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
