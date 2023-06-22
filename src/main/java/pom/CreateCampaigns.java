package pom;

import Utils.Locators;
import Utils.SeleniumActions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static Utils.SeleniumBase.wait;

public class CreateCampaigns {
    public void oneTimeCampaign() {
        try {
            SeleniumActions seleniumActions = new SeleniumActions();
            Locators locators = new Locators();
            seleniumActions.click(locators.oneTimeNextButton);
            seleniumActions.click(locators.templateGroups);
            wait.until(ExpectedConditions.visibilityOfElementLocated(locators.hoverOnTemplate));
            seleniumActions.hoverOnElement(locators.hoverOnTemplate);
            seleniumActions.click(locators.selectTemplate);
        } catch (InterruptedException e) {
            System.out.println("check exception");
        }
    }
}
