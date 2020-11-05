package pages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.Map;

public class AccountSummaryPage extends PageObject {
    private Map<String, String> data;
//    public static WebDriver driver;
    private int timeout = 15;

    public Actor user(){
        Actor user = Actor.named("User");
        user.can(BrowseTheWeb.with(getDriver()));
    return user;
    }

    @FindBy(css = "#bs-example-navbar-collapse-1 ul:nth-of-type(1) li:nth-of-type(1) a")
    @CacheLookup
    public WebElement accountSummary;

    @FindBy(css = "#onlineCreditCard tbody:nth-of-type(14) tr td h5.additional-card-heading a:nth-of-type(2)")
    @CacheLookup
    public WebElement additionalCards1;

    @FindBy(css = "#onlineCreditCard tbody:nth-of-type(7) tr td h5.additional-card-heading a:nth-of-type(2)")
    @CacheLookup
    public WebElement additionalCards2;

    @FindBy(css = "a[href='https://your_url/credit-card/alert']")
    @CacheLookup
    public WebElement alerts;

    @FindBy(css = "#onlineCreditCard tbody:nth-of-type(13) tr td.pl-0.pr-0.account-info div.well.narrow-well div:nth-of-type(1) a")
    @CacheLookup
    public WebElement authorizedCardsAreLockedBelow;

    @FindBy(css = "#onlineCreditCard tbody:nth-of-type(6) tr td.pl-0.pr-0.account-info div.well.narrow-well div:nth-of-type(1) a")
    @CacheLookup
    public WebElement cardLocked1;

    @FindBy(css = "#collapseFamily tr td.pl-0.pr-0 div.well.narrow-well.narrow-add-card.border-bottom-mobile. div.row div:nth-of-type(1) a:nth-of-type(2)")
    @CacheLookup
    public WebElement cardLocked2;

    @FindBy(css = "a[href='https://your_url/?menu=OpenAccount']")
    @CacheLookup
    public WebElement checkingSavings;

    @FindBy(css = "#header div.aboveBlueBar.container div:nth-of-type(3) a")
    @CacheLookup
    public WebElement cls1Fill231f20;

    @FindBy(css = "a[href='https://www.your_url/index.asp']")
    @CacheLookup
    public WebElement cnbCom;

    @FindBy(css = "#bs-example-navbar-collapse-1 > ul.nav.navbar-nav.navbar-right > li:nth-child(1) > a > i")
    @CacheLookup
    public WebElement contactUs;

    @FindBy(css = "a[href='https://your_url/credit-card/payment']")
    @CacheLookup
    public WebElement creditCardPayments;

    @FindBy(css = "#bs-example-navbar-collapse-1 ul:nth-of-type(1) li:nth-of-type(2) ul.dropdown-menu li:nth-of-type(2) a")
    @CacheLookup
    public WebElement creditCards1;

    @FindBy(css = "a[href='https://your_urlcredit-card/']")
    @CacheLookup
    public WebElement creditCards2;

    @FindBy(id = "ccHeader")
    @CacheLookup
    public WebElement creditCards3;

    @FindBy(css = "a[href='https://your_url/InterestRate/GetInterestRates']")
    @CacheLookup
    public WebElement currentInterestRates;

    @FindBy(id = "creditcard-editor-target-4")
    @CacheLookup
    public WebElement dchannelsTestcardR;

    @FindBy(id = "deposit-editor-source-1")
    @CacheLookup
    public WebElement depositsInsuredToFdicLimits;

    @FindBy(id = "edit-deposit-editor-1")
    @CacheLookup
    public WebElement edit1;

    @FindBy(id = "edit-creditcard-editor-1")
    @CacheLookup
    public WebElement edit2;

    @FindBy(id = "edit-creditcard-editor-2")
    @CacheLookup
    public WebElement edit3;

    @FindBy(id = "edit-creditcard-editor-3")
    @CacheLookup
    public WebElement edit4;

    @FindBy(id = "creditcard-editor-target-3")
    @CacheLookup
    public WebElement edit5;

    @FindBy(id = "edit-creditcard-editor-4")
    @CacheLookup
    public WebElement edit6;

    @FindBy(id = "creditcard-editor-target-4")
    @CacheLookup
    public WebElement edit7;

    @FindBy(id = "QSIFeedbackButton-btn")
    @CacheLookup
    public WebElement feedback;

    @FindBy(css = "a[href='https://www.your_url/fraud/']")
    @CacheLookup
    public WebElement fraudPreventionCenter;

    @FindBy(id = "HouseholdedRewardsPoints")
    @CacheLookup
    public WebElement householdedRewardsPoints;

    @FindBy(css = "a[href='https://locations.your_url/search/']")
    @CacheLookup
    public WebElement locations;

    @FindBy(css = "a[href='https://your_url/credit-card/lockunlock']")
    @CacheLookup
    public WebElement lockAndUnlockCard;

    @FindBy(css = "a[href='https://your_url/?menu=Payment']")
    @CacheLookup
    public WebElement makePayments;

    @FindBy(id = "creditcard-editor-target-1")
    @CacheLookup
    public WebElement manage1;

    @FindBy(id = "creditcard-editor-target-2")
    @CacheLookup
    public WebElement manage2;

    @FindBy(id = "creditcard-editor-target-3")
    @CacheLookup
    public WebElement manage3;

    @FindBy(id = "creditcard-editor-target-4")
    @CacheLookup
    public WebElement manage4;

    @FindBy(css = "#bs-example-navbar-collapse-1 ul:nth-of-type(1) li:nth-of-type(2) a.dropdown-toggle")
    @CacheLookup
    public WebElement myAccounts;

    @FindBy(css = "a[href='https://your_urlmy-profile/?firsttimevisit=true']")
    @CacheLookup
    public WebElement myProfile;

    @FindBy(css = "a[href='https://newsroom.your_url/']")
    @CacheLookup
    public WebElement newsinsights;

    @FindBy(css = "a[href='https://your_url/']")
    @CacheLookup
    public WebElement onlineBanking1;

    @FindBy(id = "ccHeader")
    @CacheLookup
    public WebElement onlineBanking2;

    @FindBy(css = "#bs-example-navbar-collapse-1 ul:nth-of-type(1) li:nth-of-type(4) a.dropdown-toggle")
    @CacheLookup
    public WebElement openAnAccount;

