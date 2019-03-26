package com.stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Pageobjectscucumber.pom_login;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefination extends pom_login  {
	
	
	
	public static WebDriver driver;
	
	public Stepdefination()
	{
		super(driver);
		PageFactory.initElements(driver, pom_login.class);
	}
	
	pom_login loginp = PageFactory.initElements(driver, pom_login.class);
	
	@Given("^hit the imageneCsi url$")
	public void hit_the_imageneCsi_url() throws Throwable {
		
		driver.get("https://ramdv3.migrams.my/mipss-ra-bgd-web/login");
	    
	}
	
	@When("^enter the invalid \"(.*?)\" and \"(.*?)\" in the text box$")
	public void enter_the_invalid_and_in_the_text_box(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^user should be logged into the application successfully$")
	public void user_should_be_logged_into_the_application_successfully() throws Throwable {
	    
	}

	@When("^enter the invalid username and password in the text box$")
	public void enter_the_invalid_username_and_password_in_the_text_box() throws Throwable {
	   
	}

	@Then("^error message should be displayed$")
	public void error_message_should_be_displayed() throws Throwable {
	   
	}
	
	
	
	
	
	

}
