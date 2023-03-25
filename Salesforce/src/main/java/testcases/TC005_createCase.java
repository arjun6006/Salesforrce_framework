package testcases;

import org.testng.annotations.Test;

import base.projectSpecificMethods;
import pages.loginPage;

public class TC005_createCase extends projectSpecificMethods{
	@Test
	public void runCreatecase() throws InterruptedException {
		// TODO Auto-generated method stub
		loginPage lp = new loginPage();
		 
		 lp.enterUsername()
		 .enterPassword()
		 .clickLoginButton()
		 .clickAppLauncher()
		 .clickViewAll()
		 .enterSearchBar()
		 .clickSalesButton()
		 .clickMoreDropdown()
		 .clickCasesOption()
		 .casesDropdown()
		 .clickNewcaseinDD()
		 .selectContactName()
		 .selectCaseOriginDropdown()
		 .selectEmailinCaseOrigin()
		 .enterSubject()
		 .enterDescription()
		 .clickSaveButton();
	}

}
