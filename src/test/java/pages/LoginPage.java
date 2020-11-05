package pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import starter.navigation.NavigateTo;
import starter.stepdefinitions.LoginPageStepDefinitions;
import starter.OOBA;
import java.util.Map;

@DefaultUrl("https://your_url")
public class LoginPage extends PageObject {
    private Map<String, String> data;
    private int timeout = 15;
    LoginPageStepDefinitions loginPageStepDefinitions;
    MyProfileConfirmPage myProfileConfirmPage;

    @Steps
    NavigateTo navigateTo;

    @FindBy(css = "#masthead nav.navbar.navbar-default div:nth-of-type(1) p.signedOutText a:nth-of-type(2)")
    @CacheLookup
    private WebElement phoneNumber;

    @FindBy(css = "#masthead nav.navbar.navbar-default div:nth-of-type(2) div.row div:nth-of-type(2) div:nth-of-type(2) p.signedOutTextMoDown a")
    @CacheLookup
    private WebElement phoneNumber2;

    @FindBy(css = "#masthead nav.navbar.navbar-default div:nth-of-type(1) p.signedOutText a:nth-of-type(1)")
    @CacheLookup
    private WebElement _88712901800;

    @FindBy(css = "#masthead nav.navbar.navbar-default div:nth-of-type(2) div.row div:nth-of-type(2) div:nth-of-type(1) p.signedOutTextMoUp a")
    @CacheLookup
    private WebElement _88712902800;


    @FindBy(css = "a[href='https://www.your_url/wealth-management/online-services/individual/business-continuity-notification.asp']")
    @CacheLookup
    public WebElement businessContinuityNotification;

    @FindBy(css = "a[href='http://www.your_url/']")
    @CacheLookup
    private WebElement cityNationalBank;

    @FindBy(css = "a[href='/login/']")
    @CacheLookup
    private WebElement cls1Fill231f20Cls2Fill;

    @FindBy(css = "a[href='https://www.your_url']")
    @CacheLookup
    public WebElement cnbCom;

    @FindBy(css = "a[href='https://www.your_url/about/contact-us.asp']")
    @CacheLookup
    private WebElement contactUs;

    @FindBy(css = "a[href='/login/self-enrollment/personal-info']")
    @CacheLookup
    private WebElement enrollForPersonalBanking;

    @FindBy(css = "a[href='/login/e-sign']")
    @CacheLookup
    private WebElement esign;

    @FindBy(css = "a[href='http://brokercheck.finra.org/Firm/Summary/103705']")
    @CacheLookup
    private WebElement finrasBrokercheck;

    @FindBy(css = "a[href='/login/forgot-password']")
    @CacheLookup
    private WebElement forgotPassword;

    @FindBy(css = "a[href='/login/forgot-user-id']")
    @CacheLookup
    private WebElement forgotUserId;

    @FindBy(css = "a[href='https://www.your_url/fraud/']")
    @CacheLookup
    private WebElement fraudPreventionCenter;

    @FindBy(css = "a[href='https://www.your_url/locations']")
    @CacheLookup
    private WebElement locations;

    private final String pageLoadedText = "The safe, simple and secure way to access your City National services with one sign-in";

    private final String pageUrl = "/login/";

    @FindBy(id = "Password")
    @CacheLookup
    private WebElement password;

    @FindBy(css = "a[href='https://www.your_url/about/privacy-security/']")
    @CacheLookup
    private WebElement privacySecurity;

    @FindBy(id = "RememberUserId")
    @CacheLookup
    private WebElement rememberUserId;

    @FindBy(css = "a[href='http://www.rbcroyalbank.com/']")
    @CacheLookup
    private WebElement royalBankOfCanada;

    @FindBy(css = "a[href='https://www.your_url/fraud/online-security.asp']")
    @CacheLookup
    private WebElement secureOnlineSession;

    @FindBy(id = "LoginForm_login_signIn")
    @CacheLookup
    private WebElement signIn;

    @FindBy(css = "a[href='/login/terms-and-conditions']")
    @CacheLookup
    private WebElement termsConditions;

    @FindBy(id = "UserId")
    @CacheLookup
    private WebElement userId;

    public LoginPage() {
        getDriver();
    }

    public LoginPage(Map<String, String> data) {
        this.data = data;
    }

    /**
     * Click on 800 5990020 Link.
     *
     * @return the LoginPage class instance.
     */
    public LoginPage clickphoneNumber() {
        phoneNumber.click();
        return this;
    }

    /**
     * Click on 800 5990020 Link.
     *
     * @return the LoginPage class instance.
     */
    public LoginPage phoneNumber2() {
        phoneNumber2.click();
        return this;
    }

