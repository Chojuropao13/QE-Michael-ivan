package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Failedlogin {
    @And("user input cresendital data")
    public void userInputCresenditalData() {
        System.out.println("use credible data");
    }

    @Then("user see the eror")
    public void userSeeTheEror() {
        System.out.println("sorry stay here, please try again");
    }
}
