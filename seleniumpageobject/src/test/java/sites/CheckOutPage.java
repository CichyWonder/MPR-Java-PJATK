package sites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CheckOutPage {

    private final WebDriver webDriver;


    @FindBy(id = "email")
    WebElement emailForm;

    @FindBy(id="name")
    WebElement nameForm;

    @FindBy(id="address")
    WebElement addressForm;

    @FindBy(id="card_type")
    WebElement cardDropdown;

    @FindBy(id="card_number")
    WebElement cardNumberForm;

    @FindBy(id="cardholder_name")
    WebElement cardHolderNameForm;

    @FindBy(id="verification_code")
    WebElement verificationCodeForm;

    @FindBy(className = "btn-primary")
    WebElement submitButton;

    public CheckOutPage(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

    public void open(){
        webDriver.get("http://www.practiceselenium.com/check-out.html");
    }

    public void filmTheForm(){
        emailForm.sendKeys("s20695@pjwstk.edu.pl");
        nameForm.sendKeys("Michał");
        addressForm.sendKeys("Gdańsk Sołecka");
        cardNumberForm.sendKeys("4929300895437188");
        cardHolderNameForm.sendKeys("Michał");
        verificationCodeForm.sendKeys("123");

    }

    public void chooseVisaFromDropDown(){
        Select cardTypeSelect = new Select(cardDropdown);

        cardTypeSelect.selectByVisibleText("Visa");
    }

    public void sendTheFrom(){
        submitButton.click();
    }
}
