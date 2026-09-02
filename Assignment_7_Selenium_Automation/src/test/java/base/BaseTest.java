package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import java.time.Duration;

public class BaseTest {
 protected WebDriver driver;
 @BeforeMethod public void setUp(){
  ChromeOptions options=new ChromeOptions();
  options.addArguments("--start-maximized","--disable-notifications");
  driver=new ChromeDriver();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
  driver.get("https://www.saucedemo.com/");
 }
 @AfterMethod(alwaysRun=true) public void tearDown(){if(driver!=null) driver.quit();}
}