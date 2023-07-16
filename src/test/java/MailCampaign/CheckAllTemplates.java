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
    public void selectBackToSchoolTemplate() throws InterruptedException {
        SeleniumActions actions = new SeleniumActions();
        Locators locators = new Locators();
        CreateCampaigns oneTime = new CreateCampaigns();
        oneTime.oneTimeCampaign(locators.hoverOnBackToSchool, locators.selectBackToSchool);
        Assert.assertEquals(actions.getText(locators.assertBackToSchool), "Shopping Season Back To School");
        actions.click(locators.backButton);
    }

    @Test(dependsOnMethods = "selectBackToSchoolTemplate")
    public void selectBackInStockTemplate() throws InterruptedException {
        SeleniumActions actions = new SeleniumActions();
        Locators locators = new Locators();
        CreateCampaigns oneTime = new CreateCampaigns();
        oneTime.oneTimeCampaign(locators.hoverOnBackToSchool, locators.selectBackToSchool);
        Assert.assertEquals(actions.getText(locators.assertBackToSchool), "Shopping Season Back To School");
        actions.click(locators.backButton);

    }

    @Test(dependsOnMethods = "selectBackInStockTemplate")
    public void selectDiscountOnSelectedItemsTemplate() throws InterruptedException {
        SeleniumActions actions = new SeleniumActions();
        Locators locators = new Locators();
        CreateCampaigns oneTime = new CreateCampaigns();
        oneTime.oneTimeCampaign(locators.hoverOnBackToSchool, locators.selectBackToSchool);
        Assert.assertEquals(actions.getText(locators.assertBackToSchool), "Shopping Season Back To School");
        actions.click(locators.backButton);

    }

    @Test(dependsOnMethods = "selectDiscountOnSelectedItemsTemplate")
    public void selectShoppingSeasonSummerSaleTemplate() throws InterruptedException {
        SeleniumActions actions = new SeleniumActions();
        Locators locators = new Locators();
        CreateCampaigns oneTime = new CreateCampaigns();
        oneTime.oneTimeCampaign(locators.hoverOnBackToSchool, locators.selectBackToSchool);
        Assert.assertEquals(actions.getText(locators.assertBackToSchool), "Shopping Season Back To School");
        actions.click(locators.backButton);

    }

    @Test(dependsOnMethods = "selectShoppingSeasonSummerSaleTemplate")
    public void select24HrsFlashSaleTemplate() throws InterruptedException {
        SeleniumActions actions = new SeleniumActions();
        Locators locators = new Locators();
        CreateCampaigns oneTime = new CreateCampaigns();
        oneTime.oneTimeCampaign(locators.hoverOnBackToSchool, locators.selectBackToSchool);
        Assert.assertEquals(actions.getText(locators.assertBackToSchool), "Shopping Season Back To School");
        actions.click(locators.backButton);

    }

    @Test(dependsOnMethods = "select24HrsFlashSaleTemplate")
    public void select24HrsFlashSale2Template() throws InterruptedException {
        SeleniumActions actions = new SeleniumActions();
        Locators locators = new Locators();
        CreateCampaigns oneTime = new CreateCampaigns();
        oneTime.oneTimeCampaign(locators.hoverOnBackToSchool, locators.selectBackToSchool);
        Assert.assertEquals(actions.getText(locators.assertBackToSchool), "Shopping Season Back To School");
        actions.click(locators.backButton);

    }

    @Test(dependsOnMethods = "select24HrsFlashSale2Template")
    public void selectLaborDayTemplate() throws InterruptedException {
        SeleniumActions actions = new SeleniumActions();
        Locators locators = new Locators();
        CreateCampaigns oneTime = new CreateCampaigns();
        oneTime.oneTimeCampaign(locators.hoverOnBackToSchool, locators.selectBackToSchool);
        Assert.assertEquals(actions.getText(locators.assertBackToSchool), "Shopping Season Back To School");
        actions.click(locators.backButton);

    }

    @Test(dependsOnMethods = "selectLaborDayTemplate")
    public void selectEbookReleasedTemplate() throws InterruptedException {
        SeleniumActions actions = new SeleniumActions();
        Locators locators = new Locators();
        CreateCampaigns oneTime = new CreateCampaigns();
        oneTime.oneTimeCampaign(locators.hoverOnBackToSchool, locators.selectBackToSchool);
        Assert.assertEquals(actions.getText(locators.assertBackToSchool), "Shopping Season Back To School");
        actions.click(locators.backButton);

    }
    @Test(dependsOnMethods = "selectEbookReleasedTemplate")
    public void selectSummerSaleTemplate() throws InterruptedException {
        SeleniumActions actions = new SeleniumActions();
        Locators locators = new Locators();
        CreateCampaigns oneTime = new CreateCampaigns();
        oneTime.oneTimeCampaign(locators.hoverOnBackToSchool, locators.selectBackToSchool);
        Assert.assertEquals(actions.getText(locators.assertBackToSchool), "Shopping Season Back To School");
        actions.click(locators.backButton);

    }

    @Test(dependsOnMethods = "selectSummerSaleTemplate")
    public void selectWomenDayTemplate() throws InterruptedException {
        SeleniumActions actions = new SeleniumActions();
        Locators locators = new Locators();
        CreateCampaigns oneTime = new CreateCampaigns();
        oneTime.oneTimeCampaign(locators.hoverOnBackToSchool, locators.selectBackToSchool);
        Assert.assertEquals(actions.getText(locators.assertBackToSchool), "Shopping Season Back To School");
        actions.click(locators.backButton);

    }
    @Test(dependsOnMethods = "selectWomenDayTemplate")
    public void selectHelloBlackFridayTemplate() throws InterruptedException {
        SeleniumActions actions = new SeleniumActions();
        Locators locators = new Locators();
        CreateCampaigns oneTime = new CreateCampaigns();
        oneTime.oneTimeCampaign(locators.hoverOnBackToSchool, locators.selectBackToSchool);
        Assert.assertEquals(actions.getText(locators.assertBackToSchool), "Shopping Season Back To School");
        actions.click(locators.backButton);

    }

    @Test(dependsOnMethods = "selectHelloBlackFridayTemplate")
    public void selectDiscountEmailTemplate() throws InterruptedException {
        SeleniumActions actions = new SeleniumActions();
        Locators locators = new Locators();
        CreateCampaigns oneTime = new CreateCampaigns();
        oneTime.oneTimeCampaign(locators.hoverOnBackToSchool, locators.selectBackToSchool);
        Assert.assertEquals(actions.getText(locators.assertBackToSchool), "Shopping Season Back To School");
        actions.click(locators.backButton);

    }
    @Test(dependsOnMethods = "selectDiscountEmailTemplate")
    public void selectWelcomeEmailTemplate() throws InterruptedException {
        SeleniumActions actions = new SeleniumActions();
        Locators locators = new Locators();
        CreateCampaigns oneTime = new CreateCampaigns();
        oneTime.oneTimeCampaign(locators.hoverOnBackToSchool, locators.selectBackToSchool);
        Assert.assertEquals(actions.getText(locators.assertBackToSchool), "Shopping Season Back To School");
        actions.click(locators.backButton);

    }

}
