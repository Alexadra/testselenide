package test.java;
import org.junit.Test;

import main.java.BaseClass;
import main.java.CartPage;
import main.java.DataProperties;
import main.java.PDPage;
import main.java.PLPage;
import main.java.SearchPage;


public class SearchTest extends BaseClass {

	/*@Test
	public void searchByName(){
		LOG.info("_____variationAddToCartQuickPLP()_____");
		SearchPage search = new SearchPage();
		search.findBy(DataProperties.get("searchName"));
		avoidShipPopup();
		avoidCookieInfo();
		plp.clickQuickBuyVar();
		String productId = plp.getQuickProductId();
		plp.selectSizeQuick();
		plp.setQtyQuick();
		CartPage cart = plp.addToCartQuick();
		cart.isMiniCartVisible();
		cart.goToCart();
		cart.isProductPresent(productId);
	}*/
	
	/*
	@Test
	public void variationAddToCartQuickPLP(){
		LOG.info("_____variationAddToCartQuickPLP()_____");
		PLPage plp = new PLPage();
		plp.openPLP(DataProperties.get("plpurl"));
		avoidShipPopup();
		avoidCookieInfo();
		plp.clickQuickBuyVar();
		String productId = plp.getQuickProductId();
		plp.selectSizeQuick();
		plp.setQtyQuick();
		CartPage cart = plp.addToCartQuick();
		cart.isMiniCartVisible();
		cart.goToCart();
		cart.isProductPresent(productId);
	}
	
	@Test
	public void simpleAddToCartQuickPLP(){
		LOG.info("_____simpleAddToCartQuickPLP()_____");
		PLPage plp = new PLPage();
		plp.openPLP(DataProperties.get("plpurl"));
		avoidShipPopup();
		avoidCookieInfo();
		plp.clickQuickBuySim();
		String productId = plp.getQuickProductId();
		plp.setQtyQuick();
		CartPage cart = plp.addToCartQuick();
		cart.isMiniCartVisible();
		cart.goToCart();
		cart.isProductPresent(productId);
	}
	
	@Test
	public void simpleAddToCartListPLP(){
		LOG.info("_____simpleAddToCartListPLP()_____");
		PLPage plp = new PLPage();
		plp.openPLP(DataProperties.get("plpurl"));
		avoidShipPopup();
		avoidCookieInfo();
		plp.setListView();
		String productId = plp.getFirstSimpleProductId();
		plp.setQtyFirstSimple();
		CartPage cart = plp.addToCartFirstSimple();
		cart.isMiniCartVisible();
		cart.goToCart();
		cart.isProductPresent(productId);
	}
	
	@Test
	public void variationAddToCartListPLP(){
		LOG.info("_____variationAddToCartListPLP()_____");
		PLPage plp = new PLPage();
		plp.openPLP(DataProperties.get("plpurl"));
		avoidShipPopup();
		avoidCookieInfo();
		plp.setListView();
		String productId = plp.getFirstSimpleProductId();
		plp.selectSizeFirstVariation();
		plp.setQtyFirstVariation();
		CartPage cart = plp.addToCartFirstSimple();
		cart.isMiniCartVisible();
		cart.goToCart();
		cart.isProductPresent(productId);
	}
	*/
}
