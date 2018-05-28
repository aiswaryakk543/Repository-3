package testScripts;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import library.BasePage;
import library.BaseTest;
import pom.ActiTimeLoginPO;

public class Test1 extends BaseTest{
@Test(groups={"smoke","regression"},priority=1)
public void ValidLoginLogout() {
	try {
		driver.get("https://online.actitime.com/coursecube/login.do");
		ActiTimeLoginPO loginPO=new ActiTimeLoginPO(driver);
		loginPO.unTxtBx().sendKeys("aishujayaprakash543");
		loginPO.pwTxtBx().sendKeys("YTyQU4EM");
		loginPO.LoginBtn().click();
		BasePage basePage=new BasePage(driver);
		basePage.VerifyTitle("actiTIME - Enter Time-Track");
		Assert.assertEquals(driver.getTitle(),"actiTIME - Enter Time-Track");
	} catch (Exception e) {
		Reporter.log("Test Fail",true);
		Assert.fail();
	}
}
}