    /**
     * Click on 800 8871290 Link.
     *
     * @return the LoginPage class instance.
     */
    public LoginPage click88712901Link800() {
        _88712901800.click();
        return this;
    }

    /**
     * Click on 800 8871290 Link.
     *
     * @return the LoginPage class instance.
     */
    public LoginPage click88712902Link800() {
        _88712902800.click();
        return this;
    }

    /**
     * Click on Business Continuity Notification Link.
     *
     * @return the LoginPage class instance.
     */
    @Then("^User click on Business Continuity Notification Link")
    public LoginPage businessContinuityNotification() {
        businessContinuityNotification.click();
        return this;
    }

    /**
     * Click on City National Bank Link.
     *
     * @return the LoginPage class instance.
     */
    @Then("^User click on CNB Link")
    public LoginPage clickCityNationalBankLink() {
        cityNationalBank.click();
        return this;
    }

    /**
     * Click on .Cls1 Fill 231f20 .Cls2 Fill 1b559b .Cls3 Fill 0060a9 .Cls4 Fill Ffd520 .Cls5 Fill Fff City National Bank Link.
     *
     * @return the LoginPage class instance.
     */
    public LoginPage clickCls1Fill231f20Cls2FillLink() {
        cls1Fill231f20Cls2Fill.click();
        return this;
    }

