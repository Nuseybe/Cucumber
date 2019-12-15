package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EtsyHomePage {
    WebDriver driver;

    public EtsyHomePage() {
        this.driver = Driver.driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "global-enhancements-search-query")
    public WebElement searchBox;
    @FindBy(id = "catnav-primary-link-10855")
    public WebElement JeweandAccButton;
    @FindBy(id = "catnav-primary-link-10923")
    public WebElement clothshoes;
    @FindBy(id = "catnav-primary-link-891")
    public WebElement homeLiving;
    @FindBy(id = "catnav-primary-link-10983")
    public WebElement weddingParty;
    @FindBy(id = "catnav-primary-link-11049")
    public WebElement toysEntertainment;
    @FindBy(xpath = "//span[@class='wt-radio__label']")
    public WebElement anyPrice;


}
