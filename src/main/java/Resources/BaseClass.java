package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver browserLaunch() throws IOException {
		
		
		//FileInputStream fis=new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\20thJuneTestNgframework\\src\\main\\java\\Resources\\data.properties");
        
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		prop=new Properties();
		
		prop.load(fis);
		
		String browserName=prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("Chrome")) {
			
			/*System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Desktop\\chrome\\chromedriver.exe");*/
			//replace to following
			
			WebDriverManager.chromedriver().setup(); //this will run latest chrome browser in your system
			
			//WebDriverManager.chromeDriver.Version("102.1.0").setup(); //this will run with old version
			driver=new ChromeDriver();
			
			}
		
		else if(browserName.equalsIgnoreCase("firefox")) {
			
			
		}
		
		else if(browserName.equalsIgnoreCase("Edge")) {
			
		}
		
		else {
			
			System.out.println("please selec valid browser ");
			
		}
		
		return driver;
		}
	
	
	@BeforeMethod
	public void launchBrowser() throws IOException {
		
		browserLaunch();
		//this driver have scope
		driver.get(prop.getProperty("url"));
		
	}
	
	@AfterMethod
	public void tearDown() throws IOException {
	driver.quit();
	}
		


}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

