package com.example.register;

import com.example.UserDetails;
import io.cucumber.java.en.And;
import org.example.services.RegisterService;

public class RegisterSteps {
    private final RegisterService registerService = new RegisterService();
    private final UserDetails userDetails;

    public RegisterSteps(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    @And("User enters confirmPassword {string}")
    public void userEntersConfirmPassword(String confirmPassword) {
        this.userDetails.setConfirmPassword(confirmPassword);
    }

    @And("User enters name {string}")
    public void userEntersName(String name) {
        this.userDetails.setName(name);
    }

    @And("User enters email {string}")
    public void userEntersEmail(String email) {
        this.userDetails.setEmail(email);
    }

    @And("User clicks the register button")
    public void userClicksTheRegisterButton() {
        this.userDetails.setMessage(this.registerService.register(this.userDetails.getUsername(), this.userDetails.getPassword(), this.userDetails.getConfirmPassword(), this.userDetails.getName(), this.userDetails.getEmail()));
    }
}
