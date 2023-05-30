package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;


  public class verifyLogin {
	  
	public WebDriver driver;
	
	
	private By name= By.xpath("//input [@type='email']");
	private By password= By.xpath("//input[@type='password']");
	private By click= By.xpath("//input[@type='submit']");
	private By signup= By.xpath("//a[@id='signup_link']");
	
	private By errormessage= By.xpath("//div[@id='error']");
	
	
	
	
	
  // this is constructor
  public verifyLogin(WebDriver driver2) {
		this.driver=driver2;
	}

public WebElement Username() {
	
	return driver.findElement(name);
	
   }
  
  public WebElement Password() {
		
		return driver.findElement(password);
		
	   }
  
  public WebElement Click() {
		
		return driver.findElement(click);
		
	   }
  
  
  

public WebElement SignUpPage() {
	// TODO Auto-generated method stub
	return driver.findElement(signup);
	
}

  
public WebElement ErrorMessage() {
	// TODO Auto-generated method stub
	return driver.findElement(errormessage);
	
}

  
  
  
  
  
  
  
  
  
}