package Tests;


import Pages.Package.Bitrix24Elements;
import UtilityWedDriverFactory.BrowserUtils;
import UtilityWedDriverFactory.Driver;
import UtilityWedDriverFactory.WebInformationReader;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoginTest extends Bitrix24Elements {
    Bitrix24Elements bitrix24Elements;

    @Test
    public void logIn() {


        //  get the Url from the file (configuration.properties)
        String url=WebInformationReader.getProperties("Bitrix24Url");

        Driver.getDiver().get(url);

        bitrix24Elements=new Bitrix24Elements();

        BrowserUtils.Wait(2);

        String userinput=WebInformationReader.getProperties("Bitrix24UserName");
        bitrix24Elements.username.sendKeys(userinput);
        BrowserUtils.Wait(2);

        String passwrodInput=WebInformationReader.getProperties("Bitrix24PAsswords");
        bitrix24Elements.password.sendKeys(passwrodInput);

        BrowserUtils.Wait(3);
        bitrix24Elements.LoginButton.click();


    }



}