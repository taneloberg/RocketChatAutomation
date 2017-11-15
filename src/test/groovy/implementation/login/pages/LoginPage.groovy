package implementation.login.pages

import io.appium.java_client.pagefactory.iOSFindBy
import io.cify.framework.PageObjects
import io.cify.framework.core.Device
import org.openqa.selenium.WebElement

/**
 * Created by FOB Solutions
 */
class LoginPage extends PageObjects {

    @iOSFindBy(accessibility = "usernameTextField")
    WebElement usernameField

    @iOSFindBy(accessibility = "passwordTextField")
    WebElement passwordField

    @iOSFindBy(accessibility = "Next:")
    WebElement nextButton

    @iOSFindBy(accessibility = "createNewAccountButton")
    WebElement createNewAccountButton

    LoginPage(Device device) {
        super(device)
    }
}
