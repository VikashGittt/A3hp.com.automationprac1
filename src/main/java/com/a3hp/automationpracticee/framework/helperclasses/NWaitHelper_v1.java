package com.a3hp.automationpracticee.framework.helperclasses;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

 

/**
 * 
 * @author Bhanu Pratap Singh
 * https://www.udemy.com/seleniumbybhanu/
 * https://www.youtube.com/user/MrBhanupratap29/playlists
 *
 */
public class NWaitHelper_v1 {

	 
	
	private WebDriver driver;
	
	/*	public WaitHelper(WebDriver driver){
		this.driver = driver;
	} */
	
	public void WaitForElement(WebElement element,long timeOutInSeconds){
	//	logger.info("waiting for element visibilityOf..");
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	//	logger.info("element is visible..");
	}
	
}