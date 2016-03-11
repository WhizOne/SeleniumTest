
import static org.junit.Assert.*;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class getTitle_R {
  private WebDriver driver;
  @Before
  public void setUp() throws Exception {
   // driver = new FirefoxDriver();
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Roshan\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testRelativexpath() throws Exception {
	  driver.get("https://google.com/");
	  String Title = driver.getTitle();
	  System.out.println("Title of the webpage = " +Title);
	  
      assertEquals(Title,"Google");	  

  }
   

  @After
  public void tearDown() throws Exception {
    driver.quit();
  }
  }