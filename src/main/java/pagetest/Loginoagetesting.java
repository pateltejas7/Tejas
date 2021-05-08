package pagetest;

import org.openqa.selenium.WebDriver;

import Loginpageelements.Loginpagetest;

public class Loginoagetesting {
	
	
	WebDriver driver;
	Loginpagetest loginpagetest;
	
	
	public Loginoagetesting(WebDriver driver) {
		
		this.driver= driver;
		loginpagetest = new Loginpagetest(driver);
		
	}
	
	
	 public  void Testingdone() throws InterruptedException {
		 
		  
		 loginpagetest.click.click();
		 
		 Thread.sleep(5000);
		 loginpagetest.email.sendKeys("pateltejas799@gmail.com");
		 loginpagetest.Password.sendKeys("Test@1234");
		 
		 
		 
	 }	

}
