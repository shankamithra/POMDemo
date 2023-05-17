package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.ManagerLoginPage;

public class ManagerLoginTest extends TestBase {

    @Test
    public void managerLoginTestMethod() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.clickOnManagerLogin();
        ManagerLoginPage managerLoginPage = new ManagerLoginPage(driver);
        managerLoginPage.validateManagerLogin();
        managerLoginPage.clickOnAddCustomerSection();
        managerLoginPage.enterFirstName();
        managerLoginPage.enterLastName();
        managerLoginPage.enterPostCode();
        managerLoginPage.clickAddCustomer();
        managerLoginPage.validateCustomerAddition();

    }
}
