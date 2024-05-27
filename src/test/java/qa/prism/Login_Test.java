package qa.prism;

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

import helper.Reader;


@TestInstance(Lifecycle.PER_CLASS)
public class Login_Test {
	WebDriver driver;
	
	
	@BeforeAll
	
	public void test() {
		
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
		
		ChromeOptions option = new ChromeOptions();
		driver = new ChromeDriver(option);
		
		driver.get("https://prism.qa.triomics.in/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	
	@Test
	public void login() throws Exception {
		driver.findElement(By.xpath("//*[@id='dropdown-selectorganisation']")).click();
		driver.findElement(By.xpath("//*[text()='Azure Org']")).click();
		driver.findElement(By.xpath("//*[@type='button']")).click();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("prism.admin@hriturajtriomics.onmicrosoft.com");
		driver.findElement(By.xpath("//*[@id='idSIButton9']")).click();
		Thread.sleep(5000);
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
