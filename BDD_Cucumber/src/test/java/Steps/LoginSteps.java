package Steps;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
//	@Given("user is launching the facebook application in browser.")
//	public void user_is_launching_the_facebook_application_in_browser() {
//	    // Write code here that turns the phrase above into concrete actions
//	    System.out.println("user is launching the facebook application in browser.");
//	}
//	@When("user clicks on signup button")
//	public void user_clicks_on_signup_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	   System.out.println("user clicks on signup button");
//	}
//	@When("user enters valid personal details as firstname {string} and lastname {string}")
//	public void user_enters_valid_personal_details_as_firstname_and_lastname(String firstname, String lastname) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@When("user enters valid email_id {string} and phone_no {string}")
//	public void user_enters_valid_email_id_and_phone_no(String email_id, String phone_no) {
//	   System.out.println("user enters the"+email_id+"and phone_no" +phone_no);
//	}
//	@When("user sets the valid password {string}")
//	public void user_sets_the_valid_password(String password) {
//		 System.out.println("user sets the valid"+password);
//	}
//	@When("User needs to provide username {string} and password {string }")
//	public void user_needs_to_provide_username_and_password(String username,String password ) {
//	    // Write code here that turns the phrase above into concrete actions
//	    System.out.println("User provided"+ username+ "and"+ password);
//	}
//	@When("user clicked on login button.")
//	public void user_clicked_on_login_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	    System.out.println("user clicked on login button.");
//	}
//	@Then("user landed on homepage of facebook")
//	public void user_landed_on_homepage_of_facebook() {
//	    // Write code here that turns the phrase above into concrete actions
//	    System.out.println("user landed on homepage of facebook");
@Given("user is launching the facebook application in browser.")
public void user_is_launching_the_facebook_application_in_browser() {
    System.out.println("user_is_launching_the_facebook_application_in_browser");
}
@When("user clicks on signup button")
public void user_clicks_on_signup_button() {
   System.out.println("user clicks on signup button");
}
@When("user enters valid personal details as firstname {string} and lastname {string}")
public void user_enters_valid_personal_details_as_firstname_and_lastname(String firstname, String lastname) {
  System.out.println("user enters valid personal details as"+firstname+lastname);
}
@When("user enters valid email_id {string} and phone_no {string}")
public void user_enters_valid_email_id_and_phone_no(String email_id, String phone_no) {
   System.out.println("user enters valid"+email_id+phone_no);
}
@When("user sets the valid password {string}")
public void user_sets_the_valid_password(String password) {
   System.out.println("user sets the valid" +password);
}
@When("User needs to provide username (.+) and password (.+)$")
public void user_needs_to_provide_username_and_password(String username, String password) {
    System.out.println("user entered valid "+username+" "+password);
}
@When("user clicked on login button.")
public void user_clicked_on_login_button() {
    System.out.println("user clicks on signup button");
}
@Then("user landed on homepage of facebook")
public void user_landed_on_homepage_of_facebook() {
    System.out.println("user landed on homepage of facebook");
}

@Then(": Upon sucessful signup user is created.")
public void upon_sucessful_signup_user_is_created() {
   System.out.println("User is created.");
}

@Given("User is at signup page")
public void user_is_at_signup_page() {
    System.out.println("User is at signup page");
}
@When("User enters the necessary details for creating an account")
public void user_enters_the_necessary_details_for_creating_an_account(List<String> Data) {
   System.out.println(Data.get(0));
   System.out.println(Data.get(1));
   System.out.println(Data.get(2));
   System.out.println(Data.get(3));
    
   
}
@Then("User clicks on the Signup Button")
public void user_clicks_on_the_signup_button() {
  System.out.println("User clicks on the Signup Button");
}
@Then("Upon successful signup, the user is created")
public void upon_successful_signup_the_user_is_created() {
  System.out.println("Upon successful signup, the user is created");
}

@Given("Setup database entries.")
public void setup_database_entries() {
   System.out.println("Setup database entries.");
}
@When("Launch the browser by using config file.")
public void launch_the_browser_by_using_config_file() {
   System.out.println("\"Launch the browser by using config file.\"");
}

@When("hit the browser")
public void hit_the_browser() {
    System.out.println("hit the browser");
}

}
//
//}


