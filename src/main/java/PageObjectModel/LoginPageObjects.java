package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
	//this driver dont have scope
	public WebDriver driver;
	
	/*browserLaunch();
	//this driver have scope
	driver.get("https://login.salesforce.com/?locale=in");*/
	
	
	//driver.findElement(By.xpath("")).sendKeys();
	//we have achieved encapsulation here
	private By username=By.xpath("//input[@id='username']");
	private By password=By.xpath("//input[@id='password']");
	private By LoginButton=By.xpath("//input[@id='Login']");
	private By tryForFree=By.xpath("//a[@id='signup_link']");
	
	
	public LoginPageObjects(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}

	public WebElement EnterUsername() {
		
		return driver.findElement(username);
		//driver.findElement(By.xpath("//input[@id='username']"));
	}
	
public WebElement EnterPassword() {
		
		return driver.findElement(password);
}


 public WebElement ClickLogin() {
	
	return driver.findElement(LoginButton);
}
 
 public WebElement ClickOnTryForFree() {
		
		return driver.findElement(tryForFree);
	}
}
