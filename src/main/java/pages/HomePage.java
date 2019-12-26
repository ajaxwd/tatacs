package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
	private String baseURL = "http://www.blazedemo.com/";

	@FindBy(xpath = "//select[1]")
	private WebElement inputSalida;
	
	@FindBy(xpath = "//form/select/option[contains(text(),'Mexico City')]")
	private WebElement selectSalida;
	
	@FindBy(xpath = "//select[2]")
	private WebElement inputDestino;
	
	@FindBy(xpath = "//form/select/option[contains(text(),'New York')]")
	private WebElement selectdestino;
	
	@FindBy(xpath = "//div/input[@type='submit']")
	private WebElement btnFind;

	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public HomePage goToThePage() {
		driver.get(baseURL);
		return this;
	}

	public void findVuelo() {
		inputSalida.click();
		selectSalida.click();
		inputDestino.click();
		selectdestino.click();
		String btn = btnFind.getText();
		if(btn.equals("Find Flights")) {
			btnFind.click();
		}
		else {
			System.out.println("Error con el boton");
		}
		
		
	}
}