    @FindBy(id = "label_modal_1")
    @CacheLookup
    public WebElement openPopup1;

    @FindBy(id = "label_modal_10")
    @CacheLookup
    public WebElement openPopup10;

    @FindBy(id = "label_modal_11")
    @CacheLookup
    public WebElement openPopup11;

    @FindBy(id = "label_modal_12")
    @CacheLookup
    public WebElement openPopup12;

    @FindBy(id = "label_modal_13")
    @CacheLookup
    public WebElement openPopup13;

    @FindBy(id = "label_modal_14")
    @CacheLookup
    public WebElement openPopup14;

    @FindBy(id = "label_modal_15")
    @CacheLookup
    public WebElement openPopup15;

    @FindBy(id = "label_modal_16")
    @CacheLookup
    public WebElement openPopup16;

    @FindBy(id = "label_modal_17")
    @CacheLookup
    public WebElement openPopup17;

    @FindBy(id = "label_modal_18")
    @CacheLookup
    public WebElement openPopup18;

    @FindBy(id = "label_modal_19")
    @CacheLookup
    public WebElement openPopup19;

    @FindBy(id = "label_modal_2")
    @CacheLookup
    public WebElement openPopup2;

    @FindBy(id = "label_modal_20")
    @CacheLookup
    public WebElement openPopup20;

    @FindBy(id = "label_modal_21")
    @CacheLookup
    public WebElement openPopup21;

    @FindBy(id = "label_modal_22")
    @CacheLookup
    public WebElement openPopup22;

    @FindBy(id = "label_modal_23")
    @CacheLookup
    public WebElement openPopup23;

    @FindBy(id = "label_modal_3")
    @CacheLookup
    public WebElement openPopup3;

    @FindBy(id = "label_modal_4")
    @CacheLookup
    public WebElement openPopup4;

    @FindBy(id = "label_modal_5")
    @CacheLookup
    public WebElement openPopup5;

    @FindBy(id = "label_modal_6")
    @CacheLookup
    public WebElement openPopup6;

    @FindBy(id = "label_modal_7")
    @CacheLookup
    public WebElement openPopup7;

    @FindBy(id = "label_modal_8")
    @CacheLookup
    public WebElement openPopup8;

    @FindBy(id = "label_modal_9")
    @CacheLookup
    public WebElement openPopup9;

    @FindBy(css = "a[href='https://your_urlpayment/wire/outgoing-wire-activities']")
    @CacheLookup
    public WebElement outgoingWireActivity;

    private final String pageLoadedText = "Amount Over Credit Access Line:";

    private final String pageUrl = "/spaces/";

    @FindBy(css = "a[href='https://your_url/credit-card/paperless']")
    @CacheLookup
    public WebElement paperlessEnrollment;

    @FindBy(css = "#onlineCreditCard tbody:nth-of-type(2) tr td.pl-0.pr-0.account-info div.well.narrow-well div:nth-of-type(5) div:nth-of-type(2) input.CNBLargeButton.pay-now[type='button']")
    @CacheLookup
    public WebElement payNow1;

    @FindBy(css = "#onlineCreditCard tbody:nth-of-type(4) tr td.pl-0.pr-0.account-info div.well.narrow-well div:nth-of-type(5) div:nth-of-type(2) div.autopayCont input.CNBLargeButton.pay-now[type='button']")
    @CacheLookup
    public WebElement payNow2;

    @FindBy(css = "#onlineCreditCard tbody:nth-of-type(6) tr td.pl-0.pr-0.account-info div.well.narrow-well div:nth-of-type(5) div:nth-of-type(2) input.CNBLargeButton.pay-now[type='button']")
    @CacheLookup
    public WebElement payNow3;

    @FindBy(css = "#onlineCreditCard tbody:nth-of-type(13) tr td.pl-0.pr-0.account-info div.well.narrow-well div:nth-of-type(5) div:nth-of-type(2) input.CNBLargeButton.pay-now[type='button']")
    @CacheLookup
    public WebElement payNow4;

    @FindBy(css = "#bs-example-navbar-collapse-1 ul:nth-of-type(1) li:nth-of-type(3) a.dropdown-toggle")
    @CacheLookup
    public WebElement paymentsTransfers;

    @FindBy(css = "a[href='../spaces/account/credit-card/transaction?tvv=pzfedRAm1Tm1MTvR0iHZJe+WEKlBfVjl&status=Pending']")
    @CacheLookup
    public WebElement pendingCharges1;

    @FindBy(css = "a[href='../spaces/account/credit-card/transaction?tvv=/YNidSQ+kb6tX3Fkf1S5hVYIAJDGguQ0&status=Pending']")
    @CacheLookup
    public WebElement pendingCharges2;

    @FindBy(css = "a[href='../spaces/account/credit-card/transaction?tvv=By5yaf9UAMkWrB9hYM7ydoWOKiwuHViN&status=Pending']")
    @CacheLookup
    public WebElement pendingCharges3;

    @FindBy(css = "a[href='../spaces/account/credit-card/transaction?tvv=YXYnnNBkqgHdm1jbjQjWiDJ23hpSNFt1&status=Pending']")
    @CacheLookup
    public WebElement pendingCharges4;

    @FindBy(id = "deposit-editor-target-1")
    @CacheLookup
    public WebElement pogVal;

    @FindBy(css = "a[href='https://www.your_url/about/privacy-security/']")
    @CacheLookup
    public WebElement privacySecurity;

    @FindBy(id = "save-deposit-editor-1")
    @CacheLookup
    public WebElement save1;

    @FindBy(id = "save-creditcard-editor-1")
    @CacheLookup
    public WebElement save2;

    @FindBy(id = "save-creditcard-editor-2")
    @CacheLookup
    public WebElement save3;

    @FindBy(id = "save-creditcard-editor-3")
    @CacheLookup
    public WebElement save4;

    @FindBy(id = "save-creditcard-editor-4")
    @CacheLookup
    public WebElement save5;

    @FindBy(id = "creditcard-editor-target-4")
    @CacheLookup
    public WebElement scaCard9292;

    @FindBy(css = "a[href='https://www.your_url/fraud/online-security.asp']")
    @CacheLookup
    public WebElement secureOnlineSession;

