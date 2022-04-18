package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

import java.util.List;

@RunWith(Cucumber.class)
public class StepDefinition {
    @Given("^Validate the browser$")
    public void validate_the_browser() {
        System.out.println("\nDeciding browser to open");
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() {
        System.out.println("Browser is triggered");
    }

    @Then("^Check if browser is started$")
    public void check_if_browser_is_started() {
        System.out.println("Browser is started");
    }

    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() {
        System.out.println();
        System.out.println("Navigated to Net banking landing page");
    }

    @When("User login into to application with {string} and password {string}")
    public void user_login_into_to_application_with_and_password(String userName, String passwd) {
        System.out.println("userName: " + userName + " passwd: " + passwd);
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() {
        System.out.println("Validated home page");
    }

    @And("Cards displayed are {string}")
    public void cards_displayed_are(String string) {
        System.out.println(string);
        ;
    }

    @When("User signup with following details")
    public void userSignupWithFollowingDetails(DataTable dataTable) {
        List<List<String>> obj = dataTable.asLists();
        System.out.print(obj.get(0).get(0) + ", ");
        System.out.print(obj.get(0).get(1) + ", ");
        System.out.print(obj.get(0).get(2) + ", ");
        System.out.print(obj.get(0).get(3) + ", ");
        System.out.println(obj.get(0).get(4) + " ");
    }

    @When("^User login in to to application with (.+) and password (.+)$")
    public void userLoginInToToApplicationWithUsernameAndPasswordPasswd(String username, String passwd) {
        System.out.println("\nParameterizing Test: ");
        System.out.println("username:" + username + " passwd:" + passwd);
    }
}
