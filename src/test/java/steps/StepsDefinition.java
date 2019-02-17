package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LetterPage;
import pages.MailPage;
import pages.MainPage;

public class StepsDefinition {

    private MainPage mainPage = new MainPage();
    private MailPage mailPage = new MailPage();
    private LetterPage letterPage = new LetterPage();
    private final static String VALID_USERNAME = "testmail170219";
    private final static String VALID_PASSWORD = "12345qQ";

    @Given("^site mail.ru is open$")
    public void openMailRu() {
        mainPage.open();
    }

    @When("^User logging in with correct username and password$")
    public void userLoggingInWithCorrectUsernameAndPassword() {
        mainPage.login(VALID_USERNAME, VALID_PASSWORD);
    }

    @Then("^main mail page opens$")
    public void mainMailPageOpens() {
        mailPage.checkOpenMailPage();
    }

    @When("User opens received letter")
    public void userOpensReceivedLetter() {
        mailPage.openLetter();
    }

    @Then("he sees the contents of the letter")
    public void heSeesTheContentsOfTheLetter() {
        letterPage.readLetter();
    }
}

