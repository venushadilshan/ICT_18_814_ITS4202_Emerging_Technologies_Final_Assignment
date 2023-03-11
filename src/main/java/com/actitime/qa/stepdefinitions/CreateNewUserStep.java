package com.actitime.qa.stepdefinitions;

import com.actitime.qa.base.TestBase;
import com.actitime.qa.entities.UserData;
import com.actitime.qa.pages.HomePage;
import com.actitime.qa.pages.UsersPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateNewUserStep extends TestBase {
    UsersPage usersPage;
    HomePage homePage;



    @Given("^User in the Actitime home page$")
    public void user_in_the_Actitime_Users_Page() throws Throwable {
       initialization();
    }

    @When("^User click on users tab$")
    public void User_click_on_users_tab() throws Throwable {
        homePage.clickOnUsersLink();
    }

    @Then("^user click on new user button$")
    public void user_click_on_new_user_button() throws Throwable {

        usersPage.clickOnNewUserButton();
    }

    @Then("^user fill in user data$")
    public void user_fill_in_user_data(UserData userData) throws Throwable {
        usersPage.fillUserData(userData);
    }

    @Then("^user click on submit$")
    public void user_click_on_submit() throws Throwable {
        usersPage.clickSubmitButton();
    }

    //close the model once user is added
    @Then("^user should be added successfully$")
    public void user_should_be_added_successfully() throws Throwable {
        usersPage.closeModal();
        driver.quit();
    }








}
