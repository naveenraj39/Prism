package qa.prism;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.TestMethodOrder;

@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrgCreation_Test extends BaseClass{
	SuperClass superOrg;
	Integration_Setup IS;
@BeforeAll
public void invokeApplication() throws Exception {
	superOrg = new SuperClass();
	superOrg.setup_connection();
}

@Test
@Order(1)
public void signInToApplication() {
	superOrg.login_prism_withValidUsername_validPassword();
}

@Test
@Order(2)
public void addOrgDetail() throws Exception {
	superOrg.addOrgDetail();
}

@Test
@Order(3)
public void addOrgAdminDetails() {
	superOrg.addAdminDetail();
}

@Test
@Order(4)
public void setAuthAndCreateNewOrg() {
	superOrg.setupAuth();
}

@Test
@Order(5)
public void searchOrg() throws Exception {
	superOrg.searchAndViewOrg();
}

@Test
@Order(6)
public void integration() throws Exception {
	superOrg.smtpSetup();
	superOrg.hl7Setup();
	superOrg.hl7Setup2();
	superOrg.hapiSetup();
}

}
