package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest(){

        LoginPage lp = new LoginPage(driver);
        lp.login("standard_user", "secret_sauce");

        System.out.println("Login Test Passed");
    }
}
