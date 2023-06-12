package pom;

import Utils.Locators;
import Utils.SeleniumActions;
import Utils.SeleniumBase;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignInPage extends SeleniumBase {
    public void loginPage(String Email, String Password) throws InterruptedException {
        Locators locators = new Locators();
        SeleniumActions actions = new SeleniumActions();
        actions.clear(locators.LoginEmail);
        actions.sendKeys(locators.LoginEmail, Email);
        actions.clear(locators.LoginPassword);
        actions.sendKeys(locators.LoginPassword, Password);
        actions.click(locators.LoginButton);
    }

/* public String assertionLogin() throws InterruptedException {
        Locators locators = new Locators();
        SeleniumActions webActions = new SeleniumActions();
        wait.until(ExpectedConditions.visibilityOfElementLocated(locators.assertLogin));
        return webActions.getText(locators.assertLogin);
    }*/
}