    /**
     * Click on your_url Link.
     *
     * @return the LoginPage class instance.
     */
    @Then("^User click on your_url Link")
    public LoginPage clickCnbComLink() {
        cnbCom.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the LoginPage class instance.
     */
    @Then("^User click on ContactUs Link")
    public LoginPage clickContactUsLink() {
        contactUs.click();
        return this;
    }

    /**
     * Click on Enroll For Personal Banking Link.
     *
     * @return the LoginPage class instance.
     */
    @Then("^User click on Enroll For Personal Banking Link")
    public LoginPage clickEnrollForPersonalBankingLink() {
        enrollForPersonalBanking.click();
        return this;
    }

    /**
     * Click on <WebElement> Link.
     *
     * @return the LoginPage class instance.
     */
//    [Given(@"we have '(.*)'")]
    @Then("^User click on '(.*)' Link")
    public LoginPage clickOnLink(WebElement link) {
        link.click();
        return this;
    }

    /**
     * Click on Esign Link.
     *
     * @return the LoginPage class instance.
     */
    @Then("^User click on Esign Link")
    public LoginPage clickEsignLink() {
        esign.click();
        return this;
    }

    /**
     * Click on Finras Brokercheck Link.
     *
     * @return the LoginPage class instance.
     */
    @Then("^User click on Finras Brokercheck Link")
    public LoginPage clickFinrasBrokercheckLink() {
        finrasBrokercheck.click();
        return this;
    }

    /**
     * Click on Forgot Password Link.
     *
     * @return the LoginPage class instance.
     */
    @Then("^User click on Forgot Password Link")
    public LoginPage clickForgotPasswordLink() {
        forgotPassword.click();
        return this;
    }

    /**
     * Click on Forgot User Id Link.
     *
     * @return the LoginPage class instance.
     */
    @Then("^User click on Forgot User ID Link")
    public LoginPage clickForgotUserIdLink() {
        forgotUserId.click();
        return this;
    }

    /**
     * Click on Fraud Prevention Center Link.
     *
     * @return the LoginPage class instance.
     */
    @Then("^User click on Fraud Prevention Center Link")
    public LoginPage clickFraudPreventionCenterLink() {
        fraudPreventionCenter.click();
        return this;
    }

    /**
     * Click on Locations Link.
     *
     * @return the LoginPage class instance.
     */
    @Then("^User click on Location Link")
    public LoginPage clickLocationsLink() {
        locations.click();
        return this;
    }

    /**
     * Click on Privacy Security Link.
     *
     * @return the LoginPage class instance.
     */
    @Then("^User click on Privacy Security Link")
    public LoginPage clickPrivacySecurityLink() {
        privacySecurity.click();
        return this;
    }

    /**
     * Click on Royal Bank Of Canada Link.
     *
     * @return the LoginPage class instance.
     */
    @Then("^User click on Royal Bank Of Canada Link")
    public LoginPage clickRoyalBankOfCanadaLink() {
        royalBankOfCanada.click();
        return this;
    }

    /**
     * Click on Secure Online Session Link.
     *
     * @return the LoginPage class instance.
     */
    @Then("^User click on Secure Online Session Link")
    public LoginPage clickSecureOnlineSessionLink() {
        secureOnlineSession.click();
        return this;
    }

    /**
     * Click on Sign In Button.
     *
     * @return the LoginPage class instance.
     */
    @Then("^User click on Sign In Button Link")
    public LoginPage clickSignInButton() {
        signIn.click();
        return this;
    }

    /**
     * Click on Terms Conditions Link.
     *
     * @return the LoginPage class instance.
     */
    @When("^User click on Terms Conditions Link")
    public LoginPage clickTermsConditionsLink() {
        termsConditions.click();
        return this;
    }

//    /**
//     * Fill every fields in the page.
//     *
//     * @return the LoginPage class instance.
//     */
//    @When ("^user logged in using username as \"(.*)\" and password as \"(.*)\"$")
//    public LoginPage fill(String user, String password) {
//        setUserId(user);
//        setPassword(password);
//        setRememberUserIdCheckboxField();
//        return submit();
//    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the LoginPage class instance.
     */
    public LoginPage fillAndSubmit(String user, String password) throws InterruptedException {
        fill(user, password);
        return submit();
    }

    /**
     * Set default value to Password Password field.
     *
     * @return the LoginPage class instance.
     */
    public LoginPage setPasswordPasswordField() {
        return setPasswordPasswordField(data.get("PASSWORD"));
    }

    /**
     * Set default value to Password Password field.
     *
     * @return the LoginPage class instance.
     */
    public LoginPage setPassword(String password) {
        return setPasswordPasswordField(password);
    }

    /**
     * Set value to Password Password field.
     *
     * @return the LoginPage class instance.
     */
    public LoginPage setPasswordPasswordField(String passwordValue) {
        password.sendKeys(passwordValue);
        return this;
    }

    /**
     * Set Remember User Id Checkbox field.
     *
     * @return the LoginPage class instance.
     */
    public LoginPage setRememberUserIdCheckboxField() {
        if (!rememberUserId.isSelected()) {
            rememberUserId.click();
        }
        return this;
    }

    /**
     * Set default value to User Id Text field.
     *
     * @return the LoginPage class instance.
     */
    public LoginPage setUserIdTextField() {
        return setUserIdTextField(data.get("USER_ID"));
    }

    /**
     * Set default value to User Id Text field.
     *
     * @return the LoginPage class instance.
     */
    public LoginPage setUserId(String user) {
        return setUserIdTextField(user);
    }

    /**
     * Set value to User Id Text field.
     *
     * @return the LoginPage class instance.
     */
    public LoginPage setUserIdTextField(String userIdValue) {
        userId.sendKeys(userIdValue);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the LoginPage class instance.
     */
    public LoginPage submit() {
        clickSignInButton();
        return this;
    }

    /**
     * Unset Remember User Id Checkbox field.
     *
     * @return the LoginPage class instance.
     */
    public LoginPage unsetRememberUserIdCheckboxField() {
        if (rememberUserId.isSelected()) {
            rememberUserId.click();
        }
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the LoginPage class instance.
     */
    public LoginPage verifyPageLoaded(String title) {
        waitForTitleToAppear(title);
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the LoginPage class instance.
     */
    public LoginPage verifyPageUrl() {
        (new WebDriverWait(getDriver(), timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains("/spaces/");
            }
        });
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the LoginPage class instance.
     */
    @When ("^user logged in using username as \"(.*)\" and password as \"(.*)\"$")
    public void fill(String user, String password) {
        if(getDriver().getCurrentUrl().contains("login")) {
            setUserId(user);
            setPassword(password);
            submit();
            waitForAngularRequestsToFinish();
//            try {
//                waitForTitleToAppear("City National Bank - Home page");
//            } catch (Exception e) {
//                waitForTitleToAppear("City National Online - Confirm Identity");
//            }
        }
    }

    /**
     * User logged with ooba
     *
     * @return the LoginPage class instance.
     */
    @When ("^user logged with OOBA in using username as \"(.*)\" and password as \"(.*)\"$")
    public void userLoggedOOBA(String user, String password) throws Exception {
        if(getDriver().getCurrentUrl().contains("login")){
            setUserId(user);
            setPassword(password);
            submit();
            try{
                waitForTitleToAppear("City National Bank - Home page");}
            catch (Exception e){
                waitForTitleToAppear("City National Online - Confirm Identity");}
            myProfileConfirmPage.OOBASubmit(2);
            myProfileConfirmPage.OOBAcodeSubmit();
            verifyPageUrl();
        }
    }

    @Given("^User navigate to CNO Login page")
    public void i_am_on_the_CNB_login_page() {
        navigateTo.theCnoLoginPage();
    }
}
