package Resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class commonUtilities {
	
	//this is common method for dropdown handling
	public static void dropdownHandle(WebElement dropdownXpath,int dropdownValue) {
		
		Select s=new Select(dropdownXpath);
		s.selectByIndex(dropdownValue);
	}
	
	
	public static void handleAssertions(String Actual,String Expected) {
		
		SoftAssert assertion=new SoftAssert();
		assertion.assertEquals(Actual,Expected);
		assertion.assertAll();//this is mandotry line
	
	
	
	}
}
