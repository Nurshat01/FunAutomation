package Pages.Package;

import Tests.TestBase;
import UtilityWedDriverFactory.BrowserUtils;
import UtilityWedDriverFactory.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CEM24CornerMenuOptions extends TestBase {

//
//    public CEM24CornerMenuOptions (){
//
//        PageFactory.initElements(Driver.getDiver(),this);
//
//    }


    @FindBy (xpath = "//div[@id='sitemap-menu']")
    public WebElement cornerDropDown;

    @FindBy(xpath = "//*[@id=\"sitemap-content\"]/div[1]/div/a[1]")
    public WebElement activityStreamOption;

    @FindBy(xpath = "//*[@id=\"sitemap-content\"]/div[1]/div/a[2]")
    public WebElement tasksOption;

    @FindBy(xpath = "//*[@id=\"sitemap-content\"]/div[1]/div/a[3]")
    public WebElement calendarOption;

    @FindBy(xpath = "//*[@id=\"sitemap-content\"]/div[1]/div/a[4]")
    public WebElement drive;

    @FindBy(xpath = "//*[@id=\"sitemap-content\"]/div[1]/div/a[5]")
    public WebElement conversationOption;

    @FindBy(xpath = "//*[@id=\"sitemap-content\"]/div[1]/div/a[6]")
    public WebElement chatAndCalls;

    @FindBy(xpath = "//*[@id=\"sitemap-content\"]/div[1]/div/a[7]")
    public WebElement mailOption;

    @FindBy(xpath = "//*[@id=\"sitemap-content\"]/div[1]/div/a[8]")
    public WebElement workflowsOption;


    public void optionOfCornerDrop(){
        /**
         * chatAndCallsOption needs to be done without loop.
         * need to test separately
         */
        List<WebElement> cornerOption=new ArrayList<>();
        cornerOption.addAll(Arrays.asList(activityStreamOption,tasksOption,calendarOption,drive,conversationOption
                ,mailOption,workflowsOption));

        for (int i = 0; i <cornerOption.size() ; i++) {
            cornerDropDown.click();
            BrowserUtils.Wait(1);
            cornerOption.get(i).click();
        }


    }







}
