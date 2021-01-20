package sites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LetsTalkTeaPage {
    private final WebDriver webDriver;


    @FindBy(name = "name")
    private WebElement nameForm;

    @FindBy(name = "email")
    private WebElement emailForm;

    @FindBy(name = "subject")
    private WebElement subjectForm;

    @FindBy(name = "message")
    private WebElement messageForm;

    @FindBy(className = "form-submit")
    private WebElement submitButton;

    public LetsTalkTeaPage(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

    public void open(){
        webDriver.get("http://www.practiceselenium.com/let-s-talk-tea.html");
    }

    public void fillTheForm(){
        nameForm.sendKeys("Michał");
        emailForm.sendKeys("s20695@pjwstk.edu.pl");
        subjectForm.sendKeys("Bardzo pyszna herbata");
        messageForm.sendKeys("Witam, bardzo polecam herbatę lipton");

    }

    public void sendTheFrom(){
        submitButton.click();
    }
}
