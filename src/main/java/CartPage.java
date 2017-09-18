package main.java;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.Condition.*;
import org.openqa.selenium.By;

public class CartPage {
	String url = DataProperties.get("url");
	
	 //========================================================LOCATORS==========================================================================
		By miniCartList = By.cssSelector(".b-minicart-products");
	 //========================================================LOCATORS==========================================================================
	
	public CartPage isMiniCartVisible() {
		$(miniCartList).shouldBe(visible);
		return page(CartPage.class);
	}

	public void goToCart() {
		// TODO Auto-generated method stub
	}

	public void isProductPresent(String productId) {
		// TODO Auto-generated method stub
	}

	public CheckoutPage goTocheckout() {
		// TODO Auto-generated method stub
		return page(CheckoutPage.class);
	}

}
