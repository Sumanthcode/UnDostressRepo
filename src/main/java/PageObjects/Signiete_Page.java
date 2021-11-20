package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signiete_Page {
	
	@FindBy(xpath="//div[@class='container-main-top']//input[@suggest='mobile-operator']")
	private WebElement operatorField;
	
	@FindBy(xpath="//div[@class='suggestion']/ul/li//div/b")
	private List<WebElement> operatorSuggesions;
	
	@FindBy(xpath="//div[@class='container-main-top']//input[@suggestmobile='mobile-numbers']")
	private WebElement mobileNumberField;
	
	@FindBy(xpath="//div[@class='container-main-top']//input[@suggest='mobile-operator_amount']")
	private WebElement montdeRecargaField;
	
	@FindBy(xpath="//ul[@class='category-list  cat1']/li")
	private List<WebElement>  montdeRecargaFieldSuggesions;
	
	@FindBy(xpath="//button[@data-qa='celular-pay']")
	private WebElement  siguiente;
	
	
	
	public Signiete_Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	public WebElement getOperatorField() {
		
		
		return operatorField;
		
	}
	
	public void selectOperatorSuggesions(String a) {
		for(int i=0;i<operatorSuggesions.size();i++)
		{
			if(operatorSuggesions.get(i).getText().equals(a))
			{
				operatorSuggesions.get(i).click();
				break;
			}
		}

	}
	

	
public WebElement getMobileNumberField() {
		
		return mobileNumberField;
		
	}
	
	public WebElement getMontdeRecargaField() {
		return montdeRecargaField;
	}
	
	public WebElement getmontdeRecargaFieldSuggesions() {
		return montdeRecargaFieldSuggesions.get(0);
	}
	
	public WebElement getSiguiente() {
		return siguiente;
	}

}
