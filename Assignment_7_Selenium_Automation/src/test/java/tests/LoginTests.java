package tests;
import base.BaseTest; import org.testng.Assert; import org.testng.annotations.Test; import pages.*;
public class LoginTests extends BaseTest {
 @Test(description="Invalid login should show an error") public void invalidLoginShouldShowError(){
  LoginPage p=new LoginPage(driver); p.login("invalid_user","wrong_password");
  String error=p.getErrorMessage(); Assert.assertTrue(error.toLowerCase().contains("username and password"),"Unexpected error: "+error);
 }
 @Test(description="Valid login should open homepage") public void validLoginShouldOpenHomepage(){
  new LoginPage(driver).login("standard_user","secret_sauce"); HomePage h=new HomePage(driver);
  Assert.assertEquals(h.getPageTitle(),"Products"); Assert.assertTrue(h.isInventoryDisplayed()); Assert.assertTrue(h.isMenuDisplayed()); Assert.assertTrue(h.isCartDisplayed());
 }
}