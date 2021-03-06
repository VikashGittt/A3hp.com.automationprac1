package com.a3hp.automationpracticee.framework.helperclasses;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;



/**
 * 
 * @author bsingh5
 *
 */

public class AlertHelper_v1{
	
	private WebDriver driver;
	//private Logger oLog = LoggerHelper.getLogger(AlertHelper.class);


	
	public AlertHelper_v1(WebDriver driver) {
		this.driver = driver;
	//	oLog.debug("AlertHelper : " + this.driver.hashCode());
	}
	
	public Alert getAlert() {
	//	oLog.debug("");
		return driver.switchTo().alert();
	}
	
	public void AcceptAlert() {
	//	oLog.info("");
		getAlert().accept();
	}
	
	public void DismissAlert() {
	//	oLog.info("");
		getAlert().dismiss();
	}

	public String getAlertText() {
		String text = getAlert().getText();
	//	oLog.info(text);
		return text;
	}

	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
		//	oLog.info("true");
			return true;
		} catch (NoAlertPresentException e) {
			// Ignore
	//		oLog.info("false");
			return false;
		}
	}

	public void AcceptAlertIfPresent() {
		if (!isAlertPresent())
			return;
		AcceptAlert();
	//	oLog.info("");
	}

	public void DismissAlertIfPresent() {

		if (!isAlertPresent())
			return;
		DismissAlert();
	//	oLog.info("");
	}
	
	public void AcceptPrompt(String text) {
		
		if (!isAlertPresent())
			return;
		
		Alert alert = getAlert();
		alert.sendKeys(text);
		alert.accept();
	//	oLog.info(text);
	}
}