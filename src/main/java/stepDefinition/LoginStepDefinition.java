package stepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.configuration.JavaScriptConfiguration;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {

	WebDriver driver;
	@Given("^User is present login page$")
	public void user_in_LoginPage()
	{
		System.setProperty("webdriver.chrome.driver", "H:\\Project\\LatestJars\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	@When("^Title of login page is CRM$")
	public void title_login_page()
	{
		String title=driver.getTitle();
		Assert.assertEquals(title, "Facebook – log in or sign up");
	}

	@Then("^User enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String userName,String password) {
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("pass")).sendKeys(password);
		
	}
	
	@Then("^User clicks on login button$")
	public void user_clicks_on_login_button() {
		WebElement ele=driver.findElement(By.xpath("//*[@value='Log In']"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele);
		
	}
	
	@Then("^User is on Home page$")
	public void user_is_on_Home_page()  {
		int checkPage=driver.findElements(By.id("email")).size();
		Assert.assertTrue(!(checkPage>0));
		Assert.assertTrue((checkPage>0));
	}
	
	@Then("^User enters firstname and lastname on login button with data tables$")
	public void user_enters_fname_lname(DataTable name)
	{
		List<List<String>> nameData = name.raw();
		System.out.println("DataTables are Fname: "+nameData.get(0).get(0));
		System.out.println("DataTables are Lname: "+nameData.get(0).get(1));
	}
	
	@Then("^User enters firstname and lastname on login button using maps$")
	public void user_enters_fname_lname_MAPS(DataTable name)
	{
		for(Map<String,String> nameData : name.asMaps(String.class, String.class))
		{
		System.out.println("DataTables with MAPS are Fname: "+nameData.get("fname"));
		System.out.println("DataTables with MAPS are Lname: "+nameData.get("lname"));
		}
		}
}
