package test.java;
import org.junit.Test;

import main.java.BaseClass;
import main.java.DataProperties;
import main.java.HomePage;
import main.java.MyAccountPage;
import main.java.RegisterPage;

public class RegistrationTest extends BaseClass {

	@Test
	public void validRegister() throws InterruptedException{
		LOG.info("_____validRegister()_____");
		HomePage home = new HomePage();
		home.openHome();
		home.openLoginPopup();
		RegisterPage register = home.goToRegister();
		MyAccountPage myAccount = register.registrationPost(DataProperties.get("title"), DataProperties.get("name"), 
				DataProperties.get("lastname"), DataProperties.get("email"), DataProperties.get("password"));
		myAccount.isLogoutPresent();
	}

}
