package testcases;

import org.testng.annotations.Test;

import base.projectSpecificMethods;
import pages.loginPage;

public class TC007_deleteCase extends projectSpecificMethods{
	@Test
	public void runDeleteCase() throws InterruptedException {
		// TODO Auto-generated method stub
		loginPage fp = new loginPage();
		 
		fp.enterUsername()
		 .enterPassword()
		 .clickLoginButton()
		 .clickAppLauncher()
		 .clickViewAll()
		 .enterSearchBar()
		 .clickSalesButton()
		 .clickMoreDropdown()
		 .clickCasesOption()
		 .clickmoreDDfromCase()
		 .clickDeleteoptionfromDropdown()
		 .clickDeletefromPopup();

	}
}
