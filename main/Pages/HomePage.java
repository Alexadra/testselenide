package Pages;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import Pages.DataProperties;

public class HomePage {

	public PDPage openPDP() {
		
		return page(PDPage.class);
	}
	
}
