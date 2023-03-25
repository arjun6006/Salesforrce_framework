package testcases;

import org.testng.annotations.Test;

import base.projectSpecificMethods;
import pages.loginPage;

public class TC004_deleteAccount extends projectSpecificMethods{
	@Test
	public void deleteAccount() throws InterruptedException {
		// TODO Auto-generated method stub
		loginPage lp = new loginPage();
		 
		 lp.enterUsername()
		 .enterPassword()
		 .clickLoginButton()
		 .clickAppLauncher()
		 .clickViewAll()
		 .enterSearchBar()
		 .clickSalesButton()
		 .clickAccountButton()
		 .searchAccName()
		 .clickaccountOwnerdropdown()
		 .clickDeleteButton()
		 .confirmDeleteOption();
		 
	}
}