    @FindBy(id = "creditcard-editor-target-3")
    @CacheLookup
    public WebElement sharonDchannelJca;

    @FindBy(id = "creditcard-editor-target-3")
    @CacheLookup
    public WebElement sharonDchannelTestPca;

    @FindBy(id = "creditcard-editor-target-1")
    @CacheLookup
    public WebElement sharonTestIcaAutop;

    @FindBy(css = "#depositSummary thead tr.no-border th:nth-of-type(2) a.masked.toggle-account-number.small")
    @CacheLookup
    public WebElement show1;

    @FindBy(css = "a.masked.toggle-account-number.small.visible-xs")
    @CacheLookup
    public WebElement show2;

    @FindBy(css = "a[href='https://your_url/personal/logout/']")
    @CacheLookup
    public WebElement signOut;

    @FindBy(css = "a.sr-only.sr-only-focusable.btn.btn-primary")
    @CacheLookup
    public WebElement skipToMainContent;

    @FindBy(id = "creditcard-editor-target-3")
    @CacheLookup
    public WebElement snDchannelSca5367;

    @FindBy(css = "a[href='https://your_url/credit-card/spending-limit']")
    @CacheLookup
    public WebElement spendingLimits;

    @FindBy(css = "a[href='https://your_url/credit-card/statement']")
    @CacheLookup
    public WebElement statements;

    @FindBy(css = "a[href='https://your_url/terms-and-conditions/']")
    @CacheLookup
    public WebElement termsConditions;

    @FindBy(css = "button.navbar-toggle.collapsed")
    @CacheLookup
    public WebElement toggleNavigation;

    @FindBy(css = "a[href='https://your_url/credit-card/transaction']")
    @CacheLookup
    public WebElement transactions;

    @FindBy(css = "a[href='https://your_url/?menu=Transfer']")
    @CacheLookup
    public WebElement transferFunds;

    @FindBy(id = "creditcard-editor-target-2")
    @CacheLookup
    public WebElement valpog;

    @FindBy(id = "creditcard-editor-source-1")
    @CacheLookup
    public WebElement visaSignatureCardWithRewards10851;

    @FindBy(id = "creditcard-editor-source-2")
    @CacheLookup
    public WebElement visaSignatureCardWithRewards10852;

    @FindBy(id = "creditcard-editor-source-3")
    @CacheLookup
    public WebElement visaSignatureCardWithRewards10853;

    @FindBy(id = "creditcard-editor-source-4")
    @CacheLookup
    public WebElement visaSignatureCardWithRewards10854;

    @FindBy(css = "a[href='https://your_urlpayment/']")
    @CacheLookup
    public WebElement wireTransferRequest;

    @FindBy(css = "a[href='http://www.your_url/rewards']")
    @CacheLookup
    public WebElement wwwCnbComrewards;

    @FindBy(css = "a[href='https://your_urlCommunicationCenter.aspx?op=1']")
    @CacheLookup
    public WebElement messageCenter;

    @FindBy(css = "#bs-example-navbar-collapse-1 ul:nth-of-type(1) li:nth-of-type(1) a")
    @CacheLookup
    public WebElement accountSummary2;

    @FindBy(id = "deposit-editor-source-1")
    @CacheLookup
    public WebElement asOf10620201;

    @FindBy(id = "loan-editor-source-1")
    @CacheLookup
    public WebElement asOf10620202;

    @FindBy(css = "a[href='https://your_urlbrokerage/']")
    @CacheLookup
    public WebElement brokerage;

    @FindBy(id = "ccHeader")
    @CacheLookup
    public WebElement brokerageAccounts;

    @FindBy(css = "a[href='https://your_urlpayment/cimmt/brokeragefundstransfer/overview']")
    @CacheLookup
    public WebElement brokerageFundsTransfer;

    @FindBy(css = "a[href='https://your_url/?menu=OpenAccount']")
    @CacheLookup
    public WebElement openAccount;

    @FindBy(css = "#header div.aboveBlueBar.container div:nth-of-type(3) a")
    @CacheLookup
    public WebElement cls1Fill231f2;


    @FindBy(css = "#footer div.container.hidden-print div:nth-of-type(1) div:nth-of-type(2) ul li a")
    @CacheLookup
    public WebElement contactUsFooter;

    @FindBy(css = "a[href='https://your_urlcredit-card/']")
    @CacheLookup
    public WebElement creditCards;

    @FindBy(id = "deposit-editor-target-1")
    @CacheLookup
    public WebElement depositDr0903s;

    @FindBy(id = "brokerage-source-1")
    @CacheLookup
    public WebElement depositsInsuredToFdicLimits1;

    @FindBy(id = "trust-source-1")
    @CacheLookup
    public WebElement depositsInsuredToFdicLimits2;

    @FindBy(id = "brokerage-target-1")
    @CacheLookup
    public WebElement dr0903;

    @FindBy(id = "edit-deposit-editor-1")
    @CacheLookup
    public WebElement edit_deposit;

    @FindBy(id = "edit-loan-editor-1")
    @CacheLookup
    public WebElement edit_loan;

    @FindBy(id = "edit-brokerage-1")
    @CacheLookup
    public WebElement edit_brokerage;

    @FindBy(id = "edit-trust-1")
    @CacheLookup
    public WebElement edit_trust;

    @FindBy(id = "loan-editor-target-1")
    @CacheLookup
    public WebElement loanDr0903;

    @FindBy(css = "#loanSummary thead tr.no-border th:nth-of-type(2) a.masked.toggle-account-number.small")
    @CacheLookup
    public WebElement show3;

    @FindBy(css = "#loanSummary tbody:nth-of-type(1) tr td:nth-of-type(2) a.masked.toggle-account-number.small.visible-xs")
    @CacheLookup
    public WebElement show4;

    @FindBy(css = "#brokerageSummary thead tr.no-border th:nth-of-type(2) a.masked.toggle-account-number.small")
    @CacheLookup
    public WebElement show5;

    @FindBy(css = "#brokerageSummary tbody:nth-of-type(1) tr td:nth-of-type(2) a.masked.toggle-account-number.small.visible-xs")
    @CacheLookup
    public WebElement show6;

    @FindBy(css = "#trustSummary thead tr.no-border th:nth-of-type(2) a.masked.toggle-account-number.small")
    @CacheLookup
    public WebElement show7;

