package testcases;

import org.testng.annotations.Test;

import base.projectSpecificMethods;
import pages.loginPage;

public class TC006_editCase extends projectSpecificMethods{
	@Test
	public void runEditCase() throws InterruptedException {
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
		 .clickmoreDDfromCase()
		 .clickEditoptionfromDropdown()
		 .clickStatusNewButtonDD()
		 .selectWorkingfromDD()
		 .clickPriorityDropdown()
		 .selectLowPriorityfromDropDown()
		 .clickCaseOriginDropdown()
		 .selectPhonefromCaseOrigin()
		 .clickSLAViolationDropdown() 	 
		 .selectNofromSLA();
	}
	}
	
	
