package Pages;

import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;

import com.codeborne.selenide.Configuration;

public class BaseClass {
	 //========================================================LOCATORS==========================================================================
		By popupShipClose = By.cssSelector(".ui-dialog-titlebar-close");
		By cookieClose = By.cssSelector(".b-cookies_notice-content-close");
	 //========================================================LOCATORS==========================================================================
	
	
	public BaseClass(){
	//System.setProperty("webdriver.gecko.driver", "D:\\Oleksandra\\selenide_docs\\geckodriver.exe");
	//Configuration.browser="gecko";
	System.setProperty("webdriver.chrome.driver", "D:\\Oleksandra\\testein\\chrome-win-x64-latest.exe");
	Configuration.browser="Chrome";
	}

	public void avoidShipPopup(){
		$(popupShipClose).click();
	}
	
	public void avoidCookieInfo(){
		$(cookieClose).click();
	}
}
