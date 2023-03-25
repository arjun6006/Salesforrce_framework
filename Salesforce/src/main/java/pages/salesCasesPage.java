package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import base.projectSpecificMethods;

public class salesCasesPage extends projectSpecificMethods{
	public salesCasesPage() {
		
	this.driver = driver;
	}
	
	
	public salesCasesPage casesDropdown() throws InterruptedException {
		// TODO Auto-generated method stub
		WebElement ClickCaseDropDown = driver.findElementByXPath("//a[@title='Cases']/following-sibling::one-app-nav-bar-item-dropdown/div//lightning-icon//*[local-name()='svg']//*[local-name()='path']");
		builder.moveToElement(ClickCaseDropDown).click().perform();
		System.out.println("Case DD clicked");
		return this;
	}
	
	public salesCasesPage clickNewcaseinDD() {
		// TODO Auto-generated method stub
		 WebElement clickNewCase = driver.findElementByXPath("//lightning-icon[@class='slds-icon-text-default slds-m-right--x-small slds-shrink-none slds-icon-utility-add slds-icon_container']//following::span[text()='New Case']");
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].click();", clickNewCase);
		  System.out.println("New case clicked ");
		
		return this;
	}
	
	public salesCasesPage selectContactName() {
		// TODO Auto-generated method stub
		 driver.findElementByXPath("//input[@placeholder='Search Contacts...']").sendKeys("Arjun Durai");
		 WebElement selectAD1 = driver.findElementByXPath("//div[@class='slds-m-left--smalllabels slds-truncate slds-media__body']/div[@title='Arjun Durai']");
		 WebElement selectAD2 = driver.findElementByXPath("//a[@role='option']//div[@data-aura-class='forceEntityIcon']//following::div//div[@title='Arjun Durai']");
		 builder.moveToElement(selectAD2).click().perform();
		 return this;
	}
	
	
	public salesCasesPage selectCaseOriginDropdown() {
		// TODO Auto-generated method stub
		 WebElement clickCOButton = driver.findElementByXPath("//span[@data-aura-class= 'uiPicklistLabel']/span[text()='Case Origin']/parent::span//following::div[@class='uiMenu']/div[@class='uiPopupTrigger']//div//a[@class='select' and text()='--None--']");
		 builder.click(clickCOButton).build().perform();
		 return this;
	}
	
	public salesCasesPage selectEmailinCaseOrigin() {
		// TODO Auto-generated method stub
		 WebElement clickEmail = driver.findElementByXPath("//a[@title='Email']");
		 builder.moveToElement(clickEmail).click().build().perform();
		 return this;
	}
	
	public salesCasesPage enterSubject() {
		// TODO Auto-generated method stub
		  driver.findElementByXPath("//label[@class='label inputLabel uiLabel-left form-element__label uiLabel']/span[text()='Subject']/following::input[@class=' input']").sendKeys("Testing - ARJ"); 
		  return this;
	}
	
	public salesCasesPage enterDescription() {
		// TODO Auto-generated method stub
		  driver.findElementByXPath("//label[@class='label inputLabel uiLabel-left form-element__label uiLabel']/span[text()='Description']/following::textarea[@role='textbox'][1]").sendKeys("Dummy");
		 return this;
	}
	
	public salesCasesPage clickSaveButton() {
		// TODO Auto-generated method stub
		  driver.findElementByXPath("//button[@class= 'slds-button slds-button--neutral uiButton--brand uiButton forceActionButton']/span[text()='Save']").click();
		  return this;
	}
	
	
	public void clickDeletefromPopup() {
		// TODO Auto-generated method stub
		driver.findElementByXPath("//button[@class= 'slds-button slds-button--neutral uiButton--default uiButton--brand uiButton forceActionButton']/span[text()='Delete']").click();
	}
	
	public salesCasesPage clickmoreDDfromCase() {
		// TODO Auto-generated method stub
		WebElement clickmoreActionDD = driver.findElementByXPath("//table[@data-aura-class='uiVirtualDataTable']//tbody//td[@role='gridcell']//span//div[@class='forceVirtualActionMarker forceVirtualAction']//span//span[1]");
		clickmoreActionDD.click();
		return this;
	}
	
	public salesCasesPage clickEditoptionfromDropdown() {
		// TODO Auto-generated method stub
		WebElement clickEditOption = driver.findElementByXPath("//li[@class='uiMenuItem']/a[@title='Edit']/div[@title='Edit']");
		builder.moveToElement(clickEditOption).click().build().perform();
		return this;
	}
	
	
	public salesCasesPage clickDeleteoptionfromDropdown() {
		// TODO Auto-generated method stub
		WebElement clickDeleteOption = driver.findElementByXPath("//li[@class='uiMenuItem']/a[@title='Delete']/div[@title='Delete']");
		builder.moveToElement(clickDeleteOption).click().build().perform();
		return this;
	}
	public salesCasesPage clickStatusNewButtonDD() {
		// TODO Auto-generated method stub
		 WebElement clickNewButton = driver.findElementByXPath("//label[@class = 'slds-form-element__label']/following::div//div//button[@data-value='New']//span[text()='New']");
		 builder.moveToElement(clickNewButton).click().perform();
		 return this;
	}
	
	public salesCasesPage selectWorkingfromDD() {
		// TODO Auto-generated method stub
		 WebElement selectWorkingStatus = driver.findElementByXPath("//span[@class = 'slds-media__body']/span[text()='Working']");
		 builder.moveToElement(selectWorkingStatus).click().build().perform();
		return this;
	}
	
	public salesCasesPage clickPriorityDropdown() {
		// TODO Auto-generated method stub
		WebElement clickPriorityButton = driver.findElementByXPath("//span[@class = 'label inputLabel uiPicklistLabel-left form-element__label uiPicklistLabel']//span[text()='Priority']/parent::span/following::div[@class='uiPopupTrigger']//div//a[@class='select' and text()='Medium']"); 
		clickPriorityButton.click();
		return this;
	}
	
	public salesCasesPage selectLowPriorityfromDropDown() {
		// TODO Auto-generated method stub
		WebElement clickLow = driver.findElementByXPath("//span[@class = 'slds-media__body']/span[text()='Low']");
		builder.moveToElement(clickLow).click().build().perform();
		return this;
	}
	
	public salesCasesPage clickCaseOriginDropdown() {
		// TODO Auto-generated method stub
		  WebElement clickCOButton = driver.findElementByXPath("//span[@data-aura-class= 'uiPicklistLabel']/span[text()='Case Origin']/parent::span//following::div[@class='uiMenu']/div[@class='uiPopupTrigger']//div//a[@class='select' and text()='Email']"); 
		  clickCOButton.click(); 
		  return this;
	}
	
	public salesCasesPage selectPhonefromCaseOrigin() {
		// TODO Auto-generated method stub
		  WebElement clickPhone = driver.findElementByXPath("//span[@class = 'slds-media__body']/span[text()='Low']");
		  builder.moveToElement(clickPhone ).click().build().perform();
		  return this;
	}
	
	
	public salesCasesPage clickSLAViolationDropdown() {
		// TODO Auto-generated method stub
		  WebElement clickSLAButton = driver.findElementByXPath("//span[@class = 'label inputLabel uiPicklistLabel-left form-element__label uiPicklistLabel']//span[text()='SLA Violation']/parent::span/following::div[@class='uiPopupTrigger']//div//a[@class='select' and text()='--None--']"); 
		  clickSLAButton.click();
		return this;
	}
	
	
	public salesCasesPage selectNofromSLA() {
		// TODO Auto-generated method stub
		WebElement clickNo = driver.findElementByXPath("//span[@class = 'slds-media__body']/span[text()='No']");
		builder.moveToElement(clickNo).click().build().perform();
		return this;
	}
	
	
}
