package step_definition112;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_steps112 {
	WebDriver driver;
	
	@Given("User is on Home Page")
	public void user_is_on_Home_Page() {
		System.setProperty("webdriver.chrome.driver", "C:\\New Folder\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:8083/TestMeApp/");
		driver.manage().window().maximize();
	}

	@When("User Navigate to LogIn Page")
	public void user_Navigate_to_LogIn_Page() {
		driver.findElement(By.linkText("SignIn")).click();
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		driver.findElement(By.id("userName")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.name("Login")).click();
		
	  
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_Login_Successfully() {
		Assert.assertTrue( driver.findElement(By.linkText("SignOut")).isDisplayed());
	   
	}


}
