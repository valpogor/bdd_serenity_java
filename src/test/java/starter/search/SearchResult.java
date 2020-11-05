package starter.search;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SearchResult extends UIInteractionSteps {
    public List<String> titles() {
        return findAll(SearchResultList.RESULT_TITLES)
                .stream()
                .map(WebElementFacade::getTextContent)
                .filter(text -> !text.equalsIgnoreCase("Ad"))
                .collect(Collectors.toList());
    }

    public String pagetitle() {
        Set<String> handles = getDriver().getWindowHandles();
        if(handles.size()>1){ switchBrowser(); }
        return getTitle();
    }

    public void switchBrowserClose() {
        String parentWindow = getDriver().getWindowHandle();
        Set<String> handles = getDriver().getWindowHandles();
        for (String windowHandle : handles) {
            if (!windowHandle.equals(parentWindow)) {
                getDriver().switchTo().window(parentWindow).close();
                getDriver().switchTo().window(windowHandle);
            }
        }
    }

    public void switchBrowser() {
        String parentWindow = getDriver().getWindowHandle();
        Set<String> handles = getDriver().getWindowHandles();
        for (String windowHandle : handles) {
            if (!windowHandle.equals(parentWindow)) {
                getDriver().switchTo().window(windowHandle);
            }
        }
    }

    public String pagetitlenextwindow() {

        switchBrowser();
        return getTitle();
    }
}
