package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PropertyRegistrationPage {

  public PropertyRegistrationPage(WebDriver driver){

      PageFactory.initElements(driver,this);
  }


  @FindBy(how = How.XPATH,using ="/html/body/section/nav/div[1]/a[1]" )
    private WebElement register;

  public void ClickRegisterButton(){
      register.click();
  }

 @FindBy(how = How.ID,using = "first_name")
   private WebElement firstname;
  @FindBy(how = How.ID,using = "last_name")
  private WebElement lastname;
  @FindBy(how = How.ID,using = "email")
  private WebElement email;
  @FindBy(how = How.CSS,using =".selected-flag" )
  private WebElement countryflag;
  @FindBy(how = How.CSS,using = ".country-name")
  private WebElement unitedkingdom;
  @FindBy(how = How.ID,using = "mobile")
  private WebElement phonenumber;
  @FindBy(how = How.NAME,using = "password")
  private WebElement password;
  @FindBy(how = How.ID,using = "confirm_password")
  private WebElement confirmpassword;
  @FindBy(how = How.ID,using = "btn_register")
  private WebElement createaccount;
  @FindBy(how = How.CSS,using = "#dng_msg > p:nth-child(2)")
  private WebElement errormessage;
  @FindBy(how = How.ID,using = "/html/body/section/section[1]/div/figure/div[3]/div[2]/form/div[9]/span/p[2]")
  private WebElement geterrormessage;

public void GetErrorMessage(){

}
  public void ErrorMessageReceived(){
  errormessage.getText();
  }
public void ClickCreateAccount(){
   createaccount.click();
}
  public void EnterConfirmPassword(){
      confirmpassword.sendKeys("anikey");
  }

  public void EnterPassword(){
      password.sendKeys("anikey");
  }
public void EnterPhoneNumber(){
    phonenumber.sendKeys("+447578446563");
}
  public void ClickUnitedKingdom(){
      unitedkingdom.click();
  }
public void ClickFlagBox(){
    countryflag.click();
}

public  void EnterEmail(){
    email.sendKeys("johntrott727@yahoo.com");
}
public void EnterLastname(){
    lastname.sendKeys("Adebayo");
}
  public void EnterFirstname()
  {
      firstname.sendKeys("Kudi");
  }
}
