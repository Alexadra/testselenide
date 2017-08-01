import org.junit.Test;

import Pages.BaseClass;
import Pages.PDPage;

public class AddToCart extends BaseClass {

	@Test
	public void variationAddtoCart(){
		PDPage pdp = new PDPage();
		pdp.openPDP();
		avoidShipPopup();
		avoidCookieInfo();
		pdp.selectVariation();
		pdp.selectSize();
		pdp.addToCart();
	}
}
