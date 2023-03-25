package pages;

import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.projectSpecificMethods;

public class salesHomepage extends projectSpecificMethods{

	public salesHomepage() {
	
	this.driver = driver;
	}

	public salesAccountsPage clickAccountButton() {
		WebElement clickAccountsButton = driver.findElementByXPath("//a[@title='Accounts']/span[text()='Accounts']");
		builder.click(clickAccountsButton).perform();
		return new salesAccountsPage();
	}
	
	public salesHomepage clickMoreDropdown() {
		// TODO Auto-generated method stub
		WebElement clickMoreDropdown = driver.findElementByXPath("//span[@class='slds-p-right_small']");
		wait.until(ExpectedConditions.elementToBeClickable(clickMoreDropdown));
		builder.click(clickMoreDropdown).perform();
		return new salesHomepage();
	}
	
	public salesCasesPage clickCasesOption() throws InterruptedException {
		// TODO Auto-generated method stub
		WebElement clickCases = driver.findElementByXPath("//span[@class='slds-truncate']/span[text()='Cases']");
		wait.until(ExpectedConditions.elementToBeClickable(clickCases));
		builder.moveToElement(clickCases).click().perform();
		Thread.sleep(3000);
		return new salesCasesPage();
	}
}
