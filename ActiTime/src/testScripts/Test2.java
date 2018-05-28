package testScripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BasePage;
import library.BaseTest;
import pom.ActiTimeLoginPO;

	public class Test2 extends BaseTest{
		@Test(groups={"regression"},priority=2)
		public void ValidLogInvalidLogout() {
			try {
				driver.get("https://online.actitime.com/coursecube/login.do");
				ActiTimeLoginPO loginPO=new ActiTimeLoginPO(driver);
				loginPO.unTxtBx().sendKeys("aishujayaprakash543");
				loginPO.pwTxtBx().sendKeys("YTyQU4EM1");
				loginPO.LoginBtn().click();
				BasePage basePage=new BasePage(driver);
				basePage.VerifyWebElement(loginPO.ErrMsg());
				Assert.assertEquals(loginPO.ErrMsg().isDisplayed(),true);
			} catch (Exception e) {
				Reporter.log("Test Fail",true);
				Assert.fail();
			}
		}
			@Test(groups={"regression"},priority=3)
			public void InvalidLogInvalidLogout() {
				try {
					driver.get("https://online.actitime.com/coursecube/login.do");
					ActiTimeLoginPO loginPO=new ActiTimeLoginPO(driver);
					loginPO.unTxtBx().sendKeys("aishujayaprakash5431");
					loginPO.pwTxtBx().sendKeys("YTyQU4EM1");
					loginPO.LoginBtn().click();
					BasePage basePage=new BasePage(driver);
					basePage.VerifyWebElement(loginPO.ErrMsg());
					Assert.assertEquals(loginPO.ErrMsg().isDisplayed(),true);
				} catch (Exception e) {
					Reporter.log("Test Fail",true);
					Assert.fail();
				}
			}
	
				@Test(groups={"regression"},priority=4)
				public void testvalidunEmptypw() {
					try {
						driver.get("https://online.actitime.com/coursecube/login.do");
						ActiTimeLoginPO loginPO=new ActiTimeLoginPO(driver);
						loginPO.unTxtBx().sendKeys("aishujayaprakash543");
						loginPO.pwTxtBx().sendKeys("");
						loginPO.LoginBtn().click();
						BasePage basePage=new BasePage(driver);
						basePage.VerifyWebElement(loginPO.ErrMsg());
						Assert.assertEquals(loginPO.ErrMsg().isDisplayed(),true);
					} catch (Exception e) {
						Reporter.log("Test Fail",true);
						Assert.fail();
					}
				}
				@Test(groups={"regression"},priority=5)
				public void testEmptyunValidpw() {
					try {
						driver.get("https://online.actitime.com/coursecube/login.do");
						ActiTimeLoginPO loginPO=new ActiTimeLoginPO(driver);
						loginPO.unTxtBx().sendKeys("");
						loginPO.pwTxtBx().sendKeys("YTyQU4EM");
						loginPO.LoginBtn().click();
						BasePage basePage=new BasePage(driver);
						basePage.VerifyWebElement(loginPO.ErrMsg());
						Assert.assertEquals(loginPO.ErrMsg().isDisplayed(),true);
					} catch (Exception e) {
						Reporter.log("Test Fail",true);
						Assert.fail();
					}
				}
				@Test(groups={"regression"},priority=6)
				public void testEmptyunEmptypw() {
					try {
						driver.get("https://online.actitime.com/coursecube/login.do");
						ActiTimeLoginPO loginPO=new ActiTimeLoginPO(driver);
						loginPO.unTxtBx().sendKeys("");
						loginPO.pwTxtBx().sendKeys("");
						loginPO.LoginBtn().click();
						BasePage basePage=new BasePage(driver);
						basePage.VerifyWebElement(loginPO.ErrMsg());
						Assert.assertEquals(loginPO.ErrMsg().isDisplayed(),true);
					} catch (Exception e) {
						Reporter.log("Test Fail",true);
						Assert.fail();
					}
				}
				@Test(groups={"regression"},priority=7)
				public void InvalidLogValidLogout() {
					try {
						driver.get("https://online.actitime.com/coursecube/login.do");
						ActiTimeLoginPO loginPO=new ActiTimeLoginPO(driver);
						loginPO.unTxtBx().sendKeys("aishujayaprakash5431");
						loginPO.pwTxtBx().sendKeys("YTyQU4EM");
						loginPO.LoginBtn().click();
						BasePage basePage=new BasePage(driver);
						basePage.VerifyWebElement(loginPO.ErrMsg());
						Assert.assertEquals(loginPO.ErrMsg().isDisplayed(),true);
					} catch (Exception e) {
						Reporter.log("Test Fail",true);
						Assert.fail();
					}
				}
		
}