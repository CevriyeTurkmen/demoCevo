package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.About;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class About_StepDefinitions extends About {


    About about = new About();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();


    @Given("user is on the home page")
    public void userIsOnTheHomePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @Given("user clicks the about us button")
    public void user_clicks_the_about_us_button() {
        cookies.click();
        BrowserUtils.sleep(2);
        aboutButton.click();

    }


    @And("user clicks the about RSA button")
    public void userClicksTheAboutRSAButton() {
        BrowserUtils.sleep(3);
        AboutRSA.click();
    }

    @And("user scrolls down and up")
    public void userScrollsDownAndUp() {

        for (int i = 0; i < 5; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0,750)");
        }
        BrowserUtils.sleep(2);
        for (int i = 0; i <10; i++) {
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
        String expectedTitle="Home | RSA Insurance";
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals(expectedTitle, actualTitle);
    }
}

