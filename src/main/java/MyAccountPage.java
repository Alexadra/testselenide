package main.java;

import static com.codeborne.selenide.Selenide.*;
import org.openqa.selenium.By;

import main.java.DataProperties;

import static com.codeborne.selenide.Condition.*;

public class MyAccountPage {
	String url = DataProperties.get("url");
	
	 //========================================================LOCATORS==========================================================================
		By secondSwatch = By.xpath("(//ul[@class='b-product_variations-list-attribute-value-swatches swatches m-color color']//a)[2]");
		By firstSize = By.xpath("(//ul[@class='b-product_variations-list-attribute-value-swatches swatches m-size size']//a)[1]");
		By addToCart = By.id("add-to-cart");
		By miniCartList = By.cssSelector(".b-minicart-products");
		By loginPopup = By.cssSelector(".ui-dialog-titlebar-close");
	 //========================================================LOCATORS==========================================================================
	
	public MyAccountPage isLogoutPresent() {
		$(".b-user_info-panel-link_logout").should(exist);
		return page(MyAccountPage.class);
		
	}



}
