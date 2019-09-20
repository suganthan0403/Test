package seleni;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class stepdef {
	
	WebDriver driver;
	
	@Given("I want to Open Browser")
	public void i_want_to_Open_Browser() {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\a08019dirp_c2x.08.05\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   driver = new ChromeDriver();
	}

	@When("I launch the URL")
	public void i_launch_the_URL() {
		driver.get("https://www.google.com");
	}
	   

	@Then("application gets opened")
	public void application_gets_opened() {
		assertEquals("Googlefgg", driver.getTitle());
	}



}
