package implementation.hostname.actions

import implementation.hostname.pages.HostnamePage
import io.cify.framework.actions.ActionsMobileAndroidApp
import io.cify.framework.core.Device

/**
 * Created by FOB Solutions
 */
class HostnameActionsMobileAndroidApp implements IHostnameActions, ActionsMobileAndroidApp {
    Device device
    HostnamePage hostnamePage

    HostnameActionsMobileAndroidApp(Device device) {
        this.device = device
        this.hostnamePage = new HostnamePage(device)
    }

    /**
     * Verify that host view is visible
     * @return
     */
    @Override
    boolean isHostViewVisible() {
        return isDisplayed(hostnamePage.getHostnameUrlField())
    }

    /**
     * Enter hostname
     * @param hostname
     * @return
     */
    @Override
    void enterHostname(String hostname) {
        sendKeys(hostnamePage.getHostnameUrlField(), hostname)

    }

    /**
     * Submit host name
     */
    @Override
    void submit() {
        click(hostnamePage.getGoButton())

    }
}
