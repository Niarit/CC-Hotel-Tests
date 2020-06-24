package CCHotel;

import CCHotel.pages.BasePage;
import CCHotel.pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReservationStepDefinitions {

    private final LoginPage loginPage = new LoginPage();
    private BasePage basePage;

    @Given("I am logged in")
    public void iAmLoggedIn() {
        loginPage.login();
    }

    @When("I try to reserve a room from {string} to {string}")
    public void iTryToReserveARoomFromTo(String start, String end) {
        throw  new PendingException();
    }

    @Then("I should see a screen pop-up with {string}")
    public void iShouldSeeAScreenPopUpWith(String message) {
        throw  new PendingException();
    }

    @After()
    public void close(){
        basePage.closeDriver();
    }
}
