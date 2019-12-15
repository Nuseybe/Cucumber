package stepDefs;

import Pages.EtsyHomePage;
import Pages.EtsyResultPage;
import Utilities.Configuration;
import Utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EtsySteps {
    EtsyHomePage etsyHomePage = new EtsyHomePage();
    EtsyResultPage etsyResultPage = new EtsyResultPage();

    @Given("^Navigate Etsy HomePage$")
    public void navigate_Etsy_HomePage() throws Throwable {
        Driver.driver.get(Configuration.getProperties("etsyUrl"));
    }

    @When("^User searches for \"([^\"]*)\"$")
    public void user_searches_for(String item) throws Throwable {
        etsyHomePage.searchBox.sendKeys(item + Keys.ENTER);

    }

    @Then("^Validate search message has the word \"([^\"]*)\"$")
    public void validate_search_message_has_the_word(String item) throws Throwable {
        String actualSearchMessage = etsyResultPage.searchMessage.getText();
        Assert.assertEquals(item, actualSearchMessage);
    }

    @When("^User clicks on \"([^\"]*)\"$")
    public void user_clicks_on(String Department) throws Throwable {
        if (etsyHomePage.JeweandAccButton.getText().equalsIgnoreCase(Department)) {
            etsyHomePage.JeweandAccButton.click();
        } else if (etsyHomePage.clothshoes.getText().equalsIgnoreCase(Department)) {
            etsyHomePage.clothshoes.click();
        } else if (etsyHomePage.homeLiving.getText().equalsIgnoreCase(Department)) {
            etsyHomePage.homeLiving.click();
        } else if (etsyHomePage.toysEntertainment.getText().equalsIgnoreCase(Department)) {
            etsyHomePage.toysEntertainment.click();
        } else if (etsyHomePage.weddingParty.getText().equalsIgnoreCase(Department)) {
            etsyHomePage.weddingParty.click();
        }

    }

    @Then("^User validate title \"([^\"]*)\"$")
    public void user_validate_title(String title) throws Throwable {
        String actualTitle = Driver.driver.getTitle();
        Assert.assertEquals(title, actualTitle);

    }

    @When("^User clicks on Free shipping checkbox$")
    public void user_clicks_on_Free_shipping_checkbox() throws Throwable {
        etsyResultPage.frees.click();
        Thread.sleep(2000);

    }

    @Then("^Verify all results have \"([^\"]*)\" label$")
    public void verify_all_results_have_label(String label) throws Throwable {
        for (WebElement element : etsyResultPage.freeallshipping) {
            Assert.assertEquals(label, element.getText().trim());
        }


    }

    @When("^User click on Over Price checkbox$")
    public void user_click_on_Over_Price_checkbox() throws Throwable {
       // WebDriverWait wait = new WebDriverWait(Driver.driver, 10);
       // wait.until(ExpectedConditions.elementToBeClickable(etsyResultPage.over1000Checkbox));
        etsyResultPage.over1000Checkbox.click();


    }

    @Then("^User verifies all items prices are over that price$")
    public void user_verifies_all_items_prices_are_over_that_price() throws Throwable {
        for (WebElement element : etsyResultPage.resultprices) {
            String number = element.getText().replace(",", "");
            System.out.println(number);
            if (!number.isEmpty()) {
                double price = Double.parseDouble(number);
                System.out.println(price);
                Assert.assertTrue(price >=799);
            }

        }

    }
}







