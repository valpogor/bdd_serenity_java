package pages;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import starter.OOBA;

public class MyProfileConfirmPage extends PageObject {
    private Map<String, String> data;
//    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a[href='https://your_urlCommunicationCenter.aspx?op=1']")
    @CacheLookup
    private WebElement _0;

    @FindBy(css = "#bs-example-navbar-collapse-1 ul:nth-of-type(1) li:nth-of-type(1) a")
    @CacheLookup
    private WebElement accountSummary;

    @FindBy(css = "a[href='https://your_urlbrokerage/']")
    @CacheLookup
    private WebElement brokerage;

    @FindBy(css = "a[href='https://your_urlpayment/cimmt/brokeragefundstransfer/overview']")
    @CacheLookup
    private WebElement brokerageFundsTransfer;

    @FindBy(css = "a.btn.btn-link")
    @CacheLookup
    private WebElement cancel;

    @FindBy(css = "#cancelOOBA div.modal-dialog div.modal-content div:nth-of-type(3) a.btn.btn-primary")
    @CacheLookup
    private WebElement cancelVerification;

    @FindBy(css = "#bs-example-navbar-collapse-1 ul:nth-of-type(1) li:nth-of-type(4) ul.dropdown-menu li:nth-of-type(1) a")
    @CacheLookup
    private WebElement checkingSavings;

    @FindBy(css = "#header div.aboveBlueBar.container div:nth-of-type(3) a")
    @CacheLookup
    private WebElement cls1Fill231f20;

    @FindBy(css = "a[href='https://www.your_url/index.asp']")
    @CacheLookup
    private WebElement cnbCom;

    @FindBy(name = "oobaendpoint")
    @CacheLookup
    private List<WebElement> cnncnbCom;

    @FindBy(xpath = "(//*[text()[contains(.,'@gmail.com')]])[1]")
    @CacheLookup
    private WebElement gmailooba;

    private final String cnncnbComValue = "2";

    @FindBy(css = "#footer div.container.hidden-print div:nth-of-type(1) div:nth-of-type(2) ul li a")
    @CacheLookup
    private WebElement contactUs;

    @FindBy(css = "button.btn.btn-link")
    @CacheLookup
    private WebElement continueVerification;

    @FindBy(css = "a[href='https://your_urlcredit-card/']")
    @CacheLookup
    private WebElement creditCards;

    @FindBy(css = "a.submenu-pad")
    @CacheLookup
    private WebElement currentInterestRates;

    @FindBy(css = "a[href='https://www.your_url/fraud/']")
    @CacheLookup
    private WebElement fraudPreventionCenter;

    @FindBy(css = "a[href='https://locations.your_url/search/']")
    @CacheLookup
    private WebElement locations;

    @FindBy(css = "a[href='https://your_url/?menu=Payment']")
    @CacheLookup
    private WebElement makePayments;

    @FindBy(css = "#bs-example-navbar-collapse-1 ul:nth-of-type(1) li:nth-of-type(2) a.dropdown-toggle")
    @CacheLookup
    private WebElement myAccounts;

    @FindBy(css = "a[href='https://your_urlmy-profile/?firsttimevisit=true']")
    @CacheLookup
    private WebElement myProfile;

    @FindBy(css = "a[href='https://newsroom.your_url/']")
    @CacheLookup
    private WebElement newsinsights;

    @FindBy(css = "a[href='https://your_url/']")
    @CacheLookup
    private WebElement onlineBanking;

    @FindBy(css = "#bs-example-navbar-collapse-1 ul:nth-of-type(1) li:nth-of-type(4) a.dropdown-toggle")
    @CacheLookup
    private WebElement openAnAccount;

    @FindBy(css = "a[href='https://your_urlpayment/wire/outgoing-wire-activities']")
    @CacheLookup
    private WebElement outgoingWireActivity;

    private final String pageLoadedText = "Equal Housing Lender - CNB Member FDIC";

    private final String pageUrl = "/spaces/my-profile/identity-verification-default";

    @FindBy(css = "#bs-example-navbar-collapse-1 ul:nth-of-type(1) li:nth-of-type(3) a.dropdown-toggle")
    @CacheLookup
    private WebElement paymentsTransfers;

    @FindBy(css = "a[href='https://www.your_url/about/privacy-security/']")
    @CacheLookup
    private WebElement privacySecurity;

    @FindBy(css = "a[href='https://www.your_url/fraud/online-security.asp']")
    @CacheLookup
    private WebElement secureOnlineSession;

    @FindBy(id = "ooba_selection-actios__continue")
    @CacheLookup
    private WebElement sendCode;

    @FindBy(id = "ooba_verification-actions__continue")
    @CacheLookup
    private WebElement oobaVerifyBtn;

    @FindBy(css = "a[href='https://your_url/personal/logout/']")
    @CacheLookup
    private WebElement signOut;

