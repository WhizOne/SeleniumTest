import static org.junit.Assert.*;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class isDisplayed_R {
		private WebDriver driver;
	  @Before
	  	public void setUp() throws Exception {
		// driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Roshan\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void findElements() throws Exception {
		driver.get("https://www.google.com");
		WebElement Search_Button = driver.findElement(By.name("btnK"));
		boolean Displayed = Search_Button.isDisplayed();
	    System.out.println("Google Search button display status :- "+Displayed);
	
	  	}
	    
	  @After
	  	public void tearDown() throws Exception {
	    driver.quit();		  
	}
}

