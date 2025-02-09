package com.example.car;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.services.CarService;
import org.junit.Assert;

public class CarSteps {
    private final CarService carService = new CarService();
    private String message;
    private String make;
    private String model;
    private String year;
    private String horsePower;
    private String engineType;

    @Given("User enters the add car page")
    public void userEntersTheAddCarPage() {

    }

    @When("User enters make {string}")
    public void userEntersMake(String make) {
        this.make = make;
    }

    @When("User enters model {string}")
    public void userEntersModel(String model) {
        this.model = model;
    }

    @When("User enters horse power {string}")
    public void userEntersHorsePower(String horsePower) {
        this.horsePower = horsePower;
    }

    @When("User enters year {string}")
    public void userEntersYear(String year) {
        this.year = year;
    }

    @When("User enters engine type {string}")
    public void userEntersEngineType(String engineType) {
        this.engineType = engineType;
    }

    @And("User clicks add car button")
    public void userClicksAddCarButton() {
        this.message = this.carService.addCar(this.make, this.model, this.horsePower, this.engineType, this.year);
    }

    @Then("User is presented with message {string}")
    public void userIsPresentedWithMessage(String message) {
        Assert.assertEquals(message, this.message);
    }
}
