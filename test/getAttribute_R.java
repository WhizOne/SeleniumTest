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

public class getAttribute_R {
	private WebDriver driver;
	  private String baseUrl;
	  @Before
	  public void setUp() throws Exception {
	   // driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Roshan\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
	    baseUrl = "http://localhost/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void findElements() throws Exception {
		  driver.get("https://google.com");
	    
	    String  Search_Buttton_Value= driver.findElement(By.name("btnK")).getAttribute("value");
	    System.out.println("Value attribute of login button :- "+Search_Buttton_Value);	    
	    
	    }
	    

	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
	}
}