package implementation

import implementation.core.actions.ICoreActions
import implementation.hostname.actions.IHostnameActions
import implementation.login.actions.ILoginActions
import io.cify.framework.Actions
import io.cify.framework.core.Device
import io.cify.framework.core.DeviceManager

/**
 * Created by FOB Solutions
 */
class ActionsImpl {

    private static final String IMPLEMENTATION_PACKAGE = "implementation."

    /**
     * Gets core actions for current device
     * @return
     */
    static ICoreActions getCoreActions() {
        Device currentDevice = DeviceManager.getInstance().getActiveDevice()
        return (ICoreActions) Actions.getCustomActions(currentDevice, IMPLEMENTATION_PACKAGE + "core.actions.CoreActions")
    }

    /**
     * Get Hostname actions for current device
     * @return
     */
    static IHostnameActions getHostActions() {
        Device currentDevice = DeviceManager.getInstance().getActiveDevice()
        return (IHostnameActions) Actions.getCustomActions(currentDevice, IMPLEMENTATION_PACKAGE + "hostname.actions.HostnameActions")
    }

    /**
     * Get login actions for current device
     * @return
     */
    static ILoginActions getLoginActions() {
        Device currentDevice = DeviceManager.getInstance().getActiveDevice()
        return (ILoginActions) Actions.getCustomActions(currentDevice, IMPLEMENTATION_PACKAGE + "login.actions.LoginActions")
    }
}
