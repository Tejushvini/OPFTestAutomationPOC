package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationSteps {

    WebDriver driver;

    @Given("the new user is on the registration page")
    public void the_new_user_is_on_the_registration_page() {

        driver = new ChromeDriver();
        driver.get("https://businesslendingqa.vodacom.co.za/registration");


    }
    @When("the new user enters valid name {}")
    public void the_new_user_enters_valid_name(String name) {
        driver.findElement(By.name("firstName")).sendKeys(name);


    }
    @And("the new user enters valid surname {}")
    public void the_new_user_enters_valid_surname(String surname) {
        driver.findElement(By.name("lastName")).sendKeys(surname);
    }

    @And("the new user enters valid cellNumber {}")
    public void the_new_user_enters_valid_cellNumber(String cellNumber) {
        driver.findElement(By.name("msisdn")).sendKeys(cellNumber);
    }
    @And("the new user enters valid email {}")
    public void the_new_user_enters_valid_email(String email) {
        driver.findElement(By.name("email")).sendKeys(email);
    }
    @And("the new user accepts the terms and conditions")
    public void the_new_user_accepts_the_terms_and_conditions() {
        driver.findElement(By.id("label-checkbox")).click();
    }
    @When("the new user click the get started button")
    public void the_new_user_click_the_get_started_button() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/form/div[2]/button")).click();
    }
    @Then("the user sees the OTP screen")
    public void the_user_sees_the_otp_screen() {

    }
}
