package Package2;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class step {

	

@Given("Enter {string} and {string}")
public void credentials(String x,String y) {
   System.out.println(x+""+y);
}

@And("Enter password in the password field")
public void enter_password_in_the_password_field() {
	 System.out.println("password is entered");
}

@When("Click on login button")
public void click_on_login_button() {
	 System.out.println("Login button is clicked");
}

@Then("Home Page is displayed")
public void home_Page_is_displayed() {
	 System.out.println("Home Page is displayed");
}

@Given("Enter user details")
public void enter_user_details() {
	System.out.println("user details entered");
}

@When("Click on login{int} button")
public void click_on_login_button(Integer int1) {
	System.out.println(int1 + "Login1 button clicked");
}


@Given("Enter {string} in the username field")
public void enter_in_the_username_field(String string) {
  System.out.println(string);
 
}

@Given("Enter the {string} in the pwd  field")
public void enter_the_in_the_pwd_field(String string) {
	  System.out.println(string);
}


}
