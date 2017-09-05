package main.pages;

import static com.codeborne.selenide.Selenide.*;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.*;
import main.pages.DataProperties;

public class RegisterPage {
	String url = DataProperties.get("url");
	
	 //========================================================LOCATORS==========================================================================
		By registerForm = By.id("RegistrationForm");
		By titleDropdown = By.id("dwfrm_profile_customer_title");
		By firstnameField = By.id("dwfrm_profile_customer_firstname");
		By lastnameField = By.id("dwfrm_profile_customer_lastname");
		By emailField = By.id("dwfrm_profile_customer_email");
		By emailConfirmField = By.id("dwfrm_profile_customer_emailconfirm");
		By passField = By.cssSelector(".password");
		By submitRegister = By.cssSelector(".password");
	 //========================================================LOCATORS==========================================================================
	
	public MyAccountPage registrationPost() {
		$(registerForm).shouldBe(visible);
		$(titleDropdown).selectOption("Mrs");
		$(firstnameField).sendKeys("1FirstName");
		$(lastnameField).sendKeys("1LastName");
		$(emailField).sendKeys("erer111@test.com");
		$(emailConfirmField).sendKeys("erer111@test.com");
		$$(passField).get(0).sendKeys("12345678");
		$$(passField).get(1).sendKeys("12345678");
		$(submitRegister).click();
		return page(MyAccountPage.class);
		
	}



}
