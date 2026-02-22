package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistrationPage {

    WebDriver driver;


    @FindBy(id = "firstName")
    public WebElement usernameField;

    @FindBy(id = "password")
    public WebElement passwordField;

    @FindBy(id = "loginButton")
    public WebElement loginButton;


public RegistrationPage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
}

public void clickNavigationButton() {
    new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(loginButton));
    loginButton.click();
}
}
