package qa.prism;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pom.Super_org;

@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class Integration_Setup extends BaseClass{
	
	WebDriver driver;
	WebDriverWait wait;
	SuperClass OT;
	
@BeforeAll
public void setupConnection() throws Exception {
	
	OT = new SuperClass();
	OT.setup_connection();
	OT.login_prism_withValidUsername_validPassword();
		
}

@Test
@Order(1)
public void searchOrg() throws InterruptedException {

	OT.searchAndViewOrg();
		
}

@Test
@Order(2)
public void integration() throws Exception {
	OT.smtpSetup();
    OT.hl7Setup();
    OT.hl7Setup2();
    OT.hapiSetup();
    
}



}
