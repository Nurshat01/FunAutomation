package Tests;


import Pages.Package.HomePageLiftSideOptions;
import org.testng.annotations.Test;


public class TestPage extends TestBase {


    @Test
    public void HomePageLiftSideOptions() {
        System.out.println("************Home Page Lift Side Options************");

        HomePageLiftSideOptions homePageLiftSideOptions=new HomePageLiftSideOptions();
         homePageLiftSideOptions.OptionsInTheList();
    }



}