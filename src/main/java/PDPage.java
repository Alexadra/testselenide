package main.java;

import static com.codeborne.selenide.Selenide.*;
import org.openqa.selenium.By;

import main.java.DataProperties;

import static com.codeborne.selenide.Condition.*;

public class PDPage {
	String url = DataProperties.get("url");
	
	 //========================================================LOCATORS==========================================================================
		By secondSwatch = By.xpath("(//ul[@class='b-product_variations-list-attribute-value-swatches swatches m-color color']//a)[2]");
		By firstSize = By.xpath("(//ul[@class='b-product_variations-list-attribute-value-swatches swatches m-size size']//a)[1]");
		By addToCart = By.id("add-to-cart");
		By miniCartList = By.cssSelector(".b-minicart-products");
	 //========================================================LOCATORS==========================================================================
	
	public PDPage openPDP(String pdpurl) {
		open(url+pdpurl);
		return page(PDPage.class);
	}
	
	public PDPage selectVariation() {
		$(secondSwatch).click();
		return page(PDPage.class);
	}
	
	public PDPage selectSize() {
		$(firstSize).click();
		return page(PDPage.class);
	}
	
	public CartPage addToCart() {
		$(addToCart).click();
		return page(CartPage.class);
	}

	public String getProductId() {
		// TODO Auto-generated method stub
		return null;
	}

}
