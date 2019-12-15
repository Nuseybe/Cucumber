package stepDefs;

import Pages.OrdersHomePage;
import Pages.OrdersPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class AddingOrderSteps {


    OrdersHomePage orderHomePage = new OrdersHomePage();
    OrdersPage ordersPAge = new OrdersPage();
    int initialOrderCount;

    @Then("^User clicks on Order$")
    public void user_clicks_on_Order() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        initialOrderCount = orderHomePage.orderRows.size(); //get size of how many webelements rows I had.
        orderHomePage.OrderButton.click();
    }

    @Then("^User creates new order$")
    public void user_creates_new_order(DataTable dataTable) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        List<Map<String, Object>> listOfMaps = dataTable.asMaps(String.class, Object.class);
        Select select = new Select(ordersPAge.product);
        select.selectByVisibleText(listOfMaps.get(0).get("product").toString());
        ordersPAge.quantity.sendKeys(listOfMaps.get(0).get("Ouantity").toString());
        ordersPAge.costumerName.sendKeys(listOfMaps.get(0).get("Customer Name").toString());
        ordersPAge.street.sendKeys(listOfMaps.get(0).get("Street").toString());
        ordersPAge.city.sendKeys(listOfMaps.get(0).get("City").toString());
        ordersPAge.state.sendKeys(listOfMaps.get(0).get("State").toString());
        ordersPAge.zipcode.sendKeys(listOfMaps.get(0).get("Zip").toString());
        ordersPAge.cardNum.sendKeys(listOfMaps.get(0).get("Card Nr").toString());
        ordersPAge.expDate.sendKeys(listOfMaps.get(0).get("Expire Date").toString());
        Thread.sleep(3000);
        ordersPAge.processButton.click();
        Thread.sleep(3000);

    }

    @Then("^User verifies Order is created$")
    public void user_verifies_Order_is_created() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        ordersPAge.OrdersViewButton.click();
        Thread.sleep(3000);
        int afterOrderCreated = orderHomePage.orderRows.size();
        Assert.assertEquals("Initial order number is:" + initialOrderCount + 1 +  "\n"+
                "After you created order the row number is:" +afterOrderCreated,initialOrderCount,afterOrderCreated);
    }
    @Then("^User verifies Order is NOT created$")
    public void user_verifies_Order_is_NOT_created() throws Throwable {
        Thread.sleep(3000);
        int afterOrderCreated = orderHomePage.orderRows.size();
        Assert.assertEquals("Initial order number is:" + initialOrderCount + 1 +  "\n"+
                "After you created order the row number is:" +afterOrderCreated,initialOrderCount,afterOrderCreated);
    }
    @Then("^User verifies Order \"([^\"]*)\" created$")
    public void user_verifies_Order_created(String isCondition ) throws Throwable {
        ordersPAge.OrdersViewButton.click();
        Thread.sleep(1000);
        int afterOrderCreated=orderHomePage.orderRows.size();
        if (isCondition.equalsIgnoreCase("is")){
            Assert.assertEquals("Initial order number is:" + initialOrderCount+  "\n"+
                    "After you created order the row number is:" +afterOrderCreated,initialOrderCount +1 ,afterOrderCreated);

        }else{
            Assert.assertEquals("Initial order number is:" + initialOrderCount+  "\n"+
                    "After you created order the row number is:" +afterOrderCreated,initialOrderCount,afterOrderCreated);

        }

    }
    @Then("^User deletes \"([^\"]*)\" from table$")
    public void user_deletes_from_table(String name) throws Throwable {

    }

    @Then("^User validates that \"([^\"]*)\" is deleted$")
    public void user_validates_that_is_deleted(String name) throws Throwable {

    }





}
