package pom;

import Utils.Locators;
import Utils.SeleniumActions;
import Utils.SeleniumBase;

public class SignInPage extends SeleniumBase {
    public void loginPage(String Email, String Password) {
        try {
            Locators locators = new Locators();
            SeleniumActions actions = new SeleniumActions();
            actions.clear(locators.LoginEmail);
            actions.sendKeys(locators.LoginEmail, Email);
            actions.clear(locators.LoginPassword);
            actions.sendKeys(locators.LoginPassword, Password);
            actions.click(locators.LoginButton);
        } catch (InterruptedException e) {
            System.out.println("check exception");
        }
    }
}