    @FindBy(css = "a.sr-only.sr-only-focusable.btn.btn-primary")
    @CacheLookup
    private WebElement skipToMainContent;

    @FindBy(css = "a[href='https://your_url/terms-and-conditions/']")
    @CacheLookup
    private WebElement termsConditions;

    @FindBy(css = "button.navbar-toggle.collapsed")
    @CacheLookup
    private WebElement toggleNavigation;

    @FindBy(css = "a[href='https://your_url/?menu=Transfer']")
    @CacheLookup
    private WebElement transferFunds;

    @FindBy(css = "a[href='https://your_urltrust']")
    @CacheLookup
    private WebElement trustAndInvestmentPortfolioReview;

    @FindBy(css = "a[href='https://your_urltrust/statements/']")
    @CacheLookup
    private WebElement trustAndInvestmentStatements;

    @FindBy(name = "oobaendpoint")
    @CacheLookup
    private List<WebElement> vaycnbCom;

    private final String vaycnbComValue = "1";

    @FindBy(name = "oobaendpoint")
    @CacheLookup
    private List<WebElement> voiceMessage1;

    @FindBy(name = "oobaendpoint")
    @CacheLookup
    private List<WebElement> voiceMessage2;

    @FindBy(name = "oobaendpoint")
    @CacheLookup
    private List<WebElement> voiceMessage3;

    @FindBy(name = "oobaendpoint")
    @CacheLookup
    private List<WebElement> voiceMessage4;

    private final String text1 = "text|1";

    private final String voice1 = "voice|1";

    private final String text2 = "text|2";

    private final String voice2 = "voice|2";

    @FindBy(css = "a[href='https://your_urlpayment/']")
    @CacheLookup
    private WebElement wireTransferRequest;

    @FindBy(name = "oobacode")
    @CacheLookup
    private WebElement oobacodefield;

    public MyProfileConfirmPage() {
      getDriver();
    }

//    public MyProfileConfirmPage(WebDriver driver, Map<String, String> data) {
//        this(driver);
//        this.data = data;
//    }
//
//    public MyProfileConfirmPage(WebDriver driver, Map<String, String> data, int timeout) {
//        this(driver, data);
//        this.timeout = timeout;
//    }

