package steps

import cucumber.api.groovy.EN
import cucumber.api.groovy.Hooks
import implementation.ActionsImpl
import implementation.RocketTestException

/**
 * Created by FOB Solutions
 */

this.metaClass.mixin(Hooks)
this.metaClass.mixin(EN)

Then(~/^hostname view should be visible$/) { ->
    if (!ActionsImpl.getHostActions().isHostViewVisible()) {
        throw new RocketTestException("Host view should be visible!")
    }
}
When(~/^user enters "([^"]*)" into hostname$/) { String hostname ->
    ActionsImpl.getHostActions().enterHostname(hostname)
}
And(~/^user clicks on select button$/) { ->
    ActionsImpl.getHostActions().submit()
}