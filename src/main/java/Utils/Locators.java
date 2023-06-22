package Utils;

import org.openqa.selenium.By;

public class Locators {
    //login locators
    public By LoginEmail = By.id("email");
    public By LoginPassword = By.id("password");
    public By LoginButton = By.xpath("//button[@type='submit']");
    public By assertLogin = By.xpath("//a[@id='contact_support']");
    //home page locators
    public By emailCampaignsLookup = By.xpath("//div[@class='main-sidebar-menu']/ul/li[7]/a/span");
    public By createEmailCampaign = By.xpath("(//a[@class='sub-item-action'])[16]");
    public By assertHomepage = By.className("campaign-item-title");

    //steps to go inside chosen template
    public By oneTimeNextButton = By.xpath("//button[text()='Next']");
    public By templateGroups = By.xpath("//div[@data-group-id='all']");
    public By hoverOnTemplate = By.xpath("//div[@data-template-type='83']");
    public By selectTemplate = By.xpath("//*[@data-template-type='83']//button[text()='Select']");
    public By assertOneTimeCampaign = By.xpath("//*[text()='Shopping Season Back To School']");


    //locators chooseCampaignTemplate
    public By hoverCampaignTemplate = By.xpath("//div[@class='handover-media']");
    public By previewButton = By.xpath("//button[@class='preview-btn']");
    public By closePreview = By.xpath("//button[@class='btn btn-secondary']");
    public By useTemplateButton = By.xpath("//button[@class='use-template-btn']");

    public By assertCampaignDetails = By.xpath("//*[text()='Defualt Template Preview']");


    //locators createCampaignSettings

    public By campaignName = By.xpath("//input[@name='name']");
    public By subjectLine = By.xpath("//input[@name='subject']");
    public By segmentLookup = By.xpath("//*[@id='select2-segment-container']");
    public By segmentSearch = By.xpath("//*[@aria-label='Search']");
    public By segmentSelection = By.xpath("//li[@role='option'][1]");
    public By productSetLookup = By.xpath("//*[@id='select2-productSets-container']");
    public By productSetSearch = By.xpath("//*[@aria-controls='select2-productSets-results']");
    public By productSetSelection = By.xpath("//li[@role='option'][1]");

     // choose from product

    public By chooseProduct = By.xpath("(//button[@data-popuptarget='multi-select-product-popup'])[1]");
    public By searchForProduct = By.name("SearchDualList");
    public By selectProducts = By.xpath("(//label[@class='form-check-label stretched-link'])[1]");
    public By addProductButton = By.xpath("(//*[@data-popuptarget='multi-select-product-popup'])[3]");
    public By assertCustomizePopup = By.xpath("//h5[@id='exampleModalLabel']");

    //locators of customize design
    public By closePopUp = By.xpath("//*[@onclick='if (!window.__cfRLUnblockHandlers) return false; hideOnBoarding()']");
    public By assertReviewStep = By.xpath("//h2[@class='my-5']");


    //locators of review and send

    public By campaignNameCheck = By.xpath("(//*[@class='pl-5'])[1]");
    public By subjectLineCheck = By.xpath("(//*[@class='pl-5'])[2]");
    public By segmentCheck = By.xpath("(//*[@class='pl-5'])[3]");
    public By productsCheck = By.xpath("(//*[@class='pl-5'])[4]");
    public By testMail = By.id("testEmail");
    public By testMailButton = By.xpath("//button[@id='emailTestButton']");

    public By previewMail = By.xpath("//button[@class='preview-email-action']");
    public By closePreviewReview = By.xpath("(//button[@aria-label='Close'])[1]");
    public By later = By.id("later-cta");
    public By date = By.xpath("//input[@class='date-picker-wrapper']");
    public By selectDate = By.xpath("//*[@class='dudp__date current selected']");
    public By time = By.xpath("//input[@class='time-picker-input timepicker hasWickedpicker']");
    public By hours = By.xpath("(//span[@class='wickedpicker__controls__control-up'])[1]");
    public By timeZone = By.className("select2-selection__arrow");
    public By searchTimeZone = By.className("select2-search__field");

    public By assertTestMsg = By.xpath("//*[@class='success-validation hidden-by-default']");

}

//note date method not working

/*public By selectDate(int days) {
    String month = LocalDate.now().getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
    int day = LocalDate.now().plusDays(days).getDayOfMonth();
    String output = String.format("//span[@class=‘dudp__date’ and contains(text(),‘%s’) and ancestor::div[@class=‘dudp__calendar’]/div[@class=‘dudp__cal-month-year’]/span[text()=‘%s’]]", day, month);
    //  String xpathExpression = "//span[@class=‘dudp__date’ and contains(text(),‘%s’) and ancestor::div[@class=‘dudp__calendar’]/div[@class=‘dudp__cal-month-year’]/span[text()=‘%s’]]";
    System.out.println(output);
    return By.xpath(String.format(output));
}

//call
seleniumActions.click(locators.generateCheckInDate(5));

*/


