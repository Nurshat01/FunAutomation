package Pages.Package;

import UtilityWedDriverFactory.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {
    protected WebDriver driver;

    Bitrix24Elements bitrix24;

    @BeforeMethod
    public void setDriver(){

        bitrix24=new Bitrix24Elements();

        driver= WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

//    @AfterMethod
//    public void tearDown(){
//        driver.close();
//    }



}

