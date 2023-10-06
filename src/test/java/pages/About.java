package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class About {

    public About(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "(//button[@class='sc-owfyr2-2 sc-8izm4n-0 dVTHaY gGFzAe'])[1]")
    public WebElement aboutButton;

    @FindBy(id ="onetrust-accept-btn-handler" )
    public WebElement cookies;


    @FindBy(xpath = "//a[@class='sc-wref1v-0 fXzgVK sc-1ksyyhq-0'][1]")
    public WebElement AboutRSA;


}
