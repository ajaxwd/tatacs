package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.PageVuelo;
import pages.PageCompra;
import utils.PageGenerator;


public class ProductToTheShoppingCartStepDefinitions {

	protected WebDriver driver = Hook.getDriver();

	
	@Given("^Que ingreso al portal del sitio de vuelo$")
	public void que_ingreso_al_portal_del_sitio_de_vuelo() {
		PageGenerator.getInstance(HomePage.class, driver).goToThePage();
	}
	
	@Given("^Se completan datos de salida y destino$")
	public void se_completan_datos_de_salida_y_destino() {
		PageGenerator.getInstance(HomePage.class, driver).findVuelo();
	}

	@And("^Se selecciona hora de vuelo$")
	public void se_selecciona_hora_de_vuelo() {
		PageGenerator.getInstance(PageVuelo.class, driver).SelectHoraVuelo();
	}

	@And("^Se completa el formulario de compra$")
	public void se_completa_el_formulario_de_compra() {
		
		PageGenerator.getInstance(PageCompra.class, driver).completaFormulario();
	}


}
