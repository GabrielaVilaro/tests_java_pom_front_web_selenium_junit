import Pages.Config;
import Pages.IndexPage;
import Pages.ItemPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;

public class TestIndexPage implements Config {

    private IndexPage indexPage;
    private ItemPage itemPage;
    private WebDriver driver;


    @Before
    public void setUp() {
        System.setProperty(Config.browser, Config.path);
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        this.driver.get(Config.baseUr);
        this.indexPage = new IndexPage(this.driver);
        this.itemPage =  new ItemPage(this.driver);

    }

    @Test
    public void pageTitleShouldAppear() {
        String pageTitle = driver.getTitle();
        assertEquals("My Store", pageTitle);
    }

    @Test
    public void elementInvalid()
    {
        this.indexPage.searchElement("Manzana");
        this.indexPage.clickElement();
        assertEquals(itemPage.getTextOfResult(), "No results were found for your search \"Manzana\"");
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
