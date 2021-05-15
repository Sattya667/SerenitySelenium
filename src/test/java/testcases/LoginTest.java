package testcases;

import org.junit.Test;
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
	  
	 
	
	@Title("User Login test")
	@Test
	public void appLogintest() {
		//browser.manage().window().maximize();
		objLoginPageSteps.navigateToLoginPage();
		objLoginPageSteps.loginAsuser();
		objLoginPageSteps.loginSuccess();
	}
}
