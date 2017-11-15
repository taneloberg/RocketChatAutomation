package implementation.core.actions

import io.cify.framework.actions.ActionsMobileAndroidApp
import io.cify.framework.core.Device

/**
 * Created by FOB Solutions
 */
class CoreActionsMobileAndroidApp implements ICoreActions, ActionsMobileAndroidApp {

    Device device

    CoreActionsMobileAndroidApp(Device device) {
        this.device = device
    }

    /**
     * Open application
     */
    @Override
    void openApplication() {
        device.openApp()
    }
}
