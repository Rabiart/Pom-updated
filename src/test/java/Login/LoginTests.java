package Login;

import Dashboard.DashboardPage;
import Setup.SetupTests;
import org.testng.annotations.Test;

public class LoginTests extends SetupTests {
    @Test
    public void testLogin() throws InterruptedException
    {
        String username = "Rabiart";
        loginpage.enterUsername(username);
        loginpage.enterUserPassword("Opeyemi@21");
        DashboardPage dashboardPage = loginpage.clickLoginBtn();
        dashboardPage.clickfaviedee();
        loginpage = dashboardPage.clickLogout();
    }
}
