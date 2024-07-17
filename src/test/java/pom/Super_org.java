package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Super_org {
	
	WebDriver ldriver;
	
	public Super_org(WebDriver rdriver){
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);	
	}
	
	
	
@FindBy(xpath="//*[@type='email']")WebElement input_username;
@FindBy(xpath="//*[@type='submit']")WebElement click_on_next;
@FindBy(xpath="//*[@type='password']")WebElement input_password;
@FindBy(xpath="//*[@id='idSIButton9']")WebElement login;
@FindBy(xpath="//*[@id='idBtn_Back']")WebElement select_No;
@FindBy(xpath="//*[@data-testid='showUserDetailsClick']")WebElement userDetail;
@FindBy(xpath="//*[@data-testid='logoutClick']")WebElement logout;


//Add Org
@FindBy(xpath="//*[@data-testid='triomicsAdminAddOrganisation']")WebElement addOrg;
@FindBy(xpath="//*[@id='modalGenerator-form-acronym']")WebElement setOrgAcronym;
@FindBy(xpath="//*[@id='modalGenerator-form-name']")WebElement setOrgName;
@FindBy(xpath="//*[@data-testid='modalGenerator-form-organisationType']")WebElement setOrgType;
@FindBy(xpath="//*[@data-testid='modalGenerator-form-organisationType-CARE_PROVIDER_SITE']")WebElement setOrgTypeCPS;
@FindBy(xpath="//*[@placeholder='Email Id']")WebElement setEmailId;
@FindBy(xpath="//*[@id='modalGenerator-form-workPhoneNumber']")WebElement setPhoneNumber;
@FindBy(xpath="//*[@id='modalGenerator-form-address']")WebElement setAddress;
@FindBy(xpath="//*[@id='modalGenerator-form-landMark']")WebElement setLandMark;
@FindBy(xpath="//*[@id='modalGenerator-form-streetName']")WebElement setStreetName;
@FindBy(xpath="//*[@id='modalGenerator-form-city']")WebElement setCity;
@FindBy(xpath="//*[@data-testid='modalGenerator-form-country']")WebElement setCountry;
@FindBy(xpath="//*[@data-testid='modalGenerator-form-country-India']")WebElement setCountryIndia;
@FindBy(xpath="//*[@id='modalGenerator-form-postCode']")WebElement setPostcode;
@FindBy(xpath="//*[@id='modalGenerator-form-state']")WebElement setState;
@FindBy(xpath="//*[@id='modalGenerator-form-timezoneSeconds']")WebElement setTimeZone;
@FindBy(xpath="//*[@data-testid='modalGenerator-form-timezoneSeconds-19800']")WebElement timeZoneSelect;
@FindBy(xpath="//*[@data-testid='modalGenerator-submitCTA']")WebElement continueBtn;


//Admin

@FindBy(xpath="//*[@id='modalGenerator-form-adminFirstName']")WebElement setAdminFirstName;
@FindBy(xpath="//*[@id='modalGenerator-form-adminLastName']")WebElement setAdminLastName;
@FindBy(xpath="//*[@placeholder='Email Id']")WebElement setAdminEmailId;
@FindBy(xpath="//*[@id='modalGenerator-form-adminWorkPhoneNumber']")WebElement setAdminPhoneNumber;
@FindBy(xpath="//*[@data-testid='modalGenerator-submitCTA']")WebElement continueBtnAdmin;

//Authselect
@FindBy(xpath="//*[@id='modalGenerator-form-authBackendType']")WebElement selectAuth;
@FindBy(xpath="//*[@data-testid='modalGenerator-form-authBackendType-AWS_COGNITO']")WebElement selectAWScognito;
@FindBy(xpath="//*[@data-testid='modalGenerator-submitCTA']")WebElement submitBtn;

//search Org
@FindBy(xpath="//*[@placeholder='Type something']")WebElement searchOrg;
@FindBy(xpath="//*[@id='undefined-button']")WebElement clcikOnKebabButton;

//temp
	@FindBy(xpath="//*[@data-testid='TABLE_ROW_1']/descendant::button[@id='undefined-button']")WebElement tempKebabButton;
		
		
