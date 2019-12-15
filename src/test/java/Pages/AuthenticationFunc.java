package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationFunc {
    WebDriver driver;

    public AuthenticationFunc() {
        this.driver = Driver.driverSetup("chrome");
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='login']")
    public WebElement signInBtn;

    @FindBy(id = "email_create")
    public WebElement emailInput;

    @FindBy(id = "SubmitCreate")
    public WebElement createAccBtn;

    @FindBy(xpath = "firstname")
    public WebElement firstname;

    @FindBy(xpath = "lastname")
    public WebElement lastname;

    @FindBy(id = "company")
    public WebElement companyInput;

    @FindBy(id = "phone")
    public WebElement inputPhone;

    @FindBy(id = "phone_mobile")
    public WebElement inputMobile;

    @FindBy(id = "alias")
    public WebElement assignReference;

    @FindBy(id = "address1")
    public WebElement adresslineInput;

    @FindBy(id = "address2")
    public WebElement adressline2;

    @FindBy(id = "city")
    public WebElement cityInput;

    @FindBy(id = "months")
    public WebElement months;

    @FindBy(id = "years")
    public WebElement years;

    @FindBy(id = "days")
    public WebElement days;

    @FindBy(id = "id_state")
    public WebElement selectState;

    @FindBy(id = "postcode")
    public WebElement zipcode;

    @FindBy(id = "id_country")
    public WebElement country;

    @FindBy(id = "id_gender1")
    public WebElement gender;

    @FindBy(id = "passwd")
    public WebElement password;

    @FindBy(id = "submitAccount")
    public WebElement registerButton;

    @FindBy(id = "other")
    public WebElement otherInfro;

    @FindBy(id = "newsletter")
    public WebElement signUpNews;

}
