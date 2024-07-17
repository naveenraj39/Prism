package qa.prism;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.Reader;
import pom.Super_org;



@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Prism_Test extends BaseClass{
	WebDriver driver;
	WebDriverWait wait;
	
	
	@BeforeAll
	
	public void setup_connection() throws Exception {
		
		
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
		
		ChromeOptions option = new ChromeOptions();
		driver = new ChromeDriver(option);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		config = new Properties();
		FileInputStream FI = new FileInputStream(".//config.properties");
		config.load(FI);
		
		superOrg = new Super_org(driver);
		
		
		
	}
	
	@Test
	@Order(1)
	public void login_prism_withValidUsername_validPassword()  {
	
		String url = config.getProperty("dev_super_org");
		String user = config.getProperty("dev_super_user");
		String pass = config.getProperty("dev_super_pass");
		driver.get(url);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@type='email']")));
		superOrg.input_username(user);
		superOrg.click_on_next();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@type='password']")));
		superOrg.input_password(pass);
		superOrg.login();
		superOrg.select_No();
		
		
	}
	
	@Test
	@Order(2)
	public void addOrg() throws InterruptedException  {
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-testid='triomicsAdminAddOrganisation']")));
		superOrg.addOrg();
		WebElement acr = driver.findElement(By.xpath("//*[@id='modalGenerator-form-acronym']"));
		acr.sendKeys("New_Hosp_13");
		superOrg.orgName("New_Hosp_13","test@mailinator.com"); 
		superOrg.phone("+91-8989898989");
//		WebElement phone = driver.findElement(By.xpath("//*[@id='modalGenerator-form-workPhoneNumber']"));
//		phone.sendKeys("+91-8989898989");
		
		
		
		
		
		
		
	}
	
	@AfterAll
	 public static void ReportingTest() throws InterruptedException {
	  	  Thread.sleep(6000);
	  	  Reader read = new Reader();
	  	  read.report();
	    }
	

}
