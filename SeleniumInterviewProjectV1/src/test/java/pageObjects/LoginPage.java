package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver rdriver){
		this.driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//*[@data-id='loginFormLoginId']")
	WebElement customerID;

	@FindBy(xpath = "//*[@data-id='loginFormEmailAddress']")
	WebElement email;
	
	@FindBy(xpath = "//*[@data-id='loginFormPassword']")
	WebElement password;
	
	@FindBy(xpath = "//*[@data-id='loginFormCancelButton']")
	WebElement cancel;
	
	@FindBy(xpath = "//*[@data-id='loginFormSubmitButton']")
	WebElement submit;
	
	
	public void login(String customerID, String email, String password) {
		this.customerID.sendKeys(customerID);
		this.email.sendKeys(email);		
		this.password.sendKeys(password);
		this.submit.click();
	}
}
