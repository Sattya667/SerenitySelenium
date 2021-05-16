package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account")

public class LoginPage extends PageObject{
	
	 @FindBy(id="SubmitLogin")
	    WebElement signIN;
	
	public void doLogin() {
		$("#email").sendKeys("janthird2021batch@gmail.com");
		$("#passwd").sendKeys("Selenium12345");
	   
		signIN.click();
	}
    public String accountPageIsVisible(){
        return $("div#center_column h1").getText();
    }

    public void goToContactsUsPage(){
        $(By.linkText("Contact us")).click();
    }

}
