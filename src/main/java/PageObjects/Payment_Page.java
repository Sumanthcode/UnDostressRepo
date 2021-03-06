package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Payment_Page {
	
	@FindBy(xpath="//div[@class='summary-message-top']")
	private WebElement paymentPageTitle;
	
	@FindBy(xpath="//div[@class='active']//p[text()='Tarjeta']")
	private WebElement tarjeta;
	
	@FindBy(xpath="//label[@class='radio-custom-label']/a")
	private List<WebElement> tarjetaDropdownRadioButtons;
	
	
	@FindBy(xpath="//input[@id='cardnumberunique']")
	private WebElement cardNumberField;
	
	@FindBy(xpath="//input[@placeholder='Mes']")
	private WebElement monthField;
	
	@FindBy(xpath="//input[@placeholder='Año']")
	private WebElement dayField;
	
	@FindBy(xpath="//input[@placeholder='CVV']")
	private WebElement cvvField;
	
	@FindBy(xpath="//div[@class='row correoElectronicoPaymentsRow']//input[@type='email']")
	private WebElement emailField;
	
	
	@FindBy(xpath="//button[@id='paylimit']")
	private WebElement paySubmit;
	
	@FindBy(xpath="//input[@id='usrname']")
	private WebElement popupEmailField;
	
	@FindBy(xpath="//input[@id='psw']")
	private WebElement popupPasswordField;

	@FindBy(xpath="(//iframe[contains(@name,'a')])[1]")
	private WebElement frame;
	
	@FindBy(xpath="//div[@class='rc-anchor rc-anchor-normal rc-anchor-light']//span[@id='recaptcha-anchor']")
	private WebElement capchaCheckBox;
	
	@FindBy(xpath="//button[@id='loginBtn']")
	private WebElement popupSubmit;
	
	@FindBy(xpath="//div[@id='add_err']")
	private WebElement errorMsg;

	
	public Payment_Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getPaymentPageTitle() {
		return paymentPageTitle;
	}
	
	public WebElement getTarjeta() {
		return tarjeta;
	}
	
	public List<WebElement> getTarjetaDropdownRadioButtons()
	{
		return tarjetaDropdownRadioButtons;
	}
	
	
	public WebElement getCardNumberField() {
		
		return cardNumberField;
		
	}
	
	
	
	public WebElement getMonthField() {
		 return monthField;
	}
	
	public WebElement getDayField() {
		 return dayField;
	}
	
	public WebElement getCvvField() {
		 return cvvField;
	}
	
	public WebElement getEmailField() {
		 return emailField;
	}
	
	public WebElement getPaySubmit() {
		return paySubmit;
	}

	
	public WebElement getPopupEmailField() {
		 return popupEmailField;
	}
	
	
	public WebElement getPopupPasswordField() {
		 return popupPasswordField;
	}
	
	public WebElement getFrame() {
		
		return frame;
	}
	
    public WebElement getCapchaCheckBox() {
		
		return capchaCheckBox;
	}
    
    public WebElement getPopupSubmit() {
		
  		return popupSubmit;
  	}
    
    public WebElement getErrorMsg() {
		
  		return errorMsg;
  	}
    
 
	
	

}
