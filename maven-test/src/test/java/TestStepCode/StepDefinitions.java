package TestStepCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	
	WebDriver driver;
	
	@Given("^URL and Valid Credentials$")
	public void URL_and_Valid_Credentials() throws Throwable {
	System. setProperty("webdriver.chrome.driver", "F:\\reading material\\Selenium\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.get("https://www.olx.in");
	  
	}
	
	@When("^I enter the given credntials \"([^\"]*)\" and \"([^\"]*)\"$")
	public void I_enter_the_given_credntials_and(String uname, String pass) throws Throwable {
		System.out.println("Hi, I am in");
		driver.findElement(By.xpath("//*[@id='topLoginLink']/span[2]/strong")).click();
		//WebDriverWait wait =new WebDriverWait(driver,0);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='userEmail']")));

		driver.findElement(By.xpath("//*[@id='userEmail']")).sendKeys(uname);
		driver.findElement(By.xpath("//*[@id='userPass']")).sendKeys(pass);
		
	}

	@When("^Click on login button$")
	public void Click_on_login_button() throws Throwable {
		driver.findElement(By.xpath("//*[@id='se_userLogin']")).click();
	}

	@Then("^I should be navigated to homepage$")
	public void I_should_be_navigated_to_homepage() throws Throwable {
	  String a= driver.getTitle() ;
	  System.out.println(a);
	  driver.quit();
	}
}
