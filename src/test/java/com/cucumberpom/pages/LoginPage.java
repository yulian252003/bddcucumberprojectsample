package com.cucumberpom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumberpom.base.BaseTest;

public class LoginPage extends BaseTest
{
	@FindBy(css = ".btn.btn-primary.btn-xs-2.btn-shadow.btn-rect.btn-icon.btn-icon-left")
	WebElement loginAreaBtn; // this button opens the login area.
	
	@FindBy(name = "email")
	WebElement userName;
	
	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath="//*[@id=\"ui\"]/div/div/form/div/div[3]")
	WebElement loginBtn;
	
	
	
	public void  enterAreaOfLogin()
	{
		loginAreaBtn.click();
		
	}
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public HomePage doLogin() throws InterruptedException
	{
		Thread.sleep(10000);
		userName.sendKeys(prop.getProperty("userName"));
		password.sendKeys(prop.getProperty("password"));
		loginBtn.click();
		return new HomePage();
		
	}
}
