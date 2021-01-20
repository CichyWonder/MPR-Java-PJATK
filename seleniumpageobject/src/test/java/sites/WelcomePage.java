package sites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

    private final WebDriver webDriver;

    @FindBy(linkText = "Our Passion")
    private WebElement ourPassionLink;

    @FindBy(linkText = "Menu")
    private WebElement menuLink;

    @FindBy(linkText = "Let's Talk Tea")
    private WebElement letsTalkTeaLink;

    @FindBy(linkText = "Check Out")
    private WebElement checkOutLink;

    public WelcomePage(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

    public void open(){
        webDriver.get("http://www.practiceselenium.com/welcome.html");
    }

    public void visitOurPassion(){
        ourPassionLink.click();
    }

    public void visitMenu(){
        menuLink.click();
    }

    public void visitLetsTalkTea(){
        letsTalkTeaLink.click();
    }

    public void visitCheckOut(){
        checkOutLink.click();
    }

}
