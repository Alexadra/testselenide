package main.pages;

import static com.codeborne.selenide.Selenide.*;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.*;
import main.pages.DataProperties;

public class LoginPage {
	String url = DataProperties.get("url");
	
	 //========================================================LOCATORS==========================================================================
		By secondSwatch = By.xpath("(//ul[@class='b-product_variations-list-attribute-value-swatches swatches m-color color']//a)[2]");
		By firstSize = By.xpath("(//ul[@class='b-product_variations-list-attribute-value-swatches swatches m-size size']//a)[1]");
		By addToCart = By.id("add-to-cart");
		By miniCartList = By.cssSelector(".b-minicart-products");
		By loginPopup = By.cssSelector(".ui-dialog-titlebar-close");
	 //========================================================LOCATORS==========================================================================
	
	public LoginPage openHome() {
		open(url);
		return page(LoginPage.class);
	}

	public LoginPage openLoginPopup() {
		$(loginPopup).click();
		return page(LoginPage.class);
	}

	public void loginPost() {
		// TODO Auto-generated method stub
	}
	
	public RegisterPage goToRegister() {
		$(By.xpath("(//a[@class='b-user_info-link b-user_info-register'])[2]")).click();
		return null;
	}

}
