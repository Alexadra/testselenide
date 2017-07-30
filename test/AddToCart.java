import org.junit.Test;

import Pages.PDPage;

public class AddToCart {

	@Test
	public void variationAddtoCart(){
		PDPage pdp = new PDPage();
		pdp.openPDP();
		pdp.selectVariation();
		pdp.selectSize();
		pdp.addToCart();
	}
}
