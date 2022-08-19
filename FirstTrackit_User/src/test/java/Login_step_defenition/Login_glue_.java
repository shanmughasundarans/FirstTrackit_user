package Login_step_defenition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_glue_ {


@Given("User Get landed on to login page")
public void user_get_landed_on_to_login_page() {
    System.out.println("1");
}

@And("Enter valid username and Password")
public void enter_valid_username_and_password() {
	System.out.println("2");
}

@When("Perform a  single click on the login button")
public void perform_a_single_click_on_the_login_button() {
	System.out.println("3");
}

@Then("Make sure user is  landed on to Home page")
public void make_sure_user_is_landed_on_to_home_page() {
	System.out.println("4");
}
}
