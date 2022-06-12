package stepDef;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AllSteps 
{
	WebDriver driver;

	@Given("^User able to open any browser$")
	public void user_able_to_open_any_browser() throws Throwable {
		System.out.println("Inside Step- user is on the Browser homepage");
		//System.setProperty("webdriver.chrome.driver", "C://Users/imama/eclipse-workspace 1/CucumberBDDTesting/Driver/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("http://google.com/");
		driver.manage().window().maximize();
	}

	@And("^User able to enter the URL$")
	public void user_able_to_enter_the_URL() throws Throwable {
		System.out.println("Inside Step- user enter the desired URL address");
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
	}

	@When("^User able click on Signin Button$")
	public void user_able_click_on_Signin_Button() throws Throwable {
		System.out.println("Inside Step- click on the SignIn button");
		driver.findElement(By.id("btnLogin")).click();
	}

	@When("^User able to enter the Username$")
	public void user_able_to_enter_the_Username() throws Throwable {
		System.out.println("Inside Step- user enters the Username in the editBox");

	}

	@And("^User able to enter the Password$")
	public void user_able_to_enter_the_Password() throws Throwable {
		System.out.println("Inside Step- user enters the Password in the editBox");

	}

	@And("^User able to click on the submit Button$")
	public void user_able_to_click_on_the_submit_Button() throws Throwable {
		System.out.println("Inside Step- clicks on the Submit Button");

	}

	@Then("^User able to login Successfully$")
	public void user_able_to_login_Successfully() throws Throwable {
		System.out.println("Inside Step- user user navigated to the desired homepage");

	}

	@And("^User able see his/her Name in the home page$")
	public void user_able_see_his_her_Name_in_the_home_page() throws Throwable {
		System.out.println("Inside Step- user see his/her name in the home-account page");

	}





}
