package Pages.Package;

import UtilityWedDriverFactory.BrowserUtils;
import UtilityWedDriverFactory.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class HomePageLiftSideOptions extends  TestBase{


    public HomePageLiftSideOptions (){

        PageFactory.initElements(Driver.getDiver(),this);

    }

    @FindBy (xpath = "//*[@id=\"left-menu-list\"]//li")
    public WebElement LiftSideOptions;

    @FindBy (xpath = "//*[@id=\"left-menu-list\"]//li[3]")
    public WebElement tasksOption;

    @FindBy (xpath = "//*[@id=\"left-menu-list\"]//li[4]")
    public WebElement chatAndCallsOption;

    @FindBy (xpath = "//*[@id=\"left-menu-list\"]//li[5]")
    public WebElement workGroupsOption;


    @FindBy (xpath = "//*[@id=\"left-menu-list\"]//li[6]")
    public WebElement driverOption;

    @FindBy (xpath = "//*[@id=\"left-menu-list\"]//li[7]")
    public WebElement calendarOption;

    @FindBy (xpath = "//*[@id=\"left-menu-list\"]//li[8]")
    public WebElement mailOption;

    @FindBy (xpath = "//*[@id=\"left-menu-list\"]//li[9]")
    public WebElement contactCenterOption;

    @FindBy (xpath = "//*[@id=\"left-menu-list\"]//li[10]")
    public WebElement timeAndReportsOption;

    @FindBy (xpath = "//*[@id=\"left-menu-list\"]//li[11]")
    public WebElement employeesOption;

    @FindBy (xpath = "//*[@id=\"left-menu-list\"]//li[12]")
    public WebElement servicesOption;

    @FindBy (xpath = "//*[@id=\"left-menu-list\"]//li[13]")
    public WebElement companyOption;

public void OptionsInTheList(){

   LinkedHashSet<WebElement> optionsInTheList=new LinkedHashSet<>();
    optionsInTheList.addAll(Arrays.asList(tasksOption,chatAndCallsOption,workGroupsOption,driverOption,calendarOption,
            mailOption,contactCenterOption,timeAndReportsOption,employeesOption,servicesOption,companyOption));

    List<WebElement> options= (List<WebElement>) optionsInTheList;

    for (int i = 0; i <options.size() ; i++) {
            options.get(i).click();
        BrowserUtils.Wait(2);
              Driver.getDiver().navigate().back();
    }


}


}