    @FindBy(css = "#trustSummary tbody:nth-of-type(1) tr td:nth-of-type(2) a:nth-of-type(1)")
    @CacheLookup
    public WebElement show8;

    @FindBy(css = "a[href='https://your_urltrust']")
    @CacheLookup
    public WebElement trustAndInvestmentPortfolioReview;

    @FindBy(css = "a[href='https://your_urltrust/statements/']")
    @CacheLookup
    public WebElement trustAndInvestmentStatements;

    @FindBy(id = "trust-target-1")
    @CacheLookup
    public WebElement trustDr0903;

    @FindBy(id = "ccHeader")
    @CacheLookup
    public WebElement trustInvestmentAccounts;

    @FindBy(css = "a[href='../spaces/trust/statements']")
    @CacheLookup
    public WebElement viewStatement;

    public AccountSummaryPage() {
    }

    public AccountSummaryPage(WebDriver driver) {
        this();
        driver = driver;
    }

    public AccountSummaryPage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public AccountSummaryPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Brokerage Accounts Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickBrokerageAccountsLink() {
        brokerageAccounts.click();
        return this;
    }

    /**
     * Click on Brokerage Funds Transfer Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickBrokerageFundsTransferLink() {
        brokerageFundsTransfer.click();
        return this;
    }

    /**
     * Click on Brokerage Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickBrokerageLink() {
        brokerage.click();
        return this;
    }

    /**
     * Click on Credit Cards Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickCreditCardsLink() {
        creditCards.click();
        return this;
    }

    /**
     * Click on Current Interest Rates Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    @Then("^User click on Current Interest Rates Link")
    public AccountSummaryPage clickCurrentInterestRatesLink() {
        currentInterestRates.click();
        return this;
    }

    /**
     * Click on Deposit Dr 0903s Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickDepositDr0903sLink() {
        depositDr0903s.click();
        return this;
    }

    /**
     * Click on Dr 0903 Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickDr0903Link() {
        dr0903.click();
        return this;
    }

    /**
     * Click on Edit Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickEdit1Link() {
        edit1.click();
        return this;
    }

    /**
     * Click on Edit Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickEdit2Link() {
        edit2.click();
        return this;
    }

    /**
     * Click on Edit Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickEdit3Link() {
        edit3.click();
        return this;
    }

    /**
     * Click on Edit Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickEdit4Link() {
        edit4.click();
        return this;
    }

    /**
     * Click on Feedback Button.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickFeedbackButton() {
        feedback.click();
        return this;
    }

    /**
     * Click on Fraud Prevention Center Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickFraudPreventionCenterLink() {
        fraudPreventionCenter.click();
        return this;
    }

    /**
     * Click on message Center Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    @Then("^User click on Message Center Link")
    public AccountSummaryPage clickLink0() {
        messageCenter.click();
        return this;
    }

    /**
     * Click on Loan Dr 0903 Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickLoanDr0903Link() {
        loanDr0903.click();
        return this;
    }

    /**
     * Click on Locations Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickLocationsLink() {
        locations.click();
        return this;
    }

    /**
     * Click on Make Payments Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickMakePaymentsLink() {
        makePayments.click();
        return this;
    }


    /**
     * Click on My Accounts Link.
     *
     * @return the AccountSummaryPage class instance.
     */
//    @Then("^click on \"(.*)\"(?:|from top navigation menu: \"(.*)\")")
    public void clickAnyLinkSubMenu(String link, String topnav) {
        if(topnav==null){
            WebElement el;
            if(link.contains("Message Center")){el=messageCenter;}
            else if(link.contains("Contact Us")){el=contactUs;}
            else if(link.contains("Account Summary")){el=accountSummary;}
            else{el=getDriver().findElement(By.xpath("//*[text()[contains(.,'"+link+"')]]"));}
            el.click();
        }
        else {
            Actions select = new Actions(getDriver());
            select.moveToElement(getDriver().findElement(By.xpath("//*[text()[contains(.,'"+topnav+"')]]"))).perform();
            getDriver().findElement(By.xpath("//*[text()[contains(.,'"+link+"')]]")).click();}
    }

    /**
     * Click on My Accounts Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    @Then("click on \"(.*)\" from top navigation menu: \"(.*)\"")
    public void clickTopNavLinkSubMenu(String submenu, String topnav) {
        Actions select = new Actions(getDriver());
        select.moveToElement(getDriver().findElement(By.xpath("//*[text()[contains(.,'"+topnav+"')]]"))).perform();
        getDriver().findElement(By.xpath("//*[text()[contains(.,'"+submenu+"')]]")).click();
    }

    /**
     * Click on text Link.
     * @return the AccountSummaryPage class instance.
     */
    @Then("user click on \"(.*)\"")
    public AccountSummaryPage clickTextLink(String link)  {
        WebElement el;
        if(link.contains("Message Center")){el=messageCenter;}
        else if(link.contains("Contact Us")&&!getDriver().getCurrentUrl().contains("login")){el=contactUs;}
        else if(link.contains("Account Summary")){el=accountSummary;}
        else{el=getDriver().findElement(By.xpath("//*[text()[contains(.,'"+link+"')]]"));}
        el.click();
        return this;
    }

