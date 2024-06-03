package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.Store;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Store_StepDefinitions extends Store {


    Store store = new Store();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();


    @Given("user is on the home page")
    public void userIsOnTheHomePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @And("user clicks the store locator button")
    public void userClicksTheStoreLocatorButton() {

        cookies.click();
        BrowserUtils.sleep(2);

        BrowserUtils.sleep(2);

        ad.click();
        BrowserUtils.sleep(2);

        LocatorButton.click();


    }


    @And("user enters his location into the search field")
    public void userEntersHisLocationIntoTheSearchField() {
        BrowserUtils.sleep(2);
        EnterLocation.sendKeys("London");
    }

    @And("user select first option")
    public void userSelectFirstOption() {
     firstOption.click();

    }



    @And("user scrolls down and up")
    public void userScrollsDownAndUp() {

        for (int i = 0; i < 2; i++) {
            BrowserUtils.sleep(2);
            js.executeScript("window.scrollBy(0,600)");
        }
        BrowserUtils.sleep(2);
        for (int i = 0; i <5; i++) {
            js.executeScript("window.scrollBy(0,-1000)");
        }
    }

    @And("user goes back to previous page")
    public void userGoesBackToPreviousPage() {
        BrowserUtils.sleep(2);
        Driver.getDriver().navigate().back();
        BrowserUtils.sleep(2);
    }

    @Then("user should see the main page")
    public void userShouldSeeTheMainPage() {
        String expectedTitle="MILWAUKEE® Power Tools UK Official Site | NOTHING BUT HEAVY DUTY | Milwaukee Tools UK";
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals(expectedTitle, actualTitle);
    }


}

