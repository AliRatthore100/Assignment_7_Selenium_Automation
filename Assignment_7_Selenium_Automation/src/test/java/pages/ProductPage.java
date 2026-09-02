package pages;
import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import utils.ElementUtils;
public class ProductPage {
 private final ElementUtils e; private final By backpack=By.id("item_4_title"),name=By.cssSelector(".inventory_details_name"),price=By.cssSelector(".inventory_details_price"),desc=By.cssSelector(".inventory_details_desc"),add=By.id("add-to-cart"),item=By.cssSelector(".inventory_item");
 public ProductPage(WebDriver d){e=new ElementUtils(d);}
 public void openBackpack(){e.click(backpack);} public String getProductName(){return e.getText(name);}
 public String getProductPrice(){return e.getText(price);} public String getProductDescription(){return e.getText(desc);}
 public boolean isAddToCartDisplayed(){return e.isVisible(add);} public boolean isProductListDisplayed(){return e.isVisible(item);}
}