package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import screens.DuckGoScreens;


public class DuckGoStepdefs {

    DuckGoScreens duckGoScreens;
    public DuckGoStepdefs(){
        duckGoScreens=new DuckGoScreens();
    }


    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {
        duckGoScreens.navigateToDuckGoApplication();

    }

    @When("I look at the page")
    public void iLookAtThePage() {
        duckGoScreens.lookAtDuckGoApplication();
    }

    @Then("I expect to see the duckduckgo logo on the page")
    public void iExpectToSeeTheDuckduckgoLogoOnThePage() {
        duckGoScreens.verifyDuckGoLogoinHomePage();

    }

    @When("I type {string} into the search box")
    public void iTypeIntoTheSearchBox(String arg0) {
    }

    @Then("I expect to see exactly {int} suggestions in the typeahead dropdown")
    public void iExpectToSeeExactlySuggestionsInTheTypeaheadDropdown(int arg0) {
    }

    @Then("I expect the first result to be {string}")
    public void iExpectTheFirstResultToBe(String arg0) {
    }

    @When("I click on the hamburger menu in the top right")
    public void iClickOnTheHamburgerMenuInTheTopRight() {

    }

    @Then("I expect to see a themes link")
    public void iExpectToSeeAThemesLink() {
    }

    @When("I go to the homepage and type <see-below-test-data-table> Then click the magnifying glass")
    public void iGoToTheHomepageAndTypeSeeBelowTestDataTableThenClickTheMagnifyingGlass() {
    }

    @When("I click on the themes link then click on the dark mode theme button")
    public void iClickOnTheThemesLinkThenClickOnTheDarkModeThemeButton() {

    }

    @Then("My page background should change colour")
    public void myPageBackgroundShouldChangeColour() {
    }

    @Then("I should get {int} results on the results page")
    public void iShouldGetResultsOnTheResultsPage(int arg0) {
    }

    @Given("I am on the traffic page")
    public void iAmOnTheTrafficPage() {
    }

    @When("I click on the {int} Traffic section")
    public void iClickOnTheTrafficSection(int arg0) {
    }

    @Then("I should see all the months listed in the order from Dec to Jan")
    public void iShouldSeeAllTheMonthsListedInTheOrderFromDecToJan() {
    }

    @And("the Total Direct Queries should be equal to the sum of all the total directs from each month")
    public void theTotalDirectQueriesShouldBeEqualToTheSumOfAllTheTotalDirectsFromEachMonth() {
    }
}
