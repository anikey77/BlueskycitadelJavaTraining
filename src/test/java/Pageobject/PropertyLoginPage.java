package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PropertyLoginPage {

    public PropertyLoginPage(WebDriver driver){

        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH,using = "/html/body/section/nav/div[1]/a[2]")
    private WebElement login;
    @FindBy(how = How.ID,using = "user_email")
    private WebElement email;
    @FindBy(how = How.ID,using = "user_password")
    private WebElement password;
    @FindBy(how = How.ID,using = "btn_signin")
    private WebElement signin;
    @FindBy(how = How.ID,using = "/html/body/section/section[1]/div/figure/div[3]/div[1]/form/div[6]/center/div/a[1]")
    private WebElement activateaccount;



//    public void ClickActivateAccount(){activateaccount.click();}
    public void ClickSigninButton() {signin.click();}
    public  void EnterPassword(){password.sendKeys("korede");}
    public void EnterEmail(){email.sendKeys("johntrott727@yahoo.com");}

    public void ClickLoginButton ()

   {login.click();}

}
