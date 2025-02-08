package com.example.login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.services.LoginService;
import org.junit.Assert;

public class LoginSteps {
    private String username;
    private String password;
    private String message;
    private final LoginService loginService = new LoginService();

    @Given("User enters the login screen")
    public void userEntersTheLoginScreen() {

    }
    @When("enters username {string}")
    public void userEntersUsername(String username) {
        this.username = username;
    }
    @When("enters password {string}")
    public void userEntersPassword(String password) {
        this.password = password;
    }
    @When("clicks the login button")
    public void userClicksTheLoginButton() {
        this.message = this.loginService.login(this.username, this.password);
    }
    @Then("sees message {string}")
    public void userIsPresentedWithMessage(String message) {
        Assert.assertEquals(message, this.message);
    }
}