@FindBy(xpath="//*[@data-testid='undefined-view_organisation']")WebElement viewOrgOption;
@FindBy(xpath="//*[@data-testid='customPageHeader-tab-ehr_setup']")WebElement navigateToIntegrationTab;


//SMTP setup

@FindBy(xpath="//*[@role='button']/descendant::p[text()='SMTP']")WebElement smtpSection;
@FindBy(xpath="(//*[@Placeholder='Port'])[2]")WebElement portInput;
@FindBy(xpath="//*[@Placeholder='Host']")WebElement hostInput;
@FindBy(xpath="(//*[@Placeholder='Username'])[1]")WebElement usernameInput;
@FindBy(xpath="(//*[@placeholder='Password'])[1]")WebElement passwordInput;
@FindBy(xpath="//*[text()='SMTP']/../parent::div/../following-sibling::div/descendant::span[text()='Save']")WebElement smtpSaveBtn;


//HL7 V2

@FindBy(xpath="//*[@role='button']/descendant::p[text()='HL7 V2']")WebElement hl7Section;
@FindBy(xpath="(//*[@Placeholder='Port'])[1]")WebElement hl7PortInput;
@FindBy(xpath="//*[text()='Supported Versions']/../descendant::div[@role='button']")WebElement hl7Versions;
@FindBy(xpath="//*[@data-value='2.5.1']")WebElement selectHL7Version;
@FindBy(xpath="//*[text()='Supported Message Types']/../descendant::div[@role='button']")WebElement hl7MsgTypes;









//@FindBy(xpath="//*[@data-testid='modalGenerator-submitCTA']")WebElement clickContinueOnAdmin;
//@FindBy(xpath="//*[@data-testid='modalGenerator-submitCTA']")WebElement clickContinueOnAdmin;













public void input_username(String user) {
	input_username.sendKeys(user);
}

public void click_on_next() {
	click_on_next.click();
}

public void input_password(String pass){
	input_password.sendKeys(pass);
}

public void login() {
	login.click();
}

public void select_No() {
	select_No.click();
}

public void addOrg() {
	addOrg.click();
}

public void orgCreation(String acr, String name, String email, String phone, String address, String landmark, String street, String city, String post, String state) {	
//	Actions action = new Actions(ldriver);
//	action.sendKeys(setOrgName, name).perform();
	setOrgAcronym.sendKeys(acr);
	setOrgName.sendKeys(name);
	setOrgType.click();
	setOrgTypeCPS.click();
	setEmailId.sendKeys(email);
	setPhoneNumber.sendKeys(phone);
	setAddress.sendKeys(address);
	setLandMark.sendKeys(landmark);
	setStreetName.sendKeys(street);
    setCity.sendKeys(city);
    setCountry.click();
    setCountryIndia.click();
    setPostcode.sendKeys(post);
    setState.sendKeys(state);
    setTimeZone.click();
    timeZoneSelect.click();
    continueBtn.click();
	
}

public void adminDetails(String firstName, String lastName, String adminEmail, String adminPhone) {
	setAdminFirstName.sendKeys(firstName);
	setAdminLastName.sendKeys(lastName);
	setAdminEmailId.sendKeys(adminEmail);
	setAdminPhoneNumber.sendKeys(adminPhone);
	continueBtnAdmin.click();
	
	
}

public void setupAuth() {
	selectAuth.click();
	selectAWScognito.click();
	//submitBtn.click();
}

public void searchOrg(String orgName) {
	searchOrg.sendKeys(orgName);
	
}

public void viewOrg() {
	
	tempKebabButton.click();
	viewOrgOption.click();
	navigateToIntegrationTab.click();
	
}

public void smtp(String port, String host, String user, String pass) {
	
	smtpSection.click();
	portInput.sendKeys(port);
	hostInput.sendKeys(host);
	usernameInput.sendKeys(user);
	passwordInput.sendKeys(pass);
	
}

public void hl7_v2(String port) {
	
	hl7Section.click();
	hl7PortInput.sendKeys(port);
	hl7Versions.click();
	selectHL7Version.click();
	List<WebElement>ele = ldriver.findElements(By.xpath("//*[text()='Supported Message Types']/../descendant::div[@role='button']"));
	Select sel = new Select(hl7MsgTypes);
}

}
