package utils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class ElementUtils {
 private final WebDriver driver; private final WebDriverWait wait;
 public ElementUtils(WebDriver driver){this.driver=driver; this.wait=new WebDriverWait(driver,Duration.ofSeconds(15));}
 public void click(By locator){wait.until(ExpectedConditions.elementToBeClickable(locator)).click();}
 public void enterText(By locator,String text){WebElement e=wait.until(ExpectedConditions.visibilityOfElementLocated(locator));e.clear();e.sendKeys(text);}
 public String getText(By locator){return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();}
 public boolean isVisible(By locator){try{return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).isDisplayed();}catch(TimeoutException e){return false;}}
 public void waitForVisible(By locator){wait.until(ExpectedConditions.visibilityOfElementLocated(locator));}
}