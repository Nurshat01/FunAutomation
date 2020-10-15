package UtilityWedDriverFactory;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {
    /**
     Accepts a list of Wed Elements
     @param list
     @Return List<String>
     Method should be returning a list of String
     */


    public static List<String> getElementTest(List<WebElement>list){

        List<String>wedElementAsString=new ArrayList<>();

        for (WebElement each : list) {
            wedElementAsString.add(each.getText());
        }
        return wedElementAsString;

    }

    public static void Wait(int sec){

        try {
            Thread.sleep(1000*sec);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Interrupted Exceptions Caught");
        }
    }
}
