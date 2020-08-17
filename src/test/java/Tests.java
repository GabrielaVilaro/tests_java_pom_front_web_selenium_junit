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
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        this.driver.get(Config.baseUr);
        this.indexPage = new IndexPage(this.driver);
        this.itemPage =  new ItemPage(this.driver);
        this.signInPage = new SignInPage(this.driver);
        this.functions = new Functions();
        this.myAccountPage = new MyAccountPage(this.driver);
        this.createAnAccountPage = new CreateAnAccountPage(this.driver);

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
        this.indexPage.clickButtonSearch();
        String textResult = itemPage.getTextOfResult();
        assertEquals(textResult, "No results were found for your search \"Manzana\"");
    }

    @Test
    public void createAnAccountValidPage()
    {
        this.indexPage.clickButtonSignIn();
        this.signInPage.sendKeysBoxOfEmail(this.functions.generateEmail());
        this.signInPage.clickButtonCreateAnAccount();
        String titleOfPageAuthentication = this.createAnAccountPage.getTextTitleOfAuthentication();
        assertEquals(titleOfPageAuthentication, "AUTHENTICATION");
    }

    @Test
    public void loginOfValidAccountValidTextOfPage()
    {
        this.indexPage.clickButtonSignIn();
        this.signInPage.sendKeysBoxOfEmailRegistered(UserStatic.emailUserRegistered);
        this.signInPage.sendKeysBoxOfPassword(UserStatic.passwordUserRegistered);
        this.signInPage.clickButtonSignInRegistered();
        String textNameOfUser = this.myAccountPage.getTextOfNameUserRegistration();
        String textOfBanner = this.myAccountPage.getTextOfTitleBannerRegistration();
        assertEquals(textNameOfUser, "Lorena Perez");
        assertEquals(textOfBanner, "MY ACCOUNT");
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
