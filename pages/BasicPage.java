package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasicPage {
	
//	Od page klasa je potrebno implementirati:
//		Basic Page:
//		apstraktna klasa koja sadrži sve zajedničke funkcionalnosti page klasa
//		sve ostale page klase nasleđuju ovu klasu

	private WebDriver driver;
	private WebDriverWait waiter;

}
