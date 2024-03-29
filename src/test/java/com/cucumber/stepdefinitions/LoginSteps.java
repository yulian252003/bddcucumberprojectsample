package com.cucumber.stepdefinitions;

//import java.sql.Driver;

import com.cucumberpom.base.BaseTest;
import com.cucumberpom.pages.HomePage;
import com.cucumberpom.pages.LoginPage;
import org.junit.Assert;
//import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.*;
import io.cucumber.java.en.*;

public class LoginSteps extends BaseTest
{
	@Before
	public void openBrowser()
	{
		BaseTest.initBrowser();
	}
	
	@After
	public void tearDown()
	{
		driver.close();
		
	}
	
	LoginPage loginPage;
	HomePage homePage;
	Hooks hook;
	
	@Given("^User is on Application Landing Page$")
	public void user_is_on_Application_Landing_Page() 	
	{
		String url = prop.getProperty("applicationUrl");
		driver.get(url);
		loginPage = new LoginPage();
		
	}
	

    
	@Then("^Verify user is on Application Landing Page$")
    public void verify_user_is_on_Application_Landing_Page()
    {
    	String actualTittle = loginPage.getTitle();
    	String expectedTitle = "Free CRM Software for every business";
    	Assert.assertEquals(expectedTitle, actualTittle);
    	
    }
	
	  @Then("^User enters the Loggin Area$")
	    public void user_enters_the_Loggin_Area()
	    
	    {
	    	loginPage.enterAreaOfLogin();
	    }
	  
	  @Then("^Verify user is on the Loggin Area$")
	    public void Verify_user_is_on_the_Loggin_Area()
	    
	    {
		  String actualTittle = loginPage.getTitle();
	    	String expectedTitle = "Cogmento CRM";
	    	Assert.assertEquals(expectedTitle, actualTittle);
	    
	    }
    
    @Then("^Login FreeCRM Application$")
    public void login_FreeCRM_Application() throws InterruptedException 
    {
    	homePage = loginPage.doLogin();
    }
}
