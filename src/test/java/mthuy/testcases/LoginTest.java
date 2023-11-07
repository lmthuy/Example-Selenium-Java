package mthuy.testcases;

import mthuy.common.BaseTest;
import mthuy.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
@Test
    public void loginValidInfor() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("caychuoinon0307@gmail.com", "123456");
    }
}
