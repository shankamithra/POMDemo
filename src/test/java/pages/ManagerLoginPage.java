package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ManagerLoginPage {
    WebDriver driver;

    //Locators
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")
    WebElement addCustomerSection;

    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")
    WebElement firstName;

    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]")
    WebElement lastName;

    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/input[1]")
    WebElement postCode;

    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/button[1]")
    WebElement addCustomerButton;

    //Constructor
    public ManagerLoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Methods
    public void validateManagerLogin(){
        Assert.assertTrue(addCustomerSection.getText().equals("Add Customer"));
    }

    public void clickOnAddCustomerSection() throws InterruptedException {
        addCustomerSection.click();
        Thread.sleep(2000);
    }

    public void enterFirstName(){
        firstName.sendKeys("Test");
    }

    public void enterLastName(){
        lastName.sendKeys("Account01");
    }

    public void enterPostCode() throws InterruptedException {
        postCode.sendKeys("560068");
        Thread.sleep(2000);
    }

    public void clickAddCustomer() throws InterruptedException {
        addCustomerButton.click();
        Thread.sleep(2000);
    }

    public void validateCustomerAddition(){
       String alertText = driver.switchTo().alert().getText();
       Assert.assertTrue(alertText.contains("Customer added successfully"));
       driver.switchTo().alert().accept();
    }
}
