package com.cucumberpom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumberpom.base.BaseTest;

public class HomePage extends BaseTest {



	//@FindBy(xpath = "//*[@id=\\\"main-nav\\\"]/div[3]/button/i")
	//WebElement newContacts;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public ContactsPage gotoContacts() throws InterruptedException {
		Thread.sleep(5000);
		
    	Actions builder = new Actions(driver);
    	builder.moveToElement(driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[3]/a"))).build().perform();
		return new ContactsPage();
	}
	
	public ContactsPage AddContacts() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[3]/button/i")).click(); 
		//newContacts.click();
		return new ContactsPage();
	}

}
