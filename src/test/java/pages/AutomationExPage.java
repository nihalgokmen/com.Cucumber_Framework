package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExPage {

    public AutomationExPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Signup / Login']")
    public WebElement singUpLinki;

    @FindBy(xpath = "//*[@*='signup-name']")
    public WebElement singUpName;

    @FindBy(xpath = "(//input[@placeholder='Email Address'])[2]")
    public  WebElement singUpEmail;

    @FindBy(xpath = "//*[text()='New User Signup!']")
    public WebElement singUpButton;

    @FindBy(id = "id_gender2")
    public WebElement mrsButton;


}
