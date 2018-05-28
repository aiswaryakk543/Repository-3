package library;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage {
public WebDriver driver;
public WebDriverWait wait;
public BasePage(WebDriver driver) {
	wait=new WebDriverWait(driver, 10);
    PageFactory.initElements(driver, this);
}
public void VerifyTitle(String title) {
	try {
		wait.until(ExpectedConditions.titleIs(title));
		Reporter.log("Title matching",true);
	} catch (TimeoutException e) {
		Reporter.log("Title not matching",true);
	}
}
		public void VerifyWebElement(WebElement element) {
			try {
				wait.until(ExpectedConditions.visibilityOf(element));
				Reporter.log("Element is present",true);
			} catch (TimeoutException e) {

             Reporter.log("Element is not present",true);
			}
		}
}

