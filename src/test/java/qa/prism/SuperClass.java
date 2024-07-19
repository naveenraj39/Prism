package qa.prism;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
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
import org.openqa.selenium.JavascriptExecutor;
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
public class SuperClass extends BaseClass{
	WebDriver driver;
	WebDriverWait wait;
	String studyName;
	
	@BeforeAll
	
	public void setup_connection() throws Exception {
		
		
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-cache");
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
	public void addOrgDetail() throws InterruptedException  {
		String timeStamp = new SimpleDateFormat(" yyyy-MM-dd 'at' HH:mm:ss").format(new Date());
    	studyName = "Test_Study" + timeStamp;
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-testid='triomicsAdminAddOrganisation']")));
		superOrg.addOrg();
		superOrg.orgCreation(studyName, studyName, "test@mailinator.com", "+91-8989898989", "addr", "land", "str", "Blr", "560086", "KA");
	  	
	}
	
	@Test
	@Order(3)
	public void addAdminDetail() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='modalGenerator-form-adminFirstName']")));
		superOrg.adminDetails("Org", "Admin", "siteadm.qa@mailinator.com", "+91-8989898989");
		
	}
	@Test
	@Order(4)
	public void setupAuth() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='modalGenerator-form-authBackendType']")));
		superOrg.setupAuth();
	}
	
	@Test
	@Order(5)
	public void searchAndViewOrg() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Type something']")));
		superOrg.searchOrg(studyName);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-testid='TABLE_ROW_1']/descendant::button[@id='undefined-button']")));
		Thread.sleep(2000);
		superOrg.viewOrg();
	}
	
	@Test
	@Order(6)
	public void smtpSetup() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@role='button']/descendant::p[text()='SMTP']")));
		superOrg.smtp("465", "smtp.gmail.com", "tools@triomics.in", "wqzm hesy jtoi loss");
	}
	
	@Test
	@Order(7)
	public void hl7Setup() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@role='button']/descendant::p[text()='HL7 V2']")));
		superOrg.hl7_v2("2575");
	}
	
	@Test
	@Order(8)
	public void hl7Setup2() throws Exception {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[text()='Supported Versions']/../descendant::div[@role='button'])[1]")));
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("//*[text()='Supported Versions']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(element).click().build().perform();	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Supported Message Types']/../descendant::div[@role='button']")));
		superOrg.hl7Msg();
		WebElement element1 = driver.findElement(By.xpath("//*[text()='Supported Versions']"));
		ac.moveToElement(element).click().build().perform();
		superOrg.useTLS();
        
	}
	
	@Test
	@Order(9)
	public void hapiSetup() throws Exception {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@role='button']/descendant::p[text()='HAPI FHIR EHR']")));
		superOrg.hapi("R4", "https://dopanciark.eng.triomics.in/", "https://sandbox.triomics.com/2024-05-23T22:00:00");
		
	}
	
	
	
	@AfterAll
	 public static void ReportingTest() throws InterruptedException {
	  	  Thread.sleep(6000);
	  	  Reader read = new Reader();
	  	  read.report();
	    }
	

}
