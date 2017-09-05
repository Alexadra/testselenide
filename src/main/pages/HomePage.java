package main.pages;

import static com.codeborne.selenide.Selenide.*;
import org.openqa.selenium.By;
import main.pages.DataProperties;

public class HomePage {
	String url = DataProperties.get("url");
	
	 //========================================================LOCATORS==========================================================================
		By secondSwatch = By.xpath("(//ul[@class='b-product_variations-list-attribute-value-swatches swatches m-color color']//a)[2]");
		By firstSize = By.xpath("(//ul[@class='b-product_variations-list-attribute-value-swatches swatches m-size size']//a)[1]");
		By addToCart = By.id("add-to-cart");
		By miniCartList = By.cssSelector(".b-minicart-products");
		By loginPopup = By.cssSelector(".ui-dialog-titlebar-close");
		By registerLink = By.xpath("(//a[@class='b-user_info-link b-user_info-register'])[2]");
		By loginEmail = By.cssSelector("");
	 //========================================================LOCATORS==========================================================================
	
	public HomePage openHome() {
		open(url);
		return page(HomePage.class);
	}

	public HomePage openLoginPopup() {
		$(loginPopup).click();
		return page(HomePage.class);
	}

	public void loginPost() {
		$(loginEmail).sendKeys("");
	}
	
	public RegisterPage goToRegister() {
		$(registerLink).click();
		return page(RegisterPage.class);
	}

}
