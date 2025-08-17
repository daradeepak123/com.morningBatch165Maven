package stepDefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewClass {

    WebDriver driver;
    String testName;
    int testValue;
    String testStatus;

    @Given("I want to write a step with {string}")
    public void i_want_to_write_a_step_with(String name) {
        System.out.println("Given step with name: " + name);
    }

    @When("I check for the {int} in step")
    public void i_check_for_the_in_step(Integer value) {
        System.out.println("When step with value: " + value);
    }

    @Then("I verify the {string} in step")
    public void i_verify_the_in_step(String status) {
        System.out.println("Then step with status: " + status);
    }
}

