package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.nio.file.WatchEvent;

public class CustomerLoginPage {

    WebDriver driver;

    //Locators
    @FindBy(id = "userSelect")
    WebElement nameDropDown;

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement loginButton;

    @FindBy(xpath ="//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/strong[1]")
    WebElement welcomeTitle;


    //Constructor
    public CustomerLoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    //Methods
    public void selectCustomerName() throws InterruptedException {
        Select name = new Select(nameDropDown);
        name.selectByVisibleText("Harry Potter");
        Thread.sleep(2000);
    }

    public void clickOnLoginButton() throws InterruptedException {
        loginButton.click();
        Thread.sleep(2000);
    }

    public void validateCustomerLoginSuccessScreen(){
        Assert.assertTrue(welcomeTitle.isDisplayed());
        Assert.assertTrue(welcomeTitle.getText().contains("Harry Potter"));
    }
}
