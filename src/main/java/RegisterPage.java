package main.java;

import static com.codeborne.selenide.Selenide.*;
import org.openqa.selenium.By;

import main.java.DataProperties;

import static com.codeborne.selenide.Condition.*;

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
	
	public MyAccountPage registrationPost(String title, String name, String lastname, String email, String password) {
		$(registerForm).shouldBe(visible);
		$(titleDropdown).selectOption(title);
		$(firstnameField).sendKeys(name);
		$(lastnameField).sendKeys(lastname);
		$(emailField).sendKeys(email);
		$(emailConfirmField).sendKeys(email);
		$$(passField).get(0).sendKeys(password);
		$$(passField).get(1).sendKeys(password);
		$(submitRegister).click();
		return page(MyAccountPage.class);
		
	}



}
