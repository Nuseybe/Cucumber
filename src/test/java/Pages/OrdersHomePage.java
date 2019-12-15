package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OrdersHomePage {
    WebDriver driver;
    public void  Homepage(){
        this.driver= Driver.driverSetup("chrome");
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//a[@href='Process.aspx']")
    public WebElement OrderButton;
    @FindBy(xpath = "//table[@class=‘SampleTable’]//tr")
    public List<WebElement> orderRows;
}
