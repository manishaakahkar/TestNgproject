package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObjects;
import Resources.BaseClass;
import Resources.TestCaseData;
import Resources.commonUtilities;

public class VerifyLoginTestCase extends BaseClass {
  //we have achieved inheritance here	

	@Test
	public void login() throws IOException {
		
		/*browserLaunch();
		//this driver have scope
		driver.get("https://login.salesforce.com/?locale=in");---  added in BaseClass*/
		
		LoginPageObjects lpo=new LoginPageObjects(driver);
		lpo.EnterUsername().sendKeys(TestCaseData.username);
		lpo.EnterPassword().sendKeys(TestCaseData.password);
		lpo.ClickLogin().click();
		
		
		//String ExpectedStringlogin="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		String ExpectedStringlogin=TestCaseData.ExpectedTitlelogin;
		String ActualStringlogin=driver.findElement(By.xpath("//div[@id='error']")).getText();
		
		/*SoftAssert assertion=new SoftAssert();
		assertion.assertEquals(Actual,Expected);
		assertion.assertAll();*/
		
		commonUtilities.handleAssertions(ActualStringlogin,ExpectedStringlogin);
		
		
		
		

}
}