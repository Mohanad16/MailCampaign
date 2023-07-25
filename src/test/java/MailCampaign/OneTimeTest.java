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

    SignInPage signInPage = new SignInPage();

    @BeforeTest
    public void init() {
        SeleniumBase seleniumBase = new SeleniumBase();
        seleniumBase.seleniumConfig("https://app-stg.converted.in/login");
    }


    @Test
    public void openRedmos() {
        Homepage home = new Homepage();
        signInPage.loginPage("mckenzie.lincoln@yahoo.com", "password");
        home.EmailCampaign();
    }

    @Test(dependsOnMethods = "openRedmos")
    public void selectOneTimeCampaign(){

        Locators locators = new Locators();
        CreateCampaigns oneTime = new CreateCampaigns();

            oneTime.selectCampaignType();
        oneTime.oneTimeCampaign(locators.hoverOnBackToSchool, locators.selectBackToSchool);
    }

    @Test(dependsOnMethods = "selectOneTimeCampaign")
    public void chooseCampaignTemplate()  {
        OneTimeCampaignSteps steps = new OneTimeCampaignSteps();
        steps.chooseCampaignTemplate();
    }

    @Test(dependsOnMethods = "chooseCampaignTemplate")

    public void createCampaignSettings()  {
        OneTimeCampaignSteps steps = new OneTimeCampaignSteps();
        List<String> products = Arrays.asList("test", "star", "sunglasses");
        steps.createCampaignSettings("campaign1", "subject1", "all", "new", products);
    }

    @Test(dependsOnMethods = "createCampaignSettings")
    public void customizeYourDesign()  {
        OneTimeCampaignSteps steps = new OneTimeCampaignSteps();
        steps.customizeYourDesign();
    }

    @Test(dependsOnMethods = "customizeYourDesign")
    public void reviewAndSend()  {
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
