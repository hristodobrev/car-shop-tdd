package com.example.login;

import com.example.UserDetails;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.services.LoginService;
import org.junit.Assert;

public class LoginSteps {
    private final UserDetails userDetails;
    private final LoginService loginService = new LoginService();

    public LoginSteps(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    @Given("User enters the login screen")
    public void userEntersTheLoginScreen() {

    }

    @When("User enters username {string}")
    public void userEntersUsername(String username) {
        this.userDetails.setUsername(username);
    }

    @When("User enters password {string}")
    public void userEntersPassword(String password) {
        this.userDetails.setPassword(password);
    }

    @When("User clicks the login button")
    public void userClicksTheLoginButton() {
        this.userDetails.setMessage(this.loginService.login(this.userDetails.getUsername(), this.userDetails.getPassword()));
    }

    @Then("User sees message {string}")
    public void userIsPresentedWithMessage(String message) {
        Assert.assertEquals(message, this.userDetails.getMessage());
    }
}
