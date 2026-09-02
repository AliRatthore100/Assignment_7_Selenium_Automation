package pages;
import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import utils.ElementUtils;
public class HomePage {
 private final ElementUtils e; private final By inventory=By.id("inventory_container"),menu=By.id("react-burger-menu-btn"),cart=By.className("shopping_cart_link"),title=By.cssSelector(".title");
 public HomePage(WebDriver d){e=new ElementUtils(d);}
 public boolean isInventoryDisplayed(){return e.isVisible(inventory);} public boolean isMenuDisplayed(){return e.isVisible(menu);}
 public boolean isCartDisplayed(){return e.isVisible(cart);} public String getPageTitle(){return e.getText(title);}
}