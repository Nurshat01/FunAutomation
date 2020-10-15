package UtilityWedDriverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class WebDriverFactory {

    /*
    UTILITIES:
        - In "utilities" package we create new classes, and new methods for the reasons below:
            #1 -> to remove repetitive steps
            #2 -> to create a new logic
            #3 -> or to create a new logic AND to remove repetitive steps
            #4 -> to make our code easy to maintain.
        Let's say you used
             WebDriverManager.chromedriver().setup();
        in 30 different places. And you need to do minor change on your code where you have to change the driver type from chromedriver() to chromedriverA(), then you would have to go in 30 different places and fix it.
        But if you were to use a utility class&method, you would have only 1 place to go and fix just one line.
        Shoe factory -> shoe
        Cell phone factories -> cell phones
        WebDriverFactory --> web driver
    How do we call the method from now on:
                WebDriver driver = WebDriverFactory.getDriver("chrome");
     */
    public static WebDriver getDriver(String browser) {

        browser = browser.toLowerCase();

        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("internet explorer")) {
            WebDriverManager.iedriver().setup();
            return new InternetExplorerDriver();
        } else if (browser.equalsIgnoreCase("opera")) {
            WebDriverManager.operadriver().setup();
            return new OperaDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            return new EdgeDriver();
        } else {
            System.out.println("Not valid browser type, please try again");
            return null;
        }


    }
}
