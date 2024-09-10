package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.Pages.Dashboard;
import starter.Pages.HomePage;

public class LoginToApplication {

    @Steps
    HomePage home;

    @Steps
    Dashboard dash;

    @Given("user is on home page")
    public void user_is_on_home_page() {

        home.OpenApplication();
    }

    @When("user enter admin as username")
    public void user_enter_admin_as_username() {

        home.enterUsername();
    }

    @When("user enter admin123 as password")
    public void user_enter_admin123_as_password() {
     home.enterPassword();
     home.clickOnLoginButton();
    }

    @Then("user should be able to Login")
    public void user_should_be_able_to_login() {

        home.SwitchToZTNAPage();
    }

    @Given("user is on ExtremeCloud Universal ZTNA page")
    public void user_is_on_x_cloud_page() {
        dash.verifyAdmin();
    }

    @When("user click on IAM button")
    public void user_click_on_iam() {
        dash.clickonIAM();
    }

    @When("user click on UserGroup button")
    public void user_click_on_user_group() {
        dash.clickonUsergroup();
    }

    @When("user click on Create User Group button")
    public void create_user_group() {
        dash.CreateUserGroup();

    }


    @When("user enter Group name")
    public void user_enter_group_name() {
        dash.InsertGroupDetail();
    }

    @Then("user click on create to Add group to List.")
    public void add_group_to_list() {
        dash.create();
    }

}
