package pom;

import Utils.Locators;
import Utils.SeleniumActions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static Utils.SeleniumBase.wait;

public class Homepage {
    public void EmailCampaign () throws InterruptedException {
        SeleniumActions seleniumActions = new SeleniumActions();
        Locators locators = new Locators();
        wait.until(ExpectedConditions.visibilityOfElementLocated(locators.emailCampaignsLookup));
        seleniumActions.click(locators.emailCampaignsLookup);
        seleniumActions.click(locators.createEmailCampaign);
    }
}
