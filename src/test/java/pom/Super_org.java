package pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
	@FindBy(xpath="//*[@data-testid='TABLE_ROW_2']/descendant::button[@id='undefined-button']")WebElement tempKebabButton;
		
		
@FindBy(xpath="//*[@data-testid='undefined-view_organisation']")WebElement viewOrgOption;
@FindBy(xpath="//*[@data-testid='customPageHeader-tab-ehr_setup']")WebElement navigateToIntegrationTab;


//SMTP setup

@FindBy(xpath="//*[@role='button']/descendant::p[text()='SMTP']")WebElement smtpSection;
@FindBy(xpath="(//*[text()='Port']//parent::div//following-sibling::div//descendant::input)[2]")WebElement portInput;
@FindBy(xpath="//*[text()='Host']//parent::div//following-sibling::div//descendant::input")WebElement hostInput;
@FindBy(xpath="(//*[text()='Username']//parent::div//following-sibling::div//descendant::input)[1]")WebElement usernameInput;
@FindBy(xpath="(//*[text()='Password']//parent::div//following-sibling::div//descendant::input)[1]")WebElement passwordInput;
@FindBy(xpath="//*[text()='SMTP']/../parent::div/../following-sibling::div/descendant::span[text()='Save']")WebElement smtpSaveBtn;


//HL7 V2

@FindBy(xpath="//*[@role='button']/descendant::p[text()='HL7 V2']")WebElement hl7Section;
@FindBy(xpath="(//*[text()='Port']//parent::div//following-sibling::div//descendant::input)[1]")WebElement hl7PortInput;
@FindBy(xpath="//*[text()='Supported Versions']/../descendant::div[@role='button']")WebElement hl7Versions;
@FindBy(xpath="//*[@data-value='2.5.1']")WebElement selectHL7Version;
@FindBy(xpath="//*[text()='Supported Message Types']/../descendant::div[@role='button']")WebElement hl7MsgTypes;
@FindBy(xpath="//*[@role='listbox']")WebElement hl7MsgList;
@FindBy(xpath="//*[@role='button']/child::span[text()='Use TLS']")WebElement useTLS;
@FindBy(xpath="//*[@data-testid='-false']")WebElement selectTLS;
@FindBy(xpath="//*[@type='button']/descendant::div[text()='Add Department']")WebElement addDept;

@FindBy(xpath="(//*[text()='Supported Versions']/../descendant::div[@role='button'])[1]")WebElement returnClk;

//addDept

@FindBy(xpath="//*[text()='Name']//parent::div//following-sibling::div//descendant::input")WebElement nameOfTheDepartment;
@FindBy(xpath="//*[text()='Code']//parent::div//following-sibling::div//descendant::input")WebElement deptCode;
@FindBy(xpath="//*[@role='button']//child::span[text()='Timezone']")WebElement timeZone;
@FindBy(xpath="//*[@data-testid='-UTC']")WebElement selectZone;
@FindBy(xpath="//*[@data-testid='modalGenerator-submitCTA']")WebElement saveDept;

@FindBy(xpath="(//*[@type='button']//child::span[text()='Save'])[3]")WebElement saveHl7;

//HAPI

@FindBy(xpath="//*[@role='button']/descendant::p[text()='HAPI FHIR EHR']")WebElement hapi;
@FindBy(xpath="(//*[text()='FHIR Version']//parent::div//following-sibling::div//descendant::input)[2]")WebElement fhirVersion;
@FindBy(xpath="(//*[text()='FHIR Base URL']//parent::div//following-sibling::div//descendant::input)[2]")WebElement fhirBaseUrl;
@FindBy(xpath="(//*[text()='MRN System List']//parent::div//following-sibling::div//descendant::input)[2]")WebElement systemList;
@FindBy(xpath="(//*[@type='button']/child::span[text()='Save'])[2]")WebElement hapiSaveBtn;

//smd

@FindBy(xpath="//*[@data-testid='customPageHeader-tab-standard_medical_data']")WebElement smdTab;
@FindBy(xpath="(//*[text()='Drag and drop to upload or Browse'])[1]")WebElement dragAndDrop;








//@FindBy(xpath="//*[@data-testid='modalGenerator-submitCTA']")WebElement clickContinueOnAdmin;
//@FindBy(xpath="//*[@data-testid='modalGenerator-submitCTA']")WebElement clickContinueOnAdmin;













public void input_username(String uname) {
	
	input_username.sendKeys(uname);
}

public void click_on_next() {
	click_on_next.click();
}

public void input_password(String pword){
	input_password.sendKeys(pword);
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
    List<WebElement> country = ldriver.findElements(By.xpath("//*[@role='listbox']//child::li"));
    String india = "India";
    for(WebElement con:country) {
    	if(con.getText().equals("India")) {
    		con.click();
    		break;
    	}
    }
    
  //  setCountryIndia.click();
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
	submitBtn.click();
}

public void searchOrg(String orgName) {
	searchOrg.sendKeys(orgName);
	
}

public void viewOrg() {
	
	tempKebabButton.click();
	viewOrgOption.click();
	navigateToIntegrationTab.click();
	
}

public void smtp() {
	
	smtpSection.click();
}

public void smtpSetup(String port, String host, String user, String pass) {
	portInput.sendKeys(port);
	hostInput.sendKeys(host);
	usernameInput.sendKeys(user);
	passwordInput.sendKeys(pass);
	smtpSaveBtn.click();
	
}

public void hl7Click() {
	
			hl7Section.click();
}

public void hl7_v2(String port) {
	
	
	hl7PortInput.sendKeys(port);
	hl7Versions.click();
	selectHL7Version.click();
}

public void hl7Msg() {
	hl7MsgTypes.click();
	List<WebElement> list = ldriver.findElements(By.xpath("//*[@role='listbox']/li"));
	System.out.println(list.size());
	for(int i=0;i<list.size();i++) {
		list.get(i).click();
	}
}	
public void useTLS() {
	
	useTLS.click();
	selectTLS.click();
	addDept.click();
	
}

public void addDept(String name, String code) {
	nameOfTheDepartment.sendKeys(name);
	deptCode.sendKeys(code);
	timeZone.click();
	List<WebElement> times = ldriver.findElements(By.xpath("//*[@role='listbox']//child::li"));
	for(WebElement timeZone:times) {
		if(timeZone.getText().equals("UTC")) {
			timeZone.click();
			break;
		}
	}
	saveDept.click();
	saveHl7.click();
}

public void hapiClick() {
	hapi.click();
}

public void hapi(String version, String baseUrl, String mrnSystemList) throws Exception {
	
	fhirVersion.sendKeys(version);
	fhirBaseUrl.sendKeys(baseUrl);
	systemList.sendKeys(mrnSystemList);
    systemList.sendKeys(Keys.ENTER);
	if(hapiSaveBtn.isEnabled()) {
		hapiSaveBtn.click();
	}
	
}

public void uploadSmdFiles(String file) {
	smdTab.click();
	dragAndDrop.sendKeys(file);
	
}


}
