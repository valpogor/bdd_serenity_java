package starter.navigation;

import net.thucydides.core.annotations.Step;

public class NavigateTo {

    CnbLoginPage cnbLoginPage;

    @Step("Open the CNB login page")
    public void theCnoLoginPage() {
        cnbLoginPage.open();
    }
}
