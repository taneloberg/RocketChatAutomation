package implementation.login.actions

import implementation.login.pages.LoginPage
import io.cify.framework.actions.ActionsDesktopWeb
import io.cify.framework.core.Device

/**
 * Created by FOB Solutions
 */
class LoginActionsDesktopWeb implements ILoginActions, ActionsDesktopWeb {

    Device device
    LoginPage loginPage

    LoginActionsDesktopWeb(Device device) {
        this.device = device
        this.loginPage = new LoginPage(device)
    }

    /**
     * Verifies if login page is visible
     * @return
     */
    @Override
    boolean isLoginPageVisible() {
        return isDisplayed(loginPage.getUsernameField()) &&
                isDisplayed(loginPage.getPasswordField())
    }

    /**
     * Enter username to field
     * @param username
     */
    @Override
    void enterUsername(String username) {
        sendKeys(loginPage.getUsernameField(), username)
    }

    /**
     * Enter password to field
     * @param password
     */
    @Override
    void enterPassword(String password) {
        sendKeys(loginPage.getPasswordField(), password)
    }

    /**
     * Click login button
     */
    @Override
    void clickLogin() {
        click(loginPage.getNextButton())
    }

    /**
     * Click register button
     */
    @Override
    void clickRegister() {
        click(loginPage.getCreateNewAccountButton())
    }
}
