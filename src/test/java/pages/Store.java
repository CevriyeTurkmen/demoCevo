package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Store {

    public Store(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//a[.='Store Locator']")
    public WebElement LocatorButton;


    @FindBy(xpath = "//input[@placeholder='Enter Your Location']")
    public WebElement EnterLocation;



    @FindBy (id ="onetrust-accept-btn-handler" )
    public WebElement cookies;

    @FindBy (xpath = "//button[@class='PopupSignUpstyles__Close-sc-178ntqo-5 bqrXcT']")
    public WebElement ad;

    @FindBy(xpath = "//li[@class='MapHeaderstyles__TypeaheadLi-bxf165-24 jVzxCR'][1]")
    public WebElement firstOption;

}
