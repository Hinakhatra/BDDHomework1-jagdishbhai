package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefinitions {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    LoginPage loginPage = new LoginPage();
    ProductPage productPage = new ProductPage();
    EmailAFriendPage emailAFriendPage = new EmailAFriendPage();
    EmailAFriendResultPage emailAFriendResultPage = new EmailAFriendResultPage();

    @Given("I am on registration page")
    public void i_am_on_registration_page() {
        homePage.clickOnRegisterButton();

    }

    @When("I enter required registration details")
    public void i_enter_required_registration_details() {

        registerPage.enterRegistrationDetails();

    }

    @Then("I should able to register successfully")
    public void i_should_able_to_register_successfully() {
        registerResultPage.VerifyUserRegisterSuccessfully();

    }
    @When("Click on log in button and fill required details")
    public void click_on_log_in_button_and_fill_required_details() {
        loginPage.enterLoginDetails();
    }
    @When("Click on selected product")
    public void click_on_selected_product() {
        productPage.VerifyUserSelectProductSuccessful();
    }
    @When("Click on email a friend button")
    public void click_on_email_a_friend_button() {
        emailAFriendPage.enterSendFriendMailDetails();
    }
    @Then("I should be able to refer a product by email a friend")
    public void i_should_be_able_to_refer_a_product_by_email_a_friend() {
       emailAFriendResultPage.VerifyUserSendEmailFriendsSuccessfully();
    }


    @When("I enter required registration New details")
    public void iEnterRequiredRegistrationNewDetails() {
        registerPage.enterRegistrationNewDetails();
    }
}
