package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import PageObjectModel.SignUpPageObjects;
import Resources.BaseClass;
import Resources.TestCaseData;
import Resources.commonUtilities;

public class VerifySiggnUpTestCase extends BaseClass{
	
	@Test
	public void SignUp() throws IOException, InterruptedException {
		
		
		LoginPageObjects lpo=new LoginPageObjects(driver);
		lpo.ClickOnTryForFree().click();
		
		Thread.sleep(5000);
		
		
		//System.out.println(driver.getTitle());
		
		String actualTitle=driver.getTitle();
		
		//String expectedTitle="Free CRM Trial: Salesforce 30-Day Trial - Salesforce IN";
		String expectedTitle=TestCaseData.expectedTitlesignup;
		
		commonUtilities.handleAssertions(actualTitle, expectedTitle);
		
		
		SignUpPageObjects spo=new SignUpPageObjects(driver);
		spo.EnterFirstName().sendKeys(TestCaseData.firstName);
		spo.EnterLastName().sendKeys(TestCaseData.LastName);
		spo.WorkEmail().sendKeys(TestCaseData.WorkEmail);
		spo.Company().sendKeys(TestCaseData.Company);
		spo.Phone().sendKeys(TestCaseData.Phone);
		
		
		/*Select s=new Select(spo.SelectJobTitle());
		s.selectByIndex(1);
		
		Select s1=new Select(spo.Employees());
		s1.selectByValue("9");
		
		Select s2=new Select(spo.Country());
		s2.selectByVisibleText("United States");*/
		
		commonUtilities.dropdownHandle(spo.SelectJobTitle(),1);
		commonUtilities.dropdownHandle(spo.Employees(),2);
		commonUtilities.dropdownHandle(spo.Country(),0);
		
	}
	
	

}
