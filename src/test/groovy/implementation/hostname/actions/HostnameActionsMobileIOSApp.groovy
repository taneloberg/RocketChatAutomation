package implementation.hostname.actions

import implementation.hostname.pages.HostnamePage
import io.cify.framework.actions.ActionsMobileIOSApp
import io.cify.framework.core.Device

/**
 * Created by FOB Solutions
 */
class HostnameActionsMobileIOSApp implements IHostnameActions, ActionsMobileIOSApp {

    Device device
    HostnamePage hostnamePage

    HostnameActionsMobileIOSApp(Device device) {
        this.device = device
        this.hostnamePage = new HostnamePage(device)
    }

    /**
     * Verify that host view is visible
     * @return
     */
    @Override
    boolean isHostViewVisible() {
        return isDisplayed(hostnamePage.getHostnameUrlField()) &&
                isDisplayed(hostnamePage.getLogo())
    }

    /**
     * Enter hostname
     * @param hostname
     * @return
     */
    @Override
    void enterHostname(String hostname) {
        sendKeys(hostnamePage.hostnameUrlField, hostname)
    }

    /**
     * Submit host name
     */
    @Override
    void submit() {
        click(hostnamePage.getGoButton())
    }
}
