package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.projectSpecificMethods;

public class salesAccountsPage extends projectSpecificMethods{

	public salesAccountsPage() {
		
	this.driver = driver;
	}
	public salesAccountsPage clickNewbutton() {
		// TODO Auto-generated method stub
		WebElement clickNewButton = driver.findElementByLinkText("New");
		clickNewButton.click();
		return this;
	}
	
	public salesAccountsPage searchAccName() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElementByXPath("//input[@name='Account-search-input']").sendKeys("Arjun", Keys.ENTER);
		driver.findElementByXPath("//div[@class='listViewContent slds-table--header-fixed_container']").click();
		Thread.sleep(3000);
		return this;
	}
	
	public salesAccountsPage enterAccountName() {
		// TODO Auto-generated method stub
		driver.findElementByXPath("//div[@class='slds-form-element__control slds-grow']//input[@name='Name']").sendKeys("Arjun");
		
		return this;
	}
	
	
	public salesAccountsPage clickaccountOwnerdropdown() {
		// TODO Auto-generated method stub
		WebElement clickDD = driver.findElementByXPath("//a[@title='Arjun']//parent::span//parent::th//following-sibling::td//span[@class='slds-grid slds-grid--align-spread']//a//span//*[local-name()='svg']"); 
		builder.click(clickDD).build().perform();
		return this;
	}
	
	public salesAccountsPage clickEditButton() {
		// TODO Auto-generated method stub
		WebElement clickEdit = driver.findElementByXPath("//a[@title='Edit']");
	  	
	  	builder.moveToElement(clickEdit).click().perform();
		return this;
	}
	
	public salesAccountsPage clickDeleteButton() throws InterruptedException {
		// TODO Auto-generated method stub
		WebElement clickDelete = driver.findElementByXPath("//a[@title='Delete']");
	  	
	  	builder.moveToElement(clickDelete).click().perform();
		Thread.sleep(3000);
		return this;
	}
	
	public salesAccountsPage clickTypeDropdown() {
		// TODO Auto-generated method stub
		WebElement selectType = driver.findElementByXPath("//lightning-combobox[@class='slds-form-element_stacked slds-form-element']/label[text()='Type']//following-sibling::div//div//button//span[text()='--None--']");
		builder.click(selectType).perform();
		return this;
	}
	
	public salesAccountsPage selectTechpartner() throws InterruptedException {
		// TODO Auto-generated method stub
		WebElement selectTechPartner = driver.findElementByXPath("//span[@class='slds-media__body']/span[text()='Technology Partner']");
		builder.moveToElement(selectTechPartner).click().perform();
		
		Thread.sleep(3000);
		return this;
	}
	
	public salesAccountsPage clickIndustryDropdown() {
		// TODO Auto-generated method stub
		WebElement selectIndustry = driver.findElementByXPath("//lightning-combobox[@class='slds-form-element_stacked slds-form-element']/label[text()='Industry']//following-sibling::div//div//button//span[text()='--None--']");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", selectIndustry);
		return this;
	}
	
	public salesAccountsPage selectHealthcare() throws InterruptedException {
		// TODO Auto-generated method stub
		WebElement selectHealthcare = driver.findElementByXPath("//span[@class='slds-media__body']/span[text()='Healthcare']");
		builder.moveToElement(selectHealthcare).click().perform();
		Thread.sleep(3000);
		return this;
	}
	
	public salesAccountsPage billingAddress() {
		// TODO Auto-generated method stub
		driver.findElementByXPath("//label[text()='Billing Street']//following-sibling::div//textarea[@name='street']").sendKeys("Hopes, Coimbatore");
		return this;
	}
	
	public salesAccountsPage shippingAddress() {
		// TODO Auto-generated method stub
		driver.findElementByXPath("//label[text()='Shipping Street']//following-sibling::div//textarea[@name='street']").sendKeys("Hopes, Coimbatore");
		return this;
	}
	
	public salesAccountsPage selectCustomerpriority() {
		// TODO Auto-generated method stub
		WebElement selectCusPriority = driver.findElementByXPath("//lightning-combobox[@class='slds-form-element_stacked slds-form-element']/label[text()='Customer Priority']//following-sibling::div//div//button//span[text()='--None--']");
		js.executeScript("arguments[0].click();", selectCusPriority);
		return this;
	}
	
	public salesAccountsPage selectLowCP() throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebElement selectLow = driver.findElementByXPath("//span[@class='slds-media__body']/span[text()='Low']");
		builder.moveToElement(selectLow).click().perform();
		Thread.sleep(3000);
		return this;
	}
	
	public salesAccountsPage SLADropdown() {
		// TODO Auto-generated method stub
		WebElement selectSLA = driver.findElementByXPath("//lightning-combobox[@class='slds-form-element_stacked slds-form-element']/label[text()='SLA']//following-sibling::div//div//button//span[text()='--None--']");
		js.executeScript("arguments[0].click();", selectSLA);
		return this;
	}
	
	public salesAccountsPage selectSilverSLA() throws InterruptedException {
		// TODO Auto-generated method stub
		WebElement selectSilver = driver.findElementByXPath("//span[@class='slds-media__body']/span[text()='Silver']");
		builder.moveToElement(selectSilver).click().perform();
		Thread.sleep(3000);
		return this;
	}
	
	public salesAccountsPage activeDropdown() {
		// TODO Auto-generated method stub
		WebElement selectActive = driver.findElementByXPath("//lightning-combobox[@class='slds-form-element_stacked slds-form-element']/label[text()='Active']//following-sibling::div//div//button//span[text()='--None--']");
		js.executeScript("arguments[0].click();", selectActive);
		return this;
	}
	
	public salesAccountsPage activeNo() throws InterruptedException {
		// TODO Auto-generated method stub
		WebElement selectNo = driver.findElementByXPath("//span[@class='slds-media__body']/span[text()='No']");
		builder.moveToElement(selectNo).click().perform();
		Thread.sleep(3000);
		return this;
	}
	
	public salesAccountsPage phoneNumber() {
		// TODO Auto-generated method stub
		String expectedNumber = "9823577925";
		driver.findElementByXPath("//label[text()='Phone']//following-sibling::div//input[@name='Phone']").sendKeys(expectedNumber);
		return this;	
	}
	
	public salesAccountsPage upsellDropdown() {
		// TODO Auto-generated method stub
		WebElement selectOpportunity = driver.findElementByXPath("//lightning-combobox[@class='slds-form-element_stacked slds-form-element']/label[text()='Upsell Opportunity']//following-sibling::div//div//button//span[text()='--None--']");
		js.executeScript("arguments[0].click();", selectOpportunity);
		return this;
	}
	
	public salesAccountsPage upsellNo() throws InterruptedException {
		// TODO Auto-generated method stub
		WebElement selectNo1 = driver.findElementByXPath("//span[@class='slds-media__body']/span[text()='No']");
		builder.moveToElement(selectNo1).click().perform();
		Thread.sleep(3000);
		return this;
	}
	
	
	public salesAccountsPage selectOwnerShip() {
		// TODO Auto-generated method stub
		WebElement clickOwnershipButton = driver.findElementByXPath("//lightning-combobox[@class='slds-form-element_stacked slds-form-element']//label[text()='Ownership']//parent::lightning-combobox/div//div//button/span[text()='--None--']");
		
		wait.until(ExpectedConditions.elementToBeClickable(clickOwnershipButton));
		js.executeScript("arguments[0].click();", clickOwnershipButton);

		WebElement publicOption = driver.findElementByXPath("//span[@class='slds-media__body']//span[@title='Public']");	
		builder.moveToElement(publicOption).click().perform();
		return this;
	}
	
	public salesAccountsPage clickSaveButton() {
		// TODO Auto-generated method stub
	    driver.findElementByXPath("//button[@class= 'slds-button slds-button_brand' and text()='Save']").click();
		return this;

	}
	
	public salesAccountsPage confirmDeleteOption() {
		// TODO Auto-generated method stub
	  	WebElement clickDeletePopup = driver.findElementByXPath("//button[@title='Delete']//span[text()='Delete']");

	  	builder.click(clickDeletePopup).perform();
	  	return this;
	}
}
