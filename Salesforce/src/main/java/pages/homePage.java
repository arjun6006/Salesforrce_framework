package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.projectSpecificMethods;

public class homePage extends projectSpecificMethods{
	public homePage() {
	this.driver = driver;
	}
	
	
	public homePage clickUserButton() {
		WebElement clickUserButton = driver.findElementByXPath("//span[@class='uiImage']//img[@title='User']");
		builder.moveToElement(clickUserButton).click().build().perform();
		return this;
	}
	
	public homePage clickAppLauncher() {
		// TODO Auto-generated method stub
		driver.findElementByXPath("//div[@class='slds-icon-waffle']").click();
		return this;
	}
	
	public homePage clickViewAll() {
		// TODO Auto-generated method stub
		driver.findElementByXPath("//button[text()='View All']").click();
		return this;
	}
	
	public homePage enterSearchBar() {
		// TODO Auto-generated method stub
		driver.findElementByXPath("//input[@placeholder='Search apps or items...']").sendKeys("Sales");
		return this;
	}
	
	public salesHomepage clickSalesButton() {
		// TODO Auto-generated method stub
		driver.findElementByXPath("//p[@title='Manage your sales process with accounts, leads, opportunities, and more']").click();
		return new salesHomepage();
	}
	
	public loginPage clickLogout() {
		driver.findElementByLinkText("Log Out").click();
		return new loginPage(); 

	}
	
	
}
