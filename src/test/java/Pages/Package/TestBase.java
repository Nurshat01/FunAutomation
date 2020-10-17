package Pages.Package;

import UtilityWedDriverFactory.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {
    protected WebDriver driver;

    @BeforeMethod
    public void setDriver(){

        driver= Driver.getDiver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);




    }

            @AfterMethod
    public void tearDown(){
        driver.close();
    }





}

