package implementation.core.actions

import io.appium.java_client.MobileDriver
import io.cify.framework.actions.ActionsMobileIOSApp
import io.cify.framework.core.Device
import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.ui.ExpectedCondition

/**
 * Created by FOB Solutions
 */
class CoreActionsMobileIOSApp implements ICoreActions, ActionsMobileIOSApp {

    Device device

    CoreActionsMobileIOSApp(Device device) {
        this.device = device
    }

    /**
     * Open application
     */
    @Override
    void openApplication() {
        device.openApp()
        autoAcceptAlerts()
    }

    /**
     * Automatically dismiss alerts
     * */
    private void autoAcceptAlerts() {
        boolean accept = true

        while (accept) {
            try {
                waitForCondition(device, new ExpectedCondition<Boolean>() {
                    Boolean apply(WebDriver d) {
                        try {
                            (device.getDriver() as MobileDriver).switchTo().alert().accept()
                            return true
                        } catch (ignored) {
                            return false
                        }
                    }
                }, 10)
            } catch (ignored) {
                accept = false
            }
        }
    }
}
