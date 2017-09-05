package test.java;
import org.junit.Test;
import main.pages.BaseClass;
import main.pages.PDPage;


public class AddToCartTest extends BaseClass {

	@Test
	public void variationAddtoCart(){
		LOG.info("_____variationAddtoCart()_____");
		PDPage pdp = new PDPage();
		pdp.openPDP();
		avoidShipPopup();
		avoidCookieInfo();
		pdp.selectVariation();
		pdp.selectSize();
		pdp.addToCart();
	}
}
