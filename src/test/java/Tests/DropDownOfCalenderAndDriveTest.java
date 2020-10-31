package Tests;
import Pages.Package.DropDownOfCalenderAndDrive;
import UtilityWedDriverFactory.Driver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownOfCalenderAndDriveTest  extends TestBase{

    @Test
    public void myCalenderOption01(){
      DropDownOfCalenderAndDrive dropDownOfCalenderAndDrive=new DropDownOfCalenderAndDrive();
        dropDownOfCalenderAndDrive.cornerDropDown.click();
        dropDownOfCalenderAndDrive.myCalenderOption.click();
        String titleCalender=Driver.getDiver().findElement(By.xpath("//span[@id='pagetitle']")).getText();
        Assert.assertTrue(titleCalender.contains("Calendar"),"**My CalenderOption Failed**");
    }

    @Test
    public void companyCalenderOption02(){
        DropDownOfCalenderAndDrive dropDownOfCalenderAndDrive=new DropDownOfCalenderAndDrive();
        dropDownOfCalenderAndDrive.cornerDropDown.click();
        dropDownOfCalenderAndDrive.companyCalenderOption.click();
        String titleCompanyCalender=Driver.getDiver().findElement(By.id("pagetitle")).getText();
        System.out.println(titleCompanyCalender);
        Assert.assertTrue(titleCompanyCalender.contains("Event Calendar"), "company Calender Option **Failed** ");
    }

    @Test
    public void myDrive(){
        DropDownOfCalenderAndDrive dropDownOfCalenderAndDrive=new DropDownOfCalenderAndDrive();
        dropDownOfCalenderAndDrive.cornerDropDown.click();
        dropDownOfCalenderAndDrive.myDrive.click();
        String titleOfMyDrive=Driver.getDiver().findElement(By.xpath("//span[@id='pagetitle']")).getText();
        Assert.assertTrue(titleOfMyDrive.contains("My Drive"),"MY Drive Option **Failed**");
    }

    @Test
    public void allDocuments(){
        DropDownOfCalenderAndDrive dropDownOfCalenderAndDrive=new DropDownOfCalenderAndDrive();
        dropDownOfCalenderAndDrive.cornerDropDown.click();
        dropDownOfCalenderAndDrive.allDocuments.click();
        String titleOfAllDouments=Driver.getDiver().findElement(By.xpath("//span[@id='pagetitle']")).getText();
        System.out.println(titleOfAllDouments);
        Assert.assertTrue(titleOfAllDouments.contains("All Documents"),"All Documents Option **Failed**");
    }

    @Test
    public void companyDrive(){
        DropDownOfCalenderAndDrive dropDownOfCalenderAndDrive=new DropDownOfCalenderAndDrive();
        dropDownOfCalenderAndDrive.cornerDropDown.click();
        dropDownOfCalenderAndDrive.companyDrive.click();
        String titleOfCompanyDrive=Driver.getDiver().findElement(By.xpath("//*[@id=\"pagetitle\"]  ")).getText();
        System.out.println(titleOfCompanyDrive);
        Assert.assertTrue(titleOfCompanyDrive.contains("Company drive"),"Company Drive Option **Failed**");
    }

    @Test
    public void salesAndMarketing(){
        DropDownOfCalenderAndDrive dropDownOfCalenderAndDrive=new DropDownOfCalenderAndDrive();
        dropDownOfCalenderAndDrive.cornerDropDown.click();
        dropDownOfCalenderAndDrive.salesAndMarketing.click();
        String titleOfsalesAndMarketing=Driver.getDiver().findElement(By.xpath("//span[@id='pagetitle']")).getText();
        System.out.println(titleOfsalesAndMarketing);
        Assert.assertTrue(titleOfsalesAndMarketing.contains("Drive: Sales and marketing"),"Sales and marketing**Failed**");
    }

@Test
    public void driveCleanUp(){
    DropDownOfCalenderAndDrive dropDownOfCalenderAndDrive=new DropDownOfCalenderAndDrive();
    dropDownOfCalenderAndDrive.cornerDropDown.click();
    dropDownOfCalenderAndDrive.driveCleanUp.click();
    String titleOfdriveCleanUp=Driver.getDiver().findElement(By.xpath("//a[contains(text(),'Drive Cleanup')]")).getText();
    Assert.assertTrue(titleOfdriveCleanUp.contains("Drive Cleanup"),"Drive Cleanup **Failed**");

}

}
