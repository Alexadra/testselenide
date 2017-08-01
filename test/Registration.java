
import static com.codeborne.selenide.Selenide.*;
import org.junit.Test;
import org.openqa.selenium.By;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Condition.*;

public class Registration {

	@Test
	public void validRegister() throws InterruptedException{
		open("https://www.musto.com/");
		$(".ui-dialog-titlebar-close").click();
		$(By.xpath("(//a[@class='b-user_info-link b-user_info-register'])[2]")).click();
		$("#RegistrationForm").shouldBe(visible);
		$("#dwfrm_profile_customer_title").selectOption("Mrs");
		$("#dwfrm_profile_customer_firstname").sendKeys("1FirstName");
		$("#dwfrm_profile_customer_lastname").sendKeys("1LastName");
		$("#dwfrm_profile_customer_email").sendKeys("erer111@test.com");
		$("#dwfrm_profile_customer_emailconfirm").sendKeys("erer111@test.com");
		$$(".password").get(0).sendKeys("12345678");
		$$(".password").get(1).sendKeys("12345678");
		$(".b-btn_secondary").click();
		$(".b-user_info-panel-link_logout").should(exist);
		
	}

}
