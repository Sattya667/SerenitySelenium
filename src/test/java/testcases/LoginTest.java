package testcases;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.OrderWith;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import steps.LoginPageSteps;

@RunWith(SerenityRunner.class)

public class LoginTest {
	
	@Steps
	LoginPageSteps objLoginPageSteps;
	
	
	  @Managed
	  WebDriver browser;
	  
	 
	@Test
	@Title("AUser Login test")
	//@Order(1)
	public void appLogintest() {
		//browser.manage().window().maximize();
		objLoginPageSteps.navigateToLoginPage();
		objLoginPageSteps.loginAsuser();
		objLoginPageSteps.loginSuccess();
		
	}
	
	@Test
	@Title("User should able to use conatct us option")
	//@Order(1)
	public void contactUsPage() {
		//browser.manage().window().maximize();
		objLoginPageSteps.navigateToLoginPage();
		objLoginPageSteps.loginAsuser();
		objLoginPageSteps.loginSuccess();
		objLoginPageSteps.clickContactUsLink();
		objLoginPageSteps.verifyContactUsPageHeader();
	}
}
