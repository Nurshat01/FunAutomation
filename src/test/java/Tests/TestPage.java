package Tests;


import Pages.Package.CEM24CornerMenuOptions;
import UtilityWedDriverFactory.Driver;
import org.testng.annotations.Test;


public class TestPage extends TestBase {

//
//    @Test
//    public void HomePageLiftSideOptions() {
//        System.out.println("************Home Page Lift Side Options************");
//
//        HomePageLiftSideOptions homePageLiftSideOptions=new HomePageLiftSideOptions();
//         homePageLiftSideOptions.OptionsInTheList();
//    }
//
//
//    @Test
//    public void CornerOptionMnue(){
//        CEM24CornerMenuOptions cem24CornerMenuOptions=new CEM24CornerMenuOptions();
//        cem24CornerMenuOptions.optionOfCornerDrop();
//
//        cem24CornerMenuOptions.cornerDropDown.click();
//
//        cem24CornerMenuOptions.chatAndCalls.click();
//
//    }

       @Test
    public void activityStreamOption1(){
        CEM24CornerMenuOptions cem24CornerMenuOptions=new CEM24CornerMenuOptions();
        cem24CornerMenuOptions.cornerDropDown.click();
        cem24CornerMenuOptions.activityStreamOption.click();
           System.out.println(Driver.getDiver().getTitle());
       }

       @Test
    public void tasksOption2(){
        CEM24CornerMenuOptions cem24CornerMenuOptions=new CEM24CornerMenuOptions();
        cem24CornerMenuOptions.cornerDropDown.click();
        cem24CornerMenuOptions.tasksOption.click();
           System.out.println(Driver.getDiver().getTitle());
       }

       @Test
    public void calendarOption3(){
        CEM24CornerMenuOptions cem24CornerMenuOptions=new CEM24CornerMenuOptions();
        cem24CornerMenuOptions.cornerDropDown.click();
        cem24CornerMenuOptions.calendarOption.click();
           System.out.println(Driver.getDiver().getTitle());
       }

       @Test
    public void driver4(){
        CEM24CornerMenuOptions cem24CornerMenuOptions=new CEM24CornerMenuOptions();
        cem24CornerMenuOptions.cornerDropDown.click();
        cem24CornerMenuOptions.drive.click();
           System.out.println(Driver.getDiver().getTitle());
       }

       @Test
    public void conversationOption5(){
        CEM24CornerMenuOptions cem24CornerMenuOptions=new CEM24CornerMenuOptions();
        cem24CornerMenuOptions.cornerDropDown.click();
        cem24CornerMenuOptions.conversationOption.click();
           System.out.println(Driver.getDiver().getTitle());
       }

       @Test
    public void chatAndCalls6(){
        CEM24CornerMenuOptions cem24CornerMenuOptions=new CEM24CornerMenuOptions();
        cem24CornerMenuOptions.cornerDropDown.click();
        cem24CornerMenuOptions.chatAndCalls.click();
           System.out.println(Driver.getDiver().getTitle());
       }

       @Test
    public void mailOption7(){
        CEM24CornerMenuOptions cem24CornerMenuOptions=new CEM24CornerMenuOptions();
        cem24CornerMenuOptions.cornerDropDown.click();
        cem24CornerMenuOptions.mailOption.click();
           System.out.println(Driver.getDiver().getTitle());
       }
       @Test
    public void workflowsOption8(){
        CEM24CornerMenuOptions cem24CornerMenuOptions=new CEM24CornerMenuOptions();
        cem24CornerMenuOptions.cornerDropDown.click();
        cem24CornerMenuOptions.workflowsOption.click();
           System.out.println(Driver.getDiver().getTitle());
       }




}