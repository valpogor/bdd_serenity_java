package pages;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.List;
import java.util.Map;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreditCardsPaymentsPage extends PageObject {
    private Map<String, String> data;
    private int timeout = 15;

    @FindBy(css = "a[href='https://your_urlCommunicationCenter.aspx?op=1']")
    @CacheLookup
    private WebElement _0;

    @FindBy(id = "CCExtAcctNickname")
    @CacheLookup
    private WebElement accountNickname;

    @FindBy(id = "maskedBox1")
    @CacheLookup
    private WebElement accountNumber;

    @FindBy(css = "#bs-example-navbar-collapse-1 ul:nth-of-type(1) li:nth-of-type(1) a")
    @CacheLookup
    private WebElement accountSummary;

    @FindBy(css = "input.CNBLargeButton.ng-hide")
    @CacheLookup
    private WebElement addAccount1;

    @FindBy(css = "#divManageExternalAccount div.payor-view.col-xs-12.col-sm-12.col-md-11.col-lg-10 div:nth-of-type(2) input:nth-of-type(2)")
    @CacheLookup
    private WebElement addAccount2;

    @FindBy(name = "toggleItem")
    @CacheLookup
    private List<WebElement> addExternalAccounts;

    private final String addExternalAccountsValue = "on";

    @FindBy(css = "a[href='https://your_url/credit-card/alert']")
    @CacheLookup
    private WebElement alerts;

    @FindBy(id = "grdPaymentAmount")
    @CacheLookup
    private WebElement amount;

    @FindBy(xpath = "//*[text()[contains(.,'Make Another Payment')]]")
    @CacheLookup
    public WebElement makeAnotherPayment;

    @FindBy(xpath = "//span[text()[contains(.,'Select Account')]]")
    @CacheLookup
    public WebElement selectAccount;

    @FindBy(xpath = "//*[text()[contains(.,'View Scheduled Payments')]]")
    @CacheLookup
    public WebElement viewScheduledPayments;

    @FindBy(xpath = "//*[text()[contains(.,'Return to Account Summary')]]")
    @CacheLookup
    public WebElement returnToAccountSummary;

    @FindBy(xpath = "//button[text()[contains(.,'Approve')]]")
    @CacheLookup
    public WebElement approve;

    @FindBy(xpath = "(//button[@data-ng-click='methods.confirmedCancel()'])[1]")
    @CacheLookup
    public WebElement yesBtb;

    @FindBy(css = "#divPayment div:nth-of-type(3) div.col-lg-12 auto-payment-directive div.row div.col-lg-8.col-md-10.col-xs-12 div:nth-of-type(5) div.col-xs-12 div:nth-of-type(12) div.formGroup div:nth-of-type(1) input.CNBLargeButton[type='button']")
    @CacheLookup
    private WebElement approve2;

    @FindBy(css = "#confirmPayorWindow div.modal-dialog div.modal-content div:nth-of-type(4) button:nth-of-type(1)")
    @CacheLookup
    private WebElement approve3;

    @FindBy(name = "toggleItem")
    @CacheLookup
    private List<WebElement> autopay;

    private final String autopayValue = "on";

    @FindBy(id = "chkAutoPayConsent")
    @CacheLookup
    private WebElement byCheckingThisBoxIConfirm1;

    @FindBy(css = "input.auto-pay-edit-form__agree")
    @CacheLookup
    private WebElement byCheckingThisBoxIConfirm2;

    @FindBy(css = "#divPayment div:nth-of-type(3) div.col-lg-12 auto-payment-directive div.row div.col-lg-8.col-md-10.col-xs-12 div:nth-of-type(1) div:nth-of-type(5) div.col-xs-12 a.cancelLink")
    @CacheLookup
    private WebElement cancel1;

    @FindBy(css = "#confirmDeleteWindow div.modal-dialog div.modal-content div:nth-of-type(3) button:nth-of-type(2)")
    @CacheLookup
    private WebElement cancel10;

    @FindBy(css = "#confirmDeleteWindowForMultipleAutoPayCard div.modal-dialog div.modal-content div:nth-of-type(3) button:nth-of-type(2)")
    @CacheLookup
    private WebElement cancel11;

    @FindBy(css = "#divAddExternalAccount div.add-payor-view div.ng-pristine.ng-valid.ng-valid-maxlength div:nth-of-type(2) div.col-sm-12 a.cancelLink")
    @CacheLookup
    private WebElement cancel12;

    @FindBy(css = "#confirmPayorWindow div.modal-dialog div.modal-content div:nth-of-type(4) button:nth-of-type(2)")
    @CacheLookup
    private WebElement cancel13;

    @FindBy(css = "#divPayment div:nth-of-type(3) div.col-lg-12 auto-payment-directive div.row div.col-lg-8.col-md-10.col-xs-12 div:nth-of-type(2) div:nth-of-type(2) div.col-xs-12 div:nth-of-type(5) a.cancelLink")
    @CacheLookup
    private WebElement cancel2;

    @FindBy(css = "#divPayment div:nth-of-type(3) div.col-lg-12 auto-payment-directive div.row div.col-lg-8.col-md-10.col-xs-12 div:nth-of-type(3) div.auto-pay-form__cca.row div.col-xs-12 div:nth-of-type(8) div.col-xs-12.formGroup a.cancelLink")
    @CacheLookup
    private WebElement cancel3;

    @FindBy(css = "#divPayment div:nth-of-type(3) div.col-lg-12 auto-payment-directive div.row div.col-lg-8.col-md-10.col-xs-12 div:nth-of-type(4) div..col-xs-12 div:nth-of-type(12) div.formGroup div:nth-of-type(2) a.cancelLink")
    @CacheLookup
    private WebElement cancel4;

    @FindBy(css = "#divPayment div:nth-of-type(3) div.col-lg-12 auto-payment-directive div.row div.col-lg-8.col-md-10.col-xs-12 div:nth-of-type(5) div.col-xs-12 div:nth-of-type(12) div.formGroup div:nth-of-type(2) a.cancelLink")
    @CacheLookup
    private WebElement cancel5;

    @FindBy(css = "#confirmRemoveAutoPay div.modal-dialog div.modal-content div:nth-of-type(3) button:nth-of-type(2)")
    @CacheLookup
    private WebElement cancel6;

    @FindBy(id = "gridLnkCancel")
    @CacheLookup
    private WebElement cancel7;

    @FindBy(id = "lnkCancel")
    @CacheLookup
    private WebElement cancel8;

    @FindBy(css = "#divManageExternalAccount div.payor-view.col-xs-12.col-sm-12.col-md-11.col-lg-10 div:nth-of-type(2) a.cancelLink")
    @CacheLookup
    private WebElement cancel9;

    @FindBy(css = "#divPayment div:nth-of-type(3) div.col-lg-12 auto-payment-directive div.row div.col-lg-8.col-md-10.col-xs-12 input:nth-of-type(4)")
    @CacheLookup
    private WebElement cancelAutoPayment;

    @FindBy(name = "toggleAcountTitle")
    @CacheLookup
    private List<WebElement> checking1;

    @FindBy(name = "account")
    @CacheLookup
    private List<WebElement> checking2;

    @FindBy(css = "a[href='https://your_url/?menu=OpenAccount']")
    @CacheLookup
    private WebElement checkingSavings;

    private final String checkingValue = "on";

//    private final String checkingValue = "Checking";

    @FindBy(css = "#header div.aboveBlueBar.container div:nth-of-type(3) a")
    @CacheLookup
    private WebElement cls1Fill231f20;

    @FindBy(css = "a[href='https://www.your_url/index.asp']")
    @CacheLookup
    private WebElement cnbCom;

    @FindBy(id = "maskedBox2")
    @CacheLookup
    private WebElement confirmAccountNumber;

    @FindBy(css = "#footer div.container.hidden-print div:nth-of-type(1) div:nth-of-type(2) ul li a")
    @CacheLookup
    private WebElement contactUs;

    @FindBy(css = "#divPayment div:nth-of-type(3) div.col-lg-12 auto-payment-directive div.row div.col-lg-8.col-md-10.col-xs-12 div:nth-of-type(1) div:nth-of-type(5) div.col-xs-12 input.CNBLargeButton[type='button']")
    @CacheLookup
    private WebElement continue1;

    @FindBy(css = "#divPayment div:nth-of-type(3) div.col-lg-12 auto-payment-directive div.row div.col-lg-8.col-md-10.col-xs-12 div:nth-of-type(2) div:nth-of-type(2) div.col-xs-12 div:nth-of-type(5) input.CNBLargeButton[type='button']")
    @CacheLookup
    private WebElement continue2;

    @FindBy(id = "ddlCreditCardAccount")
    @CacheLookup
    private WebElement creditCardAccount1;

    @FindBy(id = "ddlCreditCardAccountEdit")
    @CacheLookup
    private WebElement creditCardAccount2;

    @FindBy(css = "a[href='https://your_url/credit-card/payment']")
    @CacheLookup
    private WebElement creditCardPayments;

    @FindBy(css = "#bs-example-navbar-collapse-1 ul:nth-of-type(1) li:nth-of-type(2) ul.dropdown-menu li:nth-of-type(2) a")
    @CacheLookup
    private WebElement creditCards1;

    @FindBy(css = "a[href='https://your_urlcredit-card/']")
    @CacheLookup
    private WebElement creditCards2;

    @FindBy(name = "PaymentOption")
    @CacheLookup
    private List<WebElement> currentBalance1;

    @FindBy(id = "rdoPayCurrentBalance")
    @CacheLookup
    public WebElement currentBalanceRadioButton;

    @FindBy(name = "PaymentOptionEdit")
    @CacheLookup
    private List<WebElement> currentBalance2;

    @FindBy(name = "paymentChoice")
    @CacheLookup
    private List<WebElement> currentBalanceAsOf;

    private final String currentBalanceAsOfValue = "4";

    private final String currentBalanceValue = "4";

//    private final String currentBalanceValue = "4";

    @FindBy(css = "a[href='https://your_url/InterestRate/GetInterestRates']")
    @CacheLookup
    private WebElement currentInterestRates;

    @FindBy(id = "btnDownload")
    @CacheLookup
    private WebElement download;

    @FindBy(xpath = "(//tbody[@role='rowgroup'])[1]//*[text()[contains(.,'Edit')]]")
    @CacheLookup
    public WebElement edit;

    @FindBy(xpath = "(//tbody[@role='rowgroup'])[1]//*[text()[contains(.,'In Process')]]")
    @CacheLookup
    public WebElement inprocess;

    @FindBy(xpath = "(//tbody[@role='rowgroup'])[1]//*[text()[contains(.,'Edit')]]")
    @CacheLookup
    public List<WebElement> editAll;

    @FindBy(xpath = "(//tbody[@role='rowgroup'])[1]//*[text()[contains(.,'Cancel')]]")
    @CacheLookup
    public WebElement cancelBtn;

    @FindBy(xpath = "(//tbody[@role='rowgroup'])[1]//*[text()[contains(.,'Cancel')]]")
    @CacheLookup
    private List<WebElement> cancelBtnAll;

    @FindBy(css = "#gridExternal div:nth-of-type(2) table tbody tr:nth-of-type(1) td:nth-of-type(2) a:nth-of-type(1)")
    @CacheLookup
    private WebElement edit1;

    @FindBy(css = "#gridExternal div:nth-of-type(2) table tbody tr:nth-of-type(2) td:nth-of-type(2) a:nth-of-type(1)")
    @CacheLookup
    private WebElement edit2;

    @FindBy(css = "#confirmDeleteWindowForMultipleAutoPayCard div.modal-dialog div.modal-content div:nth-of-type(3) button:nth-of-type(1)")
    @CacheLookup
    private WebElement editAutoPay;

    @FindBy(css = "#divPayment div:nth-of-type(3) div.col-lg-12 auto-payment-directive div.row div.col-lg-8.col-md-10.col-xs-12 div:nth-of-type(3) div.auto-pay-form__cca.row div.col-xs-12 div:nth-of-type(8) div.col-xs-12.formGroup input:nth-of-type(1)")
    @CacheLookup
    private WebElement editAutopay;

    @FindBy(id = "QSIFeedbackButton-btn")
    @CacheLookup
    private WebElement feedback;

    @FindBy(css = "a[href='https://www.your_url/fraud/']")
    @CacheLookup
    private WebElement fraudPreventionCenter;

    @FindBy(css = "#divPayment div:nth-of-type(3) div.col-lg-12 auto-payment-directive div.row div.col-lg-8.col-md-10.col-xs-12 input:nth-of-type(1)")
    @CacheLookup
    private WebElement getAutoPaymentByAccount;

    @FindBy(css = "#divPayment div:nth-of-type(3) div.col-lg-12 auto-payment-directive div.row div.col-lg-8.col-md-10.col-xs-12 input:nth-of-type(2)")
    @CacheLookup
    private WebElement getAutoPaymentById;

    @FindBy(css = "#divPayment div:nth-of-type(3) div.col-lg-12 auto-payment-directive div.row div.col-lg-8.col-md-10.col-xs-12 input:nth-of-type(3)")
    @CacheLookup
    private WebElement getAutoPaymentByPayorSource;

    @FindBy(css = "#confirmCancelAutoPaymentWindow div.modal-dialog div.modal-content div:nth-of-type(2) p:nth-of-type(2) a")
    @CacheLookup
    private WebElement here;

    @FindBy(name = "PaymentOption")
    @CacheLookup
    private List<WebElement> lastStatementBalance1;

    @FindBy(name = "PaymentOptionEdit")
    @CacheLookup
    private List<WebElement> lastStatementBalance2;

    private final String lastStatementBalanceValue = "1";
    
    @FindBy(css = "a[href='https://locations.your_url/search/']")
    @CacheLookup
    private WebElement locations;

    @FindBy(css = "a[href='https://your_url/credit-card/lockunlock']")
    @CacheLookup
    private WebElement lockAndUnlockCard;

    @FindBy(name = "toggleItem")
    @CacheLookup
    private List<WebElement> makeAPayment;

    private final String makeAPaymentValue = "on";

    @FindBy(id = "btnPayment")
    @CacheLookup
    private WebElement makePayment;

    @FindBy(css = "a[href='https://your_url/?menu=Payment']")
    @CacheLookup
    private WebElement makePayments;

    @FindBy(name = "toggleItem")
    @CacheLookup
    private List<WebElement> manageExternalAccounts1;

    @FindBy(id = "lnkManangeExternalAccounts")
    @CacheLookup
    private WebElement manageExternalAccounts2;

    private final String manageExternalAccountsValue = "on";

    @FindBy(name = "PaymentOption")
    @CacheLookup
    private List<WebElement> minimumPaymentDue1;

    @FindBy(name = "PaymentOptionEdit")
    @CacheLookup
    private List<WebElement> minimumPaymentDue2;

    @FindBy(name = "paymentChoice")
    @CacheLookup
    private List<WebElement> minimumPaymentDue3;

    private final String minimumPaymentDueValue = "2";
    
    @FindBy(css = "#divPayment div:nth-of-type(3) div.col-lg-12 auto-payment-directive div.row div.col-lg-8.col-md-10.col-xs-12 input:nth-of-type(5)")
    @CacheLookup
    private WebElement modifyAutoPayment;

    @FindBy(css = "#bs-example-navbar-collapse-1 ul:nth-of-type(1) li:nth-of-type(2) a.dropdown-toggle")
    @CacheLookup
    private WebElement myAccounts;

    @FindBy(css = "a[href='https://your_urlmy-profile/?firsttimevisit=true']")
    @CacheLookup
    private WebElement myProfile;

    @FindBy(css = "a[href='https://newsroom.your_url/']")
    @CacheLookup
    private WebElement newsinsights;

    @FindBy(css = "#confirmCancelAutoPayWindow div.modal-dialog div.modal-content div:nth-of-type(3) button:nth-of-type(2)")
    @CacheLookup
    private WebElement no1;

    @FindBy(css = "#confirmCancelPaymentWindow div.modal-dialog div.modal-content div:nth-of-type(3) button:nth-of-type(2)")
    @CacheLookup
    private WebElement no2;

    @FindBy(css = "#confirmCancelAutoPaymentWindow div.modal-dialog div.modal-content div:nth-of-type(3) button:nth-of-type(2)")
    @CacheLookup
    private WebElement no3;

    @FindBy(css = "#cancelExitWindow div.modal-dialog div.modal-content div:nth-of-type(3) button:nth-of-type(2)")
    @CacheLookup
    private WebElement no4;

    @FindBy(css = "#cancelUpdateWindow div.modal-dialog div.modal-content div:nth-of-type(3) button:nth-of-type(2)")
    @CacheLookup
    private WebElement no5;

    @FindBy(css = "#confirmExitWindow div.modal-dialog div.modal-content div:nth-of-type(3) button:nth-of-type(2)")
    @CacheLookup
    private WebElement no6;

    @FindBy(css = "a[href='https://your_url/']")
    @CacheLookup
    private WebElement onlineBanking;

    @FindBy(css = "#bs-example-navbar-collapse-1 ul:nth-of-type(1) li:nth-of-type(4) a.dropdown-toggle")
    @CacheLookup
    private WebElement openAnAccount;

    @FindBy(css = "#lblPaymentAmount span.amount-info a.js-modal")
    @CacheLookup
    private WebElement openDialogForMoreInfo1;
    

    @FindBy(css = "#lblPaymentDate span.payment-date-info a.js-modal")
    @CacheLookup
    private WebElement openDialogForMoreInfo2;

    @FindBy(css = "#divPayment div:nth-of-type(3) div.col-lg-12 auto-payment-directive div.row div.col-lg-8.col-md-10.col-xs-12 div:nth-of-type(2) div:nth-of-type(2) div.col-xs-12 div:nth-of-type(3) div.col-xs-12.col-sm-9.col-md-7.col-lg-6.formGroup label span.amount-info a.js-modal")
    @CacheLookup
    private WebElement openDialogForMoreInfo3;

    @FindBy(css = "#divPayment div:nth-of-type(3) div.col-lg-12 auto-payment-directive div.row div.col-lg-8.col-md-10.col-xs-12 div:nth-of-type(2) div:nth-of-type(2) div.col-xs-12 div:nth-of-type(4) div.col-xs-12.col-sm-9.col-md-7.col-lg-6.formGroup span.payment-date-info a.js-modal")
    @CacheLookup
    private WebElement openDialogForMoreInfo4;

    @FindBy(id = "label_modal_1")
    @CacheLookup
    private WebElement openDialogForMoreInfo5;

    @FindBy(id = "label_modal_2")
    @CacheLookup
    private WebElement openDialogForMoreInfo6;

    @FindBy(css = "#ScheduledPaymentsContainer payment-grid-directive.col-lg-12.col-md-12.col-xs-12.ng-isolate-scope div:nth-of-type(2) span.amount-info a.js-modal")
    @CacheLookup
    private WebElement openDialogForMoreInfo7;

    @FindBy(id = "label_modal_3")
    @CacheLookup
    private WebElement openDialogForMoreInfo8;

    @FindBy(id = "label_modal_4")
    @CacheLookup
    private WebElement openDialogForMoreInfo9;

    @FindBy(name = "PaymentOption")
    @CacheLookup
    private List<WebElement> other1;

    @FindBy(name = "paymentChoice")
    @CacheLookup
    private List<WebElement> other2;

    @FindBy(id = "inpOther")
    @CacheLookup
    private WebElement other3;

    @FindBy(id = "inpOther")
    @CacheLookup
    private WebElement otherAmount;

    private final String otherValue = "3";
    
    @FindBy(css = "a[href='https://your_urlpayment/wire/outgoing-wire-activities']")
    @CacheLookup
    private WebElement outgoingWireActivity;

    private final String pageLoadedText = "Payments submitted on weekends and federal holidays will be processed on the next business day";

    private final String pageUrl = "/spaces/account/credit-card/payment";

    @FindBy(css = "a[href='https://your_url/credit-card/paperless']")
    @CacheLookup
    private WebElement paperlessEnrollment;

    @FindBy(xpath = "//*[@class='row payFrom-row']//*[@class='k-widget k-dropdown k-header']")
    @CacheLookup
    private WebElement payFrom;

    @FindBy(xpath = "//*[@id='payFrom_listbox']/li[1]/span")
    @CacheLookup
    private WebElement payFromDropdownFirstCard;

    @FindBy(xpath = "//*[@id='payFrom_listbox']/li[2]/span")
    @CacheLookup
    private WebElement payFromDropdownSecondCard;

    @FindBy(xpath = "//*[@id='ddlAccounts_listbox']/li[1]/span")
    @CacheLookup
    private WebElement alertsDropdownFirstCard;

    @FindBy(xpath = "//*[@id='ddlAccounts_listbox']/li[2]/span")
    @CacheLookup
    private WebElement alertsDropdownSecondCard;

    @FindBy(id = "ddlBankAccountEdit")
    @CacheLookup
    private WebElement payFrom2;

    @FindBy(id = "gridPayFrom")
    @CacheLookup
    private WebElement payFrom3;

    @FindBy(id = "payFrom")
    @CacheLookup
    private WebElement payFrom4;

    @FindBy(id = "payTo")
    @CacheLookup
    private WebElement payTo;

    @FindBy(id = "paymentDateFieldEdit")
    @CacheLookup
    private WebElement paymentDateEdit;

    @FindBy(id = "paymentDateField")
    @CacheLookup
    private WebElement paymentDate;

    @FindBy(css = "#bs-example-navbar-collapse-1 ul:nth-of-type(1) li:nth-of-type(3) a.dropdown-toggle")
    @CacheLookup
    private WebElement paymentsTransfers;

    @FindBy(css = "#divPayment div:nth-of-type(3) div.col-lg-12 auto-payment-directive div.row div.col-lg-8.col-md-10.col-xs-12 div:nth-of-type(4) div..col-xs-12 a.pull-right.auto-pay-print")
    @CacheLookup
    private WebElement print1;

    @FindBy(css = "#divPayment div:nth-of-type(3) div.col-lg-12 auto-payment-directive div.row div.col-lg-8.col-md-10.col-xs-12 div:nth-of-type(5) div.col-xs-12 a.pull-right.auto-pay-print")
    @CacheLookup
    private WebElement print2;

    @FindBy(id = "btnPrint")
    @CacheLookup
    private WebElement print3;

    @FindBy(css = "a[href='https://www.your_url/about/privacy-security/']")
    @CacheLookup
    private WebElement privacySecurity;

    @FindBy(css = "#confirmRemoveAutoPay div.modal-dialog div.modal-content div:nth-of-type(3) button:nth-of-type(1)")
    @CacheLookup
    private WebElement remove1;

    @FindBy(css = "#gridExternal div:nth-of-type(2) table tbody tr:nth-of-type(1) td:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement remove2;

    @FindBy(css = "#gridExternal div:nth-of-type(2) table tbody tr:nth-of-type(2) td:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement remove3;

    @FindBy(css = "#confirmDeleteWindow div.modal-dialog div.modal-content div:nth-of-type(3) button:nth-of-type(1)")
    @CacheLookup
    private WebElement remove4;

    @FindBy(css = "input.CNBLargeButtonSecondary")
    @CacheLookup
    private WebElement removeAutopay;

    @FindBy(id = "inpRoutingNo")
    @CacheLookup
    private WebElement routingNumber;

    @FindBy(css = "#divAddExternalAccount div.add-payor-view div.ng-pristine.ng-valid.ng-valid-maxlength div:nth-of-type(2) div.col-sm-12 input.CNBLargeButton[type='button']")
    @CacheLookup
    private WebElement saveAccount;

    @FindBy(id = "gridBtnSave")
    @CacheLookup
    private WebElement saveChanges;

    @FindBy(name = "toggleAcountTitle")
    @CacheLookup
    private List<WebElement> savings1;

    @FindBy(name = "account")
    @CacheLookup
    private List<WebElement> savings2;

    private final String savingsValue = "on";
    
    @FindBy(css = "a[href='https://www.your_url/fraud/online-security.asp']")
    @CacheLookup
    private WebElement secureOnlineSession;

    @FindBy(css = "a[href='https://your_url/cnbsso/CNBSSO/logout.jsp?logid=1']")
    @CacheLookup
    private WebElement signOut;

    @FindBy(css = "a.sr-only.sr-only-focusable.btn.btn-primary")
    @CacheLookup
    private WebElement skipToMainContent;

    @FindBy(css = "a[href='https://your_url/credit-card/spending-limit']")
    @CacheLookup
    private WebElement spendingLimits;

    @FindBy(name = "paymentChoice")
    @CacheLookup
    private List<WebElement> statementBalance;

    private final String statementBalanceValue = "1";

    @FindBy(css = "a[href='https://your_url/credit-card/statement']")
    @CacheLookup
    private WebElement statements;

    @FindBy(css = "a[href='https://your_url/terms-and-conditions/']")
    @CacheLookup
    private WebElement termsConditions;

    @FindBy(css = "button.navbar-toggle.collapsed")
    @CacheLookup
    private WebElement toggleNavigation;

    @FindBy(css = "#divPayment div:nth-of-type(5) div.col-sm-12.col-md-12.col-lg-12.col-xl-12 span:nth-of-type(2) a")
    @CacheLookup
    private WebElement transactionHistory1;

    @FindBy(css = "#divPayment div:nth-of-type(5) div.col-sm-12.col-md-12.col-lg-12.col-xl-12 span:nth-of-type(7) a")
    @CacheLookup
    private WebElement transactionHistory2;

    @FindBy(css = "a[href='https://your_url/credit-card/transaction']")
    @CacheLookup
    private WebElement transactions;

    @FindBy(css = "a[href='https://your_url/?menu=Transfer']")
    @CacheLookup
    private WebElement transferFunds;

    @FindBy(css = "#divPayment div:nth-of-type(5) div.col-sm-12.col-md-12.col-lg-12.col-xl-12 span:nth-of-type(1) a")
    @CacheLookup
    private WebElement viewPreviousPayments1;

    @FindBy(css = "#divPayment div:nth-of-type(5) div.col-sm-12.col-md-12.col-lg-12.col-xl-12 span:nth-of-type(6) a")
    @CacheLookup
    private WebElement viewPreviousPayments2;

    @FindBy(id = "lnkScheduledPayment")
    @CacheLookup
    private WebElement viewScheduledPayment;

    @FindBy(css = "a[href='https://your_urlpayment/']")
    @CacheLookup
    private WebElement wireTransferRequest;

    @FindBy(css = "#confirmCancelAutoPayWindow div.modal-dialog div.modal-content div:nth-of-type(3) button:nth-of-type(1)")
    @CacheLookup
    private WebElement yes1;

    @FindBy(css = "#confirmCancelPaymentWindow div.modal-dialog div.modal-content div:nth-of-type(3) button:nth-of-type(1)")
    @CacheLookup
    private WebElement yes2;

    @FindBy(css = "#confirmCancelAutoPaymentWindow div.modal-dialog div.modal-content div:nth-of-type(3) button:nth-of-type(1)")
    @CacheLookup
    private WebElement yes3;

    @FindBy(css = "#cancelExitWindow div.modal-dialog div.modal-content div:nth-of-type(3) button:nth-of-type(1)")
    @CacheLookup
    private WebElement yes4;

    @FindBy(css = "#cancelUpdateWindow div.modal-dialog div.modal-content div:nth-of-type(3) button:nth-of-type(1)")
    @CacheLookup
    private WebElement yes5;

    @FindBy(css = "#confirmExitWindow div.modal-dialog div.modal-content div:nth-of-type(3) button:nth-of-type(1)")
    @CacheLookup
    private WebElement yes6;

   
    public CreditCardsPaymentsPage() {
    }

    /**
     * Click on Account Summary Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickAccountSummaryLink() {
        waitFor(accountSummary).click();
        return this;
    }

    /**
     * Click on Add Account Button.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickAddAccount1Button() {
        addAccount1.click();
        return this;
    }

    /**
     * Click on Add Account Button.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickAddAccount2Button() {
        addAccount2.click();
        return this;
    }

    /**
     * Click on Alerts Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickAlertsLink() {
        waitFor(alerts).click();
        return this;
    }

    /**
     * Click on Approve Button.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickApproveButton() {
        waitFor(approve).click();
        return this;
    }

    /**
     * Click on Approve Button.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickYesBtb() {
        waitFor(yesBtb).click();
        return this;
    }

    /**
     * Click on Make Another Payment.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickMakeAnotherPayment() {
        waitFor(makeAnotherPayment).click();
        return this;
    }

    /**
     * Click on Select Account
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickSelectAccount() {
        waitFor(selectAccount).click();
        return this;
    }

    /**
     * Click on Approve Button.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickApprove2Button() {
        approve2.click();
        return this;
    }

    /**
     * Click on Approve Button.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickApprove3Button() {
        approve3.click();
        return this;
    }

    /**
     * Click on Cancel Button.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickCancel10Button() {
        cancel10.click();
        return this;
    }

    /**
     * Click on Cancel Button.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickCancel11Button() {
        cancel11.click();
        return this;
    }

    /**
     * Click on Cancel Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickCancel12Link() {
        cancel12.click();
        return this;
    }

    /**
     * Click on Cancel Button.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickCancel13Button() {
        cancel13.click();
        return this;
    }

    /**
     * Click on Cancel Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickCancel1Link() {
        cancel1.click();
        return this;
    }

    /**
     * Click on Cancel Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickCancel2Link() {
        cancel2.click();
        return this;
    }

    /**
     * Click on Cancel Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickCancel3Link() {
        cancel3.click();
        return this;
    }

    /**
     * Click on Cancel Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickCancel4Link() {
        cancel4.click();
        return this;
    }

    /**
     * Click on Cancel Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickCancel5Link() {
        cancel5.click();
        return this;
    }

    /**
     * Click on Cancel Button.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickCancel6Button() {
        cancel6.click();
        return this;
    }

    /**
     * Click on Cancel Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickCancel7Link() {
        cancel7.click();
        return this;
    }

    /**
     * Click on Cancel Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickCancel8Link() {
        cancel8.click();
        return this;
    }

    /**
     * Click on Cancel Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickCancel9Link() {
        cancel9.click();
        return this;
    }

    /**
     * Click on Cancel Auto Payment Button.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickCancelAutoPaymentButton() {
        cancelAutoPayment.click();
        return this;
    }

    /**
     * Click on Checking Savings Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickCheckingSavingsLink() {
        checkingSavings.click();
        return this;
    }

    /**
     * Click on .Cls1 Fill 231f20 .Cls2 Fill 1b559b .Cls3 Fill 0060a9 .Cls4 Fill Ffd520 .Cls5 Fill Fff City National Bank Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickCls1Fill231f20Link() {
        cls1Fill231f20.click();
        return this;
    }

    /**
     * Click on your_url Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickCnbComLink() {
        cnbCom.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickContactUsLink() {
        contactUs.click();
        return this;
    }

    /**
     * Click on Continue Button.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickContinue1Button() {
        continue1.click();
        return this;
    }

    /**
     * Click on Continue Button.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickContinue2Button() {
        continue2.click();
        return this;
    }

    /**
     * Click on Credit Card Payments Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickCreditCardPaymentsLink() {
        creditCardPayments.click();
        return this;
    }

    /**
     * Click on Credit Cards Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickCreditCards1Link() {
        creditCards1.click();
        return this;
    }

    /**
     * Click on Credit Cards Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickCreditCards2Link() {
        creditCards2.click();
        return this;
    }

    /**
     * Click on Current Interest Rates Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickCurrentInterestRatesLink() {
        currentInterestRates.click();
        return this;
    }

    /**
     * Click on Download Button.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickDownloadButton() {
        download.click();
        return this;
    }

    /**
     * Click on Edit Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickEdit1Link() {
        edit1.click();
        return this;
    }

    /**
     * Click on Edit Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickEdit2Link() {
        edit2.click();
        return this;
    }

    /**
     * Click on Edit Auto Pay Button.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickEditAutoPayButton() {
        editAutoPay.click();
        return this;
    }

    /**
     * Click on Edit Autopay Button.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickEditAutopayButton() {
        editAutopay.click();
        return this;
    }

    /**
     * Click on Feedback Button.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickFeedbackButton() {
        feedback.click();
        return this;
    }

    /**
     * Click on Fraud Prevention Center Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickFraudPreventionCenterLink() {
        fraudPreventionCenter.click();
        return this;
    }

    /**
     * Click on Get Auto Payment By Account Button.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickGetAutoPaymentByAccountButton() {
        getAutoPaymentByAccount.click();
        return this;
    }

    /**
     * Click on Get Auto Payment By Id Button.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickGetAutoPaymentByIdButton() {
        getAutoPaymentById.click();
        return this;
    }

    /**
     * Click on Get Auto Payment By Payor Source Button.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickGetAutoPaymentByPayorSourceButton() {
        getAutoPaymentByPayorSource.click();
        return this;
    }

    /**
     * Click on Here Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickHereLink() {
        here.click();
        return this;
    }

    /**
     * Click on 0 Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickLink0() {
        _0.click();
        return this;
    }

    /**
     * Click on Locations Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickLocationsLink() {
        locations.click();
        return this;
    }

    /**
     * Click on Lock And Unlock Card Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickLockAndUnlockCardLink() {
        waitFor(lockAndUnlockCard).click();
        return this;
    }

    /**
     * Click on Make Payment Button.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickMakePaymentButton() {
        waitFor(makePayment).click();
        return this;
    }

    /**
     * Click on Make Payments Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickMakePaymentsLink() {
        waitFor(makePayments).click();
        return this;
    }

    /**
     * Set default value to Manage External Accounts Radio Button field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickManageExternalAccounts1Link() {
        for (WebElement el : manageExternalAccounts1) {
            if (el.getAttribute("value").equals(manageExternalAccountsValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Click on Manage External Accounts Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickManageExternalAccounts2Link() {
        manageExternalAccounts2.click();
        return this;
    }

    /**
     * Click on Modify Auto Payment Button.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickModifyAutoPaymentButton() {
        modifyAutoPayment.click();
        return this;
    }

    /**
     * Click on My Accounts Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickMyAccountsLink() {
        myAccounts.click();
        return this;
    }

    /**
     * Click on My Profile Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickMyProfileLink() {
        myProfile.click();
        return this;
    }

    /**
     * Click on Newsinsights Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickNewsinsightsLink() {
        newsinsights.click();
        return this;
    }

    /**
     * Click on No Button.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickNo1Button() {
        no1.click();
        return this;
    }

    /**
     * Click on No Button.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickNo2Button() {
        no2.click();
        return this;
    }

    /**
     * Click on No Button.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickNo3Button() {
        no3.click();
        return this;
    }

    /**
     * Click on No Button.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickNo4Button() {
        no4.click();
        return this;
    }

    /**
     * Click on No Button.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickNo5Button() {
        no5.click();
        return this;
    }

    /**
     * Click on No Button.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickNo6Button() {
        no6.click();
        return this;
    }

    /**
     * Click on Online Banking Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickOnlineBankingLink() {
        onlineBanking.click();
        return this;
    }

    /**
     * Click on Open An Account Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickOpenAnAccountLink() {
        openAnAccount.click();
        return this;
    }

    /**
     * Click on Open Dialog For More Info. Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickOpenDialogForMoreInfo1Link() {
        openDialogForMoreInfo1.click();
        return this;
    }

    /**
     * Click on Open Dialog For More Info. Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickOpenDialogForMoreInfo2Link() {
        openDialogForMoreInfo2.click();
        return this;
    }

    /**
     * Click on Open Dialog For More Info. Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickOpenDialogForMoreInfo3Link() {
        openDialogForMoreInfo3.click();
        return this;
    }

    /**
     * Click on Open Dialog For More Info. Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickOpenDialogForMoreInfo4Link() {
        openDialogForMoreInfo4.click();
        return this;
    }

    /**
     * Click on Open Dialog For More Info. Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickOpenDialogForMoreInfo5Link() {
        openDialogForMoreInfo5.click();
        return this;
    }

    /**
     * Click on Open Dialog For More Info. Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickOpenDialogForMoreInfo6Link() {
        openDialogForMoreInfo6.click();
        return this;
    }

    /**
     * Click on Open Dialog For More Info. Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickOpenDialogForMoreInfo7Link() {
        openDialogForMoreInfo7.click();
        return this;
    }

    /**
     * Click on Open Dialog For More Info. Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickOpenDialogForMoreInfo8Link() {
        openDialogForMoreInfo8.click();
        return this;
    }

    /**
     * Click on Open Dialog For More Info. Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickOpenDialogForMoreInfo9Link() {
        openDialogForMoreInfo9.click();
        return this;
    }

    /**
     * Click on Outgoing Wire Activity Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickOutgoingWireActivityLink() {
        outgoingWireActivity.click();
        return this;
    }

    /**
     * Click on Paperless Enrollment Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickPaperlessEnrollmentLink() {
        paperlessEnrollment.click();
        return this;
    }

    /**
     * Click on Payments Transfers Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickPaymentsTransfersLink() {
        paymentsTransfers.click();
        return this;
    }

    /**
     * Click on Print Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickPrint1Link() {
        print1.click();
        return this;
    }

    /**
     * Click on Print Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickPrint2Link() {
        print2.click();
        return this;
    }

    /**
     * Click on Print Button.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickPrint3Button() {
        print3.click();
        return this;
    }

    /**
     * Click on Privacy Security Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickPrivacySecurityLink() {
        privacySecurity.click();
        return this;
    }

    /**
     * Click on Remove Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickRemove1Link() {
        remove1.click();
        return this;
    }

    /**
     * Click on Remove Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickRemove2Link() {
        remove2.click();
        return this;
    }

    /**
     * Click on Remove Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickRemove3Link() {
        remove3.click();
        return this;
    }

    /**
     * Click on Remove Button.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickRemove4Button() {
        remove4.click();
        return this;
    }

    /**
     * Click on Remove Autopay Button.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickRemoveAutopayButton() {
        removeAutopay.click();
        return this;
    }

    /**
     * Click on Save Account Button.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickSaveAccountButton() {
        saveAccount.click();
        return this;
    }

    /**
     * Click on Save Changes Button.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickSaveChangesButton() {
        saveChanges.click();
        return this;
    }

    /**
     * Click on Secure Online Session Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickSecureOnlineSessionLink() {
        secureOnlineSession.click();
        return this;
    }

    /**
     * Click on Sign Out Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickSignOutLink() {
        signOut.click();
        return this;
    }

    /**
     * Click on Skip To Main Content Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickSkipToMainContentLink() {
        skipToMainContent.click();
        return this;
    }

    /**
     * Click on Spending Limits Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickSpendingLimitsLink() {
        spendingLimits.click();
        return this;
    }

    /**
     * Click on Statements Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickStatementsLink() {
        statements.click();
        return this;
    }

    /**
     * Click on Terms Conditions Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickTermsConditionsLink() {
        termsConditions.click();
        return this;
    }

    /**
     * Click on Toggle Navigation Button.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickToggleNavigationButton() {
        toggleNavigation.click();
        return this;
    }

    /**
     * Click on Transaction History Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickTransactionHistory1Link() {
        transactionHistory1.click();
        return this;
    }

    /**
     * Click on Transaction History Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickTransactionHistory2Link() {
        transactionHistory2.click();
        return this;
    }

    /**
     * Click on Transactions Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickTransactionsLink() {
        transactions.click();
        return this;
    }

    /**
     * Click on Transfer Funds Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickTransferFundsLink() {
        transferFunds.click();
        return this;
    }

    /**
     * Click on View Previous Payments Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickViewPreviousPayments1Link() {
        viewPreviousPayments1.click();
        return this;
    }

    /**
     * Click on View Previous Payments Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickViewPreviousPayments2Link() {
        viewPreviousPayments2.click();
        return this;
    }

    /**
     * Click on View Scheduled Payments Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickViewScheduledPaymentsLink() {
        viewScheduledPayments.click();
        return this;
    }

    /**
     * Click on Wire Transfer Request Link.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickWireTransferRequestLink() {
        wireTransferRequest.click();
        return this;
    }

    /**
     * Click on Yes Button.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickYes1Button() {
        yes1.click();
        return this;
    }

    /**
     * Click on Yes Button.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickYes2Button() {
        yes2.click();
        return this;
    }

    /**
     * Click on Yes Button.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickYes3Button() {
        yes3.click();
        return this;
    }

    /**
     * Click on Yes Button.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickYes4Button() {
        yes4.click();
        return this;
    }

    /**
     * Click on Yes Button.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickYes5Button() {
        yes5.click();
        return this;
    }

    /**
     * Click on Yes Button.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage clickYes6Button() {
        yes6.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage fill() {
        setMakeAPaymentRadioButtonField();
        setAutopayRadioButtonField();
        clickManageExternalAccounts1Link();
        setAddExternalAccountsRadioButtonField();
        setCreditCardAccount1DropDownListField();
        setPayFromDropDownListField();
        setMinimumPaymentDue1RadioButtonField();
        setCurrentBalance1RadioButtonField();
        setLastStatementBalance1RadioButtonField();
        setOther1RadioButtonField();
        setOtherAmountTextField();
        setPayFrom2DropDownListField();
        setMinimumPaymentDue2RadioButtonField();
        setCurrentBalance2RadioButtonField();
        setLastStatementBalance2RadioButtonField();
        setCreditCardAccount2DropDownListField();
        setByCheckingThisBoxIConfirm1CheckboxField();
        setByCheckingThisBoxIConfirm2CheckboxField();
        setPayFrom3DropDownListField();
        setPaymentDateTextField();
        setAmountTextField();
        setPaymentDateOpenDialogForMore1CheckboxField();
        setPaymentDateOpenDialogForMore2CheckboxField();
        setPayToDropDownListField();
        setPayFrom4DropDownListField();
//        setMinimumPaymentDueBy10152020RadioButtonField();
//        setCurrentBalanceAsOf10062020RadioButtonField();
//        setStatementBalanceAsOf09182020RadioButtonField();
        setOther2RadioButtonField();
        setOther3TextField();
        setPaymentDateOpenDialogForMore3TextField();
        setAccountNicknameTextField();
        setRoutingNumberTextField();
        setAccountNumberTextField();
        setConfirmAccountNumberTextField();
        setChecking1RadioButtonField();
        setSavings1RadioButtonField();
        setChecking2RadioButtonField();
        setSavings2RadioButtonField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to Account Nickname Text field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setAccountNicknameTextField() {
        return setAccountNicknameTextField(data.get("ACCOUNT_NICKNAME"));
    }

    /**
     * Set value to Account Nickname Text field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setAccountNicknameTextField(String accountNicknameValue) {
        accountNickname.sendKeys(accountNicknameValue);
        return this;
    }

    /**
     * Set default value to Account Number Text field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setAccountNumberTextField() {
        return setAccountNumberTextField(data.get("ACCOUNT_NUMBER"));
    }

    /**
     * Set value to Account Number Text field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setAccountNumberTextField(String accountNumberValue) {
        accountNumber.sendKeys(accountNumberValue);
        return this;
    }

    /**
     * Set default value to Add External Accounts Radio Button field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setAddExternalAccountsRadioButtonField() {
        for (WebElement el : addExternalAccounts) {
            if (el.getAttribute("value").equals(addExternalAccountsValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Amount Text field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setAmountTextField() {
        return setAmountTextField(data.get("AMOUNT"));
    }

    /**
     * Set value to Amount Text field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setAmountTextField(String amountValue) {
        amount.sendKeys(amountValue);
        return this;
    }

    /**
     * Set default value to Autopay Radio Button field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setAutopayRadioButtonField() {
        for (WebElement el : autopay) {
            if (el.getAttribute("value").equals(autopayValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set By Checking This Box I Confirm That I Have Read And Agree To The Terms And Conditions Of The Credit Card Automatic Payment Authorization And Agreement Checkbox field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setByCheckingThisBoxIConfirm1CheckboxField() {
        if (!byCheckingThisBoxIConfirm1.isSelected()) {
            byCheckingThisBoxIConfirm1.click();
        }
        return this;
    }

    /**
     * Set By Checking This Box I Confirm That I Have Read And Agree To The Terms And Conditions Of The Credit Card Automatic Payment Authorization And Agreement Checkbox field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setByCheckingThisBoxIConfirm2CheckboxField() {
        if (!byCheckingThisBoxIConfirm2.isSelected()) {
            byCheckingThisBoxIConfirm2.click();
        }
        return this;
    }

    /**
     * Set default value to Checking Radio Button field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setChecking1RadioButtonField() {
        for (WebElement el : checking1) {
            if (el.getAttribute("value").equals(checkingValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Checking Radio Button field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setChecking2RadioButtonField() {
        for (WebElement el : checking2) {
            if (el.getAttribute("value").equals(checkingValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Confirm Account Number Text field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setConfirmAccountNumberTextField() {
        return setConfirmAccountNumberTextField(data.get("CONFIRM_ACCOUNT_NUMBER"));
    }

    /**
     * Set value to Confirm Account Number Text field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setConfirmAccountNumberTextField(String confirmAccountNumberValue) {
        confirmAccountNumber.sendKeys(confirmAccountNumberValue);
        return this;
    }

    /**
     * Set default value to Credit Card Account Drop Down List field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setCreditCardAccount1DropDownListField() {
        return setCreditCardAccount1DropDownListField(data.get("CREDIT_CARD_ACCOUNT_1"));
    }

    /**
     * Set value to Credit Card Account Drop Down List field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setCreditCardAccount1DropDownListField(String creditCardAccount1Value) {
        new Select(creditCardAccount1).selectByVisibleText(creditCardAccount1Value);
        return this;
    }

    /**
     * Set default value to Credit Card Account Drop Down List field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setCreditCardAccount2DropDownListField() {
        return setCreditCardAccount2DropDownListField(data.get("CREDIT_CARD_ACCOUNT_2"));
    }

    /**
     * Set value to Credit Card Account Drop Down List field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setCreditCardAccount2DropDownListField(String creditCardAccount2Value) {
        new Select(creditCardAccount2).selectByVisibleText(creditCardAccount2Value);
        return this;
    }


    /**
     * Set default value to Current Balance Radio Button field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setCurrentBalance1RadioButtonField() {
        for (WebElement el : currentBalance1) {
            if (el.getAttribute("value").equals(currentBalanceValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Click on Current Balance Radio Button field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public void clickCurrentBalanceRadioButton() {
        waitFor(currentBalanceRadioButton).click();
    }

    /**
     * Get next saturday / sunday
     * @return the CreditCardsPaymentsPage class instance.
     */
    public static String getNextDayDate(int dayOfWeek) {
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String nextDate = sdf.format(LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.of(dayOfWeek))));
        System.out.println("Day: "+nextDate);
        return nextDate;
    }

    /**
     * Set default value to Current Balance Radio Button field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setCurrentBalance2RadioButtonField() {
        for (WebElement el : currentBalance2) {
            if (el.getAttribute("value").equals(currentBalanceValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

//    /**
//     * Set default value to Current Balance As Of 10062020 Radio Button field.
//     *
//     * @return the CreditCardsPaymentsPage class instance.
//     */
//    public CreditCardsPaymentsPage setCurrentBalanceAsOf10062020RadioButtonField() {
//        for (WebElement el : currentBalanceAsOf10062020) {
//            if (el.getAttribute("value").equals(currentBalanceAsOf10062020Value)) {
//                if (!el.isSelected()) {
//                    el.click();
//                }
//                break;
//            }
//        }
//        return this;
//    }

    /**
     * Set default value to Last Statement Balance Radio Button field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setLastStatementBalance1RadioButtonField() {
        for (WebElement el : lastStatementBalance1) {
            if (el.getAttribute("value").equals(lastStatementBalanceValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Last Statement Balance Radio Button field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setLastStatementBalance2RadioButtonField() {
        for (WebElement el : lastStatementBalance2) {
            if (el.getAttribute("value").equals(lastStatementBalanceValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Make A Payment Radio Button field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setMakeAPaymentRadioButtonField() {
        for (WebElement el : makeAPayment) {
            if (el.getAttribute("value").equals(makeAPaymentValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Minimum Payment Due Radio Button field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setMinimumPaymentDue1RadioButtonField() {
        for (WebElement el : minimumPaymentDue1) {
            if (el.getAttribute("value").equals(minimumPaymentDueValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Minimum Payment Due Radio Button field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setMinimumPaymentDue2RadioButtonField() {
        for (WebElement el : minimumPaymentDue2) {
            if (el.getAttribute("value").equals(minimumPaymentDueValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

//    /**
//     * Set default value to Minimum Payment Due By 10152020 Radio Button field.
//     *
//     * @return the CreditCardsPaymentsPage class instance.
//     */
//    public CreditCardsPaymentsPage setMinimumPaymentDueBy10152020RadioButtonField() {
//        for (WebElement el : minimumPaymentDueBy10152020) {
//            if (el.getAttribute("value").equals(minimumPaymentDueBy10152020Value)) {
//                if (!el.isSelected()) {
//                    el.click();
//                }
//                break;
//            }
//        }
//        return this;
//    }

    /**
     * Set default value to Other Radio Button field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setOther1RadioButtonField() {
        for (WebElement el : other1) {
            if (el.getAttribute("value").equals(otherValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Other Radio Button field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setOther2RadioButtonField() {
        for (WebElement el : other2) {
            if (el.getAttribute("value").equals(otherValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Other Text field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setOther3TextField() {
        return setOther3TextField(data.get("OTHER_3"));
    }

    /**
     * Set value to Other Text field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setOther3TextField(String other3Value) {
        other3.sendKeys(other3Value);
        return this;
    }

    /**
     * Set default value to Other Amount Text field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setOtherAmountTextField() {
        return setOtherAmountTextField(data.get("OTHER_AMOUNT"));
    }

    /**
     * Set value to Other Amount Text field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setOtherAmountTextField(String otherAmountValue) {
        otherAmount.sendKeys(otherAmountValue);
        return this;
    }

    /**
     * Set default value to Pay From Drop Down List field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setPayFromDropDownListField() {
        return setPayFromDropDownListField(data.get("PAY_FROM_1"));
    }

    /**
     * Set value to Pay From Drop Down List field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setPayFromDropDownListField(String payFromValue) {
        new Select(payFrom).selectByVisibleText(payFromValue);
        return this;
    }

    /**
     * click to card from Pay From dropdown
     */
    public void clickPayFromCard(int card) {
        if(card==1){waitFor(payFromDropdownFirstCard).click();}
        else if (card==2){waitFor(payFromDropdownSecondCard).click();}
    }

    /**
     * select a card from dropdown on Alerts page
     */
    public void selectCard(int card) throws Exception{
        Thread.sleep(10900000);
        if(card==1){waitFor(alertsDropdownFirstCard).click();}
        else if (card==2){waitFor(alertsDropdownSecondCard).click();}
    }

    /**
     * click on Pay From
     */
    public void clickPayFrom() throws Exception{
        Thread.sleep(10000);
        payFrom.click();
    }

    /**
     * click on View Scheduled Payments
     */
    public void clickViewScheduledPayments() throws Exception {
        Thread.sleep(10000);
        viewScheduledPayment.isDisplayed();
        viewScheduledPayment.click();
    }

    /**
     * click on Edit from View Scheduled Payments
     */
    public void clickEditViewScheduledPayments() {
        edit.isDisplayed();
        edit.click();
    }

    /**
     * click on Cancel from View Scheduled Payments
     */
    public void clickCancelViewScheduledPayments() {
        setWaitForElementTimeout(10);
        cancelBtnAll.get(1).click();
    }

    /**
     * Set default value to Pay From Drop Down List field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setPayFrom2DropDownListField() {
        return setPayFrom2DropDownListField(data.get("PAY_FROM_2"));
    }

    /**
     * Set value to Pay From Drop Down List field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setPayFrom2DropDownListField(String payFrom2Value) {
        new Select(payFrom2).selectByVisibleText(payFrom2Value);
        return this;
    }

    /**
     * Set default value to Pay From Drop Down List field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setPayFrom3DropDownListField() {
        return setPayFrom3DropDownListField(data.get("PAY_FROM_3"));
    }

    /**
     * Set value to Pay From Drop Down List field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setPayFrom3DropDownListField(String payFrom3Value) {
        new Select(payFrom3).selectByVisibleText(payFrom3Value);
        return this;
    }

    /**
     * Set default value to Pay From Drop Down List field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setPayFrom4DropDownListField() {
        return setPayFrom4DropDownListField(data.get("PAY_FROM_4"));
    }

    /**
     * Set value to Pay From Drop Down List field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setPayFrom4DropDownListField(String payFrom4Value) {
        new Select(payFrom4).selectByVisibleText(payFrom4Value);
        return this;
    }

    /**
     * Set default value to Pay To Drop Down List field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setPayToDropDownListField() {
        return setPayToDropDownListField(data.get("PAY_TO"));
    }

    /**
     * Set value to Pay To Drop Down List field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setPayToDropDownListField(String payToValue) {
        new Select(payTo).selectByVisibleText(payToValue);
        return this;
    }

    /**
     * Set default value to Payment Date Open Dialog For More Info. Drop Down List field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setPaymentDateOpenDialogForMore1CheckboxField() {
        return setPaymentDateOpenDialogForMore1CheckboxField(data.get("PAYMENT_DATE_OPEN_DIALOG_FOR_MORE"));
    }

    /**
     * Set Payment Date Open Dialog For More Info. Checkbox field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setPaymentDateOpenDialogForMore1CheckboxField(String paymentDateOpenDialogForMoreValue) {
        new Select(paymentDate).selectByVisibleText(paymentDateOpenDialogForMoreValue);
        return this;
    }

    /**
     * Set Payment Date Open Dialog For More Info. Checkbox field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setPaymentDateOpenDialogForMore2CheckboxField() {
        if (!paymentDate.isSelected()) {
            paymentDate.click();
        }
        return this;
    }

    /**
     * Set default value to Payment Date Open Dialog For More Info. Text field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setPaymentDateOpenDialogForMore3TextField() {
        return setPaymentDateOpenDialogForMore3TextField(data.get("PAYMENT_DATE_OPEN_DIALOG_FOR_MORE_3"));
    }

    /**
     * Set value to Payment Date Open Dialog For More Info. Text field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setPaymentDateOpenDialogForMore3TextField(String paymentDateOpenDialogForMore3Value) {
        paymentDate.sendKeys(paymentDateOpenDialogForMore3Value);
        return this;
    }

    /**
     * Set default value to Payment Date Text field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setPaymentDateTextField() {
        return setPaymentDateTextField(data.get("PAYMENT_DATE"));
    }

    /**
     * Set value to Payment Date Text field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setPaymentDateTextField(String paymentDateValue) {
        waitFor(paymentDate).sendKeys(paymentDateValue);
        return this;
    }

    /**
     * Set default value to Routing Number Text field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setRoutingNumberTextField() {
        return setRoutingNumberTextField(data.get("ROUTING_NUMBER"));
    }

    /**
     * Set value to Routing Number Text field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setRoutingNumberTextField(String routingNumberValue) {
        routingNumber.sendKeys(routingNumberValue);
        return this;
    }

    /**
     * Set default value to Savings Radio Button field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setSavings1RadioButtonField() {
        for (WebElement el : savings1) {
            if (el.getAttribute("value").equals(savingsValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Savings Radio Button field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage setSavings2RadioButtonField() {
        for (WebElement el : savings2) {
            if (el.getAttribute("value").equals(savingsValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

//    /**
//     * Set default value to Statement Balance As Of 09182020 Radio Button field.
//     *
//     * @return the CreditCardsPaymentsPage class instance.
//     */
//    public CreditCardsPaymentsPage setStatementBalanceAsOf09182020RadioButtonField() {
//        for (WebElement el : statementBalanceAsOf09182020) {
//            if (el.getAttribute("value").equals(statementBalanceAsOf09182020Value)) {
//                if (!el.isSelected()) {
//                    el.click();
//                }
//                break;
//            }
//        }
//        return this;
//    }

    /**
     * Submit the form to target page.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage submit() {
        clickFeedbackButton();
        return this;
    }

    /**
     * Unset By Checking This Box I Confirm That I Have Read And Agree To The Terms And Conditions Of The Credit Card Automatic Payment Authorization And Agreement Checkbox field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage unsetByCheckingThisBoxIConfirm1CheckboxField() {
        if (byCheckingThisBoxIConfirm1.isSelected()) {
            byCheckingThisBoxIConfirm1.click();
        }
        return this;
    }

    /**
     * Unset By Checking This Box I Confirm That I Have Read And Agree To The Terms And Conditions Of The Credit Card Automatic Payment Authorization And Agreement Checkbox field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage unsetByCheckingThisBoxIConfirm2CheckboxField() {
        if (byCheckingThisBoxIConfirm2.isSelected()) {
            byCheckingThisBoxIConfirm2.click();
        }
        return this;
    }

    /**
     * Unset default value from Credit Card Account Drop Down List field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage unsetCreditCardAccount1DropDownListField() {
        return unsetCreditCardAccount1DropDownListField(data.get("CREDIT_CARD_ACCOUNT_1"));
    }

    /**
     * Unset value from Credit Card Account Drop Down List field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage unsetCreditCardAccount1DropDownListField(String creditCardAccount1Value) {
        new Select(creditCardAccount1).deselectByVisibleText(creditCardAccount1Value);
        return this;
    }

    /**
     * Unset default value from Credit Card Account Drop Down List field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage unsetCreditCardAccount2DropDownListField() {
        return unsetCreditCardAccount2DropDownListField(data.get("CREDIT_CARD_ACCOUNT_2"));
    }

    /**
     * Unset value from Credit Card Account Drop Down List field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage unsetCreditCardAccount2DropDownListField(String creditCardAccount2Value) {
        new Select(creditCardAccount2).deselectByVisibleText(creditCardAccount2Value);
        return this;
    }

    /**
     * Unset default value from Pay From Drop Down List field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage unsetPayFromDropDownListField() {
        return unsetPayFromDropDownListField(data.get("PAY_FROM_1"));
    }

    /**
     * Unset value from Pay From Drop Down List field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage unsetPayFromDropDownListField(String payFromValue) {
        new Select(payFrom).deselectByVisibleText(payFromValue);
        return this;
    }

    /**
     * Unset default value from Pay From Drop Down List field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage unsetPayFrom2DropDownListField() {
        return unsetPayFrom2DropDownListField(data.get("PAY_FROM_2"));
    }

    /**
     * Unset value from Pay From Drop Down List field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage unsetPayFrom2DropDownListField(String payFrom2Value) {
        new Select(payFrom2).deselectByVisibleText(payFrom2Value);
        return this;
    }

    /**
     * Unset default value from Pay From Drop Down List field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage unsetPayFrom3DropDownListField() {
        return unsetPayFrom3DropDownListField(data.get("PAY_FROM_3"));
    }

    /**
     * Unset value from Pay From Drop Down List field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage unsetPayFrom3DropDownListField(String payFrom3Value) {
        new Select(payFrom3).deselectByVisibleText(payFrom3Value);
        return this;
    }

    /**
     * Unset default value from Pay From Drop Down List field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage unsetPayFrom4DropDownListField() {
        return unsetPayFrom4DropDownListField(data.get("PAY_FROM_4"));
    }

    /**
     * Unset value from Pay From Drop Down List field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage unsetPayFrom4DropDownListField(String payFrom4Value) {
        new Select(payFrom4).deselectByVisibleText(payFrom4Value);
        return this;
    }

    /**
     * Unset default value from Pay To Drop Down List field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage unsetPayToDropDownListField() {
        return unsetPayToDropDownListField(data.get("PAY_TO"));
    }

    /**
     * Unset value from Pay To Drop Down List field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage unsetPayToDropDownListField(String payToValue) {
        new Select(payTo).deselectByVisibleText(payToValue);
        return this;
    }

    /**
     * Unset default value from Payment Date Open Dialog For More Info. Drop Down List field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage unsetPaymentDateOpenDialogForMore1CheckboxField() {
        return unsetPaymentDateOpenDialogForMore1CheckboxField(data.get("PAYMENT_DATE_OPEN_DIALOG_FOR_MORE"));
    }

    /**
     * Unset Payment Date Open Dialog For More Info. Checkbox field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage unsetPaymentDateOpenDialogForMore1CheckboxField(String paymentDateOpenDialogForMoreValue) {
        new Select(paymentDate).deselectByVisibleText(paymentDateOpenDialogForMoreValue);
        return this;
    }

    /**
     * Unset Payment Date Open Dialog For More Info. Checkbox field.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage unsetPaymentDateOpenDialogForMore2CheckboxField() {
        if (paymentDate.isSelected()) {
            paymentDate.click();
        }
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage verifyPageLoaded() {
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
     * @return the CreditCardsPaymentsPage class instance.
     */
    public CreditCardsPaymentsPage verifyPageUrl() {
        (new WebDriverWait(getDriver(), timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
