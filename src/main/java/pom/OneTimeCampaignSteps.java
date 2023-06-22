package pom;

import Utils.Locators;
import Utils.SeleniumActions;
import Utils.SeleniumBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class OneTimeCampaignSteps extends SeleniumBase {
    public void chooseCampaignTemplate() {
        try {
            SeleniumActions seleniumActions = new SeleniumActions();
            Locators locators = new Locators();

            wait.until(ExpectedConditions.visibilityOfElementLocated(locators.hoverCampaignTemplate));
            seleniumActions.hoverOnElement(locators.hoverCampaignTemplate);

            seleniumActions.click(locators.previewButton);

            seleniumActions.click(locators.closePreview);

            wait.until(ExpectedConditions.visibilityOfElementLocated(locators.hoverCampaignTemplate));
            seleniumActions.hoverOnElement(locators.hoverCampaignTemplate);

            seleniumActions.click(locators.useTemplateButton);
        } catch (InterruptedException e) {
            System.out.println("check exception");
        }
    }

    public void createCampaignSettings(String CampaignName, String SubjectLine, String SegmentSearch, String ProductSetSearch, List<String> products) {
        try {
            SeleniumActions seleniumActions = new SeleniumActions();
            Locators locators = new Locators();
            seleniumActions.clear(locators.campaignName);
            seleniumActions.sendKeys(locators.campaignName, CampaignName);
            seleniumActions.clear(locators.subjectLine);
            seleniumActions.sendKeys(locators.subjectLine, SubjectLine);

            seleniumActions.click(locators.segmentLookup);

            wait.until(ExpectedConditions.visibilityOfElementLocated(locators.segmentSearch));
            seleniumActions.sendKeys(locators.segmentSearch, SegmentSearch);

            seleniumActions.click(locators.segmentSelection);
            seleniumActions.click(locators.productSetLookup);
            seleniumActions.sendKeys(locators.productSetSearch, ProductSetSearch);
            seleniumActions.click(locators.productSetSelection);
            seleniumActions.click(locators.chooseProduct);

            //commented till development done
            /*for (int i = 1; i < products.size(); i++) {
                seleniumActions.clear(locators.searchForProduct);
                seleniumActions.sendKeys(locators.searchForProduct, products.toString());
                seleniumActions.click(locators.selectProducts);
            }
            seleniumActions.clear(locators.searchForProduct);// deleted when issue solved
            seleniumActions.click(locators.addProductButton);
            seleniumActions.click(locators.oneTimeNextButton);*/

            wait.until(ExpectedConditions.visibilityOfElementLocated(locators.assertCustomizePopup));
        } catch (InterruptedException e) {
            System.out.println("check exception");
        }
    }

    public void customizeYourDesign() {
        try {
            Actions actions = new Actions(driver);
            SeleniumActions seleniumActions = new SeleniumActions();
            Locators locators = new Locators();
            actions.sendKeys(Keys.ESCAPE).perform();

            //seleniumActions.click(locators.closePopUp);
            seleniumActions.scroll(4000);
            seleniumActions.click(locators.oneTimeNextButton);
        } catch (InterruptedException e) {
            System.out.println("check exception");
        }
    }

    public void reviewAndSend(String testMail, String searchTimeZone) {
        try {
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
        } catch (InterruptedException e) {
            System.out.println("check exception");
        }
    }
}
