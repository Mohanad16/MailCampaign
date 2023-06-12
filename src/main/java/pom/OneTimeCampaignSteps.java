package pom;

import Utils.Locators;
import Utils.SeleniumActions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static Utils.SeleniumBase.wait;

public class OneTimeCampaignSteps {
    public void chooseCampaignTemplate() throws InterruptedException {
        SeleniumActions seleniumActions = new SeleniumActions();
        Locators locators = new Locators();

        wait.until(ExpectedConditions.visibilityOfElementLocated(locators.hoverCampaignTemplate));
        seleniumActions.hoverOnElement(locators.hoverCampaignTemplate);

        wait.until(ExpectedConditions.visibilityOfElementLocated(locators.previewButton));
        seleniumActions.click(locators.previewButton);

        wait.until(ExpectedConditions.visibilityOfElementLocated(locators.closePreview));
        seleniumActions.click(locators.closePreview);

        wait.until(ExpectedConditions.visibilityOfElementLocated(locators.hoverCampaignTemplate));
        seleniumActions.hoverOnElement(locators.hoverCampaignTemplate);

        wait.until(ExpectedConditions.visibilityOfElementLocated(locators.useTemplateButton));
        seleniumActions.click(locators.useTemplateButton);
    }

    public void createCampaignSettings(String CampaignName, String SubjectLine, String SegmentSearch, String ProductSetSearch, String Product1, String Product2, String Product3) throws InterruptedException {
        SeleniumActions seleniumActions = new SeleniumActions();
        Locators locators = new Locators();
        seleniumActions.clear(locators.campaignName);
        seleniumActions.sendKeys(locators.campaignName, CampaignName);
        seleniumActions.clear(locators.subjectLine);
        seleniumActions.sendKeys(locators.subjectLine, SubjectLine);

        wait.until(ExpectedConditions.visibilityOfElementLocated(locators.segmentLookup));
        seleniumActions.click(locators.segmentLookup);

        wait.until(ExpectedConditions.visibilityOfElementLocated(locators.segmentSearch));
        seleniumActions.sendKeys(locators.segmentSearch, SegmentSearch);

        seleniumActions.click(locators.segmentSelection);
        seleniumActions.click(locators.productSetLookup);
        seleniumActions.sendKeys(locators.productSetSearch, ProductSetSearch);
        seleniumActions.click(locators.productSetSelection);
        seleniumActions.click(locators.chooseProduct);

        String[] products = {Product1, Product2, Product3};
        for (int i = 1; i < products.length; i++) {
            seleniumActions.clear(locators.searchForProduct);
            seleniumActions.sendKeys(locators.searchForProduct, products[i]);
            seleniumActions.click(locators.selectProducts);
        }
        seleniumActions.clear(locators.searchForProduct);// deleted when issue solved
        seleniumActions.click(locators.addProductButton);
        seleniumActions.click(locators.oneTimeNextButton);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locators.assertCustomizePopup));
    }

    public void customizeYourDesign() throws InterruptedException {
        SeleniumActions seleniumActions = new SeleniumActions();
        Locators locators = new Locators();
        wait.until(ExpectedConditions.visibilityOfElementLocated(locators.closePopUp));
        seleniumActions.click(locators.closePopUp);
        seleniumActions.scroll(4000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locators.oneTimeNextButton));
        seleniumActions.click(locators.oneTimeNextButton);
    }

    public void reviewAndSend(String testMail, String searchTimeZone) throws InterruptedException {
        SeleniumActions seleniumActions = new SeleniumActions();
        Locators locators = new Locators();
        seleniumActions.clear(locators.testMail);
        seleniumActions.sendKeys(locators.testMail, testMail);
        seleniumActions.click(locators.testMailButton);
        seleniumActions.scroll(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locators.previewMail));
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

    }
}
