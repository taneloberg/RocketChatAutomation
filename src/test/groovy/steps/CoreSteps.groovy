package steps

import cucumber.api.groovy.EN
import cucumber.api.groovy.Hooks
import implementation.ActionsImpl
import io.cify.framework.core.DeviceCategory
import io.cify.framework.core.DeviceManager

this.metaClass.mixin(Hooks)
this.metaClass.mixin(EN)

Given(~/^user opens (.+) application$/) { DeviceCategory category ->
    DeviceManager.getInstance().createDevice(category)
    ActionsImpl.getCoreActions().openApplication()
}

After {
    DeviceManager.getInstance().quitAllDevices()
}