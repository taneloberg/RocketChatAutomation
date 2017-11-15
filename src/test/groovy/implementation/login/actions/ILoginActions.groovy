package implementation.login.actions

/**
 * Created by FOB Solutions
 */
interface ILoginActions {

    /**
     * Verifies if login page is visible
     * @return
     */
    boolean isLoginPageVisible()

    /**
     * Enter username to field
     * @param username
     */
    void enterUsername(String username)

    /**
     * Enter password to field
     * @param password
     */
    void enterPassword(String password)

    /**
     * Click login button
     */
    void clickLogin()

    /**
     * Click register button
     */
    void clickRegister()

}