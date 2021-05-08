package Baseautomation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import Loginpageelements.Loginpagetest;
import pagetest.Loginoagetesting;

public class Basepage {
	
	
	public static  WebDriver driver;
	public static 	Properties prop;
	public Loginpagetest loginpagetest;
	public Loginoagetesting loginoagetesting;
	
	

	@BeforeTest
	public WebDriver intializeriver() throws IOException {
		
		prop = new Properties();
		
		//FileInputStream ip = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\Test\\src\\Testt\\test.properties");
		
		
		FileInputStream fs = new FileInputStream("C:\\Users\\admin\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		prop.load(fs);
		
		//C:\Users\admin\Downloads\chromedriver_win32 (4)
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		
		String browser = prop.getProperty("browser");
		
		if(browser.equals("chrome")) 
		
		{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable notifications");
		options.addArguments("disable-infolbars");
		driver = new ChromeDriver();
		
		loginpagetest = new Loginpagetest(driver);
		loginoagetesting = new Loginoagetesting(driver);
			
		}
		
		
		else if(browser.equals("Firefox")) {
			
			
			driver = new FirefoxDriver();
			
		}
	
		driver.navigate().to(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		return driver;
		
	}
	
	

}