    /**
     * Click on My Profile Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickMyProfileLink() {
        myProfile.click();
        return this;
    }

    /**
     * Click on Newsinsights Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickNewsinsightsLink() {
        newsinsights.click();
        return this;
    }

    /**
     * Click on Online Banking Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickOnlineBanking1Link() {
        onlineBanking1.click();
        return this;
    }

    /**
     * Click on Online Banking Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickOnlineBanking2Link() {
        onlineBanking2.click();
        return this;
    }

    /**
     * Click on Open An Account Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickOpenAnAccountLink() {
        openAnAccount.click();
        return this;
    }

    /**
     * Click on Outgoing Wire Activity Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickOutgoingWireActivityLink() {
        outgoingWireActivity.click();
        return this;
    }

    /**
     * Click on Payments Transfers Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickPaymentsTransfersLink() {
        paymentsTransfers.click();
        return this;
    }

    /**
     * Click on Privacy Security Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickPrivacySecurityLink() {
        privacySecurity.click();
        return this;
    }

    /**
     * Click on Save Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickSave1Link() {
        save1.click();
        return this;
    }

    /**
     * Click on Save Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickSave2Link() {
        save2.click();
        return this;
    }

    /**
     * Click on Save Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickSave3Link() {
        save3.click();
        return this;
    }

    /**
     * Click on Save Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickSave4Link() {
        save4.click();
        return this;
    }

    /**
     * Click on Secure Online Session Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickSecureOnlineSessionLink() {
        secureOnlineSession.click();
        return this;
    }

    /**
     * Click on Show Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickShow1Link() {
        show1.click();
        return this;
    }

    /**
     * Click on Show Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickShow2Link() {
        show2.click();
        return this;
    }

    /**
     * Click on Show Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickShow3Link() {
        show3.click();
        return this;
    }

    /**
     * Click on Show Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickShow4Link() {
        show4.click();
        return this;
    }

    /**
     * Click on Show Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickShow5Link() {
        show5.click();
        return this;
    }

    /**
     * Click on Show Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickShow6Link() {
        show6.click();
        return this;
    }

    /**
     * Click on Show Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickShow7Link() {
        show7.click();
        return this;
    }

    /**
     * Click on Show Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickShow8Link() {
        show8.click();
        return this;
    }

    /**
     * Click on Sign Out Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickSignOutLink() {
        signOut.click();
        return this;
    }

    /**
     * Click on Skip To Main Content Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickSkipToMainContentLink() {
        skipToMainContent.click();
        return this;
    }

    /**
     * Click on Terms Conditions Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickTermsConditionsLink() {
        termsConditions.click();
        return this;
    }

    /**
     * Click on Toggle Navigation Button.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickToggleNavigationButton() {
        toggleNavigation.click();
        return this;
    }

    /**
     * Click on Transfer Funds Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickTransferFundsLink() {
        transferFunds.click();
        return this;
    }

    /**
     * Click on Trust And Investment Portfolio Review Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickTrustAndInvestmentPortfolioReviewLink() {
        trustAndInvestmentPortfolioReview.click();
        return this;
    }

    /**
     * Click on Trust And Investment Statements Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickTrustAndInvestmentStatementsLink() {
        trustAndInvestmentStatements.click();
        return this;
    }

    /**
     * Click on Trust Dr 0903 Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickTrustDr0903Link() {
        trustDr0903.click();
        return this;
    }

    /**
     * Click on Trust Investment Accounts Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickTrustInvestmentAccountsLink() {
        trustInvestmentAccounts.click();
        return this;
    }

    /**
     * Click on View Statement Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickViewStatementLink() {
        viewStatement.click();
        return this;
    }

    /**
     * Click on Wire Transfer Request Link.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage clickWireTransferRequestLink() {
        wireTransferRequest.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage fill() {
        setAsOf10620201TextField();
        setAsOf10620202TextField();
        setDepositsInsuredToFdicLimits1TextField();
        setDepositsInsuredToFdicLimits2TextField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to As Of 1062020 Text field.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage setAsOf10620201TextField() {
        return setAsOf10620201TextField(data.get("AS_OF_1062020_1"));
    }

    /**
     * Set value to As Of 1062020 Text field.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage setAsOf10620201TextField(String asOf10620201Value) {
        asOf10620201.sendKeys(asOf10620201Value);
        return this;
    }

    /**
     * Set default value to As Of 1062020 Text field.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage setAsOf10620202TextField() {
        return setAsOf10620202TextField(data.get("AS_OF_1062020_2"));
    }

    /**
     * Set value to As Of 1062020 Text field.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage setAsOf10620202TextField(String asOf10620202Value) {
        asOf10620202.sendKeys(asOf10620202Value);
        return this;
    }

    /**
     * Set default value to Deposits Insured To Fdic Limits Text field.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage setDepositsInsuredToFdicLimits1TextField() {
        return setDepositsInsuredToFdicLimits1TextField(data.get("DEPOSITS_INSURED_TO_FDIC_LIMITS_1"));
    }

    /**
     * Set value to Deposits Insured To Fdic Limits Text field.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage setDepositsInsuredToFdicLimits1TextField(String depositsInsuredToFdicLimits1Value) {
        depositsInsuredToFdicLimits1.sendKeys(depositsInsuredToFdicLimits1Value);
        return this;
    }

    /**
     * Set default value to Deposits Insured To Fdic Limits Text field.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage setDepositsInsuredToFdicLimits2TextField() {
        return setDepositsInsuredToFdicLimits2TextField(data.get("DEPOSITS_INSURED_TO_FDIC_LIMITS_2"));
    }

    /**
     * Set value to Deposits Insured To Fdic Limits Text field.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage setDepositsInsuredToFdicLimits2TextField(String depositsInsuredToFdicLimits2Value) {
        depositsInsuredToFdicLimits2.sendKeys(depositsInsuredToFdicLimits2Value);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage submit() {
        clickFeedbackButton();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the AccountSummaryPage class instance.
     */
    public AccountSummaryPage verifyPageLoaded() {
        (new WebDriverWait(getDriver(), timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the AccountSummaryPage class instance.
     */
    @When("^Account Summary Page should be displayed")
    public AccountSummaryPage verifyPageUrl() {
        (new WebDriverWait(getDriver(), timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }

    /**
     * Click on Account Summary Link.
     *
     * @return the void class instance.
     */
    @Then("^User click on Account Summary Link")
    public AccountSummaryPage clickAccountSummaryLink() {
        accountSummary.click();
        return this;
    }
//
//    /**
//     * Click on Additional Cards 1 Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickAdditionalCards1Link() {
//        additionalCards1.click();
//        return this;
//    }
//
    /**
     * Click on Additional Cards 2 Link.
     *
     * @return the void class instance.
     */
    @Then("^User click on Additional Cards Link")
    public AccountSummaryPage clickAdditionalCards2Link() {
        additionalCards2.click();
        return this;
    }

    /**
     * Click on Alerts Link.
     *
     * @return the void class instance.
     */
    @Then("^User click on Alerts Link")
    public AccountSummaryPage clickAlertsLink() {
        alerts.click();
        return this;
    }

    /**
     * Click on Authorized Cards Are Locked Below Link.
     *
     * @return the void class instance.
     */
    @Then("^User click on Authorized Cards Link")
    public AccountSummaryPage clickAuthorizedCardsAreLockedBelowLink() {
        authorizedCardsAreLockedBelow.click();
        return this;
    }
//
//    /**
//     * Click on Card Locked Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickCardLocked1Link() {
//        cardLocked1.click();
//        return this;
//    }
//
//    /**
//     * Click on Card Locked Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickCardLocked2Link() {
//        cardLocked2.click();
//        return this;
//    }
//
    /**
     * Click on Checking Savings Link.
     *
     * @return the void class instance.
     */
    @Then("^User click on Checking Savings Link")
    public AccountSummaryPage clickCheckingSavingsLink() {
        checkingSavings.click();
        return this;
    }
//
//    /**
//     * Click on .Cls1 Fill 231f20 .Cls2 Fill 1b559b .Cls3 Fill 0060a9 .Cls4 Fill Ffd520 .Cls5 Fill Fff City National Bank Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickCls1Fill231f20Link() {
//        cls1Fill231f20.click();
//        return this;
//    }
//
//    /**
//     * Click on your_url Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickCnbComLink() {
//        cnbCom.click();
//        return this;
//    }
//
    /**
     * Click on Contact Us Link.
     *
     * @return the void class instance.
     */
    @Then("^User click on Contact Us Link")
    public AccountSummaryPage clickContactUsLink() {
        contactUs.click();
        return this;
    }
//
//    /**
//     * Click on Credit Card Payments Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickCreditCardPaymentsLink() {
//        creditCardPayments.click();
//        return this;
//    }
//
//    /**
//     * Click on Credit Cards Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickCreditCards1Link() {
//        creditCards1.click();
//        return this;
//    }
//
//    /**
//     * Click on Credit Cards Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickCreditCards2Link() {
//        creditCards2.click();
//        return this;
//    }
//
//    /**
//     * Click on Credit Cards Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickCreditCards3Link() {
//        creditCards3.click();
//        return this;
//    }
//
//    /**
//     * Click on Current Interest Rates Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickCurrentInterestRatesLink() {
//        currentInterestRates.click();
//        return this;
//    }
//
//    /**
//     * Click on Dchannels Testcard R Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickDchannelsTestcardRLink() {
//        dchannelsTestcardR.click();
//        return this;
//    }
//
//    /**
//     * Click on Edit Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickEdit1Link() {
//        edit1.click();
//        return this;
//    }
//
//    /**
//     * Click on Edit Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickEdit2Link() {
//        edit2.click();
//        return this;
//    }
//
//    /**
//     * Click on Edit Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickEdit3Link() {
//        edit3.click();
//        return this;
//    }
//
//    /**
//     * Click on Edit Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickEdit4Link() {
//        edit4.click();
//        return this;
//    }
//
//    /**
//     * Click on Edit Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickEdit5Link() {
//        edit5.click();
//        return this;
//    }
//
//    /**
//     * Click on Edit Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickEdit6Link() {
//        edit6.click();
//        return this;
//    }
//
//    /**
//     * Click on Edit Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickEdit7Link() {
//        edit7.click();
//        return this;
//    }
//
//
//
//    /**
//     * Click on Fraud Prevention Center Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickFraudPreventionCenterLink() {
//        fraudPreventionCenter.click();
//        return this;
//    }
//
//    /**
//     * Click on Householded Rewards Points Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickHouseholdedRewardsPointsLink() {
//        householdedRewardsPoints.click();
//        return this;
//    }
//
//    /**
//     * Click on 0 Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickLink0() {
//        _0.click();
//        return this;
//    }
//
//    /**
//     * Click on Locations Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickLocationsLink() {
//        locations.click();
//        return this;
//    }
//
//    /**
//     * Click on Lock And Unlock Card Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickLockAndUnlockCardLink() {
//        lockAndUnlockCard.click();
//        return this;
//    }
//
//    /**
//     * Click on Make Payments Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickMakePaymentsLink() {
//        makePayments.click();
//        return this;
//    }
//
//    /**
//     * Click on Manage Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickManage1Link() {
//        manage1.click();
//        return this;
//    }
//
//    /**
//     * Click on Manage Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickManage2Link() {
//        manage2.click();
//        return this;
//    }
//
//    /**
//     * Click on Manage Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickManage3Link() {
//        manage3.click();
//        return this;
//    }
//
//    /**
//     * Click on Manage Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickManage4Link() {
//        manage4.click();
//        return this;
//    }
//
//    /**
//     * Click on My Accounts Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickMyAccountsLink() {
//        myAccounts.click();
//        return this;
//    }
//
//    /**
//     * Click on My Profile Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickMyProfileLink() {
//        myProfile.click();
//        return this;
//    }
//
//    /**
//     * Click on Newsinsights Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickNewsinsightsLink() {
//        newsinsights.click();
//        return this;
//    }
//
//    /**
//     * Click on Online Banking Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickOnlineBanking1Link() {
//        onlineBanking1.click();
//        return this;
//    }
//
//    /**
//     * Click on Online Banking Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickOnlineBanking2Link() {
//        onlineBanking2.click();
//        return this;
//    }
//
//    /**
//     * Click on Open An Account Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickOpenAnAccountLink() {
//        openAnAccount.click();
//        return this;
//    }
//
//    /**
//     * Click on Open Popup Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickOpenPopup10Link() {
//        openPopup10.click();
//        return this;
//    }
//
//    /**
//     * Click on Open Popup Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickOpenPopup11Link() {
//        openPopup11.click();
//        return this;
//    }
//
//    /**
//     * Click on Open Popup Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickOpenPopup12Link() {
//        openPopup12.click();
//        return this;
//    }
//
//    /**
//     * Click on Open Popup Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickOpenPopup13Link() {
//        openPopup13.click();
//        return this;
//    }
//
//    /**
//     * Click on Open Popup Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickOpenPopup14Link() {
//        openPopup14.click();
//        return this;
//    }
//
//    /**
//     * Click on Open Popup Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickOpenPopup15Link() {
//        openPopup15.click();
//        return this;
//    }
//
//    /**
//     * Click on Open Popup Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickOpenPopup16Link() {
//        openPopup16.click();
//        return this;
//    }
//
//    /**
//     * Click on Open Popup Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickOpenPopup17Link() {
//        openPopup17.click();
//        return this;
//    }
//
//    /**
//     * Click on Open Popup Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickOpenPopup18Link() {
//        openPopup18.click();
//        return this;
//    }
//
//    /**
//     * Click on Open Popup Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickOpenPopup19Link() {
//        openPopup19.click();
//        return this;
//    }
//
//    /**
//     * Click on Open Popup Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickOpenPopup1Link() {
//        openPopup1.click();
//        return this;
//    }
//
//    /**
//     * Click on Open Popup Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickOpenPopup20Link() {
//        openPopup20.click();
//        return this;
//    }
//
//    /**
//     * Click on Open Popup Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickOpenPopup21Link() {
//        openPopup21.click();
//        return this;
//    }
//
//    /**
//     * Click on Open Popup Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickOpenPopup22Link() {
//        openPopup22.click();
//        return this;
//    }
//
//    /**
//     * Click on Open Popup Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickOpenPopup23Link() {
//        openPopup23.click();
//        return this;
//    }
//
//    /**
//     * Click on Open Popup Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickOpenPopup2Link() {
//        openPopup2.click();
//        return this;
//    }
//
//    /**
//     * Click on Open Popup Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickOpenPopup3Link() {
//        openPopup3.click();
//        return this;
//    }
//
//    /**
//     * Click on Open Popup Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickOpenPopup4Link() {
//        openPopup4.click();
//        return this;
//    }
//
//    /**
//     * Click on Open Popup Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickOpenPopup5Link() {
//        openPopup5.click();
//        return this;
//    }
//
//    /**
//     * Click on Open Popup Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickOpenPopup6Link() {
//        openPopup6.click();
//        return this;
//    }
//
//    /**
//     * Click on Open Popup Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickOpenPopup7Link() {
//        openPopup7.click();
//        return this;
//    }
//
//    /**
//     * Click on Open Popup Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickOpenPopup8Link() {
//        openPopup8.click();
//        return this;
//    }
//
//    /**
//     * Click on Open Popup Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickOpenPopup9Link() {
//        openPopup9.click();
//        return this;
//    }
//
//    /**
//     * Click on Outgoing Wire Activity Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickOutgoingWireActivityLink() {
//        outgoingWireActivity.click();
//        return this;
//    }
//
//    /**
//     * Click on Paperless Enrollment Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickPaperlessEnrollmentLink() {
//        paperlessEnrollment.click();
//        return this;
//    }
//
    /**
     * Click on Pay Now Button.
     */
    public void clickPayNow1Button() {
        payNow1.click();
    }

    /**
     * Click on Pay Now Button.
     */
    public void clickPayNow2Button() {
        payNow2.click();
    }

    /**
     * Click on Pay Now Button.
     */
    public void clickPayNow3Button() {
        payNow3.click();
    }

    /**
     * Click on Pay Now Button.
     */
    public void clickPayNow4Button() {
        payNow4.click();
    }
//
//    /**
//     * Click on Payments Transfers Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickPaymentsTransfersLink() {
//        paymentsTransfers.click();
//        return this;
//    }
//
//    /**
//     * Click on Pending Charges Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickPendingCharges1Link() {
//        pendingCharges1.click();
//        return this;
//    }
//
//    /**
//     * Click on Pending Charges Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickPendingCharges2Link() {
//        pendingCharges2.click();
//        return this;
//    }
//
//    /**
//     * Click on Pending Charges Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickPendingCharges3Link() {
//        pendingCharges3.click();
//        return this;
//    }
//
//    /**
//     * Click on Pending Charges Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickPendingCharges4Link() {
//        pendingCharges4.click();
//        return this;
//    }
//
//    /**
//     * Click on Pog Val Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickPogValLink() {
//        pogVal.click();
//        return this;
//    }
//
//    /**
//     * Click on Privacy Security Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickPrivacySecurityLink() {
//        privacySecurity.click();
//        return this;
//    }
//
//    /**
//     * Click on Save Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickSave1Link() {
//        save1.click();
//        return this;
//    }
//
//    /**
//     * Click on Save Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickSave2Link() {
//        save2.click();
//        return this;
//    }
//
//    /**
//     * Click on Save Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickSave3Link() {
//        save3.click();
//        return this;
//    }
//
//    /**
//     * Click on Save Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickSave4Link() {
//        save4.click();
//        return this;
//    }
//
//    /**
//     * Click on Save Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickSave5Link() {
//        save5.click();
//        return this;
//    }
//
//    /**
//     * Click on Sca Card 9292 Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickScaCard9292Link() {
//        scaCard9292.click();
//        return this;
//    }
//
//    /**
//     * Click on Secure Online Session Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickSecureOnlineSessionLink() {
//        secureOnlineSession.click();
//        return this;
//    }
//
//    /**
//     * Click on Sharon Dchannel Jca Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickSharonDchannelJcaLink() {
//        sharonDchannelJca.click();
//        return this;
//    }
//
//    /**
//     * Click on Sharon Dchannel Test Pca Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickSharonDchannelTestPcaLink() {
//        sharonDchannelTestPca.click();
//        return this;
//    }
//
//    /**
//     * Click on Sharon Test Ica Autop Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickSharonTestIcaAutopLink() {
//        sharonTestIcaAutop.click();
//        return this;
//    }
//
//    /**
//     * Click on Show Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickShow1Link() {
//        show1.click();
//        return this;
//    }
//
//    /**
//     * Click on Show Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickShow2Link() {
//        show2.click();
//        return this;
//    }
//
//    /**
//     * Click on Sign Out Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickSignOutLink() {
//        signOut.click();
//        return this;
//    }
//
//    /**
//     * Click on Skip To Main Content Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickSkipToMainContentLink() {
//        skipToMainContent.click();
//        return this;
//    }
//
//    /**
//     * Click on Sn Dchannel Sca 5367 Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickSnDchannelSca5367Link() {
//        snDchannelSca5367.click();
//        return this;
//    }
//
//    /**
//     * Click on Spending Limits Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickSpendingLimitsLink() {
//        spendingLimits.click();
//        return this;
//    }
//
//    /**
//     * Click on Statements Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickStatementsLink() {
//        statements.click();
//        return this;
//    }
//
//    /**
//     * Click on Terms Conditions Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickTermsConditionsLink() {
//        termsConditions.click();
//        return this;
//    }
//
//    /**
//     * Click on Toggle Navigation Button.
//     *
//     * @return the void class instance.
//     */
//    public void clickToggleNavigationButton() {
//        toggleNavigation.click();
//        return this;
//    }
//
//    /**
//     * Click on Transactions Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickTransactionsLink() {
//        transactions.click();
//        return this;
//    }
//
//    /**
//     * Click on Transfer Funds Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickTransferFundsLink() {
//        transferFunds.click();
//        return this;
//    }
//
//    /**
//     * Click on Valpog Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickValpogLink() {
//        valpog.click();
//        return this;
//    }
//
//    /**
//     * Click on Wire Transfer Request Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickWireTransferRequestLink() {
//        wireTransferRequest.click();
//        return this;
//    }
//
//    /**
//     * Click on Www.your_urlrewards Link.
//     *
//     * @return the void class instance.
//     */
//    public void clickWwwCnbComrewardsLink() {
//        wwwCnbComrewards.click();
//        return this;
//    }
//
//    /**
//     * Fill every fields in the page.
//     *
//     * @return the void class instance.
//     */
//    public void fill() {
//        setDepositsInsuredToFdicLimitsTextField();
//        setVisaSignatureCardWithRewards10851TextField();
//        setVisaSignatureCardWithRewards10852TextField();
//        setVisaSignatureCardWithRewards10853TextField();
//        setVisaSignatureCardWithRewards10854TextField();
//        return this;
//    }
//
//    /**
//     * Fill every fields in the page and submit it to target page.
//     *
//     * @return the void class instance.
//     */
//    public void fillAndSubmit() {
//        fill();
//        return submit();
//    }
//
//    /**
//     * Set default value to Deposits Insured To Fdic Limits Text field.
//     *
//     * @return the void class instance.
//     */
//    public void setDepositsInsuredToFdicLimitsTextField() {
//        return setDepositsInsuredToFdicLimitsTextField(data.get("DEPOSITS_INSURED_TO_FDIC_LIMITS"));
//    }
//
//    /**
//     * Set value to Deposits Insured To Fdic Limits Text field.
//     *
//     * @return the void class instance.
//     */
//    public void setDepositsInsuredToFdicLimitsTextField(String depositsInsuredToFdicLimitsValue) {
//        depositsInsuredToFdicLimits.sendKeys(depositsInsuredToFdicLimitsValue);
//        return this;
//    }
//
//    /**
//     * Set default value to Visa Signature Card With Rewards 1085 Text field.
//     *
//     * @return the void class instance.
//     */
//    public void setVisaSignatureCardWithRewards10851TextField() {
//        return setVisaSignatureCardWithRewards10851TextField(data.get("VISA_SIGNATURE_CARD_WITH_REWARDS_1085_1"));
//    }
//
//    /**
//     * Set value to Visa Signature Card With Rewards 1085 Text field.
//     *
//     * @return the void class instance.
//     */
//    public void setVisaSignatureCardWithRewards10851TextField(String visaSignatureCardWithRewards10851Value) {
//        visaSignatureCardWithRewards10851.sendKeys(visaSignatureCardWithRewards10851Value);
//        return this;
//    }
//
//    /**
//     * Set default value to Visa Signature Card With Rewards 1085 Text field.
//     *
//     * @return the void class instance.
//     */
//    public void setVisaSignatureCardWithRewards10852TextField() {
//        return setVisaSignatureCardWithRewards10852TextField(data.get("VISA_SIGNATURE_CARD_WITH_REWARDS_1085_2"));
//    }
//
//    /**
//     * Set value to Visa Signature Card With Rewards 1085 Text field.
//     *
//     * @return the void class instance.
//     */
//    public void setVisaSignatureCardWithRewards10852TextField(String visaSignatureCardWithRewards10852Value) {
//        visaSignatureCardWithRewards10852.sendKeys(visaSignatureCardWithRewards10852Value);
//        return this;
//    }
//
//    /**
//     * Set default value to Visa Signature Card With Rewards 1085 Text field.
//     *
//     * @return the void class instance.
//     */
//    public void setVisaSignatureCardWithRewards10853TextField() {
//        return setVisaSignatureCardWithRewards10853TextField(data.get("VISA_SIGNATURE_CARD_WITH_REWARDS_1085_3"));
//    }
//
//    /**
//     * Set value to Visa Signature Card With Rewards 1085 Text field.
//     *
//     * @return the void class instance.
//     */
//    public void setVisaSignatureCardWithRewards10853TextField(String visaSignatureCardWithRewards10853Value) {
//        visaSignatureCardWithRewards10853.sendKeys(visaSignatureCardWithRewards10853Value);
//        return this;
//    }
//
//    /**
//     * Set default value to Visa Signature Card With Rewards 1085 Text field.
//     *
//     * @return the void class instance.
//     */
//    public void setVisaSignatureCardWithRewards10854TextField() {
//        return setVisaSignatureCardWithRewards10854TextField(data.get("VISA_SIGNATURE_CARD_WITH_REWARDS_1085_4"));
//    }
//
//    /**
//     * Set value to Visa Signature Card With Rewards 1085 Text field.
//     *
//     * @return the void class instance.
//     */
//    public void setVisaSignatureCardWithRewards10854TextField(String visaSignatureCardWithRewards10854Value) {
//        visaSignatureCardWithRewards10854.sendKeys(visaSignatureCardWithRewards10854Value);
//        return this;
//    }
//
//    /**
//     * Submit the form to target page.
//     *
//     * @return the void class instance.
//     */
//    public void submit() {
//        clickFeedbackButton();
//        return this;
//    }
//
//    /**
//     * Verify that the page loaded completely.
//     *
//     * @return the void class instance.
//     */
//    public void verifyPageLoaded() {
//        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
//            public Boolean apply(WebDriver d) {
//                return d.getPageSource().contains(pageLoadedText);
//            }
//        });
//        return this;
//    }
//
//    /**
//     * Verify that current page URL matches the expected URL.
//     *
//     * @return the void class instance.
//     */
//    public void verifyPageUrl() {
//        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
//            public Boolean apply(WebDriver d) {
//                return d.getCurrentUrl().contains(pageUrl);
//            }
//        });
//        return this;
//    }
}
