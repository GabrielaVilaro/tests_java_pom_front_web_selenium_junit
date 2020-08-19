import functions.Functions;
import pages.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.UserStatic;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;

public class Tests extends Functions implements Config, UserStatic {

    private IndexPage indexPage;
    private ItemPage itemPage;
    private WebDriver driver;
    private SignInPage signInPage;
    private Functions functions;
    private MyAccountPage myAccountPage;
    private CreateAnAccountPage createAnAccountPage;

    @Before
    public void setUp() {
        System.setProperty(Config.browser, Config.path);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(Config.baseUr);
        indexPage = new IndexPage(driver);
        itemPage =  new ItemPage(driver);
        signInPage = new SignInPage(driver);
        functions = new Functions();
        myAccountPage = new MyAccountPage(driver);
        createAnAccountPage = new CreateAnAccountPage(driver);
    }

    @Test
    public void pageTitleShouldAppear() {
        String pageTitle = driver.getTitle();
        assertEquals("My Store", pageTitle);
    }

    @Test
    public void elementInvalidNoResults()
    {
        indexPage.searchElement("Manzana");
        indexPage.clickButtonSearch();
        String textResult = itemPage.getTextOfResult();
        assertEquals(textResult, "No results were found for your search \"Manzana\"");
    }

    @Test
    public void elementValidResultsOfSearch()
    {
        indexPage.searchElement("T-SHIRT");
        indexPage.clickButtonSearch();
        itemPage.selectByTextList("Product Name: Z to A");
        String showingResults = itemPage.getTextOfListOrder();
        assertEquals(showingResults, "Showing 1 - 1 of 1 item");
    }

    @Test
    public void createAnAccountValidPage()
    {
        indexPage.clickButtonSignIn();
        signInPage.sendKeysBoxOfEmail(functions.generateEmail());
        signInPage.clickButtonCreateAnAccount();
        String titleOfPageAuthentication = createAnAccountPage.getTextTitleOfAuthentication();
        assertEquals(titleOfPageAuthentication, "AUTHENTICATION");
    }

    @Test
    public void loginOfValidAccountValidTextOfPage()
    {
        indexPage.clickButtonSignIn();
        signInPage.sendKeysBoxOfEmailRegistered(UserStatic.emailUserRegistered);
        signInPage.sendKeysBoxOfPassword(UserStatic.passwordUserRegistered);
        signInPage.clickButtonSignInRegistered();
        String textNameOfUser = myAccountPage.getTextOfNameUserRegistration();
        String textOfBanner = myAccountPage.getTextOfTitleBannerRegistration();
        assertEquals(textNameOfUser, "Lorena Perez");
        assertEquals(textOfBanner, "MY ACCOUNT");
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
