
package TestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.By;
import resourses.baseclass;
import resourses.commonMethods;
import resourses.constants;
import PageObjectModel.verifyLogin;



public class Verify extends baseclass{

	public void login() throws IOException {
		
		Exicution();
		
	verifyLogin LPO= new verifyLogin(driver);
	
	LPO.Username().sendKeys("Shubham");
	LPO.Password().sendKeys("Shubham@2001");
	LPO.Click().click();
	
	//LPO.SignUpPage().click();
	}
	





@Test
	public void failedlogin() throws IOException {
		
	
	
	verifyLogin LPO= new verifyLogin(driver);
	
	LPO.Username().sendKeys(constants.username);
	LPO.Password().sendKeys(constants.password);
	LPO.Click().click();
	
	
    String ActualText=LPO.ErrorMessage().getText();
	
	String expectedText=constants.actualvalue;
	commonMethods.HandleAssertion(ActualText,expectedText,"Test case failed");
	
	System.out.println("Testpass");

	System.out.println("Testpass");
	
	
	}
}




