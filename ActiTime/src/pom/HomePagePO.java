package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import library.BasePage;

public class HomePagePO extends BasePage{
public HomePagePO(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//a[@id='logoutLink']")
	private WebElement logoutBtn;
	public WebElement logoutBtn() {
		return logoutBtn;
	}
	}