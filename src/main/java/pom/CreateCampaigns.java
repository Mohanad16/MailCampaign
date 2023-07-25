package pom;

import Utils.Locators;
import Utils.SeleniumActions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import static Utils.SeleniumBase.wait;

public class CreateCampaigns {
    public void selectCampaignType(){
        SeleniumActions seleniumActions = new SeleniumActions();
        Locators locators = new Locators();
        seleniumActions.click(locators.oneTimeNextButton);
        seleniumActions.click(locators.templateGroups);

    }


    public void oneTimeCampaign(By hoverPath, By clickPath) {

        SeleniumActions actions = new SeleniumActions();
        Locators locators = new Locators();

        wait.until(ExpectedConditions.visibilityOfElementLocated(locators.hoverOnBackToSchool));
        actions.hoverOnElement(hoverPath);
        actions.click(clickPath);
        String oneTimeCampaign = actions.getText(locators.assertBackToSchool);
        Assert.assertEquals(oneTimeCampaign, "Shopping Season Back To School","one-time campaign is work");
        Assert.assertNull(oneTimeCampaign, "assertion one-time campaign is null");
    }
}
