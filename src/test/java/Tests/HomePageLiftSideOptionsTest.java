package Tests;



import Pages.Package.HomePageLiftSideOptions;

import org.testng.annotations.Test;


public class HomePageLiftSideOptionsTest extends TestBase {



    @Test
    public void tasksOption01(){
        HomePageLiftSideOptions homePageLiftSideOptions=new HomePageLiftSideOptions();
        homePageLiftSideOptions.tasksOption.click();
    }

    @Test
    public void chatAndCallsOption02(){
        HomePageLiftSideOptions homePageLiftSideOptions=new HomePageLiftSideOptions();
        homePageLiftSideOptions.chatAndCallsOption.click();
    }
    @Test
public void workGroupsOption03(){
        HomePageLiftSideOptions homePageLiftSideOptions=new HomePageLiftSideOptions();
        homePageLiftSideOptions.workGroupsOption.click();
    }

    @Test
    public void driverOption04(){
        HomePageLiftSideOptions homePageLiftSideOptions=new HomePageLiftSideOptions();
        homePageLiftSideOptions.driverOption.click();
    }

    @Test
    public void calendarOption04(){
        HomePageLiftSideOptions homePageLiftSideOptions=new HomePageLiftSideOptions();
        homePageLiftSideOptions.calendarOption.click();
    }

    @Test
    public void mailOption05(){
        HomePageLiftSideOptions homePageLiftSideOptions=new HomePageLiftSideOptions();
        homePageLiftSideOptions.mailOption.click();
    }
    @Test
    public void contactCenterOption06(){
        HomePageLiftSideOptions homePageLiftSideOptions=new HomePageLiftSideOptions();
        homePageLiftSideOptions.contactCenterOption.click();
    }

    @Test
    public void timeAndReportsOption07(){
        HomePageLiftSideOptions homePageLiftSideOptions=new HomePageLiftSideOptions();
        homePageLiftSideOptions.timeAndReportsOption.click();

    }

    @Test
    public void employeesOption08(){
        HomePageLiftSideOptions homePageLiftSideOptions=new HomePageLiftSideOptions();
        homePageLiftSideOptions.employeesOption.click();
    }
    @Test
    public void servicesOption09(){
        HomePageLiftSideOptions homePageLiftSideOptions=new HomePageLiftSideOptions();
        homePageLiftSideOptions.servicesOption.click();
    }

    @Test
    public void companyOption10(){
        HomePageLiftSideOptions homePageLiftSideOptions=new HomePageLiftSideOptions();
        homePageLiftSideOptions.companyOption.click();
    }


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

}