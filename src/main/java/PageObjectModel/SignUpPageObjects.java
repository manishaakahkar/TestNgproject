package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObjects {
	
public WebDriver driver;
	
	//driver.findElement(By.xpath("")).sendKeys();
	//we have achieved encapsulation here
	private By firstName=By.xpath("//input[@name='UserFirstName']");
	private By JobTitle =By.xpath("//select[@name='UserTitle']");
	private By LastName=By.xpath("//input[@name='UserLastName']");
	private By WorkEmail=By.xpath("//input[@name='UserEmail']");
	private By Company=By.xpath("//input[@name='CompanyName']");
	private By Phone=By.xpath("//input[@name='UserPhone']");
	private By Employees=By.xpath("//select[@name='CompanyEmployees']");
	private By Country=By.xpath("//select[@name='CompanyCountry']");
	
	
	
public SignUpPageObjects(WebDriver driver2) {
		this.driver=driver2;
	}

public WebElement EnterFirstName() {
		
		return driver.findElement(firstName);
	
	}

public WebElement SelectJobTitle() {
	
	return driver.findElement(JobTitle);
	
}

public WebElement EnterLastName() {
	
	return driver.findElement(LastName);
	
}

public WebElement WorkEmail() {
	
	return driver.findElement(WorkEmail);
	
}

public WebElement Company() {
	
	return driver.findElement(Company);
	
}

public WebElement Phone() {
	
	return driver.findElement(Phone);
	
}

public WebElement Employees() {
	
	return driver.findElement(Employees);
	
}

public WebElement Country() {
	
	return driver.findElement(Country);
	
}

}
