package test.java;
import org.junit.Test;

import main.java.BaseClass;
import main.java.DataProperties;
import main.java.HomePage;
import main.java.MyAccountPage;



public class LoginTest extends BaseClass {

	@Test
	public void validLogin(){
		LOG.info("_____validLogin()_____");
		HomePage home = new HomePage();
		home.openHome();
		home.openLoginPopup();
		MyAccountPage myaccount = home.loginPost(DataProperties.get("loginEmail"), DataProperties.get("loginPass"));
		myaccount.isLogoutPresent();
	}
}
