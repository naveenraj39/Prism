package qa.prism;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.Reader;


@TestInstance(Lifecycle.PER_CLASS)
public class Login_Test {
	WebDriver driver;
	WebDriverWait wait;
	
	
	@BeforeAll
	
	public void test() {
		
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
		
		ChromeOptions option = new ChromeOptions();
		driver = new ChromeDriver(option);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://prism.qa.triomics.in/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	
	@Test
	public void login() throws Exception {
		driver.findElement(By.xpath("//*[@id='dropdown-selectorganisation']")).click();
		driver.findElement(By.xpath("//*[text()='Azure Org']")).click();
		driver.findElement(By.xpath("//*[@type='button']")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("prism.admin@hriturajtriomics.onmicrosoft.com")));
		
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("prism.admin@hriturajtriomics.onmicrosoft.com");
		driver.findElement(By.xpath("//*[@id='idSIButton9']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@type='password']")));
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Yoko368836123");
		driver.findElement(By.xpath("//*[@id='idSIButton9']")).click();
		
		driver.findElement(By.xpath("//*[@id='idBtn_Back']")).click();
		
	}
	
	@AfterAll
	 public static void ReportingTest() throws InterruptedException {
	  	  Thread.sleep(6000);
	  	  Reader read = new Reader();
	  	  read.report();
	    }
	

}
