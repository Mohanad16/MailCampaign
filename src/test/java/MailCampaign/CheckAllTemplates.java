package MailCampaign;

import Utils.Locators;
import Utils.SeleniumActions;
import Utils.SeleniumBase;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pom.CreateCampaigns;
import pom.Homepage;
import pom.SignInPage;

public class CheckAllTemplates {
    @BeforeTest
    public void init() {
        SeleniumBase seleniumBase = new SeleniumBase();
        seleniumBase.seleniumConfig("https://app-stg.converted.in/login");
    }

    //test and assert that login is working
    @Test()

    public void login() throws InterruptedException {
        SignInPage signInPage = new SignInPage();
        SeleniumActions actions = new SeleniumActions();
        Locators locators = new Locators();
        signInPage.loginPage("mckenzie.lincoln@yahoo.com", "password");
        Assert.assertEquals(actions.getText(locators.assertLogin), "Overview");
    }

    @Test(dependsOnMethods = "login")
    public void homePage() throws InterruptedException {
        SeleniumActions actions = new SeleniumActions();
        Locators locators = new Locators();
        Homepage home = new Homepage();
        home.EmailCampaign();
        Assert.assertEquals(actions.getText(locators.assertHomepage), "One Time Campaign");
    }

    @Test(dependsOnMethods = "homePage")
    public void selectOneTimeCampaign() throws InterruptedException {
        SeleniumActions actions = new SeleniumActions();
        Locators locators = new Locators();
        CreateCampaigns oneTime = new CreateCampaigns();
        oneTime.oneTimeCampaign(locators.hoverOnBackToSchool, locators.selectBackToSchool);
        Assert.assertEquals(actions.getText(locators.assertBackToSchool), "Shopping Season Back To School");
        actions.click(locators.backButton);
    }

}
