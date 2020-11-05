package starter.stepdefinitions;

import io.cucumber.java.en.*;
import net.thucydides.core.annotations.*;
import pages.*;
import starter.navigation.*;
import starter.search.*;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static org.assertj.core.api.Assertions.*;
import static starter.matchers.TextMatcher.*;

public class LoginPageStepDefinitions {

    LoginPage loginPage;
    AccountSummaryPage accpage;
    CreditCardsPaymentsPage ccpage;

    @Steps
    NavigateTo navigateTo;

    @Steps
    SearchFor searchFor;

    @Steps
    SearchResult searchResult;

    @Given("^navigate to CNO Login page")
    public void i_am_on_the_CNB_login_page() {
        if(getDriver().getWindowHandles().size()==0){
            navigateTo.theCnoLoginPage();
        }
        else{
            getDriver().get("https://your_url");
        }
    }

    @When("^s?he (?:searches|has searched) for \"(.*)\"")
    public void i_search_for(String term) {
        searchFor.term(term);
    }


    @When("^s?he (?:searches|has searched) again for \"(.*)\"")
    public void i_search_again_for(String term) {
        searchFor.termOnSearchResultsPage(term);
    }

    @Then("title should contain: \"(.*)\"")
    public void title_should_contain_the_word(String expectedTerm) {
        searchResult.pagetitle();
        assertThat(searchResult.titles())
                .allMatch(title -> textOf(title).containsIgnoringCase(expectedTerm));
        searchResult.switchBrowserClose();
    }

//    @Then("Title should contain the word {string}")
//    public void title_should_contain_the_word(String expectedTerm) {
//        assertThat(searchResult.pagetitle())
//                .containsIgnoringCase(expectedTerm);
//    }

    @Then("^User can see business Continuity Notification")
    public void user_can_see_business_Continuity_Notification() {
        loginPage.businessContinuityNotification.isDisplayed();
    }

    @When("user navigate to payment page")
    public void userNavigateToPaymentPage() throws Exception{
        if(accpage.payNow1.isEnabled()){ accpage.clickPayNow1Button();}
        if(accpage.payNow2.isEnabled()){ accpage.clickPayNow2Button();}
        loginPage.waitForTitleToAppear("City National Bank - Credit Card Payments");
        loginPage.waitForAngularRequestsToFinish();
    }

    @And("user able to scheduled a payment")
    public void userAbleToScheduledAPayment() throws Exception{
        if(accpage.payNow1.isEnabled()){ accpage.clickPayNow1Button();}
        if(accpage.payNow2.isEnabled()){ accpage.clickPayNow2Button();}
        loginPage.waitForAngularRequestsToFinish();
        loginPage.waitForTitleToAppear("City National Bank - Credit Card Payments");
        ccpage.clickPayFrom();
        ccpage.clickPayFromCard(2);
        ccpage.clickCurrentBalanceRadioButton();
        ccpage.setPaymentDateTextField(ccpage.getNextDayDate(6));
        ccpage.clickMakePaymentButton();
        ccpage.clickApproveButton();
        ccpage.waitFor(ccpage.makeAnotherPayment).isDisplayed();
        ccpage.waitFor(ccpage.returnToAccountSummary).isDisplayed();
    }

    @Then("user navigate to Alerts page and select \"(.*)\" account")
    public void userNavigatetoAlertsPage(int account) throws Exception{
        ccpage.clickSelectAccount();
        ccpage.selectCard(account);
        loginPage.waitForTitleToAppear("City National Bank - Manage Credit Card Alerts");
////input[@type='checkbox']
        Thread.sleep(10000000);
    }

    @And("user able to update a payment")
    public void userAbleToUpdateAPayment() throws Exception {
        userNavigateToScheduledAPayment();
        if(!ccpage.edit.isDisplayed()&&ccpage.inprocess.isDisplayed()){}
        else{
            ccpage.clickEditViewScheduledPayments();
            ccpage.setAmountTextField("1");
            ccpage.clickSaveChangesButton();
            ccpage.clickApproveButton();
            ccpage.clickCancelViewScheduledPayments();
            ccpage.clickYesBtb();
        }
    }

    @Then("user verify the scheduled a payment was updated")
    public void userVerifyTheScheduledAPaymentWasUpdated() {
    }

    @Then("user navigate to View Scheduled Payment")
    public void userNavigateToScheduledAPayment() throws Exception{
        if(accpage.payNow1.isEnabled()){ accpage.clickPayNow1Button();}
        if(accpage.payNow2.isEnabled()){ accpage.clickPayNow2Button();}
        loginPage.waitForAngularRequestsToFinish();
        loginPage.waitForTitleToAppear("City National Bank - Credit Card Payments");
        ccpage.clickViewScheduledPayments();
    }

    @And("user able to cancel a payment")
    public void userAbleToCancelAPayment() throws Exception{
        userNavigateToScheduledAPayment();
        if(!ccpage.cancelBtn.isDisplayed()&&ccpage.inprocess.isDisplayed()){}
        else{
            ccpage.clickCancelViewScheduledPayments();
            ccpage.clickYesBtb();
        }
    }

    @Then("user verify the scheduled a payment was cancelled")
    public void userVerifyTheScheduledAPaymentWasCancelled() {
    }
}
