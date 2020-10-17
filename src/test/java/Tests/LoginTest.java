package Tests;


import Pages.Package.Bitrix24Elements;
import Pages.Package.HomePageLiftSideOptions;
import UtilityWedDriverFactory.BrowserUtils;
import UtilityWedDriverFactory.Driver;
import UtilityWedDriverFactory.WebInformationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;


public class LoginTest extends Bitrix24Elements {
    Bitrix24Elements bitrix24Elements;
    HomePageLiftSideOptions homePageLiftSideOptions;

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

        System.out.println("************Home Page Lift Side Options************");

        homePageLiftSideOptions.LiftSideOptions.isDisplayed();

        homePageLiftSideOptions.OptionsInTheList();




    }



}