package implementation.login.pages

import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.iOSFindBy
import io.cify.framework.PageObjects
import io.cify.framework.core.Device
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy

/**
 * Created by FOB Solutions
 */
class LoginPage extends PageObjects {

    @iOSFindBy(accessibility = "usernameTextField")
    @AndroidFindBy(id = "chat.rocket.android:id/editor_username")
    @FindBy(id = "emailOrUsername")
    WebElement usernameField

    @iOSFindBy(accessibility = "passwordTextField")
    @AndroidFindBy(id = "chat.rocket.android:id/editor_passwd")
    @FindBy(id = "pass")
    WebElement passwordField

    @iOSFindBy(accessibility = "Next:")
    @AndroidFindBy(id = "chat.rocket.android:id/btn_login_with_email")
    @FindBy(className = "login")
    WebElement nextButton

    @iOSFindBy(accessibility = "createNewAccountButton")
    @AndroidFindBy(id = "chat.rocket.android:id/btn_user_registration")
    @FindBy(className = "register")
    WebElement createNewAccountButton

    LoginPage(Device device) {
        super(device)
    }
}
