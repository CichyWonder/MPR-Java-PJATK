package pl.pjatk.selenium;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FuelTest {

    private static final By CLEARBTN_CLASS = By.className("clearbtn");
    private static final By TRIPDISTANCE_INPUT = By.name("tripdistance");
    private static final By FUELEFFICIENCY_INPUT = By.name("fuelefficiency");
    private static final By GASPRICE_INPUT = By.name("gasprice");
    private static final By CALCULATE_BTN = By.xpath("//input[@value='Calculate']");
    private static final By PRICE_RESULT = By.cssSelector("font:nth-child(2) > b");
    private WebDriver driver;

        @Before
        public void openPageInBrowser() throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://www.calculator.net/fuel-cost-calculator.html");

    }


        @Test
        public void calculateTripPrice(){


            driver.findElement(CLEARBTN_CLASS).click();
            driver.findElement(TRIPDISTANCE_INPUT).sendKeys("414");
            driver.findElement(FUELEFFICIENCY_INPUT).sendKeys("5.5");
            driver.findElement(GASPRICE_INPUT).sendKeys("1.8");


            driver.findElement(CALCULATE_BTN).click();

            String browserResult = driver.findElement(PRICE_RESULT).getText();

            Assert.assertEquals("$40.99", browserResult);



        }

    @Test
    public void calculateTripPriceToSzczytno(){


        driver.findElement(CLEARBTN_CLASS).click();
        driver.findElement(TRIPDISTANCE_INPUT).sendKeys("216");
        driver.findElement(FUELEFFICIENCY_INPUT).sendKeys("6.8");
        driver.findElement(GASPRICE_INPUT).sendKeys("1.7");


        driver.findElement(CALCULATE_BTN).click();

        String browserResult = driver.findElement(PRICE_RESULT).getText();

        Assert.assertEquals("$24.97", browserResult);



    }

    @After
    public void execute(){
        driver.quit();
    }
}
