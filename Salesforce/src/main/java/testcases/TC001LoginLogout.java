package testcases;

import org.testng.annotations.Test;

import base.projectSpecificMethods;
import pages.loginPage;

public class TC001LoginLogout extends projectSpecificMethods{

		@Test
		public void runLogin() throws InterruptedException {
			 loginPage lp = new loginPage();
			 
			 lp.enterUsername().enterPassword().clickLoginButton().clickUserButton().clickLogout();
		
		}
}
