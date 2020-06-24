package CCHotel;

import CCHotel.pages.BasePage;
import CCHotel.pages.LoginPage;
import CCHotel.pages.MainPage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MainPageDefinitions {
    private final LoginPage loginPage = new LoginPage();
    private final MainPage mainPage = new MainPage();
    private BasePage basePage;

    @Given("I am logged into the app")
    public void i_am_logged_into_the_app() {
        loginPage.login();
    }


    @When("I click on {string} button on the main page")
    public void iClickOnButtonOnTheMainPage(String categoryName) {
        mainPage.clickCategory(categoryName);
    }

    @Then("I should see the {string} card")
    public void iShouldSeeThe(String name) {
        Assert.assertEquals(name, mainPage.getCardTitle());
    }

    @When("I am at the login page and I enter my valid credentials to log in")
    public void iAmAtTheLoginPageAndIEnterMyValidCredentialsToLogIn() {
        loginPage.login();
    }

    @Then("I should arrive at the main page, where my username is on the navbar")
    public void iShouldArriveAtTheMainPageWhereMyUsernameIsOnTheNavbar() {
        Assert.assertEquals("ADMIN", mainPage.getMyName());
    }

    @After()
    public void close(){
        basePage.closeDriver();
    }
}
