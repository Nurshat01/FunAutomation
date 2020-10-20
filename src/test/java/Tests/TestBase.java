package Tests;

import Pages.Package.Bitrix24Elements;
import UtilityWedDriverFactory.BrowserUtils;
import UtilityWedDriverFactory.Driver;
import UtilityWedDriverFactory.WebInformationReader;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {


    @BeforeMethod
    public void setDriver(){

        Bitrix24Elements bitrix24Elements;

            //  get the Url from the file (configuration.properties)
            String url= WebInformationReader.getProperties("Bitrix24Url");
                Driver.getDiver().get(url);


            bitrix24Elements=new Bitrix24Elements();


            String userinput=WebInformationReader.getProperties("Bitrix24UserName");
            bitrix24Elements.username.sendKeys(userinput);


            String passwrodInput=WebInformationReader.getProperties("Bitrix24PAsswords");
            bitrix24Elements.password.sendKeys(passwrodInput);


            bitrix24Elements.LoginButton.click();



    }

            @AfterMethod
    public void tearDown(){
        Driver.closeDiver();

    }





}

