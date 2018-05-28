package pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import library.BasePage;

public class ActiTimeLoginPO extends BasePage{
	 public ActiTimeLoginPO(WebDriver driver) 
	 {
  	   super(driver);
     }
     @FindBy(xpath="//input[@id=\"username\"]")
     private WebElement unTxtBx;
     public WebElement unTxtBx() {
  	   return unTxtBx;
     }
     @FindBy(xpath="//input[@name=\"pwd\"]")
     private WebElement pwTxtBx;
     public WebElement pwTxtBx() {
  	   return pwTxtBx;
     }
     @FindBy(xpath="//a[@id=\"loginButton\"]")
     private WebElement LoginBtn;
     public WebElement LoginBtn() {
  	   return LoginBtn;
     }
     @FindBy(xpath="//span[@class=\"errormsg\"]")
     private WebElement ErrMsg;
     public WebElement ErrMsg() {
  	   return ErrMsg;
     }
}

