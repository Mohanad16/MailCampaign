package pom;

import Utils.Locators;
import Utils.SeleniumActions;

public class Homepage {
    public void EmailCampaign() {
        try {
            SeleniumActions seleniumActions = new SeleniumActions();
            Locators locators = new Locators();
            seleniumActions.click(locators.emailCampaignsLookup);
            seleniumActions.click(locators.createEmailCampaign);
        } catch (InterruptedException e) {
            System.out.println("check exception");
        }
    }
}
