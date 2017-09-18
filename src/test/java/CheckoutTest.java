package test.java;
import org.junit.Test;

import main.java.BaseClass;
import main.java.CartPage;
import main.java.CheckoutPage;
import main.java.DataProperties;
import main.java.PDPage;


public class CheckoutTest extends BaseClass {

/*	@Test
	public void guestCardCheckout(){
		LOG.info("_____guestCardCheckout()_____");
		PDPage pdp = new PDPage();
		pdp.openPDP();
		avoidShipPopup();
		avoidCookieInfo();
		pdp.selectVariation();
		pdp.selectSize();
		CartPage cart = pdp.addToCart();
		cart.goToCart();
		CheckoutPage checkout = cart.goTocheckout();
		checkout.submitBillingData(DataProperties.get("title"), DataProperties.get("name"), 
				DataProperties.get("lastname"), DataProperties.get("email"), DataProperties.get("password"));
		checkout.submitShippingData();
		checkout.submitShippingMethod();
	} */
}
