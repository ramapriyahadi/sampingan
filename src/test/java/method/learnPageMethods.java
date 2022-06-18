package method;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import objectPage.learnPage;

public class learnPageMethods {


    private basePage basePage;

    public learnPageMethods(basePage basePage){
        this.basePage = basePage;
    }

    @Given("^Iam on learn page with title \"([^\"]*)\"$")
    public void iam_on_learn_page_with_title(String title) throws Throwable {
        learnPage.learnPageTitle(basePage.driver);
        
    }

    @Then("^I type on search input form \"([^\"]*)\"$")
    public void i_type_on_search_input_form(String searcKey) throws Throwable {
        learnPage.searchInputForm(basePage.driver).sendKeys(searcKey);
    }

    @And("^I click search$")
    public void i_click_search() throws Throwable {
        learnPage.searchButton(basePage.driver).click();
    }

    @And("^I can see result of the search$")
    public void i_can_see_result_of_the_search() throws Throwable {
        learnPage.postContainer(basePage.driver).isDisplayed();
    }
}


