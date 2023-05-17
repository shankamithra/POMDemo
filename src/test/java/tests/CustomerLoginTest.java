package tests;

import org.checkerframework.checker.units.qual.C;
import org.testng.annotations.Test;
import pages.CustomerLoginPage;
import pages.HomePage;

public class CustomerLoginTest extends TestBase{

    @Test
    public void customerLoginTestMethod() throws InterruptedException {
        HomePage homePageObj = new HomePage(driver);
        homePageObj.clickOnCustomerLogin();
        CustomerLoginPage  customerLoginPage = new CustomerLoginPage(driver);
        customerLoginPage.selectCustomerName();
        customerLoginPage.clickOnLoginButton();
        customerLoginPage.validateCustomerLoginSuccessScreen();
    }
}
