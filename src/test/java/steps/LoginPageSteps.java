package steps;

import org.junit.Assert;

import net.thucydides.core.annotations.Step;
import pages.LoginPage;

public class LoginPageSteps {
	
	LoginPage objLoginPage;
	
	@Step
	public void navigateToLoginPage() {
		objLoginPage.open();
	}

	@Step
	public void loginAsuser() {
		objLoginPage.doLogin();
	
	}
	
	@Step
	public void loginSuccess() {
		Assert.assertTrue(objLoginPage.accountPageIsVisible().equals("MY ACCOUNT"));
	}
	
	@Step
	public void clickContactUsLink() {
		objLoginPage.goToContactsUsPage();
	}
	
	@Step
	public void verifyContactUsPageHeader() {
		System.out.println(objLoginPage.headerTitle());
		Assert.assertTrue(objLoginPage.headerTitle().equals("CUSTOMER SERVICE - CONTACT US"));
	}
}
