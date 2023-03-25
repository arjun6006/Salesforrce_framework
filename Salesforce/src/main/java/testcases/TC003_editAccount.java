package testcases;

import org.testng.annotations.Test;

import base.projectSpecificMethods;
import pages.loginPage;

public class TC003_editAccount extends projectSpecificMethods{
	@Test
	public void editAccounts() throws InterruptedException {
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
		 .clickEditButton()
		 .clickTypeDropdown()
		 .selectTechpartner()
		 .clickIndustryDropdown()
		 .selectHealthcare()
		 .billingAddress()
		 .shippingAddress()
		 .selectCustomerpriority()
		 .selectLowCP()
		 .SLADropdown()
		 .selectSilverSLA()
		 .activeDropdown()
		 .activeNo()
		 .phoneNumber()
		 .upsellDropdown()
		 .upsellNo()
		 .clickSaveButton();
	}
}
