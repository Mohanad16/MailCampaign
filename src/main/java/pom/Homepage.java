package pom;

import Utils.Locators;
import Utils.SeleniumActions;
import org.testng.Assert;

public class Homepage {
    public void EmailCampaign() {

        SeleniumActions actions = new SeleniumActions();
        Locators locators = new Locators();
        actions.click(locators.emailCampaignsLookup);
        actions.click(locators.createEmailCampaign);
        String homePage = actions.getText(locators.assertHomepage);
        Assert.assertEquals(homePage, "One Time Campaign", "home page assertion is done");
        Assert.assertNull(homePage, "assertion home page is null");
    }
}
