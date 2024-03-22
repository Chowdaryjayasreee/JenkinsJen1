package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.*;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HottelAppLoginTest {
	
	String ExpectedText="Hello vasuvespag";
	WebDriver driver;

	@Given("I am on hotelapp page")
	
	
	public void i_am_on_hotelapp_page() {
	   	
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		 
	}

	@When("user enters the username as {string}")
	public void user_enters_the_username_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
		driver.findElement(By.id("username")).sendKeys(string);
	    
	}

	@When("user enters the password as {string}")
	public void user_enters_the_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("password")).sendKeys(string);
	}

	@When("user clicks on the Login buttom")
	public void user_clicks_on_the_login_buttom() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("login")).click();
	}

	@Then("user gets login successful message")
	public void user_gets_login_successful_message() {
	    
		String Greeting = driver.findElement(By.id("username_show")).getAttribute("value");
		//Assert.assertTrue(Greeting.equalsIgnoreCase(ExpectedText));
		//Assert.assertTrue(Greeting.equalsIgnoreCase(ExpectedText));
		
	  	  }
	}




