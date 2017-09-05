package test.java;
import org.junit.Test;

import main.pages.BaseClass;
import main.pages.HomePage;
import main.pages.MyAccountPage;
import main.pages.RegisterPage;

public class RegistrationTest extends BaseClass {

	@Test
	public void validRegister() throws InterruptedException{
		LOG.info("_____validRegister()_____");
		HomePage home = new HomePage();
		home.openHome();
		home.openLoginPopup();
		RegisterPage register = home.goToRegister();
		MyAccountPage myAccount = register.registrationPost();
		myAccount.isLogoutPresent();
	}

}
