package mthuy.pages;

import mthuy.datatest.ConstantData;
import mthuy.drivers.DriverManager;
import mthuy.helpers.PropertiesHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static mthuy.keywords.WebUI.*;


public class LoginPage {
    private String URL = "https://demo.nopcommerce.com/login";
    By inputEmail = By.xpath("//input[@id='Email']");
    By inputPassword = By.xpath("//input[@id='Password']");
    By buttonLogin = By.xpath("//button[normalize-space()='Log in']");
    By errorMessage = By.xpath("//div[@class='message-error validation-summary-errors']");
    public void enterEmail(String email) {
        setText(inputEmail, email);
    }

    public void enterPassword(String password) {
        setText(inputPassword, password);
    }

    public void clickOnLoginButton() {
        clickElement(buttonLogin);
    }
    public DashboardPage login(String email, String password) {
        openURL(ConstantData.URL);
        enterEmail(email);
        enterPassword(password);
        clickOnLoginButton();
        return new DashboardPage();
    }


}
