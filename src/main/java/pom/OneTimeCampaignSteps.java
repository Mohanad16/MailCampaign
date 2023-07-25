package pom;

import Utils.Locators;
import Utils.SeleniumActions;
import Utils.SeleniumBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class OneTimeCampaignSteps extends SeleniumBase {
    public void chooseCampaignTemplate() {

        SeleniumActions actions = new SeleniumActions();
        Locators locators = new Locators();

        wait.until(ExpectedConditions.visibilityOfElementLocated(locators.hoverCampaignTemplate));
        actions.hoverOnElement(locators.hoverCampaignTemplate);
        actions.click(locators.previewButton);
        actions.click(locators.closePreview);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locators.hoverCampaignTemplate));
        actions.hoverOnElement(locators.hoverCampaignTemplate);
        actions.click(locators.useTemplateButton);
        String template = actions.getText(locators.assertCampaignDetails);
        Assert.assertEquals(template, "Default Template Preview", "choose Campaign Template is done");
        Assert.assertNull(template, "assertion choose Campaign Template is null");


    }

    public void createCampaignSettings(String CampaignName, String SubjectLine, String SegmentSearch, String ProductSetSearch, List<String> products) {
        SeleniumActions actions = new SeleniumActions();
        Locators locators = new Locators();
        actions.clear(locators.campaignName);
        actions.sendKeys(locators.campaignName, CampaignName);
        actions.clear(locators.subjectLine);
        actions.sendKeys(locators.subjectLine, SubjectLine);

        actions.click(locators.segmentLookup);

        wait.until(ExpectedConditions.visibilityOfElementLocated(locators.segmentSearch));
        actions.sendKeys(locators.segmentSearch, SegmentSearch);

        actions.click(locators.segmentSelection);
        actions.click(locators.productSetLookup);
        actions.sendKeys(locators.productSetSearch, ProductSetSearch);
        actions.click(locators.productSetSelection);
        //seleniumActions.click(locators.chooseProduct);

        //commented till development done
            /*for (int i = 1; i < products.size(); i++) {
                seleniumActions.clear(locators.searchForProduct);
                seleniumActions.sendKeys(locators.searchForProduct, products.toString());
                seleniumActions.click(locators.selectProducts);
            }
            seleniumActions.clear(locators.searchForProduct);// deleted when issue solved
            seleniumActions.click(locators.addProductButton);*/
        actions.click(locators.oneTimeNextButton);

        wait.until(ExpectedConditions.visibilityOfElementLocated(locators.assertCustomizePopup));

        String createCampaignSetting = actions.getText(locators.assertCustomizePopup);
        Assert.assertEquals(createCampaignSetting, "How it works", "create Campaign Setting is work");
        Assert.assertNull(createCampaignSetting, "assertion create Campaign Setting is null");
    }


    public void customizeYourDesign() {
        Actions keys = new Actions(driver);
        SeleniumActions actions = new SeleniumActions();
        Locators locators = new Locators();
        keys.sendKeys(Keys.ESCAPE).perform();
        //seleniumActions.click(locators.closePopUp);
        actions.scroll(4000);
        actions.click(locators.oneTimeNextButton);


        String customizeYourDesign = actions.getText(locators.assertReviewStep);
        Assert.assertEquals(customizeYourDesign, "Campaign Content", "customize Your Design is work");
        Assert.assertNull(customizeYourDesign, "assertion customize Your Design  is null");
    }

    public void reviewAndSend(String testMail, String searchTimeZone) {

            Actions actions = new Actions(driver);
            SeleniumActions seleniumActions = new SeleniumActions();
            Locators locators = new Locators();
            seleniumActions.clear(locators.testMail);
            seleniumActions.sendKeys(locators.testMail, testMail);
            seleniumActions.click(locators.testMailButton);

            //assertion test mail
            wait.until(ExpectedConditions.visibilityOfElementLocated(locators.assertTestMsg));

            seleniumActions.scroll(1000);
            seleniumActions.click(locators.previewMail);
            seleniumActions.click(locators.closePreviewReview);
            seleniumActions.scroll(1000);
            seleniumActions.click(locators.later);
            seleniumActions.click(locators.date);
            seleniumActions.click(locators.selectDate);
            seleniumActions.click(locators.time);
            seleniumActions.scroll(1000);
            seleniumActions.click(locators.hours);
            seleniumActions.click(locators.timeZone);
            seleniumActions.sendKeys(locators.searchTimeZone, searchTimeZone);
            actions.sendKeys(Keys.ENTER).perform();

    }
}
