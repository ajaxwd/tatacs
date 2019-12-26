package pages;

import java.util.List;

import org.apache.commons.lang3.RandomUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageCompra extends BasePage {

	@FindBy(xpath = "//h2[contains(text(),'Your flight from Mexico City to New York has been reserved.')")
	private WebElement tituloNuevo;
	
	@FindBy(xpath = "(//label[contains(text(),'Name')]/following::input)[1]")
	private WebElement inputName;
	
	@FindBy(xpath = "(//label[contains(text(),'Address')]/following::input)[1])")
	private WebElement inputAddress;
			
	@FindBy(xpath = "(//label[contains(text(),'City')]/following::input)[1])")
	private WebElement inputCity;
	
	@FindBy(xpath = "(//label[contains(text(),'State')]/following::input)[1]")
	private WebElement inputState;
	
	@FindBy(xpath = "(//label[contains(text(),'Zip Code')]/following::input)[1]")
	private WebElement inputZip;
	
	@FindBy(xpath = "(//label[contains(text(),'Card Type')]/following::input)[1]")
	private WebElement inputCard;
	
	@FindBy(xpath = "//select/option[contains(text(),'Visa')]")
	private WebElement selectCard;
	
	@FindBy(xpath = "(//label[contains(text(),'Credit Card Number')]/following::input)[1]")
	private WebElement inputCredit;
	
	@FindBy(xpath = "(//label[contains(text(),'Month')]/following::input)[1]")
	private WebElement inputMonth;
	
	@FindBy(xpath = "(//label[contains(text(),'Year')]/following::input)[1]")
	private WebElement inputYear;
	
	@FindBy(xpath = "(//label[contains(text(),'Name on Card')]/following::input)[1]")
	private WebElement inputNameCard;
	
	@FindBy(xpath = "//input[@name='rememberMe']")
	private WebElement rememberme;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement btnPurchase;

	public PageCompra(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void completaFormulario() {
		String titulo = tituloNuevo.getText();
		if(titulo.equals("Your flight from Mexico City to New York has been reserved.")) {
			inputName.sendKeys("Adrian");
			inputAddress.sendKeys("San bernardo");
			inputCity.sendKeys("Santiago");
			inputState.sendKeys("Santiago");
			inputZip.sendKeys("123456");
			inputCard.click();
			selectCard.click();
			inputCredit.sendKeys("123456789098765");
			inputMonth.clear();
			inputMonth.sendKeys("12");
			inputYear.clear();
			inputYear.sendKeys("2019");
			inputNameCard.sendKeys("Casa");
			rememberme.click();
			btnPurchase.click();
		}else {
			System.out.println("Error el titulo no es el mismo");
		}
	}
}
