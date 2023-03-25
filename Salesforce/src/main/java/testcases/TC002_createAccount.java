package testcases;

import org.testng.annotations.Test;

import base.projectSpecificMethods;
import pages.loginPage;

public class TC002_createAccount extends projectSpecificMethods{
	@Test
	public void runcreateAccount() throws InterruptedException {
		 loginPage lp = new loginPage();
		 
		 lp.enterUsername()
		 .enterPassword()
		 .clickLoginButton()
		 .clickAppLauncher()
		 .clickViewAll()
		 .enterSearchBar()
		 .clickSalesButton()
		 .clickAccountButton()
		 .clickNewbutton()
		 .enterAccountName()
		 .selectOwnerShip()
		 .clickSaveButton();
	
	}
}
