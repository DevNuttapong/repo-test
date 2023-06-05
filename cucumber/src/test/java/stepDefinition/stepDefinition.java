package stepDefinition;




import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;


public class stepDefinition {

    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        // throw new PendingException();
        //code to navigated to login url
        System.out.println("navigated to login url");
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
        // throw new PendingException();
        //code login
        System.out.println("login successfully");
    }
    

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        // throw new PendingException();
        //hame page validation
        System.out.println("Validated home page");
    }

    @When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        System.out.println(strArg1 + ": " + strArg2);
    }

    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg1) throws Throwable {
        System.out.println(strArg1);
    }

    
    @When("User sign up with following details")
    public void User_sign_up_with_following_details(DataTable data) throws Throwable
    {
        List<List<String>> obj = data.asLists();
        System.out.println(obj.get(0).get(0));
        System.out.println(obj.get(0).get(1)); 
        System.out.println(obj.get(0).get(2)); 
        System.out.println(obj.get(0).get(3)); 
        System.out.println(obj.get(0).get(4)); 
    }

    @When("^User login in to application with (.+) and password (.+)$")
    public void User_login_into_application_with_and_password(String username, String password) throws Throwable
    {
        System.out.println(username);
        System.out.println(password);
    }
    
    

}
