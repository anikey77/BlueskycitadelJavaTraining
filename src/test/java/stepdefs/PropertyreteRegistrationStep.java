package stepdefs;

import Pageobject.PropertyRegistrationPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertyreteRegistrationStep {

    public static WebDriver driver;
    public PropertyRegistrationPage registration;

      public PropertyreteRegistrationStep()
      {
         // System.setProperty("Webdriver.chrome.driver", "C:\\Users\\abc\\Downloads\\chromedriver_win(2)\\chromedriver.exe");
          System.setProperty("webdriver.gecko.driver", "D:\\Blueskycitadel\\firefox\\geckodriver.exe");
         // driver = new ChromeDriver();
          driver =new FirefoxDriver();
          registration = new PropertyRegistrationPage(driver);
      }

      @Given("^I navigate to propertyrete site$")
      public void i_navigate_to_propertyrete_site() throws Throwable {
       driver.get("https://www.propertyrete.com");
        }

    @When("^I click on register button$")
    public void i_click_on_register_button() throws Throwable {
        registration .ClickRegisterButton();
    }

    @When("^I enter firstname$")
    public void i_enter_firstname() throws Throwable {
        registration.EnterFirstname();
    }

    @When("^I enter lastname$")
    public void i_enter_lastname() throws Throwable {
        registration.EnterLastname();
    }

    @When("^I enter email$")
    public void i_enter_email() throws Throwable {
       registration.EnterEmail();
    }

    @When("^I select country flag$")
    public void i_select_country_flag() throws Throwable {
       registration.ClickFlagBox();
        registration.ClickUnitedKingdom();
    }

    @When("^I enter  phone number$")
    public void i_enter_phone_number() throws Throwable {
        registration.EnterPhoneNumber();
    }

    @When("^I enter password$")
    public void i_enter_password() throws Throwable {
        registration.EnterPassword();
    }

    @When("^I confirm password$")
    public void i_confirm_password() throws Throwable {
        registration.EnterConfirmPassword();
    }

    @When("^I click on create account button$")
    public void i_click_on_create_account_button() throws Throwable {
        registration.ClickCreateAccount();
    }

    @When("^an error message was received$")
    public void an_error_message_was_received() throws Throwable {
        registration.ErrorMessageReceived();
    }

    @Then("^I am not registered$")
    public void i_am_not_registered() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


}
