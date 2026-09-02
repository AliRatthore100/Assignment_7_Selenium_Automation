package pages;
import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import utils.ElementUtils;
public class LoginPage {
 private final ElementUtils e; private final By username=By.id("user-name"),password=By.id("password"),login=By.id("login-button"),error=By.cssSelector("[data-test='error']");
 public LoginPage(WebDriver d){e=new ElementUtils(d);}
 public void enterUsername(String s){e.enterText(username,s);} public void enterPassword(String s){e.enterText(password,s);}
 public void clickLogin(){e.click(login);} public void login(String u,String p){enterUsername(u);enterPassword(p);clickLogin();}
 public String getErrorMessage(){return e.getText(error);}
}