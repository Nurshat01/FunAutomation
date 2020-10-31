package Pages.Package;

import Tests.TestBase;
import UtilityWedDriverFactory.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDownOfCalenderAndDrive extends TestBase {



    public DropDownOfCalenderAndDrive (){

     PageFactory.initElements(Driver.getDiver(),this);

    }

//    Options of Calender

    @FindBy (xpath = "//div[@id='sitemap-menu']")
    public WebElement cornerDropDown;

     @FindBy (xpath = "//*[@id=\"sitemap-content\"]/div[2]/div/a[1]")
    public WebElement myCalenderOption;


    @FindBy (xpath = "//*[@id=\"sitemap-content\"]/div[2]/div/a[2]")
    public WebElement companyCalenderOption;


//    options of Drive


    @FindBy (xpath = "//*[@id=\"sitemap-content\"]/div[3]/div/a[1]")
    public WebElement myDrive;


    @FindBy (xpath = "//*[@id=\"sitemap-content\"]/div[3]/div/a[2]")
    public WebElement allDocuments;


    @FindBy (xpath = "//*[@id=\"sitemap-content\"]/div[3]/div/a[3]")
    public WebElement companyDrive;

    @FindBy (xpath = "//*[@id=\"sitemap-content\"]/div[3]/div/a[4]")
    public WebElement salesAndMarketing;

    @FindBy (xpath = "//*[@id=\"sitemap-content\"]/div[3]/div/a[5]")
    public WebElement driveCleanUp;



}
