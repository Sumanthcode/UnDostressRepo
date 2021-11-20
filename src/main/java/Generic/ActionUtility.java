package Generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionUtility {
	
	
	public boolean validatePageHeaderTitle(WebElement w, String s, WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(w));
		return w.getText().equals(s);
		
		
	}
	
	public boolean validateErrorMessage(WebElement w, String s, WebDriver driver) throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOf(w));
	//	Thread.sleep(2000);
		return w.getText().equals(s);
	}
	
	
	public void scrollToTheElement(WebDriver driver,WebElement w)
	{
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrollIntoView(true)", w);
		
	}
	
	public void click(WebElement w) {
		
		w.click();
		
	}
	
	public void setText(WebElement w, String s) {
		w.sendKeys(s);
	}
	
	public void waitTillElementToVissibleAndSetText(WebElement w, String s, WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOf(w));
		w.sendKeys(s);
	}


}
