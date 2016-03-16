package TestUtilityPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginIntoApp {
	public static void LogIn(WebDriver driver, String Appurl, String username, String password ) throws InterruptedException{
		 driver.get(Appurl);
		 WebElement Homepage = null;
		 WebDriverWait waiting = new WebDriverWait(driver, 1);
		 Homepage = waiting.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		 driver.findElement(By.id("username")).clear();
		 driver.findElement(By.id("username")).sendKeys(username);
		 driver.findElement(By.id("password")).clear();
		 driver.findElement(By.id("password")).sendKeys(password);
		 driver.findElement(By.xpath(".//*[@id='loginForm']/fieldset/div[3]/div[2]/button")).click();
		 WebElement Logout = null;
		 WebDriverWait waiting1 = new WebDriverWait(driver, 1);
		 Logout = waiting1.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));
		 }
	}
