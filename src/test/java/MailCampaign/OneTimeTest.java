package MailCampaign;

import Utils.Locators;
import Utils.SeleniumActions;
import Utils.SeleniumBase;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pom.CreateCampaigns;
import pom.Homepage;
import pom.OneTimeCampaignSteps;
import pom.SignInPage;

import java.util.Arrays;
import java.util.List;

public class OneTimeTest {
    @BeforeTest
    public void init() {
        SeleniumBase seleniumBase = new SeleniumBase();
        seleniumBase.seleniumConfig("https://app-stg.converted.in/login");
    }

    //test and assert that login is working
    @Test(priority = 1)
    public void login() throws InterruptedException {
        SignInPage signInPage = new SignInPage();
        SeleniumActions actions = new SeleniumActions();
        Locators locators = new Locators();
        signInPage.loginPage("mckenzie.lincoln@yahoo.com", "password");
       // Assert.assertEquals(actions.getText(locators.assertLogin), "Contact Support");
        Assert.assertEquals(actions.getText(locators.assertLogin), "Overview");
    }

    @Test(priority = 2)
    public void homePage() throws InterruptedException {
        SeleniumActions actions = new SeleniumActions();
        Locators locators = new Locators();
        Homepage home = new Homepage();
        home.EmailCampaign();
        Assert.assertEquals(actions.getText(locators.assertHomepage), "One Time Campaign");
    }

    @Test(priority = 3)
    public void selectOneTimeCampaign() throws InterruptedException {
        SeleniumActions actions = new SeleniumActions();
        Locators locators = new Locators();
        CreateCampaigns oneTime = new CreateCampaigns();
        oneTime.oneTimeCampaign();
        Assert.assertEquals(actions.getText(locators.assertOneTimeCampaign), "Shopping Season Back To School");
    }

    @Test(priority = 4)
    public void chooseCampaignTemplate() throws InterruptedException {
        SeleniumActions actions = new SeleniumActions();
        Locators locators = new Locators();
        OneTimeCampaignSteps steps = new OneTimeCampaignSteps();
        steps.chooseCampaignTemplate();
        Assert.assertEquals(actions.getText(locators.assertCampaignDetails), "Defualt Template Preview");
    }

    @Test(priority = 5)

    public void createCampaignSettings() throws InterruptedException {
        SeleniumActions actions = new SeleniumActions();
        Locators locators = new Locators();
        OneTimeCampaignSteps steps = new OneTimeCampaignSteps();
        List<String> products = Arrays.asList("test", "star", "sunglasses");
        steps.createCampaignSettings("campaign1", "subject1", "all", "new", products);
        Assert.assertEquals(actions.getText(locators.assertCustomizePopup), "How it works");
    }

    @Test(priority = 6)
    public void customizeYourDesign() throws InterruptedException {
        OneTimeCampaignSteps steps = new OneTimeCampaignSteps();
        SeleniumActions actions = new SeleniumActions();
        Locators locators = new Locators();
        steps.customizeYourDesign();
        Assert.assertEquals(actions.getText(locators.assertReviewStep), "Campaign Content");
    }

    @Test(priority = 7)
    public void reviewAndSend() throws InterruptedException {
        OneTimeCampaignSteps steps = new OneTimeCampaignSteps();
        SeleniumActions actions = new SeleniumActions();
        Locators locators = new Locators();
        Assert.assertEquals(actions.getText(locators.campaignNameCheck), "campaign1");
        Assert.assertEquals(actions.getText(locators.subjectLineCheck), "subject1");
        Assert.assertEquals(actions.getText(locators.segmentCheck), "All Customers");
        Assert.assertTrue(actions.getText(locators.productsCheck).contains("Sunglasses"));
        steps.reviewAndSend("h.adel@converted.in", "cairo");
    }
}
