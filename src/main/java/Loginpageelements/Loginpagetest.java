package Loginpageelements;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpagetest {

	WebDriver driver;
	
	@FindBy(xpath = "//a[contains(text(),'Log in')]")
	public WebElement click;
	
	@FindBy(xpath = "//input[@id='Email']")
	public WebElement email;
	
	@FindBy(xpath = "//input[@id='Password']")
	public WebElement Password;
	
	public Loginpagetest(WebDriver driver) 
	{
		
		
		this.driver=driver;
        PageFactory.initElements(driver, this);
		
		
	}
	
	
	
	
	
}
