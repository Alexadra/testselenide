package test.java;
import org.junit.Test;
import main.pages.BaseClass;
import main.pages.HomePage;



public class LoginTest extends BaseClass {

	@Test
	public void validLogin(){
		LOG.info("_____validLogin()_____");
		HomePage home = new HomePage();
		home.openHome();
		home.openLoginPopup();
		home.loginPost();
	}
}
