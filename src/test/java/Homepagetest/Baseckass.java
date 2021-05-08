package Homepagetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import Loginpageelements.Loginpagetest;
import pagetest.Loginoagetesting;

public class Baseckass {
	
	
	WebDriver driver;
	Loginpagetest loginpagetest;
	Loginoagetesting loginoagetesting;
	
	@BeforeTest
	
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\apache-maven-3.6.3-bin\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		
		loginpagetest = new Loginpagetest(driver);
		loginoagetesting = new Loginoagetesting(driver);
		
		
		
		
		
	}

	
}
