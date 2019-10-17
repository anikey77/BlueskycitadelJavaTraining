package stepdefs;

import Pageobject.PropertyLoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertyreteLoginStep {

    public static WebDriver driver;
    public PropertyLoginPage login;

    public PropertyreteLoginStep(){
    System.setProperty("webdriver.gecko.driver", "D:\\Blueskycitadel\\firefox\\geckodriver.exe");

    driver =new FirefoxDriver();

    login = new PropertyLoginPage(driver);}


    @Given("^I navigate to propertyrete website$")
    public void i_navigate_to_propertyrete_website() throws Throwable {
        driver.get("https://www.propertyrete.com");
    }

    @When("^I click on login button$")
    public void iClickOnLoginButton() throws Throwable {
        login.ClickLoginButton();
    }

    @When("^I enter my email$")
    public void i_enter_my_email() throws Throwable {
       login. EnterEmail();
    }

    @When("^I enter my password$")
    public void i_enter_my_password() throws Throwable {
        login.EnterPassword();
    }

    @When("^I click on signin button$")
    public void i_click_on_signin_button() throws Throwable {
        login.ClickSigninButton();
      //  login. ClickActivateAccount();
    }

    @Then("^I am logged in$")
    public void iAmLoggedIn() throws Throwable {
       // Thread.sleep(3000);
       // Assert.assertEquals(driver.findElement(By.cssSelector("")).getText(), ".");
    }
    }





