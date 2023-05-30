package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
import PageObjectModel.verifyLogin;
import PageObjectModel.signUpPageOM;
import resourses.baseclass;
import resourses.commonMethods;
import resourses.constants;

public class verifySignUpPage extends baseclass {

	@Test
	public void signUp() throws IOException, InterruptedException {

	
		

		verifyLogin LPO = new verifyLogin(driver);

		LPO.SignUpPage().click();

		Thread.sleep(5000);

		signUpPageOM SUP = new signUpPageOM(driver);

		SUP.FirstName().sendKeys(constants.FirtstName);
		SUP.LastName().sendKeys(constants.LastName);
		SUP.WorkMail().sendKeys(constants.WorlMail);
		
		commonMethods.Handlingdropdown(SUP.Employees(),2);
		commonMethods.Handlingdropdown(SUP.JobTitle(),1);
		
		// this is how we create common method from select
		/*
		Select s1= new Select(SUP.JobTitle());
		s1.selectByIndex(1);
        */
		
		
		SUP.PhoneNumber().sendKeys(constants.PhoneNo);
		SUP.CompanyName().sendKeys(constants.CompanyName);

	}

}
