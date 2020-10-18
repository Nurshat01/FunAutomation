package Pages.Package;

import Tests.TestBase;
import UtilityWedDriverFactory.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bitrix24Elements  extends TestBase {

    public Bitrix24Elements (){

        PageFactory.initElements(Driver.getDiver(),this);

    }

    @FindBy (xpath = "//input[@name='USER_LOGIN']")
    public WebElement username;

    @FindBy (xpath = "//input[@name='USER_PASSWORD']")
    public WebElement password;

    @FindBy (xpath = "//*[@id=\"login-popup\"]/form/div[2]/input")
    public  WebElement LoginButton;



}
