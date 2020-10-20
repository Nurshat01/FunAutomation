package Tests;

import Pages.Package.CEM24CornerMenuOptions;
import UtilityWedDriverFactory.BrowserUtils;
import UtilityWedDriverFactory.Driver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestOptions extends  TestBase {

     @Test
    public void activityStreamOption1(){
       CEM24CornerMenuOptions cem24CornerMenuOptions=new CEM24CornerMenuOptions();
        cem24CornerMenuOptions.cornerDropDown.click();
        cem24CornerMenuOptions.activityStreamOption.click();


       }

       @Test
    public void tasksOption2(){
        CEM24CornerMenuOptions cem24CornerMenuOptions=new CEM24CornerMenuOptions();
        cem24CornerMenuOptions.cornerDropDown.click();
        cem24CornerMenuOptions.tasksOption.click();

           BrowserUtils.Wait(2);
       }

       @Test
    public void calendarOption3(){
        CEM24CornerMenuOptions cem24CornerMenuOptions=new CEM24CornerMenuOptions();
        cem24CornerMenuOptions.cornerDropDown.click();
        cem24CornerMenuOptions.calendarOption.click();

       }

       @Test
    public void driver4(){
        CEM24CornerMenuOptions cem24CornerMenuOptions=new CEM24CornerMenuOptions();
        cem24CornerMenuOptions.cornerDropDown.click();
        cem24CornerMenuOptions.drive.click();

       }

       @Test
    public void conversationOption5(){
        CEM24CornerMenuOptions cem24CornerMenuOptions=new CEM24CornerMenuOptions();
        cem24CornerMenuOptions.cornerDropDown.click();
        cem24CornerMenuOptions.conversationOption.click();

       }

       @Test
    public void chatAndCalls6(){
        CEM24CornerMenuOptions cem24CornerMenuOptions=new CEM24CornerMenuOptions();
        cem24CornerMenuOptions.cornerDropDown.click();
        cem24CornerMenuOptions.chatAndCalls.click();

       }

       @Test
    public void mailOption7(){
        CEM24CornerMenuOptions cem24CornerMenuOptions=new CEM24CornerMenuOptions();
        cem24CornerMenuOptions.cornerDropDown.click();
        cem24CornerMenuOptions.mailOption.click();

       }
       @Test
    public void workflowsOption8(){
        CEM24CornerMenuOptions cem24CornerMenuOptions=new CEM24CornerMenuOptions();
        cem24CornerMenuOptions.cornerDropDown.click();
        cem24CornerMenuOptions.workflowsOption.click();

       }

}
