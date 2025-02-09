package com.example.ad;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.services.AdService;
import org.junit.Assert;

public class AdSteps {
    private final AdService adService = new AdService();

    private String carId;
    private String userId;
    private String message;
    private String title;
    private String price;
    private String description;

    @Given("User enters the add advert page")
    public void userEntersTheAddAdvertScreen() {
        this.userId = "0"; // Pretend we are getting the current logged-in user
    }

    @When("User enters title {string}")
    public void userEntersTitle(String title) {
        this.title = title;
    }

    @And("User enters description {string}")
    public void userEntersDescription(String description) {
        this.description = description;
    }

    @And("User selects car {string}")
    public void userSelectsCar(String carId) {
        this.carId = carId;
    }

    @And("User enters price {string}")
    public void userEntersPrice(String price) {
        this.price = price;
    }

    @And("User clicks add advert button")
    public void userClicksAddAdvertButton() {
        this.message = this.adService.add(this.userId, this.carId, this.title, this.description, this.price);
    }

    @Then("User should see message {string}")
    public void userShouldSeeMessage(String message) {
        Assert.assertEquals(message, this.message);
    }
}
