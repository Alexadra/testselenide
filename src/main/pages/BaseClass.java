package main.pages;

import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codeborne.selenide.Configuration;

import test.java.LoginTest;

public class BaseClass {
	 //========================================================LOCATORS==========================================================================
		By popupShipClose = By.cssSelector(".ui-dialog-titlebar-close");
		By cookieClose = By.cssSelector(".b-cookies_notice-content-close");
	 //========================================================LOCATORS==========================================================================
	
	public static Logger LOG = LoggerFactory.getLogger(LoginTest.class);
	
	public BaseClass(){
	System.setProperty("webdriver.gecko.driver", "D:\\selenide_docs\\geckodriver.exe");
	Configuration.browser="gecko";
	
	//System.setProperty("webdriver.chrome.driver", "D:\\Oleksandra\\testein\\chrome-win-x64-latest.exe");
	//Configuration.browser="Chrome";
	}

	public void avoidShipPopup(){
		$(popupShipClose).click();
	}
	
	public void avoidCookieInfo(){
		$(cookieClose).click();
	}
}