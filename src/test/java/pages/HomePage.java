package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver ;

    //Locators
    @FindBy( xpath = "//button[contains(text(),'Customer Login')]")
    WebElement customerLoginButton;

    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement managerLoginButton;


    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    //methods
    public void clickOnCustomerLogin() throws InterruptedException {
        customerLoginButton.click();
        Thread.sleep(2000);
    }

    public void clickOnManagerLogin(){
        managerLoginButton.click();
    }
}
