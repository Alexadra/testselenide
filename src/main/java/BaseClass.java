package main.java;

import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codeborne.selenide.Configuration;

public class BaseClass {
	 //========================================================LOCATORS==========================================================================
		By popupShipClose = By.cssSelector(".ui-dialog-titlebar-close");
		By cookieClose = By.cssSelector(".b-cookies_notice-content-close");
	 //========================================================LOCATORS==========================================================================
	
	public static Logger LOG = LoggerFactory.getLogger(BaseClass.class);
	
	public BaseClass(){
		String os = System.getProperty("os.name").toLowerCase();
		
		if (os.contains("win")) {
			System.setProperty("webdriver.gecko.driver", "D:\\selenide_docs\\geckodriver.exe");
			Configuration.browser="gecko";
			//System.setProperty("webdriver.chrome.driver", "D:\\Oleksandra\\testein\\chrome-win-x64-latest.exe");
			
		}
		 else {
			//System.setProperty("webdriver.gecko.driver", "src/main/resources/new/geckodriver");
			//Configuration.browser="gecko";
			System.setProperty("webdriver.chrome.driver", "src/main/resources/new/chromedriver");
			Configuration.browser="Chrome";
		 }
		LOG.info(os+": os started");
	}

	public void avoidShipPopup(){
		if ($(popupShipClose).isDisplayed())
		$(popupShipClose).click();
	}
	
	public void avoidCookieInfo(){
		if ($(cookieClose).isDisplayed())
		$(cookieClose).click();
	}
}
