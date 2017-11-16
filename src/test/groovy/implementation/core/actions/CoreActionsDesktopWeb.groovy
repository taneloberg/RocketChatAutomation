package implementation.core.actions

import io.cify.framework.actions.ActionsDesktopWeb
import io.cify.framework.core.Device

/**
 * Created by FOB Solutions
 */
class CoreActionsDesktopWeb implements ICoreActions, ActionsDesktopWeb {

    Device device

    CoreActionsDesktopWeb(Device device) {
        this.device = device
    }

    /**
     * Open application
     */
    @Override
    void openApplication() {
        device.openBrowser("http://www.fob-solutions.com/")
    }
}
