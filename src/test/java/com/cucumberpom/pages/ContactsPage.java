package com.cucumberpom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumberpom.base.BaseTest;

public class ContactsPage extends BaseTest
{
@FindBy(name="firstNamec")
WebElement firstName;

@FindBy(name="lastNamec")
WebElement lastName;

@FindBy(name="identifierc")
WebElement identifier;

@FindBy(name="positionc")
WebElement position;

@FindBy(xpath="//*[@id=\\\"dashboard-toolbar\\\"]/div[2]/div/button[2]")
WebElement saveContac;

public ContactsPage()
{
	PageFactory.initElements(driver, this);
}

public void saveContact() throws InterruptedException
{
	firstName.sendKeys("Juan");
	lastName.sendKeys("Rios");
	identifier.sendKeys("777777");
	position.sendKeys("QA");
	
	Thread.sleep(2000);
	saveContac.click();
}
}
