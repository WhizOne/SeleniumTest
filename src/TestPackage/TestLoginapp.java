package TestPackage;
import java.io.IOException;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import TestUtilityPackage.CommonMethod;
import TestUtilityPackage.LoginIntoApp;
public class TestLoginapp {
	public WebDriver driver;
	private String Pathoftestdata =CommonMethod.path;
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Roshan\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver = new  FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		}
	@Test
	public void LoginIntoApp() throws InterruptedException, IOException{
		
			 String[][] getit = CommonMethod.GetValue(Pathoftestdata, "Login",1);
			 String AppUrl = getit[0][0]; 
			 String Username= getit[0][1];  
			 String Password=getit[0][2];
			 String ExpectedResult=getit[0][3]; 
			 LoginIntoApp.LogIn(driver, AppUrl, Username, Password);
		     String ActualResult =driver.findElement(By.xpath("html/body/nav/div/div/navbar/div/div[3]/ul/li[1]/a")).getText();	
		     System.out.println("The Actual Result is = "+ActualResult);
		     Assert.assertEquals(ActualResult,ExpectedResult);
		}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
		}
	}