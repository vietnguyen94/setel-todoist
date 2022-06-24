package mobile.pageobjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import mobile.core.AbstractPage;
import mobile.core.PageFactoryManager;
import utils.Log;

public class LoginPage extends AbstractPage {

    @AndroidFindBy(id = "com.todoist:id/btn_welcome_continue_with_email")
    private MobileElement welcomeContinueWithEmail;

    @AndroidFindBy(id = "com.todoist:id/btn_continue_with_email")
    private MobileElement continueWithEmail;

    @AndroidFindBy(id = "com.todoist:id/email_exists_input")
    private MobileElement emailInput;

    @AndroidFindBy(id = "com.todoist:id/btn_log_in")
    private MobileElement btnLogin;

    @AndroidFindBy(id = "com.todoist:id/log_in_password")
    private MobileElement passwordInput;

    public LoginPage clickWelComeContinueWithEmail() {
        Log.reportLog("Click to Continue With Email in Welcome Page");
        clickOnElement(welcomeContinueWithEmail);
        return this;
    }

    public LoginPage clickContinueWithEmail() {
        Log.reportLog("Click to Continue With Email");
        clickOnElement(continueWithEmail);
        return this;
    }

    public LoginPage enterEmail(String value) {
        Log.reportLog("Enter email:" + value);
        sendKeysToElement(emailInput, value);
        return this;
    }

    public LoginPage enterPassword(String value) {
        Log.reportLog("Enter password:" + value);
        sendKeysToElement(passwordInput, value);
        return this;
    }

    public LoginPage clickToBtnLogin() {
        Log.reportLog("Click to Button Login");
        clickOnElement(btnLogin);
        return this;
    }

    public HomePage navigateToHomePage() {
        return PageFactoryManager.getHomePage();
    }
}
