package pom;

import Utils.Locators;
import Utils.SeleniumActions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static Utils.SeleniumBase.wait;

public class CreateCampaigns {
    public void oneTimeCampaign() throws InterruptedException {
        SeleniumActions seleniumActions = new SeleniumActions();
        Locators locators = new Locators();
        wait.until(ExpectedConditions.visibilityOfElementLocated(locators.oneTimeNextButton));
        seleniumActions.click(locators.oneTimeNextButton);

        wait.until(ExpectedConditions.visibilityOfElementLocated(locators.templateGroups));
        seleniumActions.click(locators.templateGroups);

        wait.until(ExpectedConditions.visibilityOfElementLocated(locators.hoverOnTemplate));
        seleniumActions.hoverOnElement(locators.hoverOnTemplate);

        wait.until(ExpectedConditions.visibilityOfElementLocated(locators.selectTemplate));
        seleniumActions.click(locators.selectTemplate);
    }
}
