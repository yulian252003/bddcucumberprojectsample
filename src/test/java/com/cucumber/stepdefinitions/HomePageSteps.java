package com.cucumber.stepdefinitions;

import org.junit.Assert;

import com.cucumberpom.base.BaseTest;
import com.cucumberpom.pages.ContactsPage;
import com.cucumberpom.pages.HomePage;

import cucumber.api.java.en.Then;

public class HomePageSteps extends BaseTest
{
	HomePage homePage = new HomePage();
	ContactsPage contactPage;
	
	@Then("^Verify User is on Application Home$")
	public void verify_User_is_on_Application_Home() 
	{
		  String actualTittle = homePage.getTitle();
	    	String expectedTitle = "Cogmento CRM";
	    	Assert.assertEquals(expectedTitle, actualTittle);
	}
	
	@Then("^Open Contact Page$")
	public void open_Contact_Page() throws InterruptedException 
	{
		homePage.gotoContacts();
	}
	
	@Then("^Create New Contact clicking On Button Plus$")
	public void create_New_Contact_clicking_on_button_plus() throws InterruptedException 
	{
		homePage.AddContacts();
	}
	
	@Then("^Populate the New Contact Form$")
	public void populateTheNewContactForm() throws InterruptedException 
	{
		contactPage.saveContact();
	}
}
