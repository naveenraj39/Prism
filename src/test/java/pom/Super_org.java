package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
@FindBy(xpath="//*[@data-testid='modalGenerator-form-acronym']")WebElement setOrgAcronym;
@FindBy(xpath="//*[@data-testid='modalGenerator-form-name']")WebElement setOrgName;
@FindBy(xpath="//*[@data-testid='modalGenerator-form-organisationType']")WebElement setOrgType;
@FindBy(xpath="//*[@data-testid='modalGenerator-form-organisationType-CARE_PROVIDER_SITE']")WebElement setOrgTypeCPS;
@FindBy(xpath="//*[@placeholder='Email Id']")WebElement setEmailId;
@FindBy(xpath="//*[@id='modalGenerator-form-workPhoneNumber']")WebElement setPhoneNumber;
@FindBy(xpath="//*[@data-testid='modalGenerator-form-address']")WebElement setAddress;
@FindBy(xpath="//*[@data-testid='modalGenerator-form-landMark']")WebElement setLandMark;
@FindBy(xpath="//*[@data-testid='modalGenerator-form-streetName']")WebElement setStreetName;
@FindBy(xpath="//*[@data-testid='modalGenerator-form-city']")WebElement setCity;
@FindBy(xpath="//*[@data-testid='modalGenerator-form-country']")WebElement setCountry;
@FindBy(xpath="//*[@data-testid='modalGenerator-form-country-India']")WebElement setCountryIndia;
@FindBy(xpath="//*[@data-testid='modalGenerator-form-postCode']")WebElement setPostcode;
@FindBy(xpath="//*[@data-testid='modalGenerator-form-state']")WebElement setState;
@FindBy(xpath="//*[@data-testid='modalGenerator-form-timezoneSeconds']']")WebElement setTimeZone;
@FindBy(xpath="//*[@data-testid='modalGenerator-form-timezoneSeconds-19800']")WebElement timeZoneSelect;
@FindBy(xpath="//*[@data-testid='modalGenerator-submitCTA']")WebElement clickContinue;


//Admin

@FindBy(xpath="//*[@data-testid='modalGenerator-form-adminFirstName']")WebElement setAdminFirstName;
@FindBy(xpath="//*[@data-testid='modalGenerator-form-adminLastName']")WebElement setAdminLastName;
@FindBy(xpath="//*[@placeholder='Email Id']")WebElement setAdminEmailId;
@FindBy(xpath="//*[@data-testid='modalGenerator-form-adminWorkPhoneNumber']")WebElement setAdminPhoneNumber;
@FindBy(xpath="//*[@data-testid='modalGenerator-submitCTA']")WebElement clickContinueOnAdmin;

//Authselect
@FindBy(xpath="//*[@data-testid='modalGenerator-form-authBackendType']")WebElement selectAuth;
@FindBy(xpath="//*[@data-testid='modalGenerator-form-authBackendType-AWS_COGNITO']")WebElement selectAWScognito;
@FindBy(xpath="//*[@data-testid='modalGenerator-submitCTA']")WebElement clickSubmit;

//search Org
@FindBy(xpath="//*[@placeholder='Type something']")WebElement searchOrg;
@FindBy(xpath="//*[@id='undefined-button']")WebElement clcikOnKebabButton;
@FindBy(xpath="//*[@data-testid='undefined-view_organisation']")WebElement clickOnViewOrg;
@FindBy(xpath="//*[@data-testid='customPageHeader-tab-ehr_setup']")WebElement navigateToIntegrationTab;



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

public void orgName(String name, String email) {	
	Actions action = new Actions(ldriver);
	action.sendKeys(setOrgName, name).perform();
	setOrgType.click();
	setOrgTypeCPS.click();
	setEmailId.sendKeys(email);
	
	
}

public void phone(String phone) {
	setPhoneNumber.sendKeys(phone);
}

public void attributes(String address, String landmark, String street, String city, String post, String state) {
	
	
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
    clickContinue.click();
    
	
}

}
