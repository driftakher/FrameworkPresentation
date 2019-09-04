package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (xpath="//a[contains(text(),'Sign in')]")
	WebElement SignIn;
	public WebElement get_SignIn() {
		return SignIn;
	}
	
	@FindBy (xpath="//input[@id='userid']")
	WebElement id_text;
	public WebElement get_id_text() {
		return id_text;
	}
	@FindBy (xpath="//input[@id='pass']")
	WebElement pass_text;
	public WebElement get_pass_text() {
		return pass_text;
	}
	@FindBy (xpath="//button[@id='sgnBt']")
	WebElement Sign_button;
	public WebElement get_Sign_button() {
		return Sign_button;
	}
	

}