    /**
     * Click on Account Summary Link.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage clickAccountSummaryLink() {
        accountSummary.click();
        return this;
    }

    /**
     * Click on Brokerage Funds Transfer Link.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage clickBrokerageFundsTransferLink() {
        brokerageFundsTransfer.click();
        return this;
    }

    /**
     * Click on Brokerage Link.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage clickBrokerageLink() {
        brokerage.click();
        return this;
    }

    /**
     * Click on Cancel Link.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage clickCancelLink() {
        cancel.click();
        return this;
    }

    /**
     * Click on Cancel Verification Link.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage clickCancelVerificationLink() {
        cancelVerification.click();
        return this;
    }

    /**
     * Click on Checking Savings Link.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage clickCheckingSavingsLink() {
        checkingSavings.click();
        return this;
    }

    /**
     * Click on .Cls1 Fill 231f20 .Cls2 Fill 1b559b .Cls3 Fill 0060a9 .Cls4 Fill Ffd520 .Cls5 Fill Fff City National Bank Link.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage clickCls1Fill231f20Link() {
        cls1Fill231f20.click();
        return this;
    }

    /**
     * Click on your_url Link.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage clickCnbComLink() {
        cnbCom.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage clickContactUsLink() {
        contactUs.click();
        return this;
    }

    /**
     * Click on Continue Verification Button.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage clickContinueVerificationButton() {
        continueVerification.click();
        return this;
    }

    /**
     * Click on Credit Cards Link.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage clickCreditCardsLink() {
        creditCards.click();
        return this;
    }

    /**
     * Click on Current Interest Rates Link.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage clickCurrentInterestRatesLink() {
        currentInterestRates.click();
        return this;
    }

    /**
     * Click on Fraud Prevention Center Link.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage clickFraudPreventionCenterLink() {
        fraudPreventionCenter.click();
        return this;
    }

    /**
     * Click on 0 Link.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage clickLink0() {
        _0.click();
        return this;
    }

    /**
     * Click on Locations Link.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage clickLocationsLink() {
        locations.click();
        return this;
    }

    /**
     * Click on Make Payments Link.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage clickMakePaymentsLink() {
        makePayments.click();
        return this;
    }

    /**
     * Click on My Accounts Link.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage clickMyAccountsLink() {
        myAccounts.click();
        return this;
    }

    /**
     * Click on My Profile Link.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage clickMyProfileLink() {
        myProfile.click();
        return this;
    }

    /**
     * Click on Newsinsights Link.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage clickNewsinsightsLink() {
        newsinsights.click();
        return this;
    }

    /**
     * Click on Online Banking Link.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage clickOnlineBankingLink() {
        onlineBanking.click();
        return this;
    }

    /**
     * Click on Open An Account Link.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage clickOpenAnAccountLink() {
        openAnAccount.click();
        return this;
    }

    /**
     * Click on Outgoing Wire Activity Link.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage clickOutgoingWireActivityLink() {
        outgoingWireActivity.click();
        return this;
    }

    /**
     * Click on Payments Transfers Link.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage clickPaymentsTransfersLink() {
        paymentsTransfers.click();
        return this;
    }

    /**
     * Click on Privacy Security Link.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage clickPrivacySecurityLink() {
        privacySecurity.click();
        return this;
    }

    /**
     * Click on Secure Online Session Link.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage clickSecureOnlineSessionLink() {
        secureOnlineSession.click();
        return this;
    }

    /**
     * Click on Send Code Button.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage clickSendCodeButton() {
        sendCode.click();
        return this;
    }

    /**
     * Click on Send Code Button.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage oobaVerifyBtnClick() {
        oobaVerifyBtn.click();
        return this;
    }

    /**
     * Click on Sign Out Link.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage clickSignOutLink() {
        signOut.click();
        return this;
    }

    /**
     * Click on Skip To Main Content Link.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage clickSkipToMainContentLink() {
        skipToMainContent.click();
        return this;
    }

    /**
     * Click on Terms Conditions Link.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage clickTermsConditionsLink() {
        termsConditions.click();
        return this;
    }

    /**
     * Click on Toggle Navigation Button.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage clickToggleNavigationButton() {
        toggleNavigation.click();
        return this;
    }

    /**
     * Click on Transfer Funds Link.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage clickTransferFundsLink() {
        transferFunds.click();
        return this;
    }

    /**
     * Click on Trust And Investment Portfolio Review Link.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage clickTrustAndInvestmentPortfolioReviewLink() {
        trustAndInvestmentPortfolioReview.click();
        return this;
    }

    /**
     * Click on Trust And Investment Statements Link.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage clickTrustAndInvestmentStatementsLink() {
        trustAndInvestmentStatements.click();
        return this;
    }

    /**
     * Click on Wire Transfer Request Link.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage clickWireTransferRequestLink() {
        wireTransferRequest.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage fill() {
        setVaycnbComRadioButtonField();
        setCnncnbComRadioButtonField();
        setVoiceMessage1RadioButtonField();
        setVoiceMessage2RadioButtonField();
        setVoiceMessage3RadioButtonField();
        setVoiceMessage4RadioButtonField();
        return this;
    }

    /**
     * Fill fields in the page.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage ooba(int email) throws Exception {
        if(email==1){ setVaycnbComRadioButtonField();}
        else if(email==2){ gmailOobaClick();}
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    @And("^select email: \"(.*)\" and click submit$")
    public MyProfileConfirmPage OOBASubmit(int email) throws Exception {
        ooba(email);
        return submit();
    }

    /**
     * Get OOBA code fill field and click on submit
     *
     * @return the MyProfileConfirmPage class instance.
     */
    @And("^get OOBA code fill the field and click on submit$")
    public MyProfileConfirmPage OOBAcodeSubmit() throws Exception {
        String ooba= OOBA.getVerCode("","");
        oobacodefield.sendKeys(ooba);
        return oobaVerifyBtnClick();
    }

    /**
     * Set default value to Cnnyour_url Radio Button field.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage setCnncnbComRadioButtonField() {
        for (WebElement el : cnncnbCom) {
            if (el.getAttribute("value").equals(cnncnbComValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Vayyour_url Radio Button field.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage setVaycnbComRadioButtonField() {
        for (WebElement el : vaycnbCom) {
            if (el.getAttribute("value").equals(vaycnbComValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Vayyour_url Radio Button field.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public void gmailOobaClick() throws Exception{
        gmailooba.click();
    }

    /**
     * Set default value to Voice Message Radio Button field.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage setVoiceMessage1RadioButtonField() {
        for (WebElement el : voiceMessage1) {
            if (el.getAttribute("value").equals(text1)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Voice Message Radio Button field.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage setVoiceMessage2RadioButtonField() {
        for (WebElement el : voiceMessage2) {
            if (el.getAttribute("value").equals(voice1)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Voice Message Radio Button field.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage setVoiceMessage3RadioButtonField() {
        for (WebElement el : voiceMessage3) {
            if (el.getAttribute("value").equals(text2)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Voice Message Radio Button field.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage setVoiceMessage4RadioButtonField() {
        for (WebElement el : voiceMessage4) {
            if (el.getAttribute("value").equals(voice2)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage submit() {
        clickSendCodeButton();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage verifyPageLoaded() {
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
     * @return the MyProfileConfirmPage class instance.
     */
    public MyProfileConfirmPage verifyPageUrl() {
        (new WebDriverWait(getDriver(), timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
