import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sites.CheckOutPage;
import sites.LetsTalkTeaPage;
import sites.WelcomePage;

public class TeaTest {

    private WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void welcomeTest(){
        WelcomePage welcomePage = new WelcomePage(driver);

        welcomePage.open();
        welcomePage.visitOurPassion();
        welcomePage.visitMenu();
        welcomePage.visitLetsTalkTea();
        welcomePage.visitCheckOut();

        driver.close();

    }

    @Test
    public void letsTalkTeaFormTest(){
        LetsTalkTeaPage letsTalkTeaPage = new LetsTalkTeaPage(driver);

        letsTalkTeaPage.open();
        letsTalkTeaPage.fillTheForm();
        letsTalkTeaPage.sendTheFrom();

        driver.close();
    }

    @Test
    public void checkOutTest(){
        CheckOutPage checkOutPage = new CheckOutPage(driver);

        checkOutPage.open();
        checkOutPage.filmTheForm();
        checkOutPage.chooseVisaFromDropDown();

        checkOutPage.sendTheFrom();

        driver.close();
    }
}
