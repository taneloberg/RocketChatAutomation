package implementation.hostname.pages

import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.iOSFindBy
import io.cify.framework.PageObjects
import io.cify.framework.core.Device
import org.openqa.selenium.WebElement

/**
 * Created by FOB Solutions
 */
class HostnamePage extends PageObjects {

    @iOSFindBy(accessibility = "logo")
    WebElement logo

    @iOSFindBy(accessibility = "serverUrlTextField")
    @AndroidFindBy(id = "chat.rocket.android:id/editor_hostname")
    WebElement hostnameUrlField

    @iOSFindBy(accessibility = "Go")
    @AndroidFindBy(id = "chat.rocket.android:id/btn_connect")
    WebElement goButton

    HostnamePage(Device device) {
        super(device)
    }
}
