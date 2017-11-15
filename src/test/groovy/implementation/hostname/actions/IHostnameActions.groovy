package implementation.hostname.actions

/**
 * Created by FOB Solutions
 */
interface IHostnameActions {

    /**
     * Verify that host view is visible
     * @return
     */
    boolean isHostViewVisible()

    /**
     * Enter hostname
     * @param hostname
     * @return
     */
    void enterHostname(String hostname)

    /**
     * Submit host name
     */
    void submit()

}