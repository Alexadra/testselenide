package main.java;

import static com.codeborne.selenide.Selenide.*;
import org.openqa.selenium.By;

import main.java.DataProperties;

import static com.codeborne.selenide.Condition.*;

public class PLPage {
	String url = DataProperties.get("url");
	
	 //========================================================LOCATORS==========================================================================
		By secondSwatch = By.xpath("(//ul[@class='b-product_variations-list-attribute-value-swatches swatches m-color color']//a)[2]");
		By firstSize = By.xpath("(//ul[@class='b-product_variations-list-attribute-value-swatches swatches m-size size']//a)[1]");
		By addToCart = By.id("add-to-cart");
		By miniCartList = By.cssSelector(".b-minicart-products");
	 //========================================================LOCATORS==========================================================================
	
	public PLPage openPLP(String plpUrl) {
		open(url+plpUrl);
		return page(PLPage.class);
	}
	
	public PLPage selectSizeQuick() {
		$(firstSize).click();
		return page(PLPage.class);
	}
	
	public CartPage addToCartQuick() {
		$(addToCart).click();
		return page(CartPage.class);
	}

	public PLPage clickQuickBuy() {
		// TODO Auto-generated method stub
		return page(PLPage.class);
	}

	public PLPage setQtyQuick() {
		// TODO Auto-generated method stub
		return page(PLPage.class);
	}

	public PLPage setListView() {
		// TODO Auto-generated method stub
		return page(PLPage.class);
	}

	public PLPage clickQuickBuyVar() {
		// TODO Auto-generated method stub
		return page(PLPage.class);
	}

	public PLPage clickQuickBuySim() {
		// TODO Auto-generated method stub
		return page(PLPage.class);
	}

	public String getQuickProductId() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getFirstSimpleProductId() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setQtyFirstSimple() {
		// TODO Auto-generated method stub
		
	}

	public CartPage addToCartFirstSimple() {
		// TODO Auto-generated method stub
		return null;
	}

	public void selectSizeFirstVariation() {
		// TODO Auto-generated method stub
		
	}

	public void setQtyFirstVariation() {
		// TODO Auto-generated method stub
		
	}

}
