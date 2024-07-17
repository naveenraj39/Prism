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

public class Integration_Setup_Test extends BaseClass{
	
	WebDriver driver;
	WebDriverWait wait;
	Org_Creation_Test OT;
	
@BeforeAll
public void setupConnection() throws Exception {
	
	OT = new Org_Creation_Test();
	OT.setup_connection();
	OT.login_prism_withValidUsername_validPassword();
		
}

@Test
@Order(1)
public void searchOrg() {

	OT.searchAndViewOrg();
		
}

@Test
@Order(2)
public void integration() {
	OT.smtpSetup();
}



}
