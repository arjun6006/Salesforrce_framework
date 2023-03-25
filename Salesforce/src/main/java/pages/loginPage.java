package pages;


import base.projectSpecificMethods;

public class loginPage extends projectSpecificMethods {
	
	public loginPage() { 	
		this.driver = driver;
	}
	
		// actionElementName()
		public loginPage enterUsername() throws InterruptedException {
			driver.findElementById("username").sendKeys("matschie@testleaf.com");
			//Thread.sleep(5000);
			return this;
		}

		public loginPage enterPassword() {
			driver.findElementById("password").sendKeys("SeleniumBootcamp@123");
			return this;
		}

		public homePage clickLoginButton() {
			driver.findElementById("Login").click();
			return new homePage();
		}
}
