package Test;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic.ActionUtility;
import Generic.Base;
import PageObjects.Payment_Page;
import PageObjects.Signiete_Page;

public class ValidateSuccessMessage extends Base{
	ActionUtility a;
	Payment_Page p;
	@Test
	public void validateSuccessMessage() throws InterruptedException {
	
		Signiete_Page s=new Signiete_Page(driver);
		a=new ActionUtility();
		a.click(s.getOperatorField());//click on operator field
		s.selectOperatorSuggesions("Telcel"); // select the "telcel" operator from the list"
		a.setText(s.getMobileNumberField(),"8465433546");// Enter the mobile number
		a.click(s.getMontdeRecargaField());//click on Mont de Recarga field
		a.click(s.getmontdeRecargaFieldSuggesions());// select the any options from the list
		a.click(s.getSiguiente());
		p=new Payment_Page(driver);
		a.click(p.getTarjeta());//click on Tarjeta
		Thread.sleep(2000);// wait for 2 sec
		a.click(p.getTarjetaDropdownRadioButtons().get(0));//select the “Usar nueva tarjeta” radio button
		a.waitTillElementToVissibleAndSetText(p.getCardNumberField(),"4111111111111111", driver);//enter the card number
		a.setText(p.getMonthField(),"11");//enter the month
		a.setText(p.getDayField(),"25");//enter the day
		a.setText(p.getCvvField(),"111");//enter the CVV
		a.setText(p.getEmailField(), "test@test.com");//enter the email 
		a.click(p.getPaySubmit());//click on sumbit option
		a.setText(p.getPopupEmailField(), "automationexcersise@test.com");// enter the emailid within the popup
		a.setText(p.getPopupPasswordField(), "123456");//enter the password within the popup
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("document.querySelector('.modal.fade.in').scrollBy(0,800)");//scroll down
		driver.switchTo().frame(p.getFrame());//switching to frame
		a.click(p.getCapchaCheckBox());//select the capcha check box
		driver.switchTo().defaultContent();//switch back to default content
		a.click(p.getPopupSubmit());//click on submit within the popup
		Thread.sleep(2000);
		Assert.assertTrue(p.getErrorMsg().getText().equals("Tu cuenta ha sido bloqueada por favor restablece tu contraseña"));//verify error message
	}


}
