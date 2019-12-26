package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.StaticWait;

public class PageVuelo extends BasePage {

	@FindBy(xpath = "//h3[contains(text(),'lights from Mexico City to New York:')]")
	private WebElement validarTitulo;
	
	@FindBy(xpath = "//input[@value='Choose This Flight']")
	private WebElement btnHoraVuelo;


	public PageVuelo(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void SelectHoraVuelo() {
		String titulo = validarTitulo.getText();
		if(titulo.equals("lights from Mexico City to New York:")) {
			btnHoraVuelo.click();
		}
		else {
			System.out.println("Error : No es posible seleccionar el boton");
		}

	}

}
