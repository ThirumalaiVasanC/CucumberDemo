package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HooksStepDefenition {
	
	@Before(order=1)
	public void launchBrowser()
	{
		System.out.println("Browser launched successfully");
	}
	
	@Before(order=0)
	public void clearcookies()
	{
		System.out.println("Before clearcookies launched successfully");
	}
	
	@After(order=0)
	public void closeBrowser()
	{
		System.out.println("closeBrowser launched successfully");
	}
	
	@After(order=1)
	public void Clearcookies()
	{
		System.out.println("After Clearcookies launched successfully");
	}
	
	@Before("@facebook")
	public void fbBefore()
	{
		System.out.println("log out existing fb account");
	}
	
	@Given("^successfully logged Facebook$")
	public void successfully_logged_Facebook() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Successfully logged in fb");
	}

	@Then("^add a new friend$")
	public void add_a_new_friend() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Successfully added a new fb friend");
	}

	@Given("^successfully logged email$")
	public void successfully_logged_email() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Email logged in successfully");
	}

	@Then("^send a mail$")
	public void send_a_mail() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Mail send successfully");
	}
}
