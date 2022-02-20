package stepDefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import pageObjects.LoginPage;

public class GivenSteps extends BaseClass {
	
	@Given("user opens {string} browser")
	public void user_opens_chrome_browser(String browser) {
		
//		Properties prop = new Properties();
//		try {
//			prop.load(new FileInputStream(".//Configuration//config.properties"));
//			System.out.println(prop.getProperty("chromeDriverLocation"));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		if(browser.toLowerCase().equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
			driver = new ChromeDriver();			
		}
		
		if(browser.toLowerCase().equals("edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"//Drivers/msedgedriver.exe");
			driver = new EdgeDriver();
		}	
		
	}

	
	@When("user opens {string}")
	public void user_opens(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	}

	@When("user enters login credentials {string} {string} {string}")
	public void user_enters_login_credentials(String customerID, String email, String password) {
		lp = new LoginPage(driver);
		lp.login(customerID, email, password);
	}

	
	
	@Then("validate whether page title is {string}")
	public void validate_whether_page_title_is(String result) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		Assert.assertEquals(result,driver.getTitle());

	}
	
	
	@After
	public void closeBrowser() {
		driver.close();
		
	}
	

}