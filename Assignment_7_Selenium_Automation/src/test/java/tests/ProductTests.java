package tests;
import base.BaseTest; import org.testng.Assert; import org.testng.annotations.Test; import pages.*;
public class ProductTests extends BaseTest {
 private void login(){new LoginPage(driver).login("standard_user","secret_sauce");}
 @Test(description="Navigate to product and validate details") public void productDetailsShouldBeDisplayed(){
  login(); ProductPage p=new ProductPage(driver); p.openBackpack();
  Assert.assertEquals(p.getProductName(),"Sauce Labs Backpack"); Assert.assertTrue(p.getProductPrice().startsWith("$"));
  Assert.assertFalse(p.getProductDescription().isBlank()); Assert.assertTrue(p.isAddToCartDisplayed());
 }
 @Test(description="Products should be available") public void productListShouldBeAvailable(){
  login(); Assert.assertTrue(new ProductPage(driver).isProductListDisplayed());
 }
}