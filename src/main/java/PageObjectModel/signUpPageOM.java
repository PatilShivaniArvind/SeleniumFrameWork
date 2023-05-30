package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signUpPageOM {

	
	public WebDriver driver;
	
	
	By firstname= By.xpath("//input[@name='UserFirstName']");
	
	By lastname= By.xpath("//input[@name='UserLastName']");
	
	By workmail= By.xpath("//input[@name='UserEmail']");
	
	By jobtitle = By.xpath("//select[@name='UserTitle']");
	
	By companyname= By.xpath("//input[@name='CompanyName']");
	
	By employees = By.xpath("//select[@name='CompanyEmployees']");
	
	By phonenumber= By.xpath("//input[@name='UserPhone']");
	
	
	public signUpPageOM(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement FirstName() {
		
		return driver.findElement(firstname);
		
	   }
	
	public WebElement LastName() {
		
		return driver.findElement(lastname);
		
	   }
	
	
	public WebElement WorkMail() {
		
		return driver.findElement(workmail);
		
	   }
	
	
	public WebElement JobTitle() {
		
		return driver.findElement(jobtitle);
		
	   }
	

	
	public WebElement CompanyName() {
		
		return driver.findElement(companyname);
		
	   }
	
	
	public WebElement Employees() {
		
		return driver.findElement(employees);
		
	   }
	
	
	public WebElement PhoneNumber() {
		
		return driver.findElement(phonenumber);
		
	   }
	
	
	
}
