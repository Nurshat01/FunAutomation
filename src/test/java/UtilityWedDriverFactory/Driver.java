package UtilityWedDriverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    private Driver(){}

    private static WebDriver driver;

    public static WebDriver getDiver(){
        if(driver== null){
            String browser=WebInformationReader.getProperties("browser");
            switch (browser.toLowerCase()){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
                    driver.manage().window().maximize();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
                    driver.manage().window().maximize();
                    break;
                case "microsoft Edge":
                    WebDriverManager.edgedriver().setup();
                    driver=new EdgeDriver();
                    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
                  driver.manage().window().maximize();
                    break;
            }
        }
        return driver;
    }

    public static void closeDiver(){
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }
}
